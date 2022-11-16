package assignment5v2;

import java.util.ArrayList;
import java.util.List;

public class Person {
    List<Address> addressList = new ArrayList<>();
    List<Books> booksList = new ArrayList<>();
    private String vorname, nachname;
    private int alter;

    public Person(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }

    public Person() {
    }

    void addAddress(String addressInfo) {
        Address address = new Address(addressInfo, this);
        addressList.add(address);
    }

    void addBooks(String booksInfo) {
        Books books = new Books(booksInfo, this);
        booksList.add(books);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(vorname + " " + nachname + " (" + alter + ")\n");
        if (!addressList.isEmpty()) {
            for (Address a : addressList) {
                result.append("Adress: ").append(a.getMyAddress()).append("\n");
            }
        }

        if (!booksList.isEmpty()) {
            for (Books b : booksList) {
                result.append("Books: ").append(b.getMyBooks()).append("\n");
            }
        }

        return result.toString();
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public List<Books> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Books> booksList) {
        this.booksList = booksList;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}