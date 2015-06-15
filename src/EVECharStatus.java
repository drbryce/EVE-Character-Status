
import com.character.EVECharacter;
import com.xmlhandlers.CharSheetHandler;
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
        EVECharacter testChar = new EVECharacter();

        	String url = "https://api.eveonline.com/char/CharacterSheet.xml.aspx?keyID=2146364&vCode=RSFaAr1A1hAZuCKSiXVorggrZLuif9Lg8hpbsmH7uRW3TT1pi07CswsQTNSlusIx";
		
		CharSheetHandler charSheetHandler = new CharSheetHandler();
		testChar = charSheetHandler.readDataFromXML(url);
                System.out.println(testChar.toString());
                
		
        
    }
    
}
