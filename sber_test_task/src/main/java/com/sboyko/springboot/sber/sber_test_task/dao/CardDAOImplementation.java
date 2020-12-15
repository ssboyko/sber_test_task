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
        Query query = entityManager.createQuery("delete from Card where id = : cardId");
        query.setParameter("cardId", id);
        query.executeUpdate();
    }
}
