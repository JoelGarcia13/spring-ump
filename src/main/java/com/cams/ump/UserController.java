package com.cams.ump;

import com.cams.ump.User;
import com.cams.ump.UserRepository;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "https://desolate-sierra-02471.herokuapp.com")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @PutMapping("/update")
    void updateUser(@RequestBody User user) {
        Long id = user.getId();

        User updatedUser = userRepository.findById(id).get();
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setEmail(user.getEmail());

        userRepository.save(updatedUser);
    }

    @PostMapping("/delete")
    void delete(@RequestBody User user) {
        userRepository.delete(user);
    }
}
