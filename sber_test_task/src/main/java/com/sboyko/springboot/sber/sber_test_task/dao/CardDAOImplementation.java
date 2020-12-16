package com.sboyko.springboot.sber.sber_test_task.dao;

import com.sboyko.springboot.sber.sber_test_task.entity.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;

@Repository
public class CardDAOImplementation implements CardDAO {
    @Autowired
    // EntityManager - это обёртка сессии. Это из JPA, а не Hibernate.
    // Чтобы не привязываться к Hibernate, а делать всё на JPA - создаем EntityManager, а не SessionFactory
    // Так будет проще, если вдруг нам понадобится изменить Hibernate на другую реализацию JPA
    // JPA - это спецификация, отвечюащая за сохранение java - объектов в БД.
    private EntityManager entityManager;


    @Override
    public void addCard(Card card) {
        entityManager.merge(card);
    }

    @Override
    public void deleteCard(int id) {
        Query query = entityManager.createQuery("DELETE from Card where id = : cardId");
        query.setParameter("cardId", id);
        query.executeUpdate();
    }

    @Override
    public long checkBalance(long cardNumber) {
        Query query = entityManager.createQuery("SELECT balance from Card where cardNumber = : cardNumber");
        query.setParameter("cardNumber", cardNumber);
        return (long)query.getSingleResult();

       // Card card = entityManager.find(Card.class, cardNumber);
       // return card.getBalance();
    }

    @Override
    public void loadMoney (long cardNumber, int sumOfLoad){
        Query query = entityManager.createQuery("UPDATE Card SET balance = : sumOfLoad WHERE id = : cardNumber");
        query.setParameter("sumOfLoad", sumOfLoad);
        query.setParameter("cardNumber", cardNumber);
        query.executeUpdate();
    }

}
