
import com.character.APIKey;
import com.character.AccountStatus;
import com.character.EVECharacter;
import com.helpers.APIUrlHelper;
import com.xmlhandlers.AccountStatusHandler;
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
        

		
                APIKey apiKey = new APIKey(2200844,"2mNOIhFfJe10IU5oaEetpnRAE0OXR8wxmWyjPti9CLAXL3iIzDSKUxbZlfIIOgFz");
                APIUrlHelper urlHelper = new APIUrlHelper();
                String url = urlHelper.getUrlString(apiKey,"accStatus");
                
                /*                
		CharSheetHandler charSheetHandler = new CharSheetHandler();
		EVECharacter testChar = charSheetHandler.readDataFromXML(url);
                System.out.println(testChar.toString());
                */
                
                AccountStatusHandler accStatusHandler = new AccountStatusHandler();
                AccountStatus accStatus = accStatusHandler.readDataFromXML(url);
                System.out.println(accStatus.toString());
                
		
        
    }
    
}
