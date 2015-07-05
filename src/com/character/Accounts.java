/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.character;

import java.util.ArrayList;

/**
 *
 * @author designstation1
 */
public class Accounts {
    private int keyID;
    private String vCode;
    private ArrayList<EVECharacter> characterList;
    
    public Accounts(int keyID, String vCode){
        this.keyID = keyID;
        this.vCode = vCode;
    }

    public int getKeyID() {
        return keyID;
    }

    public void setKeyID(int keyID) {
        this.keyID = keyID;
    }

    public String getvCode() {
        return vCode;
    }

    public void setvCode(String vCode) {
        this.vCode = vCode;
    }
    
    
}
