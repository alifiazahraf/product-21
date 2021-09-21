package io.vutura.p21.model;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "TESTING")
public class User {

    @Id
    @NotNull
    @Column(name = "phone_number")
    private String phoneNumber;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "email")
    private String email;

    @Column(name = "date_added")
    private Date dateAdded = new Date(System.currentTimeMillis());

    @Column(name = "last_activity")
    private Date last_activity;

    @Column(name = "plan")
    private String plan = "Basic";

    @NotNull
    @Column(name = "gender")
    private String gender;

    @Column(name = "birth_date")
    private Date birthOfDate;

    @Column(name = "course")
    private String course;

    public User() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Date getLast_activity() {
        return last_activity;
    }

    public void setLast_activity(Date last_activity) {
        this.last_activity = last_activity;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(Date birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "User{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dateAdded=" + dateAdded +
                ", last_activity=" + last_activity +
                ", plan='" + plan + '\'' +
                ", gender='" + gender + '\'' +
                ", birthOfDate=" + birthOfDate +
                ", course='" + course + '\'' +
                '}';
    }
}
