/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import ADT.Interface.*;
import ADT.Impl.*;



/**
 *
 * @author Wai Loc
 */
public class Programme {
    private String programmeName;
    private String programmeID;
    private String duration;
    private double feesInTotal;
    private int totalSemesters;
    private SetUniqueListInterface<TutorialGroup> tutorialList = new LinkedSetUniqueList<>();
    

    public Programme() {
    }

    public Programme(String programmeName, String programmeID, String duration, double feesInTotal, int totalSemesters) {
        this.programmeName = programmeName;
        this.programmeID = programmeID;
        this.duration = duration;
        this.feesInTotal = feesInTotal;
        this.totalSemesters = totalSemesters;
    }
    
    public String getProgrammeName() {
        return programmeName;
    }

    public void setProgrammeName(String programmeName) {
        this.programmeName = programmeName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getFeesInTotal() {
        return feesInTotal;
    }

    public void setFeesInTotal(double feesInTotal) {
        this.feesInTotal = feesInTotal;
    }

    public int getTotalSemesters() {
        return totalSemesters;
    }

    public void setTotalSemesters(int totalSemesters) {
        this.totalSemesters = totalSemesters;
    }

    public String getProgrammeID() {
        return programmeID;
    }

    public void setProgrammeID(String programmeID) {
        this.programmeID = programmeID;
    }

    public SetUniqueListInterface<TutorialGroup> getTutorialGroupList() {
        return tutorialList;
    }

    public void setTutorialGroupList(SetUniqueListInterface<TutorialGroup> tutorialList) {
        this.tutorialList = tutorialList;
    }   

    @Override
    public String toString() {
        return "===================================\n"
                + String.format(" %-15s\t: %s\n", "Programme Name", programmeName)
                + String.format(" %-15s\t: %s\n", "Programme ID", programmeID)
                + String.format(" %-15s\t: %s\n", "Duration (Years)", duration)
                + String.format(" %-15s\t: %s\n", "Total Fees (RM)", feesInTotal)
                + String.format(" %-15s\t: %s\n", "Total Semesters", totalSemesters);
    }
    
    
}
