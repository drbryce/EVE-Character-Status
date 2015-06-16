
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

        	String url = "https://api.eveonline.com/char/CharacterSheet.xml.aspx?keyID=2200844&characterID=1972337677&vCode=2mNOIhFfJe10IU5oaEetpnRAE0OXR8wxmWyjPti9CLAXL3iIzDSKUxbZlfIIOgFz";
		
		CharSheetHandler charSheetHandler = new CharSheetHandler();
		testChar = charSheetHandler.readDataFromXML(url);
                System.out.println(testChar.toString());
                
		
        
    }
    
}
