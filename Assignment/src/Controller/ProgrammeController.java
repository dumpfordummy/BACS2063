/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import ADT.Impl.*;
import Entity.*;

/**
 *
 * @author Wai Loc
 */
public class ProgrammeController {
    private static final LinkedSetUniqueList<Programme> programmeList = populateData();

    public ProgrammeController() {
        
    }

    public LinkedSetUniqueList<Programme> getProgrammeList() {
        return programmeList;
    }
    
    public static final LinkedSetUniqueList<Programme> populateData(){
        Programme p1 = new Programme("DIPLOMA IN ACCOUNTING", "DIA", "3", 25000, 9);
        Programme p2 = new Programme("DIPLOMA IN FINANCE", "DFN", "2", 22000, 6);
        Programme p3 = new Programme("DIPLOMA IN INFORMATION SYSTEM", "DIS", "3", 24000, 9);
        Programme p4 = new Programme("DIPLOMA IN COMPUTER SCIENCE", "DCS", "3", 25000, 9);
        
        LinkedSetUniqueList<Programme> tempList = new LinkedSetUniqueList<>();
        tempList.add(p1);
        tempList.add(p2);
        tempList.add(p3);
        tempList.add(p4);
        
        return tempList;
    }
    
    public boolean addProgramme(Programme programme){
        return programmeList.add(programme);
    }
    
    public Programme findProgrammeByID(String ID){
        return programmeList.get(0);
//        Programme resultProgramme = new Programme();
//        for (Programme programme : programmeList) {
//            if (programme.getProgrammeID().equals(ID)) {
//                resultProgramme = programme;
//            }
//        }
        
        //return resultProgramme;
    }
    
    public Programme findProgrammeByName(String name){
        Programme resultProgramme = new Programme();
        for (Programme programme : programmeList) {
            if (programme.getProgrammeName().equals(name)) {
                resultProgramme = programme;
            }
        }
        
        return resultProgramme;
    }

}
