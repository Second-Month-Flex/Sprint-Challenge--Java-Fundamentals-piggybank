package com.lambdaadonis.piggbank.models;

public abstract class Money {
   public int amount;
   public Money(int amount)
   {
       this.amount = amount;
   }

    public abstract double getValue();
    public abstract String getName();


}
