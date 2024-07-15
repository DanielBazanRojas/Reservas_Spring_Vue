package com.dwi.backend.Servicio;

import com.dwi.backend.Modelo.User;
import com.dwi.backend.ModeloDAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserDAO userDAO;

    public User login(String username, String password) {
        return userDAO.findByUsernameAndPassword(username, password);
    }
}
