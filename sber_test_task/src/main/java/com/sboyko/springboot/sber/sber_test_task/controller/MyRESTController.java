package com.sboyko.springboot.sber.sber_test_task.controller;

import com.sboyko.springboot.sber.sber_test_task.entity.Card;
import com.sboyko.springboot.sber.sber_test_task.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyRESTController {
    @Autowired
    CardService cardService;

    @PostMapping ("/cards")
    public Card addNewCard(@RequestBody Card card){
        cardService.addCard(card);
        return card;
    }

   @DeleteMapping("/cards/{id}")
   public String deleteCard (@PathVariable int id){
       cardService.deleteCard(id);
       return "Card with id = " + id + " was deleted";
   }

    @GetMapping ("/cards/{cardNumber}")
    public long checkBalance (@PathVariable long cardNumber){
        return cardService.checkBalance(cardNumber);
    }



}
