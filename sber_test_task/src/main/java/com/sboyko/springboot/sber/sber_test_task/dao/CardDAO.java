package com.sboyko.springboot.sber.sber_test_task.dao;

import com.sboyko.springboot.sber.sber_test_task.entity.Card;
import com.sboyko.springboot.sber.sber_test_task.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface CardDAO {

    public void addCard (Card card);
    public void deleteCard (int id);
    public long checkBalance (long cardNumber);
    public void loadMoney (String cardNumber, String sumOfLoad);

}
