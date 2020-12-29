package com.sboyko.springboot.sber.sber_test_task.controller;

import com.sboyko.springboot.sber.sber_test_task.dao.CardDAO;
import com.sboyko.springboot.sber.sber_test_task.entity.Card;
import com.sboyko.springboot.sber.sber_test_task.entity.User;
import com.sboyko.springboot.sber.sber_test_task.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
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
    public String checkBalance (@PathVariable long cardNumber,
                                Model model){
        model.addAttribute("balance", cardService.checkBalance(cardNumber));
        return "balance";
    }

    @GetMapping (value={"/cards/loadMoney"})
    public String getLoadMoney (){
       // model.addAttribute("cardNumber", 123);
       // model.addAttribute("sumOfLoad", 100);
        return "loadMoney";
    };

    @RequestMapping (value = {"/api/cards/loadMoney/card/{cardNumber}/sum/{sumOfLoad}"},
                        method = RequestMethod.POST)
    public void loadMoney ( @PathVariable (value = "cardNumber") String cardNumber,
                            @PathVariable (value = "sumOfLoad") String sumOfLoad) {
        //cardService.loadMoney(cardNumber,sumOfLoad);


        System.out.println("123");
        //model.addAttribute("loadMoney", cardService.loadMoney(cardNumber,sumOfLoad));
        //cardService.loadMoney(cardNumber,sumOfLoad);

    }
    @PostMapping ("/test")
    public void getTest (Model model){
        System.out.println("Test");
    }



    }


