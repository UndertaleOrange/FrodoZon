package sample;

public class categories {
    int CategoryID;
    String Nazov, Popis;
    public categories(int CategoryID, String Nazov, String Popis) {
        this.CategoryID = CategoryID;
        this.Nazov = Nazov;
        this.Popis = Popis;

    }

    public int getCategoryID() {
        return CategoryID;
    }

    public String getNazov() {
        return Nazov;
    }

    public String getPopis() {
        return Popis;
    }

    public void setPopis(String Popis) {
        this.Popis = Popis;
    }

    public void setNazov(String Nazov) {
        this.Nazov = Nazov;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }


}
