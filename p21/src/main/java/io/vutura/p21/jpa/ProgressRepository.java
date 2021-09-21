package io.vutura.p21.jpa;

import io.vutura.p21.model.Progress;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProgressRepository extends CrudRepository<Progress, String> {

    Optional<Progress> findAllByPhoneNumberAndModuleName(String phoneNumber, String moduleName);
}
