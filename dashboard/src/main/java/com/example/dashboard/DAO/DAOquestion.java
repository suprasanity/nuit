package com.example.dashboard.DAO;

import com.example.dashboard.model.Question;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class DAOquestion  {
    @PersistenceContext
    private EntityManager entityManager;


    @Transactional
   public List getAllQuestion(){
        List list = entityManager.createQuery("SELECT q FROM Question q").getResultList();
        return list;
    }


    @Transactional
    public void insertQuestion(Question question) {
        entityManager.createNativeQuery("INSERT INTO question (id, libelle, reponse) VALUES (?,?,?)")
                .setParameter(1, question.getId())
                .setParameter(2, question.getLibelle())
                .setParameter(3, question.getReponse())
                .executeUpdate();
    }
}
