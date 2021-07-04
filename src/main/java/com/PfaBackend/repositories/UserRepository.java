package com.PfaBackend.repositories;

import com.PfaBackend.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    public User findByEmail(String email);
    @Query(value = "select  * from user where email = :email and password = :password", nativeQuery = true)
    public User findBYEmailAndPassword(@Param("email") String email,@Param("password") String password);
    @Query(value = "select  * from user where id = :id ", nativeQuery = true)
    public User findUserById(@Param("id") Long id);
}
