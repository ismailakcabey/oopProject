package fon;

import user.User;

public class bist {
    private User user;
    private Integer stockAmount;
    private stockEnum stock;

    public void bist(){
        System.out.println("BIST FONKSIYON");
    }
    public void setUser(User user){
        this.user = user;
    }
    public void setStockAmount(Integer stockAmount){
        this.stockAmount=stockAmount;
    }
    public void setStock(stockEnum stock) {
        this.stock = stock;
    }

    public stockEnum getStock() {
        return stock;
    }

    public Integer getStockAmount() {
        return stockAmount;
    }

}
