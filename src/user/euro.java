package user;


import java.util.Scanner;

public class euro extends dolar {
    private double amount;
    public Double euroPrice = 25.5;

    public void euro(){
        System.out.println("euro alma fonk");
    }

    public void setAmount(){
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        this.amount = amount;
    }

    public Double setEuroAmount() {
        return amount;
    }

    public double getEuro() {

        return euroPrice;
    }
}
