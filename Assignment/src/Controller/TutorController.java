/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import ADT.ArraySetUniqueList;
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
        Tutor tutor1 = new Tutor("p1024", "Hoo Chun Yuan", Tutor.Genders.MALE, Tutor.Qualifications.BACHELOR, "0192009289", 20);
        Tutor tutor2 = new Tutor("p2048", "Hoh Jenn Wen", Tutor.Genders.FEMALE, Tutor.Qualifications.DOCTORATE, "0192820169", 21);
        Tutor tutor3 = new Tutor("p4096", "Leong Wai Loc", Tutor.Genders.MALE, Tutor.Qualifications.MASTERS, "01110947209", 22);
        Tutor tutor4 = new Tutor("p8192", "Low Hau Shien", Tutor.Genders.FEMALE, Tutor.Qualifications.BACHELOR, "01162656570", 23);

        tutorList.add(tutor1);
        tutorList.add(tutor2);
        tutorList.add(tutor3);
        tutorList.add(tutor4);
    }

    public static final TutorController getInstance() {
        return TutorControllerHolder.INSTANCE;
    }

    public ArraySetUniqueList<Tutor> getTutorList() {
        return tutorList;
    }

    public String generateTutorId() {
        int min = 1000;  // Minimum 4-digit number
        int max = 9999;  // Maximum 4-digit number

        // Generate a random number between min and max (inclusive)
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

    public void removeTutor(Integer[] index) {
        ArraySetUniqueList<Tutor> tempList = new ArraySetUniqueList<>();

        for (int i = 0; i < index.length && index[i] != null; i++) {
            tempList.add(tutorList.get(index[i]));
        }
        
        for(Tutor tutor : tempList) {
            tutorList.remove(tutor);
        }
    }

    public int getListSize() {
        return tutorList.size();
    }

}
