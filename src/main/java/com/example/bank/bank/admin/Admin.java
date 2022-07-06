package com.example.bank.bank.admin;

import com.example.bank.bank.dataTypes.Gender;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document
public class Admin {

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

    public Admin(String id, String first_name, String last_name, String national_id, String password, Gender gender, String mobile, LocalDate birth_date, LocalDate created_at, LocalDate updated_at) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.national_id = national_id;
        this.password = password;
        this.gender = gender;
        this.mobile = mobile;
        this.birth_date = birth_date;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
}
