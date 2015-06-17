/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpers;

import com.character.APIKey;

/**
 *
 * @author designstation1
 */
public class APIUrlHelper {
    
    public String getUrlString(APIKey apiKey, int characterID, String choice){ //with characterID
        String tempString = "https://api.eveonline.com/";
        
        switch(choice){
            case "charSheet":
                tempString = tempString + "char/CharacterSheet.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;
            
            default:
                break;
        }
        
        return tempString;
    }
    
    
        public String getUrlString(APIKey apiKey, String choice){ //without characterID
        String tempString = "https://api.eveonline.com/";
        
        switch(choice){
            case "charSheet":
                tempString = tempString + "char/CharacterSheet.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&vCode=" + apiKey.getvCode();
                break;
                
            case "accStatus":
                tempString = tempString + "/account/AccountStatus.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&vCode=" + apiKey.getvCode();
            
            default:
                break;
        }
        
        return tempString;
    }
}
