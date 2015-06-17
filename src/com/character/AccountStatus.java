/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.character;

import java.util.Date;

/**
 *
 * @author designstation1
 */
public class AccountStatus {
    //Date paidUntil;
    //Date createDate;
    String paidUntil;
    String createDate;
    int logonCount;
    int logonMinutes;

    public String getPaidUntil() {
        return paidUntil;
    }

    public void setPaidUntil(String paidUntil) {
        this.paidUntil = paidUntil;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getLogonCount() {
        return logonCount;
    }

    public void setLogonCount(int logonCount) {
        this.logonCount = logonCount;
    }

    public int getLogonMinutes() {
        return logonMinutes;
    }

    public void setLogonMinutes(int logonMinutes) {
        this.logonMinutes = logonMinutes;
    }


    @Override
    public String toString() {
        return "AccountStatus{" + "paidUntil=" + paidUntil + ", createDate=" + createDate + ", logonCount=" + logonCount + ", logonMinutes=" + logonMinutes + '}';
    }
    
}
