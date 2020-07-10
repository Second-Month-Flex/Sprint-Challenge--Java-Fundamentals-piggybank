package com.lambdaadonis.piggbank.models;

import javax.persistence.*;

@Entity
@Table(name = "coins")
public class Coin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long coinid;
    private String name;
    private String nameplural;
    private double value;
    private double quantity;


    //    coins (coinid, name, namepural, value, quantity)
//    VALUES (1, 'Quarter', 'Quarters', 0.25, 1),
//                  (2, 'Dime', 'Dimes', 0.10, 1),
//                          (3, 'Dollar', 'Dollars', 1.00, 5),
//                          (4, 'Nickel', 'Nickels', 0.05, 3),
//                          (5, 'Dime', 'Dimes', 0.10, 7),
//                          (6, 'Dollar', 'Dollars', 1.00, 1),
//                          (7, 'Penny', 'Pennies', 0.01, 10);


    public Coin() {
    }

    public Coin(String name, String nameplural, double value, double quantity) {
        this.name = name;
        this.nameplural = nameplural;
        this.value = value;
        this.quantity = quantity;
    }

    public long getMoneyid() {
        return coinid;
    }

    public void setMoneyid(long moneyid) {
        this.coinid = moneyid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameplural() {
        return nameplural;
    }

    public void setNameplural(String nameplural) {
        this.nameplural = nameplural;
    }

    public double getValue() {
        return value * quantity;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getValues() {
    if (quantity > 1)
    {
        return quantity + " " + nameplural;
    } else
    {
        return quantity + " " + name;
    }
    }


    @Override
    public String toString() {
        return "Coin{" +
                "moneyid=" + coinid +
                ", name='" + name + '\'' +
                ", nameplural='" + nameplural + '\'' +
                ", value=" + value +
                ", quantity=" + quantity +
                '}';
    }
}


