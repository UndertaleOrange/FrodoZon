package sample;

public class publisher {
    int PublisherID, Phone;
    String Meno, ContactMeno, City, Country;

    public publisher(int PublisherID, int Phone, String Meno, String ContactMeno, String City, String Country) {
        this.PublisherID = PublisherID;
        this.Phone = Phone;
        this.Meno = Meno;
        this.ContactMeno = ContactMeno;
        this.City = City;
        this.Country = Country;

    }

    public int getPublisherID() {
        return PublisherID;
    }

    public void setPublisherID(int publisherID) {
        PublisherID = publisherID;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public String getMeno() {
        return Meno;
    }

    public void setMeno(String meno) {
        Meno = meno;
    }

    public String getContactMeno() {
        return ContactMeno;
    }

    public void setContactMeno(String contactMeno) {
        ContactMeno = contactMeno;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
