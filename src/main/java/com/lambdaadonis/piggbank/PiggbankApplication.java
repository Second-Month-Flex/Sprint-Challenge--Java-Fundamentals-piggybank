package com.lambdaadonis.piggbank;

import com.lambdaadonis.piggbank.models.Coin;
import com.lambdaadonis.piggbank.repositories.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PiggbankApplication {

    @Autowired
    CoinRepository coinRepository;


    public static void main(String[] args) {
        SpringApplication.run(PiggbankApplication.class, args);






    }

}
