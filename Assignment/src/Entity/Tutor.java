/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.Date;

/**
 *
 * @author CY
 */
public class Tutor {
    private String tutorId;
    private String name;
    private String gender;
    private String address;
    private String contact;
    private int age;

    public Tutor() {
    }

    public Tutor(String tutorId, String name, String gender, String contact, int age) {
        this.tutorId = tutorId;
        this.name = name;
        this.gender = gender;
        this.contact = contact;
        this.age = age;
    }

    
    
    public Tutor(String tutorId, String name, String gender, String address, String contact, int age) {
        this.tutorId = tutorId;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.contact = contact;
        this.age = age;
    }

    
    
    public String getTutorId() {
        return tutorId;
    }

    public void setTutorId(String tutorId) {
        this.tutorId = tutorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
