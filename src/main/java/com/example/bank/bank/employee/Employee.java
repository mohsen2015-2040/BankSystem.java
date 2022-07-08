package com.example.bank.bank.employee;

import com.example.bank.bank.dataTypes.Gender;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Data
@Document
public class Employee {
    @Id
    private String id;
    private String first_name;
    private String last_name;
    private String national_id;
    private String password;
    private Gender gender;
    private String mobile;
    private LocalDate birth_date;

    @CreatedDate
    private LocalDate created_at;
    private LocalDate updated_at;

    public Employee(String id, String first_name, String last_name, String national_id, String password, Gender gender, String mobile, LocalDate birth_date, LocalDate created_at, LocalDate updated_at)
    throws UserPasswordException{
        if (password.length() < 3){
            throw new UserPasswordException("The password is too short!");
        }
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.national_id = national_id;
        this.password = password;
        this.gender = gender;
        this.mobile = mobile;
        this.birth_date = birth_date;
        this.created_at = created_at;
        this.updated_at =updated_at;
    }

    //getter methods
    public String getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getNational_id() {
        return national_id;
    }

    public String getPassword() {
        return password;
    }

    public Gender getGender() {
        return gender;
    }

    public String getMobile() {
        return mobile;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

    public LocalDate getUpdated_at() {
        return updated_at;
    }

    //setter methods
    public void setId(String id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setNational_id(String national_id) {
        this.national_id = national_id;
    }

    public void setPassword(String password) throws UserPasswordException{
        if (password.length() < 3){
            throw new UserPasswordException("The password is too short!");
        }
        this.password = password;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(LocalDate updated_at) {
        this.updated_at = updated_at;
    }
}
