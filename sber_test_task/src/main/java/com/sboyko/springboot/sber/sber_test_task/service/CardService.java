package com.sboyko.springboot.sber.sber_test_task.service;

import com.sboyko.springboot.sber.sber_test_task.entity.Card;

public interface CardService {
    public void addCard (Card card);
    public void deleteCard (int id);
}
