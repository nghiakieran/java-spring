package vn.hoidanit.laptopshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.repository.UserRepository;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String handleHello() {
        return "hello from controller";
    }

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public List<User> getAllUsersByEmail(String email) {
        return this.userRepository.findOneByEmail(email);
    }

    public User handleSave(User user) {
        User nghia = this.userRepository.save(user);
        System.out.println(nghia);
        return nghia;
    }

    public User getUserById(long id) {
        User user = this.userRepository.findById(id);
        return user;
    }

    public void deleteAUser(long id) {
        this.userRepository.deleteById(id);
    }
}
