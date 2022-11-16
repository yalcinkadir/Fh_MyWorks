package assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonAddressBooks {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        PersonAddressBooks pAB = new PersonAddressBooks();
        pAB.managePerson(personList);
    }

    public void managePerson(List<Person> personList) {

        Scanner scannerPerson = new Scanner(System.in);
        System.out.println("Name");
        String personName = scannerPerson.nextLine();
        System.out.println("Lastname");
        String personNachname = scannerPerson.nextLine();
        System.out.println("Age");
        int personAlter = Integer.parseInt(scannerPerson.nextLine());
        Person person = new Person(personName, personNachname, personAlter);

        System.out.println("Address");
        String newAddress = scannerPerson.nextLine();
        person.addAddress(newAddress);

        System.out.println("Books");
        String newBooks = scannerPerson.nextLine();
        person.addBooks(newBooks);
        personList.add(person);

        for (Person p : personList) {
            System.out.printf("\nList of Persons\n****************\n%s\n", p.toString());
        }
        managePerson(personList);
    }
}
