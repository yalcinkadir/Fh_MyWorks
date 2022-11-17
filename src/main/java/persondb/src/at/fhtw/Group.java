package persondb.src.at.fhtw;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private List<Person> personList = new ArrayList<>();
    private String name;

    public Group(String name) {
        this.name = name;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void add(Person person)
    {
        this.personList.add(person);
    }

    public String getName() {
        return name;
    }
}
