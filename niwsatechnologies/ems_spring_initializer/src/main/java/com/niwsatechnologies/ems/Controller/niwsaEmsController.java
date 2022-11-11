package com.niwsatechnologies.ems.Controller;

import com.niwsatechnologies.ems.Model.niwsaEms;
import com.niwsatechnologies.ems.Service.niwsaEmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class niwsaEmsController {
@Autowired
public niwsaEmsService niwsaEmsService;

    @GetMapping("/emsapplication")
    public String welcome(){
        return "Welcome to NIWSA technologies";
    }

    @PostMapping("/emsapplication/newuser")
    public niwsaEms saveUser(@RequestBody niwsaEms User) {
        return niwsaEmsService.saveUser(User);
    }

        @GetMapping("/emsapplication/allusers")
        public List<niwsaEms> fetchniwsaEmsUsersList()   {
            return niwsaEmsService.fetchniwsaEmsUsersList();
    }
        @GetMapping("/emsapplication/auser/{ID}")
        public Optional<niwsaEms> fetchniwsaEmsUsersId(@PathVariable("ID") Long serialID){
            return niwsaEmsService.fetchniwsaEmsUsersId(serialID);
        }
        @DeleteMapping("/emsapplication/auser/{ID}")
        public String deleteniwsaEmsUsersbyId(@PathVariable("ID") Long serialID){
            niwsaEmsService.deleteniwsaEmsUsersbyId(serialID);
            return "User deleted successfully";
        }
        @DeleteMapping("/emsapplication/allusers")
        public String deleteniwsaEmsUsers(){
                 niwsaEmsService.deleteniwsaEmsUsers();
                 return "Users deleted fool!!";
        }
        @GetMapping("/emsapplication/useremail/{email}")
        public niwsaEms getniwsaEmsUsersbyemail(@PathVariable("email") String email){
            return niwsaEmsService.getniwsaEmsUsersbyemail(email);

        }
        @PutMapping("/emsapplication/auser/{ID}")
        public niwsaEms updateUser(@PathVariable("ID") Long serialID, @RequestBody niwsaEms libUsers){
            return niwsaEmsService.updateUser(serialID,libUsers);

        }

    }

