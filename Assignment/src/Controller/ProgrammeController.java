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
    private static final LinkedSetUniqueList<Programme> programmeList = new LinkedSetUniqueList<>();

    public ProgrammeController() {
        
    }

    public LinkedSetUniqueList<Programme> getProgrammeList() {
        return programmeList;
    }
    
    public final void populateData(){
        Programme p1 = new Programme("DIPLOMA IN ACCOUNTING", "DIA", "3", 25000, 9);
        Programme p2 = new Programme("DIPLOMA IN FINANCE", "DFN", "2", 22000, 6);
        Programme p3 = new Programme("DIPLOMA IN INFORMATION SYSTEM", "DIS", "3", 24000, 9);
        Programme p4 = new Programme("DIPLOMA IN COMPUTER SCIENCE", "DCS", "3", 25000, 9);
        
        programmeList.add(p1);
        programmeList.add(p2);
        programmeList.add(p3);
        programmeList.add(p4);
    }
    
    public boolean addProgramme(Programme programme){
        return programmeList.add(programme);
    }
    
//    public void displayProgrammeList(){      
//            String output = "";
//            output += programmeList.toString();
//            output += "===================================\n";
//            output += String.format(" %-15s: %s\n", "No.", i);
//            output += String.format(" %-15s: %s\n", "Programme Name", p.getProgrammeName());
//            output += String.format(" %-15s: %s\n", "Programme ID", p.getProgrammeID());
//            output += String.format(" %-15s: %s\n", "Duration (Years)", p.getDuration());
//            output += String.format(" %-15s: %s\n", "Fees (RM)", p.getFeesInTotal());
//            output += String.format(" %-15s: %s\n", "Total Semesters", p.getTotalSemesters());
//    }
    
}
