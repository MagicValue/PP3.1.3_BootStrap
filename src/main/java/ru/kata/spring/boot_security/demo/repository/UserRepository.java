package ru.kata.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.id = :id")
    User getUserById(@Param("id") Long id);
    @Query("SELECT u FROM User u WHERE u.id = :id")
    User deleteUserAndUR(@Param("id") Long id);


    @Query("SELECT u FROM User u WHERE u.username = :username")
    User getUser(@Param("username") String username);
}
