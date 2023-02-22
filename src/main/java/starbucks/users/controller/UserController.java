package starbucks.users.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import starbucks.users.model.User;
import starbucks.users.service.UserService;
import starbucks.users.vo.RequestUser;
import starbucks.users.vo.ResponseUser;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/add")
    public ResponseUser addUser(@RequestBody RequestUser requestUser){
        return userService.addUser(requestUser);
    }

    @GetMapping("/get/{id}")
    public ResponseUser getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

}
