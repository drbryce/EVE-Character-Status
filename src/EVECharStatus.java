
import com.character.APIKey;
import com.character.AccountController;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;



/**
 *
 * @author bryce
 */
public class EVECharStatus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
        
                int keyID = 2200844;
                String vCode = "2mNOIhFfJe10IU5oaEetpnRAE0OXR8wxmWyjPti9CLAXL3iIzDSKUxbZlfIIOgFz";
		
                AccountController accController = new AccountController();
                accController.addAccount(keyID,vCode);
                
                APIKey testKey = new APIKey(keyID,vCode);
                System.out.println(accController.getAccount(testKey));
                

                //accController.printAccounts();

                /*
                Accounts eveAccount = new Accounts(keyID,vCode);
                APIKey apiKey = new APIKey(keyID,vCode);
                APIUrlHelper urlHelper = new APIUrlHelper();
                String url = urlHelper.getUrlString(apiKey,1,CHAR_FACTIONAL_WARFARE_STATS);
                System.out.println(url);
                */
                
                /*
                APIKey apiKey = new APIKey(keyID,vCode);
                APIUrlHelper urlHelper = new APIUrlHelper();
                String url = urlHelper.getUrlString(apiKey,"accStatus");
                AccountStatusHandler accStatusHandler = new AccountStatusHandler();
                AccountStatus accStatus = accStatusHandler.readDataFromXML(url);
                System.out.println(accStatus.toString())
                */
                
                /*                
		CharSheetHandler charSheetHandler = new CharSheetHandler();
		EVECharacter testChar = charSheetHandler.readDataFromXML(url);
                System.out.println(testChar.toString());
                */
                

                
		
        
    }
    
}
