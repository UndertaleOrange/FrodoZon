package sample;

public class game {
    int GameID;
    float Rating, Price;
    String DateOfRelease, Description, Vyvojar, Category, Publisher;

    public game(int GameID, float Rating, float Price, String DateOfRelease, String Description, String Vyvojar, String Category, String Publisher) {
        this.GameID = GameID;
        this.Rating = Rating;
        this.Price = Price;
        this.DateOfRelease = DateOfRelease;
        this.Description = Description;
        this.Vyvojar = Vyvojar;
        this.Category = Category;
        this.Publisher = Publisher;

    }

    public float getRating() {
        return Rating;
    }

    public void setRating(float rating) {
        Rating = rating;
    }

    public int getGameID() {
        return GameID;
    }

    public void setGameID(int gameID) {
        GameID = gameID;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public String getDateOfRelease() {
        return DateOfRelease;
    }

    public void setDateOfRelease(String dateOfRelease) {
        DateOfRelease = dateOfRelease;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getVyvojar() {
        return Vyvojar;
    }

    public void setVyvojar(String vyvojar) {
        Vyvojar = vyvojar;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }
}
