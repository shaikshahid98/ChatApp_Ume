package com.example.chatapp_ume.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class UserModel  {
    private String message;

    private Account account;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }


    @Override
    public String toString() {
        return "ClassPojo [message = " + message + ", account = " + account + "]";
    }

    public class Account implements Serializable{

        public void Account() {
        }

        private String idUser;

        private Date birthDay;

        private String password;

        private String phoneNumber;

        private String sex;

        private List<String> UserNotifications;

        private String createOn;

        private String isActive;

        private String userName;

        private String updateOn;

        private String email;

        public String getIdUser() {
            return idUser;
        }

        public void setIdUser(String idUser) {
            this.idUser = idUser;
        }

        public Date getBirthDay() {
            return birthDay;
        }

        public void setBirthDay(Date birthDay) {
            this.birthDay = birthDay;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public List<String> getUserNotifications() {
            return UserNotifications;
        }

        public void setUserNotifications(List<String> UserNotifications) {
            this.UserNotifications = UserNotifications;
        }

        public String getCreateOn() {
            return createOn;
        }

        public void setCreateOn(String createOn) {
            this.createOn = createOn;
        }

        public String getIsActive() {
            return isActive;
        }

        public void setIsActive(String isActive) {
            this.isActive = isActive;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUpdateOn() {
            return updateOn;
        }

        public void setUpdateOn(String updateOn) {
            this.updateOn = updateOn;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "ClassPojo [idUser = " + idUser + ", birthDay = " + birthDay + ", password = " + password + ", phoneNumber = " + phoneNumber + ", sex = " + sex + ", UserNotifications = " + UserNotifications + ", createOn = " + createOn + ", isActive = " + isActive + ", userName = " + userName + ", updateOn = " + updateOn + ", email = " + email + "]";
        }
    }
}
