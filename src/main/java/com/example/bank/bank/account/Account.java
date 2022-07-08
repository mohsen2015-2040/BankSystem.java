package package com.example.bank.bank.account;
import com.example.bank.bank.dataTypes.AccountType;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

public class Account {
    private String id;
    private String ownerName;
    private String accountNumber;
    private double value;
    private AccountType accountType ;
    private LocalDate created_at;
    private LocalDate updated_at;
    public Account(String id, String ownerName, String accountNumber,double value, AccountType accountType, LocalDate created_at, LocalDate updated_at){
        this.id = id;
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.value = value;
        this.accountType = accountType;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    //getter methods
    public String getId() {
        return id;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getValue() {
        return value;
    }
    public AccountType getAccountType() {
        return accountType;
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
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }
    public void setUpdated_at(LocalDate updated_at) {
        this.updated_at = updated_at;
    }

    //edit account value
    public void setValue(double value1){
        this.value += value1;
    }
}