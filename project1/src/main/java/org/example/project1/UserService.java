package org.example.project1;

import org.springframework.stereotype.Service;

import java.util.List;

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
    public void deleteUser(Long id) {
        var user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        userRepository.delete(user);
    }
    public  User updateUser(Long id, User upDateUser) {
        var user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setFirstName(upDateUser.getFirstName());
        user.setLastName(upDateUser.getLastName());
        user.setEmail(upDateUser.getEmail());
        user.setPhoneNumber(upDateUser.getPhoneNumber());
        return userRepository.save(user);
    }
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

}
