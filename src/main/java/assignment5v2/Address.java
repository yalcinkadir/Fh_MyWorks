package assignment5v2;

public class Address {

    private String myAddress;

    private Person personInAddress;

    public Address(String addressInfo, Person person) {
        this.myAddress = addressInfo;
        this.personInAddress = person;
    }

    public Person getPersonInAddress() {
        return personInAddress;
    }

    public void setPersonInAddress(Person personInAddress) {
        this.personInAddress = personInAddress;
    }

    public String getMyAddress() {
        return myAddress;
    }

    public void setMyAddress(String myAddress) {
        this.myAddress = myAddress;
    }

}