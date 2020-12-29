package com.sboyko.springboot.sber.sber_test_task.entity;

import javax.persistence.*;

@Entity
@Table(name="cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="cardNumber")
    private String cardNumber;
    @Column(name="pin")
    private int pin;
    @Column(name = "cvc")
    private int cvc;
    @Column (name = "balance")
    private long balance;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "user_id")
    private User user;


   public Card() {
   }


    public Card(int id, String cardNumber, int pin, int cvc) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.cvc = cvc;
        this.balance = 0;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", cardNumber=" + cardNumber +
                ", pin=" + pin +
                ", cvc=" + cvc +
                ", user=" + user +
                ", balance=" + balance +
                '}';
    }
}
