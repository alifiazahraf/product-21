package io.vutura.p21.jpa;

import io.vutura.p21.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {
    Optional<User> findAllByPhoneNumber(String phoneNumber);
    Optional<User> findAllByEmail(String email);
    Optional<User> findAllByPhoneNumberAndEmailAndGender(String phoneNumber, String email, String gender);
}