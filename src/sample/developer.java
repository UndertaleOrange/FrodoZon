package sample;

public class developer {
    int DeveloperID;
    String Name, Notes, Photo, BirthDate;

    public developer(int DeveloperID, String Name, String Notes, String Photo, String BirthDate) {
        this.DeveloperID = DeveloperID;
        this.Name = Name;
        this.Notes = Notes;
        this.Photo = Photo;
        this.BirthDate = BirthDate;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getDeveloperID() {
        return DeveloperID;
    }

    public void setDeveloperID(int developerID) {
        DeveloperID = developerID;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }
}
