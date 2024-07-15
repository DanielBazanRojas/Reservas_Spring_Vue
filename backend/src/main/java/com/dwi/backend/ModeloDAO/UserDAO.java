package com.dwi.backend.ModeloDAO;

import com.dwi.backend.Modelo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {
    @Query(value = "SELECT * FROM users u WHERE u.username = ?1 AND u.password = crypt(?2, u.password)", nativeQuery = true)
    User findByUsernameAndPassword(String username, String password);
}