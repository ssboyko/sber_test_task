package com.sboyko.springboot.sber.sber_test_task.entity;

import javax.persistence.*;

@Entity
@Table(name="card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="cardNumber")
    private long cardNumber;
    @Column (name = "balance")
    private long balance;

    public Card() {
    }

    public Card(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.balance = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
