/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import ADT.Impl.ArraySetUniqueList;
import Entity.Tutor;

/**
 *
 * @author CY
 */
public class TutorController {

    private static class TutorControllerHolder {

        /**
         * ensure lazy initialization. This method is used over instantiating in
         * getInstance for performance.
         */
        private static final TutorController INSTANCE = new TutorController();
    }

    private final ArraySetUniqueList<Tutor> tutorList;

    private TutorController() {
        tutorList = new ArraySetUniqueList<>();
        seedData();
    }

    private void seedData() {
        Tutor tutor1 = new Tutor("p1024", "Hoo Chun Yuan", Tutor.Genders.MALE, Tutor.Qualifications.BACHELOR, "0192009289", 1000.10f, 20);
        Tutor tutor2 = new Tutor("p2048", "Hoh Jenn Wen", Tutor.Genders.FEMALE, Tutor.Qualifications.DOCTORATE, "0192820169", 2000.20f, 21);
        Tutor tutor3 = new Tutor("p4096", "Leong Wai Loc", Tutor.Genders.MALE, Tutor.Qualifications.MASTERS, "01110947209", 3000.30f, 22);
        Tutor tutor4 = new Tutor("p8192", "Low Hau Shien", Tutor.Genders.FEMALE, Tutor.Qualifications.BACHELOR, "01162656570", 4000.40f, 23);
        Tutor tutor5 = new Tutor("p8321", "Leong Ah Wee", Tutor.Genders.MALE, Tutor.Qualifications.BACHELOR, "01362352370", 5000.50f, 24);
        Tutor tutor6 = new Tutor("p8772", "Tan Ah Wen", Tutor.Genders.FEMALE, Tutor.Qualifications.DOCTORATE, "01322650120", 6000.60f, 25);
        Tutor tutor7 = new Tutor("p9012", "Lim Yen Wen", Tutor.Genders.MALE, Tutor.Qualifications.BACHELOR, "0122019374", 7000.70f, 26);

        tutorList.add(tutor1);
        tutorList.add(tutor2);
        tutorList.add(tutor3);
        tutorList.add(tutor4);
        tutorList.add(tutor5);
        tutorList.add(tutor6);
        tutorList.add(tutor7);
    }

    public static final TutorController getInstance() {
        return TutorControllerHolder.INSTANCE;
    }

    public ArraySetUniqueList<Tutor> getTutorList() {
        return tutorList;
    }

    public String generateTutorId() {
        int min = 1000;
        int max = 9999;

        int randomNumber = (int) (Math.random() * (max - min + 1)) + min;

        return "p" + randomNumber;

    }

    public boolean addTutor(Tutor tutor) throws NullPointerException {
        if (tutor == null) {
            throw new NullPointerException();
        }

        return tutorList.add(tutor);
    }

    public Tutor removeTutor(int index) {
        return tutorList.remove(index);
    }

    public void removeTutors(Integer[] index) {
        ArraySetUniqueList<Tutor> tempList = new ArraySetUniqueList<>();

        for (int i = 0; i < index.length && index[i] != null; i++) {
            tempList.add(tutorList.get(index[i]));
        }

        for (Tutor tutor : tempList) {
            tutorList.remove(tutor);
        }
    }

    public Tutor findTutorById(String tutorId) {
        for (Tutor tutor : tutorList) {
            if (tutor.getTutorId().equals(tutorId)) {
                return tutor;
            }
        }
        return null;
    }

    public ArraySetUniqueList<Tutor> findTutorsByName(String tutorName) {
        ArraySetUniqueList<Tutor> result = new ArraySetUniqueList<>();
        for (Tutor tutor : tutorList) {
            if (tutor.getName().toLowerCase().equals(tutorName.toLowerCase())) {
                result.add(tutor);
            }
        }
        return result;
    }

    public Tutor replaceTutor(Tutor oldTutor, Tutor newTutor) {
        if (oldTutor == null || newTutor == null) {
            return null;
        }

        int index = tutorList.indexOf(oldTutor);
        return tutorList.replace(index, newTutor);
    }

    public int getNumberOfTutors() {
        return tutorList.size();
    }

}
