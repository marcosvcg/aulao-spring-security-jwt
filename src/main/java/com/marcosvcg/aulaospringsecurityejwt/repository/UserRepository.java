package com.marcosvcg.aulaospringsecurityejwt.repository;

import com.marcosvcg.aulaospringsecurityejwt.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    Optional<User> findByUsername(String username);
}
