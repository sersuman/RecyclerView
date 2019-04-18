package model;

public class Contact {
    private String name;
    private String phoneNumber;
    private int imageId;

    public Contact(String name, String phoneNumber, int imageId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
