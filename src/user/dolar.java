package user;


import fon.bist;

import java.util.Scanner;

public class dolar extends bist {
    private double amount;
    private Double dolarPrice = 20.5;

    public void dolar(){
        System.out.println("dolar alma fonk");
    }

    public void setDolar(){
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public double getDolarPrice() {

        return dolarPrice;
    }
}
