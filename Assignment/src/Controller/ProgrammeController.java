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

    public static LinkedSetUniqueList<Programme> getProgrammeList() {
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
    
    public boolean removeProgramme(int index){
        return programmeList.remove(index) != null;
    }
    
    public boolean removeProgramme(Programme programme){
        return programmeList.remove(programme);
    }
    
    public Programme findProgrammeByID(String ID){
        for (Programme programme : programmeList) {
            if (programme.getProgrammeID().equals(ID)) {
                return programme;
            }
        }
        
        return null;
    }
    
    public Programme findProgrammeByName(String name){
        for (Programme programme : programmeList) {
            if (programme.getProgrammeName().equals(name)) {
                return programme;
            }
        }
        
        return null;
    }
    
    public String displayProgrammeList(LinkedSetUniqueList<Programme> tempList){
        String output = "===================================\n";
        for (int i = 0; i < tempList.size(); i++){
            Programme tempProgramme = tempList.get(i);
                output += (i + 1) + ". \n"
                + String.format(" %-15s\t: %s\n", "Programme Name", tempProgramme.getProgrammeName())
                + String.format(" %-15s\t: %s\n", "Programme ID", tempProgramme.getProgrammeID())
                + String.format(" %-15s\t: %s\n", "Duration (Years)", tempProgramme.getDuration())
                + String.format(" %-15s\t: %s\n", "Total Fees (RM)", tempProgramme.getFeesInTotal())
                + String.format(" %-15s\t: %s\n", "Total Semesters", tempProgramme.getTotalSemesters())
                + "\n===================================\n";
        }
        
        return output;
    }

}
