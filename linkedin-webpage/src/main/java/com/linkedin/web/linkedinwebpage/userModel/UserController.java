package com.linkedin.web.linkedinwebpage.userModel;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	public void createUser(@RequestBody User user){
	    userService.addUser(user);
	}

    @GetMapping("/{username}")
    public Optional<User> getUser(@PathVariable String username){
    	return userService.getUser(username);
	}

	
    @GetMapping("/all")
    public List<User> getAllUsers() {
    	return userService.getAllUsers();
    }
    
    @PutMapping("/{username}")
    public void updateUser(@RequestBody User user, @PathVariable String username){
        userService.updateUser(user);
    }

    @DeleteMapping("/{username}")
    public void deleteUser(@PathVariable String username){
        userService.deleteUser(username);
    }
		
}
