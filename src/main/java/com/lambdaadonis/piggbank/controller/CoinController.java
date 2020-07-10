package com.lambdaadonis.piggbank.controller;


import com.lambdaadonis.piggbank.models.Coin;
import com.lambdaadonis.piggbank.repositories.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CoinController {
    @Autowired
    CoinRepository coinRepository;

//    http://localhost:2019/total
    @GetMapping(value = "/total", produces = {"application/json"})
    public ResponseEntity<?> Total(){
        DecimalFormat df = new DecimalFormat("$###,###.00");
        List<Coin>myList = new ArrayList<>();
        coinRepository.findAll().iterator().forEachRemaining(myList::add);
        double Total = 0;

        for (Coin c : myList)
        {
            System.out.println(c.getValues());
            Total = Total + c.getValue();
//            System.out.println("LOOOK AT MEEEE*********************************");
        }
        System.out.println("The total is: " + df.format(Total));

        return new ResponseEntity<>(myList, HttpStatus.OK);
    }


}

