package sample;

public class orders {
    int OrderID;
    float Price;
    String OrderDate, Game;

    public orders(int OrderID, float Price, String OrderDate, String Game) {
        this.OrderID = OrderID;
        this.Price = Price;
        this.OrderDate = OrderDate;
        this.Game = Game;

    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String orderDate) {
        OrderDate = orderDate;
    }

    public String getGame() {
        return Game;
    }

    public void setGame(String game) {
        Game = game;
    }
}
