
package com.character;

import com.helpers.*;
import com.xmlhandlers.AccountCharactersHandler;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;


public class AccountController {

    private ArrayList<Accounts> accounts;
    private APIUrlHelper urlHelper;
    
    public AccountController(){
        urlHelper = new APIUrlHelper();
        accounts = new ArrayList();
    }
    
    public void addAccount(int keyID, String vCode) throws SAXException, IOException, ParserConfigurationException{
        Accounts tempAccount = new Accounts(keyID,vCode);

        AccountCharactersHandler accCharHandler = new AccountCharactersHandler();

        ArrayList<EVECharacter> tempCharList = accCharHandler.readDataFromXML(urlHelper.getUrlString(tempAccount.getApiKey(), APIType.ACC_CHARACTER_LIST));
        for (int x = 0; x < tempCharList.size() ; x++) {
            tempAccount.addCharacter(tempCharList.get(x));
        }
        
        accounts.add(tempAccount);
    }

    public Accounts getAccount(APIKey apiKey){
        Accounts tempAccount = null;
        
        for (int x = 0; x < accounts.size(); x++){
            if(accounts.get(x).getApiKey().getKeyID() == apiKey.getKeyID() && 
                    apiKey.getvCode().equals(accounts.get(x).getApiKey().getvCode()))tempAccount = accounts.get(x);
        }
        return tempAccount;
        
    }
    
    public void printAccounts(){
        for (int x = 0; x < accounts.size() ; x++) {
            accounts.get(x).printAccount();
        }    
    }
}
