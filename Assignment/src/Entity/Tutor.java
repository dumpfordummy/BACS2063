/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import ADT.Impl.ArraySetUniqueList;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author CY
 */
public class Tutor {

    
    
    public static class Qualifications {
        public final static String BACHELOR = "Bachelor degree";
        public final static String MASTERS = "Master's degree";
        public final static String DOCTORATE = "Doctoral degree";
    }
    
    public static class Genders {
        public final static String MALE = "Male";
        public final static String FEMALE = "Female";
    }
    
    private String tutorId;
    private String name;
    private String gender;
    private String qualification;
    private String contact;
    private Integer age;

    public Tutor() {
    }

    public Tutor(String tutorId, String name, String gender, String qualification, String contact, Integer age) {
        this.tutorId = tutorId;
        this.name = name;
        this.gender = gender;
        this.qualification = qualification;
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

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.tutorId);
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.gender);
        hash = 53 * hash + Objects.hashCode(this.qualification);
        hash = 53 * hash + Objects.hashCode(this.contact);
        hash = 53 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tutor other = (Tutor) obj;
        if (!this.age.equals(other.age)) {
            return false;
        }
        if (!this.name.equals(other.name)) {
            return false;
        }
        if (!this.gender.equals(other.gender)) {
            return false;
        }
        if (!this.qualification.equals(other.qualification)) {
            return false;
        }

        return this.contact.equals(other.contact);
    }
    
    

}
