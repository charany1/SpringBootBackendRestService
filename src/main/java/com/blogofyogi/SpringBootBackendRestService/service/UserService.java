package com.blogofyogi.SpringBootBackendRestService.service;

import com.blogofyogi.SpringBootBackendRestService.model.User;
import com.blogofyogi.SpringBootBackendRestService.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(Long id){
       Optional<User> userOptional= userRepository.findById(id);


       if(userOptional.isPresent()){
           log.debug("User found for id {}, is {}",id,userOptional.get());

       }else{
           throw new IllegalIdentifierException("id : "+id);
       }
        return userOptional.get();
    }

    public User createUser(User user){
        userRepository.save(user);
        return user;
    }

    public User updateUser(User user){

        userRepository.save(user);
        return user;
    }

    public User deleteUser(Long id){
        User user = getUserById(id);
        userRepository.deleteById(id);
        return user;
    }


}
