
package com.xmlhandlers;

import com.character.Accounts;
import com.character.EVECharacter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class AccountCharactersHandler extends DefaultHandler{
    
            String currentElement;
            StringBuilder currentText;
            boolean rowsetElem;
            String rowsetName;
            Accounts account;
            ArrayList<EVECharacter> tempCharList;
            
    public AccountCharactersHandler(){
        tempCharList = new ArrayList();
    }        
    
    public ArrayList<EVECharacter> readDataFromXML(String url) throws SAXException, IOException, ParserConfigurationException {
	

        SAXParserFactory factory = SAXParserFactory.newInstance();
	SAXParser parser = factory.newSAXParser();
	//code to load xml from web
                
	parser.parse(url,this);
		
	return tempCharList
                ;
	}
    
        @Override
        public void startDocument() throws SAXException {
            System.out.println("Start document");
	}
    
        @Override
	public void endDocument() throws SAXException {
		System.out.println("End document");
	}
        
        public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {
                System.out.println("Start element: " + qName);
		currentElement = qName;
                currentText = new StringBuilder();
    
                if (currentElement == "rowset") {
                    rowsetElem = true;
                    rowsetName = attributes.getValue("name");
                }
                if (currentElement == "row") try {
                    rowsetStartElement(uri,localName,qName,attributes);
                } catch (ParseException ex) {
                    Logger.getLogger(AccountStatusHandler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        public void rowsetStartElement(String uri, String localName, String qName,
			Attributes attributes) throws ParseException{
            
            String content = currentText.toString();
            System.out.println(content);
            
            if (rowsetName.equals("characters")){
                EVECharacter tempChar = new EVECharacter();
                tempChar.setName(attributes.getValue("name"));
                tempChar.setCharacterID(Integer.parseInt(attributes.getValue("characterID")));
                tempChar.setCorporationID(Integer.parseInt(attributes.getValue("corporationID")));
                tempChar.setCorporationName(attributes.getValue("corporationName"));
                tempCharList.add(tempChar);
            }

            
    }        

        @Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
        
        System.out.println("End element: " + qName);
        
        if (currentElement == "") return;
        
        //if(!rowsetElem) 
        normalEndElement(uri,localName,qName);
        
        currentElement = "";
        
        if (currentElement == "rowset") {
            rowsetElem = false;
            rowsetName = "";
            }
        }

        public void normalEndElement(String uri, String localName, String qName){

        }

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		if (currentText != null) {
			currentText.append(ch,start,length);
		}
		
		//System.out.println("Characters");
	}        

}
