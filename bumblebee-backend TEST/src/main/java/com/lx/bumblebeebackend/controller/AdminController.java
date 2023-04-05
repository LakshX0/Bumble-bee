//package com.lx.bumblebeebackend.controller;
//
//import com.lx.bumblebeebackend.dto.AdminDTO;
//import org.springframework.beans.factory.annotation.*;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//@RestController
//@CrossOrigin
//@RequestMapping("admin")
//
//public class AdminController {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @PostMapping("/save")
//    public String saveAdmin(@RequestBody AdminDTO save){
//
//        String id = AdminService.addAdmin(adminDTO);
//
//        return id;
//
//    }
//    @GetMapping("/admins")
//    List<Admin> getAllUsers(){
//        return userRepository.findAll();
//    }
//}
