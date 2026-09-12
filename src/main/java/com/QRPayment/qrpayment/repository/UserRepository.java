package com.QRPayment.qrpayment.repository;

import com.QRPayment.qrpayment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
