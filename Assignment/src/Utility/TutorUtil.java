/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;

import ADT.Impl.ArraySetUniqueList;
import Entity.Tutor;
import java.util.function.BiFunction;

/**
 *
 * @author CY
 */
public class TutorUtil {
    public static ArraySetUniqueList<Tutor> sortTutor(ArraySetUniqueList<Tutor> tutorList, BiFunction<Tutor, Tutor, Boolean> compareFunction) {
        int n = tutorList.size();
        ArraySetUniqueList<Tutor> sortedList = new ArraySetUniqueList<>(n);
        sortedList.add(tutorList.get(0));

        for (int scanIndex = 1; scanIndex < n; scanIndex++) {
            Tutor tutor1 = tutorList.get(scanIndex);
            for (int insertIndex = 0; insertIndex < sortedList.size(); insertIndex++) {
                Tutor tutor2 = sortedList.get(insertIndex);
                if (compareFunction.apply(tutor1, tutor2)) {
                    sortedList.add(0, tutor1);
                    break;
                }
            }

            if (!sortedList.contains(tutor1)) {
                sortedList.add(tutor1);
            }
        }
        return sortedList;
    }
}
