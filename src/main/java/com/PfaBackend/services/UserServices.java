package com.PfaBackend.services;

import com.PfaBackend.beans.User;
import com.PfaBackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    /*public User Signin(User user) throws UserExist {
        User user2 =userRepository.findByEmail(user.getEmail());
        if(user2!=null)
            throw new UserExist("cet email est dèjà utilisé. Essayer un autre email");
        return userRepository.save(user);
    } */
    public User login(String email,String password){
        return userRepository.findBYEmailAndPassword(email,password);
    }
    public User upadateinfos(Long id,User newinfo){
        User user2 =userRepository.findUserById(id);
        user2.setEmail(newinfo.getEmail());
        user2.setPassword(newinfo.getPassword());
        return userRepository.save(user2);
    }
    public void deleteCompte(User user){userRepository.delete(user);}
    public void deleteCompte(Long idUser){userRepository.deleteById(idUser);}

    public User findByemail(String email) {
        return userRepository.findByEmail(email);
    }

    public User updatePass(Long id, String pwd) {
        User user = userRepository.findUserById(id);
        user.setPassword(pwd);
        System.out.println(user);
        return userRepository.save(user);
    }
}
