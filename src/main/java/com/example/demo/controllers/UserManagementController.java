package com.example.demo.controllers;

import com.example.demo.dtos.requests.RegisterRequestDTO;
import com.example.demo.dtos.requests.UpdateUserRequestDTO;
import com.example.demo.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/api/user")
@RequiredArgsConstructor
public class UserManagementController {
    final private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<?> getUser(@Valid @RequestParam("userId") Long userId){

        return ResponseEntity.ok(userService.getUser(userId));

    }
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<?> updateUser(@Valid @RequestBody UpdateUserRequestDTO dto){

        return ResponseEntity.ok(userService.updateUser(dto));

    }
    @RequestMapping(value = "/lock", method = RequestMethod.PUT)
    public ResponseEntity<?> lockUser(@Valid @RequestParam("userId") Long userId){

        return ResponseEntity.ok(userService.lockUser(userId));

    }
    @RequestMapping(value = "/unlock", method = RequestMethod.PUT)
    public ResponseEntity<?> unlockUser(@Valid @RequestParam("userId") Long userId){

        return ResponseEntity.ok(userService.unlockUser(userId));

    }
    @RequestMapping(value = "/delete", method = RequestMethod.PUT)
    public ResponseEntity<?> deleteUser(@Valid @RequestParam("userId") Long userId){

        return ResponseEntity.ok(userService.deleteUser(userId));

    }

}
