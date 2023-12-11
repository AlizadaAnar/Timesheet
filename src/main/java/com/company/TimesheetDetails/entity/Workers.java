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

    @Column(name = "number")
    private Integer number;

    @Column(name = "email")
    private String email;

    @Column(name = "marine_days")
    private Integer marineDaysOn;

    @Column(name = "training_days")
    private Integer trainingDays;

    @Column(name = "sick_days")
    private Integer sickDays;

    @Column(name = "vacation_days")
    private Integer vacationDays;

    @Column(name = "unpaid_working_days")
    private Integer unpaidWorkingDays;

    @Column(name = "educational_vacation")
    private Integer educationalVacation;

    public Workers() {

    }

    public Workers(Long id) {
        this.id = id;
    }

    public Workers(Long id, String firstName, String lastname, Integer number, String email, Integer marineDaysOn, Integer trainingDays, Integer sickDays, Integer vacationDays, Integer unpaidWorkingDays, Integer educationalVacation) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.number = number;
        this.email = email;
        this.marineDaysOn = marineDaysOn;
        this.trainingDays = trainingDays;
        this.sickDays = sickDays;
        this.vacationDays = vacationDays;
        this.unpaidWorkingDays = unpaidWorkingDays;
        this.educationalVacation = educationalVacation;
    }

    public Workers(String firstName, String lastname, Integer number, String email, Integer marineDaysOn, Integer trainingDays, Integer sickDays, Integer vacationDays, Integer unpaidWorkingDays, Integer educationalVacation) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.number = number;
        this.email = email;
        this.marineDaysOn = marineDaysOn;
        this.trainingDays = trainingDays;
        this.sickDays = sickDays;
        this.vacationDays = vacationDays;
        this.unpaidWorkingDays = unpaidWorkingDays;
        this.educationalVacation = educationalVacation;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMarineDaysOn() {
        return marineDaysOn;
    }

    public void setMarineDaysOn(Integer marineDaysOn) {
        this.marineDaysOn = marineDaysOn;
    }

    public Integer getTrainingDays() {
        return trainingDays;
    }

    public void setTrainingDays(Integer trainingDays) {
        this.trainingDays = trainingDays;
    }

    public Integer getSickDays() {
        return sickDays;
    }

    public void setSickDays(Integer sickDays) {
        this.sickDays = sickDays;
    }

    public Integer getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(Integer vacationDays) {
        this.vacationDays = vacationDays;
    }

    public Integer getUnpaidWorkingDays() {
        return unpaidWorkingDays;
    }

    public void setUnpaidWorkingDays(Integer unpaidWorkingDays) {
        this.unpaidWorkingDays = unpaidWorkingDays;
    }

    public Integer getEducationalVacation() {
        return educationalVacation;
    }

    public void setEducationalVacation(Integer educationalVacation) {
        this.educationalVacation = educationalVacation;
    }

    @Override
    public String toString() {
        return "Workers{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", number=" + number +
                ", email='" + email + '\'' +
                ", marineDaysOn=" + marineDaysOn +
                ", trainingDays=" + trainingDays +
                ", sickDays=" + sickDays +
                ", vacationDays=" + vacationDays +
                ", unpaidWorkingDays=" + unpaidWorkingDays +
                ", educationalVacation=" + educationalVacation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Workers workers)) return false;
        return Objects.equals(getId(), workers.getId()) && Objects.equals(getFirstName(), workers.getFirstName()) && Objects.equals(getLastname(), workers.getLastname()) && Objects.equals(getNumber(), workers.getNumber()) && Objects.equals(getEmail(), workers.getEmail()) && Objects.equals(getMarineDaysOn(), workers.getMarineDaysOn()) && Objects.equals(getTrainingDays(), workers.getTrainingDays()) && Objects.equals(getSickDays(), workers.getSickDays()) && Objects.equals(getVacationDays(), workers.getVacationDays()) && Objects.equals(getUnpaidWorkingDays(), workers.getUnpaidWorkingDays()) && Objects.equals(getEducationalVacation(), workers.getEducationalVacation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastname(), getNumber(), getEmail(), getMarineDaysOn(), getTrainingDays(), getSickDays(), getVacationDays(), getUnpaidWorkingDays(), getEducationalVacation());
    }
}


