package com.example.chatapp_ume.Request;

import java.util.Date;

public class UserAccount {
    int idUser;
    String phoneNumber, password, email;
    Date createOn, updateOn,birthDay;
    boolean sex,isActive;
    String name;


    public UserAccount(int idUser, String phoneNumber, String password, String email, Date createOn, Date updateOn, Date birthDay, boolean sex, boolean isActive, String name) {
        this.idUser = idUser;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.email = email;
        this.createOn = createOn;
        this.updateOn = updateOn;
        this.birthDay = birthDay;
        this.sex = sex;
        this.isActive = isActive;
        this.name = name;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Date createOn) {
        this.createOn = createOn;
    }

    public Date getUpdateOn() {
        return updateOn;
    }

    public void setUpdateOn(Date updateOn) {
        this.updateOn = updateOn;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
