package com.dwi.backend.Servicio;

import com.dwi.backend.Modelo.User;
import com.dwi.backend.ModeloDAO.UserDAO;
import com.dwi.backend.Exception.AuthenticationException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class LoginService {

    @Autowired
    private UserDAO userDAO;

    private final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    public Map<String, Object> login(String username, String password) {
        User user = userDAO.findByUsernameAndPassword(username, password);
        if (user == null) {
            throw new AuthenticationException("Usuario o contraseña incorrectos");
        }

        String token = generateToken(user);

        Map<String, Object> response = new HashMap<>();
        response.put("token", token);
        response.put("user", createUserInfo(user));

        return response;
    }

    private String generateToken(User user) {
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        Date expiration = new Date(nowMillis + 3600000); // Token válido por 1 hora

        return Jwts.builder()
                .setSubject(user.getUsername())
                .setIssuedAt(now)
                .setExpiration(expiration)
                .signWith(key)
                .compact();
    }

    private Map<String, Object> createUserInfo(User user) {
        Map<String, Object> userInfo = new HashMap<>();
        userInfo.put("id", user.getId());
        userInfo.put("username", user.getUsername());
        userInfo.put("role", user.getRole());
        return userInfo;
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}