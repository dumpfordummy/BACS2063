/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import ADT.ArrayList;
import ADT.ListInterface;

/**
 *
 * @author Wai Loc
 */
public class Programme {
    private String programmeName;
    private String duration;
    private double feesInTotal;
    private int totalSemesters;
    
    //ListInterface<Tutorial> tutorialList = new ArrayList<>();

    public Programme() {
    }
    
    public Programme(String programmeName, String duration, double feesInTotal, int totalSemesters) {
        this.programmeName = programmeName;
        this.duration = duration;
        this.feesInTotal = feesInTotal;
        this.totalSemesters = totalSemesters;
    }

//    public void addTutorialGroup(Tutorial newTutorial){}
//    public boolean removeTutorialGroup(Tutorial newTutorial){}
    
    
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
    
}
