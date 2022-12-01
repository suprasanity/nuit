package com.example.dashboard.Controller;

import com.example.dashboard.Discord.Bot;
import com.example.dashboard.service.ServiceQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "chovy.freeboxos.fr")
public class ControllerFront {

    @Autowired
    Bot bot;

    @Autowired
    ServiceQuestion serviceQuestion;

    @PostMapping("/botMsg")
    @ResponseBody
    public String sendMsg(@RequestBody String msg){
        bot.sendMsg(msg,"954877593197350964","954877593713266731");
        return "true";
    }

    @GetMapping("/getAllQuestions")
    @ResponseBody
    public List getAllQuestion(){
        List list = serviceQuestion.getAllQuestion();
       return list;
    }
    @PostMapping("/insertQuestion")
    @ResponseBody
    public String insertQuestion(@RequestParam String libelle, @RequestParam String reponse){
         serviceQuestion.insertQuestion(libelle,reponse);
        return "true";
    }

}
