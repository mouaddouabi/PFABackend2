package com.PfaBackend.controllers;

import com.PfaBackend.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import java.util.Random;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/mail")
public class EmailController {
    @Autowired
    private JavaMailSender javaMailSender;
    @PostMapping("/sendEmail")
    public String sendEmail(@RequestBody String email){
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(email);
        mail.setFrom("mouaddauom119@gmail.com");
        Random random = new Random();
        int nb;
        nb = 100000+random.nextInt(999999-100000);
        mail.setSubject(nb+" est votre code de récupération");
        mail.setText("Nous avons reçu une demande de réinitialisation de votre mot de passe.\n" +
                    "Entrez le code de réinitialisation du mot de passe suivant : "+nb);
        javaMailSender.send(mail);
        System.out.println("we do it!!!!");
        return nb+"";
    }
}
