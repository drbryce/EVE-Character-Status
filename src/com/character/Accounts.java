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
    private ArrayList<EVECharacter> characterList;
    private APIKey apiKey;
    private AccountStatus accStatus;
    
    public Accounts(int keyID, String vCode){
        characterList = new ArrayList();
        apiKey = new APIKey(keyID,vCode);
        
    }
    public Accounts(){
       characterList = new ArrayList(); 
    }
    
    public void addCharacter(String name, int characterID, int corporationID, String corporationName){
        EVECharacter tempChar = new EVECharacter();
        tempChar.setName(name);
        tempChar.setCharacterID(characterID);
        tempChar.setCorporationID(corporationID);
        tempChar.setCorporationName(corporationName);
        characterList.add(tempChar);
    }
    
    public void addCharacter(EVECharacter tempChar){
        characterList.add(tempChar);
    }
    
    public void updateCharacter(EVECharacter oldChar){
        
    }
    
    public EVECharacter getCharacter(int characterID){
        EVECharacter tempChar = null;
        for (int x = 0; x < characterList.size(); x++){
            if(characterList.get(x).getCharacterID() == characterID) tempChar = characterList.get(x);
            }
        return tempChar;
    }

    public APIKey getApiKey() {
        return apiKey;
    }

    public void setApiKey(APIKey apiKey) {
        this.apiKey = apiKey;
    }
    
    public void printAccount(){
        for (int x = 0; x < characterList.size() ; x++) {
            System.out.println(characterList.get(x));
        }
    }

    @Override
    public String toString() {
        return "Accounts{" + "characterList=" + characterList + ", apiKey=" + apiKey + ", accStatus=" + accStatus + '}';
    }


    
    
}
