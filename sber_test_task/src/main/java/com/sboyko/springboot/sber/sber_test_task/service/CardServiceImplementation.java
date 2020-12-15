package com.sboyko.springboot.sber.sber_test_task.service;

import com.sboyko.springboot.sber.sber_test_task.dao.CardDAO;
import com.sboyko.springboot.sber.sber_test_task.entity.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CardServiceImplementation implements CardService{
    @Autowired
    private CardDAO cardDAO;

    @Override
    @Transactional
    public void addCard(Card card) {
        cardDAO.addCard(card);
    }

    @Override
    @Transactional
    public void deleteCard(int id) {
        cardDAO.deleteCard(id);
    }
}
