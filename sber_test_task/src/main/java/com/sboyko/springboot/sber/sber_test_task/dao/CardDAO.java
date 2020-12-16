package com.sboyko.springboot.sber.sber_test_task.dao;

import com.sboyko.springboot.sber.sber_test_task.entity.Card;

public interface CardDAO {
    public void addCard (Card card);
    public void deleteCard (int id);
    public long checkBalance (long cardNumber);
    public void loadMoney (long cardNumber, int sumOfLoad);
}
