package Assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonDatabase {
    static List<Person> personArrayList = new ArrayList<Person>();

    public static void main(String[] args) {
        getStartMenu();
    }

    public static void getStartMenu() {
        int menu;
        do {
            System.out.println("\n***************************\n" +
                    "[1] list of all persons\n" +
                    "[2] enter a new person\n" +
                    "[3] update a person (by index)\n" +
                    "[4] delete a person (by index)\n" +
                    "[5] delete all persons\n" +
                    "[6] exit");
            Scanner scannerMenu = new Scanner(System.in);
            menu = scannerMenu.nextInt();
            switch (menu) {
                case 1:
                    getList();
                    break;
                case 2:
                    newPerson();
                    break;
                case 3:
                    updatePerson();
                    break;
                case 4:
                    removePerson();
                    break;
                case 5:
                    removeAllElementsInList();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Choice must be a value between 1 and 6.");
            }
        } while (menu != 6);
    }

    public static void newPerson() {
        PersonDatabase.personArrayList.add(getPerson());
    }

    public static Person getPerson() {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        System.out.println("Vorname");
        person.setVorname(scanner.nextLine());
        System.out.println("Nachname");
        person.setNachname(scanner.nextLine());
        System.out.println("Alter");
        person.setAlter(scanner.nextInt());
        return person;
    }

    public static void updatePerson() {
        getList();
        int arrayListLength = personArrayList.size() - 1;
        System.out.println("Pls give the number of this person in square bracket[] to update");
        Scanner scannerUpdater = new Scanner(System.in);
        int index = scannerUpdater.nextInt();
        if (index > arrayListLength) {
            System.out.println("Wrong number! Try again");
            updatePerson();
        } else {
            personArrayList.set(index, getPerson());
        }
    }

    public static void getList() {
        final int[] indexList = {0};
        personArrayList.stream().forEach(e -> System.out.print(("[" + indexList[0]++) + "] " + "" + e));
    }

    public static void removePerson() {
        getList();
        int arrayListLength = personArrayList.size() - 1;
        System.out.println("Pls give the number of this person in square bracket[] to remove");
        Scanner scannerRemover = new Scanner(System.in);
        int index = scannerRemover.nextInt();
        if (index > arrayListLength) {
            System.out.println("Wrong number! Try again");
            removePerson();
        } else {
            personArrayList.remove(index);
            System.out.println("Person [" + index + "] removed!");
        }
    }

    public static void removeAllElementsInList() {
        System.out.println("Do you want to remove all elements in the List?");
        int removeAllElements;

        System.out.println("[1] Yes, I am sure!\n" +
                "[2] No, don't remove all elements in the list\n");
        Scanner scannerMenu = new Scanner(System.in);
        removeAllElements = scannerMenu.nextInt();
        switch (removeAllElements) {
            case 1:
                personArrayList.removeAll(personArrayList);
                System.out.println("All elements have been removed!");
                break;
            case 2:
                getStartMenu();
                break;
            default:
                System.out.println("Choice must be a value 1 or 2.");
        }
    }
}
