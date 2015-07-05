
import com.character.APIKey;
import com.character.Accounts;
import static com.helpers.APIType.*;
import com.helpers.APIUrlHelper;
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
		
                Accounts eveAccount = new Accounts(keyID,vCode);
                APIKey apiKey = new APIKey(keyID,vCode);
                APIUrlHelper urlHelper = new APIUrlHelper();
                String url = urlHelper.getUrlString(apiKey,1,CHAR_FACTIONAL_WARFARE_STATS);
                System.out.println(url);
                
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
