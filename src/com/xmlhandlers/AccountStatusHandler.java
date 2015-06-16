/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xmlhandlers;

import com.character.AccountStatus;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author designstation1
 */
public class AccountStatusHandler extends DefaultHandler{
    
            String currentElement;
            StringBuilder currentText;
            boolean rowsetElem;
            String rowsetName;
    
    public AccountStatus readDataFromXML(String url) throws SAXException, IOException, ParserConfigurationException {
	
        AccountStatus accountStatus = new AccountStatus();
        SAXParserFactory factory = SAXParserFactory.newInstance();
	SAXParser parser = factory.newSAXParser();
	//code to load xml from web
                
	parser.parse(url,this);
		
	return accountStatus;
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
                if (currentElement == "row") rowsetStartElement(uri,localName,qName,attributes);
            }

        public void rowsetStartElement(String uri, String localName, String qName,
			Attributes attributes){
            switch (rowsetName) {
                case "implants":  
                        //todo
                     break;
            
                default: 
                     break;
        }
    }        
}
