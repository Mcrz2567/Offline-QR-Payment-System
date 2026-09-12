package com.QRPayment.qrpayment.service;
import java.util.List;
import com.QRPayment.qrpayment.repository.UserRepository;
import org.springframework.stereotype.Service;
import com.QRPayment.qrpayment.entity.User;


@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
}


}
