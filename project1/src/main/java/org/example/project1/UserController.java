package org.example.project1;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Tag(name = "User Controller",description = "these are user management system")
public class UserController {
    private final UserService userService;

@GetMapping
    @Operation(
            summary = "This end point it will return all users"
    )
    public List<User> getAll() {
 return userService.getAllUsers();
}
@PostMapping
    @Operation(
            summary = "This end point will add user"
    )
    public User create(@RequestBody UserCreation Dto){
    User user = new User();
    user.setFirstName(Dto.getFirstName());
    user.setLastName(Dto.getLastName());
    user.setEmail(Dto.getEmail());
    user.setPhoneNumber(Dto.getPhoneNumber());

    return userService.createUser(user);
}
@DeleteMapping("/{id}")
    @Operation(
            summary = "This will delete user"
    )
    public void delete(@PathVariable Long id){
    userService.deleteUser(id);
}
@PutMapping("/{id}")
    @Operation(
            summary = "This will update a user by its id"
    )
public User update(@PathVariable Long id, @RequestBody UserCreation Dto){
    User user = new User();
    user.setFirstName(Dto.getFirstName());
    user.setLastName(Dto.getLastName());
    user.setEmail(Dto.getEmail());
    user.setPhoneNumber(Dto.getPhoneNumber());
    return userService.updateUser(id,user);
}
@GetMapping("/{id}")
    @Operation(
            summary = "Get user by id"
    )
    public User get(@PathVariable Long id){
    return userService.getUserById(id);
}




}
