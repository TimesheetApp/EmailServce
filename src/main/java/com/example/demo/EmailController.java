package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailController {

    @Autowired
    SendEmail sendEmail;

    //Send email to the user that is currently logged in - I guess in this case the Supervisor
    @RequestMapping("/sendemail/{id}")
    public String sendEmail(@PathVariable("id") long userId,
                            Model model) {
        model = sendEmail.SendSimpleEmail(model, userId);
        return "confirmemail";
    }

}
