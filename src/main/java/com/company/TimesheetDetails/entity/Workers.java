package com.company.TimesheetDetails.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "workers")
public class Workers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "age")
    private int age;


    public Workers() {

    }

    public Workers(Long id) {
        this.id = id;
    }

    public Workers(Long id, String firstName, String lastname, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Workers workers)) return false;
        return getAge() == workers.getAge() && Objects.equals(getId(), workers.getId()) && Objects.equals(getFirstName(), workers.getFirstName()) && Objects.equals(getLastname(), workers.getLastname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastname(), getAge());
    }

    @Override
    public String toString() {
        return "Workers{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}


