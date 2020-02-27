package sample;

public class product {
    int ID;
    float price;
    String name, description;
    public product(int ID, String name, String description, float price) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


}
