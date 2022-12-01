package com.example.dashboard.service;

import com.example.dashboard.DAO.DAOquestion;
import com.example.dashboard.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceQuestion {
    @Autowired
    private DAOquestion daoquestion;
    public List getAllQuestion()
    {
       return daoquestion.getAllQuestion();
    }

    public void insertQuestion(String libelle, String reponse) {
         daoquestion.insertQuestion(new Question(libelle,reponse));
    }

}
