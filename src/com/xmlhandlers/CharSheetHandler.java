
package com.xmlhandlers;

import com.character.*;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.text.ParseException;


public class CharSheetHandler extends DefaultHandler {

    private String currentElement = "";
    private StringBuilder currentText;
    private EVECharacter tempChar;
    private boolean rowsetElem = false;
    private String rowsetName = "";
    
    
    //private static final String XMLDATEFORMAT = "yyyy-MM-dd'T'HH:mm:ss";

    public EVECharacter readDataFromXML(String url) throws SAXException, IOException, ParserConfigurationException {
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		//code to load xml from web
                
		parser.parse(url,this);
		
		return tempChar;
	}
	
        @Override
	public void startDocument() throws SAXException {
		System.out.println("Start document");
		tempChar = new EVECharacter();
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
                if (currentElement == "row") rowsetStartElement(uri,localName,qName,attributes);
                
                
	}
	
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
        
        System.out.println("End element: " + qName);
        
        if (currentElement == "") return;
        
        if(!rowsetElem) normalEndElement(uri,localName,qName);
        
        currentElement = "";
        
        if (currentElement == "rowset") {
            rowsetElem = false;
            rowsetName = "";
        }
        
        
	}
        
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		if (currentText != null) {
			currentText.append(ch,start,length);
		}
		
		//System.out.println("Characters");
	}
    
    public void normalEndElement(String uri, String localName, String qName){
        //non rowset data
        try {
            SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
            
            String content = currentText.toString();
            System.out.println(content);
            Date date;
            { switch (currentElement){
                case "characterID":
                    tempChar.setCharacterID(Integer.parseInt(content));
                    
                    break;
                    
                case "name":
                    tempChar.setName(content);
                    break;
                    
                case "homeStationID":
                    tempChar.setHomeStationID(Integer.parseInt(content));
                    break;
                    
                case "DoB":
                    date = DATE_FORMAT.parse(content);
                    tempChar.setDob(date);
                    break;
                    
                case "race":
                    tempChar.setRace(content);
                    break;
                    
                case "bloodLine":
                    tempChar.setBloodLine(content);
                    break;

                case "ancestry":
                    tempChar.setAncestry(content);
                    break;
                    
                case "gender":
                    tempChar.setGender(content);
                    break;
 
                case "corporationName":
                    tempChar.setCorporationName(content);
                    break;                    

                case "corporationID":
                    tempChar.setCorporationID(Integer.parseInt(content));
                    break;                    

                case "allianceName":
                    tempChar.setAllianceName(content);
                    break;                    

                case "allianceID":
                    tempChar.setAllianceID(Integer.parseInt(content));
                    break;                      
                    
                case "factionName":
                    tempChar.setFactionName(content);
                    break;                    

                case "factionID":
                    tempChar.setFactionID(Integer.parseInt(content));
                    break;                      

                case "cloneTypeID":
                    tempChar.setCloneTypeID(Integer.parseInt(content));
                    break;                    
                    
                case "cloneName":
                    tempChar.setCloneName(content);
                    break;                    

                case "cloneSkillPoints":
                    tempChar.setCloneSkillPoints(Integer.parseInt(content));
                    break;                      
                    
                case "freeSkillPoints":
                    tempChar.setFreeSkillPoints(Integer.parseInt(content));
                    break;                      
                    
                case "freeRespecs":
                    tempChar.setFreeRespecs(Integer.parseInt(content));
                    break;                      
                    
                case "cloneJumpDate":
                    date = DATE_FORMAT.parse(content);
                    tempChar.setCloneJumpDate(date);
                    break;
                    
                case "lastRespecDate":
                    date = DATE_FORMAT.parse(content);
                    tempChar.setLastRespecDate(date);
                    break;
                    
                case "lastTimedRespec":
                    date = DATE_FORMAT.parse(content);
                    tempChar.setLastTimedRespec(date);
                    break;
                    
                case "remoteStationDate":
                    date = DATE_FORMAT.parse(content);
                    tempChar.setRemoteStationDate(date);
                    break;                    

                case "jumpActivation":
                    date = DATE_FORMAT.parse(content);
                    tempChar.setJumpActivation(date);
                    break;                     
                    
                case "jumpFatigue":
                    date = DATE_FORMAT.parse(content);
                    tempChar.setJumpFatigue(date);
                    break;                     
                    
                case "jumpLastUpdate":
                    date = DATE_FORMAT.parse(content);
                    tempChar.setJumpLastUpdate(date);
                    break;                     
                    
                case "balance":
                    tempChar.setBalance(Double.parseDouble(content));
                    break;                     

                case "intelligence":
                    tempChar.setIntelligence(Integer.parseInt(content));
                    break;                      

                case "memory":
                    tempChar.setMemory(Integer.parseInt(content));
                    break;                    
                    
                case "charisma":
                    tempChar.setCharisma(Integer.parseInt(content));
                    break;                    
                    
                case "perception":
                    tempChar.setPerception(Integer.parseInt(content));
                    break;                    

                case "willpower":
                    tempChar.setWillpower(Integer.parseInt(content));
                    break; 
    
                    
                default:
                    break;
            }}
            
            } catch (ParseException ex) {
            Logger.getLogger(CharSheetHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void rowsetStartElement(String uri, String localName, String qName,
			Attributes attributes){
        switch (rowsetName) {
            case "implants":  
                        Implants implant = new Implants(Integer.parseInt(attributes.getValue("typeID")),attributes.getValue("typeName"));
                        tempChar.addImplants(implant);
                     break;
            
            default: 
                     break;
        }
    }
}
