/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.character;

/**
 *
 * @author designstation1
 */
public class APIKey {
    
    private int keyID;
    private String vCode;
    
    public APIKey(int keyID, String vCode){
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

    @Override
    public String toString() {
        return "APIKey{" + "keyID=" + keyID + ", vCode=" + vCode + '}';
    }
    
    
    
    
}
