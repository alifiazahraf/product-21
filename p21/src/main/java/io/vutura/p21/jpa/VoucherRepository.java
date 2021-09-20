package io.vutura.p21.jpa;

import io.vutura.p21.model.User;
import io.vutura.p21.model.Voucher;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface VoucherRepository extends CrudRepository<Voucher, String> {
    Optional<Voucher> findAllByVoucher(String voucher);
}
