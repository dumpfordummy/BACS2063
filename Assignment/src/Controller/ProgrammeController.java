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
        if (index < 0){
            throw new NullPointerException();
        }
        return programmeList.remove(index) != null;
    }
    
    public boolean removeProgramme(Programme programme){
        return programmeList.remove(programme);
    }
    
    public boolean replaceProgramme(int index, Programme programme){
        return programmeList.replace(index, programme) != null;
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
    
    public Programme findProgrammeByIndex(int index){
        return programmeList.get(index);
    }
    
    public String displayProgrammeList(LinkedSetUniqueList<Programme> tempList){
        String tutorialGroupNameList = "";
        String output = "===================================\n";
        for (int i = 0; i < tempList.size(); i++){
            Programme tempProgramme = tempList.get(i);
            for (TutorialGroup tg : tempProgramme.getTutorialGroupList()){
                tutorialGroupNameList += Integer.toString(tg.getGroupNumber());
            }
                output += (i + 1) + ". \n"
                + String.format(" %-15s\t: %s\n", "Programme Name", tempProgramme.getProgrammeName())
                + String.format(" %-15s\t: %s\n", "Programme ID", tempProgramme.getProgrammeID())
                + String.format(" %-15s\t: %s\n", "Duration (Years)", tempProgramme.getDuration())
                + String.format(" %-15s\t: %s\n", "Total Fees (RM)", tempProgramme.getFeesInTotal())
                + String.format(" %-15s\t: %s\n", "Total Semesters", tempProgramme.getTotalSemesters())
                + String.format(" %-15s\t\t: %s\n", "Tutorial Group", tutorialGroupNameList)
                + "\n===================================\n";
                tutorialGroupNameList = "";
        }
        
        return output;
    }

    public String reportProgrammeByFees(){
        LinkedSetUniqueList<Programme> sortedProgrammeByFeesList = programmeList;
        for (int n = 0; n < sortedProgrammeByFeesList.size(); n++){
            for (int i = 0; i < sortedProgrammeByFeesList.size() - 1; i++) {
                if (sortedProgrammeByFeesList.get(i).getFeesInTotal() < sortedProgrammeByFeesList.get(i+1).getFeesInTotal()) {
                    Programme tempProgramme = sortedProgrammeByFeesList.get(i);
                    sortedProgrammeByFeesList.replace(i+1, sortedProgrammeByFeesList.get(i+1));
                    sortedProgrammeByFeesList.replace(i+1+1, tempProgramme);
                }
            }
        }
        
        String output = String.format("%-70s\t%-15s\t%-20s\n", "Programme Name", "Total Fees", "Number of Semesters");
        output += "================================================================================\n";
        for (Programme p : sortedProgrammeByFeesList){
            output += String.format("%-70s\t%-15s\t%-20s\n", p.getProgrammeName(), p.getFeesInTotal(), p.getTotalSemesters());          
        }
        
        return output;
    }
    
    public String reportProgrammeByTotalGroups(){
        LinkedSetUniqueList<Programme> sortedProgrammeByTotalGroupsList = programmeList;
        for (int n = 0; n < sortedProgrammeByTotalGroupsList.size(); n++){
            for (int i = 0; i < sortedProgrammeByTotalGroupsList.size() - 1; i++) {
                ArraySetUniqueList<TutorialGroup> firstTutorialGroupList = sortedProgrammeByTotalGroupsList.get(i).getTutorialGroupList();
                ArraySetUniqueList<TutorialGroup> secondTutorialGroupList = sortedProgrammeByTotalGroupsList.get(i+1).getTutorialGroupList();
                
                if (firstTutorialGroupList.size() < secondTutorialGroupList.size()) {
                    Programme tempProgramme = sortedProgrammeByTotalGroupsList.get(i);
                    sortedProgrammeByTotalGroupsList.replace(i+1, sortedProgrammeByTotalGroupsList.get(i+1));
                    sortedProgrammeByTotalGroupsList.replace(i+1+1, tempProgramme);
                }
            }
        }
        
        String output = String.format("%-70s\t%-25s\n", "Programme Name", "Total Tutorial Groups");
        output += "===================================================================\n";
        for (Programme p : sortedProgrammeByTotalGroupsList){
            output += String.format("%-70s\t%-25s\n", p.getProgrammeName(), p.getTutorialGroupList().size());          
        }
        
        return output;
    }
}
