package UniCampus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

public class MainUniCampus {
    public static void main(String[] args) throws UniException {

        List<UniPerson> personList = new ArrayList<>();
        UniLehrer uniLehrer = null;
        UniLehrer uniLehrer1 = null;
        UniLehrer uniLehrer2 = null;

        try {
            uniLehrer = new UniLehrer(1, 35, "K.Y", new ArrayList<UniTopics>(
                    List.of(UniTopics.DEUTSCH)), 3);
            uniLehrer1 = new UniLehrer(2, 55, "K.Y", new ArrayList<UniTopics>(
                    List.of(UniTopics.DEUTSCH)), 7);
            uniLehrer2 = new UniLehrer(3, 65, "K.Y", new ArrayList<UniTopics>(
                    List.of(UniTopics.DEUTSCH)), 5);
        } catch (UniException e) {
            System.out.println(e.getMessage());
        }

        personList.add(uniLehrer);
        personList.add(uniLehrer1);
        personList.add(uniLehrer2);

        personList.add(new UniStudent(1, 30, "Y.K.Y", "1", new ArrayList<>(Collections.singletonList(uniLehrer))));
        personList.add(new UniStudent(2, 20, "Y.K.Y", "1", new ArrayList<>(Collections.singletonList(uniLehrer))));

        sort(personList);
        for (UniPerson u : personList) {
            System.out.println(u);
        }
    }
}
