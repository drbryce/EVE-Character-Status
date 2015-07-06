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
    private String tempString;
    
    public String getUrlString(APIType choice){ //no API info
        tempString = "https://api.eveonline.com/";
        
        switch(choice){
            case API_CALL_LIST:
                tempString = tempString + "api/CallList.xml.aspx";
                break;

            case EVE_ALLIANCE_LIST:
                tempString = tempString + "eve/AllianceList.xml.aspx";
                break;                

            case EVE_CERTIFICATE_TREE:
                tempString = tempString + "eve/CertificateTree.xml.aspx";
                break;                 

            case EVE_CONQUERABLE_STATION_LIST:
                tempString = tempString + "eve/ConquerableStationList.xml.aspx";
                break;                 
                
            case EVE_ERROR_LIST:
                tempString = tempString + "eve/ErrorList.xml.aspx";
                break;  
                
            case EVE_FACTIONAL_WARFARE_STATS:
                tempString = tempString + "eve/FacWarStats.xml.aspx";
                break;                 

            case EVE_FACTIONAL_WARFARE_TOP_100_STATS:
                tempString = tempString + "eve/FacWarTopStats.xml.aspx";
                break;                 

            case EVE_REFTYPES_LIST:
                tempString = tempString + "eve/RefTypes.xml.aspx";
                break;                 
                
            case EVE_SKILL_TREE:
                tempString = tempString + "eve/SkillTree.xml.aspx";
                break;                 
                                
            case MAP_FACTIONAL_WARFARE_SYSTEMS:
                tempString = tempString + "map/FacWarSystems.xml.aspx";
                break;                 
                            
            case MAP_JUMPS:
                tempString = tempString + "map/Jumps.xml.aspx";
                break;                  
                                
            case MAP_KILLS:
                tempString = tempString + "map/Kills.xml.aspx";
                break;                                   
            
            case MAP_SOVEREIGNTY:
                tempString = tempString + "map/Sovereignty.xml.aspx";
                break;                   

            case SERVER_SERVER_STATUS:
                tempString = tempString + "server/ServerStatus.xml.aspx";
                break;                 
 
            default:
                break;
        }
        
        return tempString;
    }
    
    public String getUrlString(APIType choice, String argument){ //no API info
        tempString = "https://api.eveonline.com/";    
        switch(choice){
            case EVE_CHARACTER_ID:
                tempString = tempString + "eve/CharacterID.xml.aspx?" + "names=" + argument;
                break;
               
            case EVE_CHARACTER_NAME:
                tempString = tempString + "eve/CharacterName.xml.aspx?" + "ids=" + argument;
                break;
                         
            case EVE_TYPE_NAME:
                tempString = tempString + "eve/TypeName.xml.aspx?" + "ids=" + argument;
                break;                
                
            default:
                break;
        }
        
        return tempString;
    }
    
    public String getUrlString(APIKey apiKey, int characterID, APIType choice){ //with characterID
        tempString = "https://api.eveonline.com/";
        switch(choice){
            case CHAR_ACCOUNT_BALANCE:
                tempString = tempString + "char/AccountBalance.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;

            case CHAR_ASSET_LIST:
                tempString = tempString + "char/AssetList.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;

            case CHAR_CHARACTER_SHEET:
                tempString = tempString + "char/CharacterSheet.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;

            case CHAR_CONTACT_LIST:
                tempString = tempString + "char/ContactList.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;

            case CHAR_CONTACT_NOTIFICATIONS:
                tempString = tempString + "char/ContactNotifications.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;
                
            case CHAR_CONTRACT_BIDS:
                tempString = tempString + "char/ContractBids.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;

            case CHAR_FACTIONAL_WARFARE_STATS:
                tempString = tempString + "char/FacWarStats.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                
                
            case CHAR_INDUSTRY_JOBS:
                tempString = tempString + "char/IndustryJobs.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                

            case CHAR_KILL_LOG:
                tempString = tempString + "char/KillLog.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                
                
            case CHAR_MAILING_LISTS:
                tempString = tempString + "char/mailinglists.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                
                
            case CHAR_MAIL_MESSAGES:
                tempString = tempString + "char/MailMessages.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                
    
            case CHAR_MARKET_ORDERS:
                tempString = tempString + "char/MarketOrders.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                
                
            case CHAR_MEDALS:
                tempString = tempString + "char/Medals.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                

            case CHAR_NOTIFICATIONS:
                tempString = tempString + "char/Notifications.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                
                
            case CHAR_RESEARCH:
                tempString = tempString + "char/Research.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                
                               
            case CHAR_SKILL_IN_TRAINING:
                tempString = tempString + "char/SkillInTraining.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                
                               
            case CHAR_SKILL_QUEUE:
                tempString = tempString + "char/SkillQueue.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                
                               
            case CHAR_STANDINGS:
                tempString = tempString + "char/Standings.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                
                               
            case CHAR_UPCOMING_CALENDAR_EVENTS:
                tempString = tempString + "char/UpcomingCalendarEvents.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                
                               
            case CHAR_WALLET_JOURNAL:
                tempString = tempString + "char/WalletJournal.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                

            case CHAR_WALLET_TRANSACTIONS:
                tempString = tempString + "char/WalletTransactions.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                  
                
            case CORP_ACCOUNT_BALANCES:
                tempString = tempString + "corp/AccountBalance.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                  
   
            case CORP_ASSET_LIST:
                tempString = tempString + "corp/AssetList.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                  
   
            case CORP_CONTACT_LIST:
                tempString = tempString + "corp/ContactList.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                  

            case CORP_CONTAINER_LOG:
                tempString = tempString + "corp/ContainerLog.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                  
   
            case CORP_CONTRACTS:
                tempString = tempString + "corp/Contracts.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                  
   
            case CORP_CONTRACT_BIDS:
                tempString = tempString + "corp/Contract_Bids.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;  
                
            case CORP_FACTIONAL_WARFARE_STATS:
                tempString = tempString + "corp/FacWarStats.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;  
                
            case CORP_INDUSTRY_JOBS:
                tempString = tempString + "corp/IndustryJobs.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;  

            case CORP_KILL_LOG:
                tempString = tempString + "corp/KillLog.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;  
                
            case CORP_MARKET_ORDERS:
                tempString = tempString + "corp/MarketOrders.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;  
                
            case CORP_MEDALS:
                tempString = tempString + "corp/Medals.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                  
            
            case CORP_MEMBER_MEDALS:
                tempString = tempString + "corp/MemberMedals.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;  
                
            case CORP_MEMBER_SECURITY:
                tempString = tempString + "corp/MemberSecurity.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                                 
                
            case CORP_MEMBER_SECURITY_LOG:
                tempString = tempString + "corp/MemberSecurityLog.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                  
                
            case CORP_MEMBER_TRACKING:
                tempString = tempString + "corp/MemberTracking.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                 

            case CORP_OUTPOST_LIST:
                tempString = tempString + "corp/OutpostList.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break; 
            
            case CORP_SHAREHOLDERS:
                tempString = tempString + "corp/Shareholders.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break; 

            case CORP_STANDINGS:
                tempString = tempString + "corp/Standings.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;  
                
            case CORP_STARBASE_DETAIL:
                tempString = tempString + "corp/StarbaseDetail.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&itemID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;                 

            case CORP_TITLES:
                tempString = tempString + "corp/Titles.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;  
                
            case EVE_CHARACTER_INFO:
                tempString = tempString + "eve/CharacterInfo.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&vCode=" + apiKey.getvCode();
                break;  
                
            default:
                break;
        }
        
        return tempString;
    }
 
    public String getUrlString(APIKey apiKey, APIType choice){ //without characterID
        tempString = "https://api.eveonline.com/";    
        switch(choice){
            case ACC_ACCOUNT_STATUS:
                tempString = tempString + "account/AccountStatus.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&vCode=" + apiKey.getvCode();
                break;
            
            case ACC_API_KEY_INFO:
                tempString = tempString + "account/APIKeyInfo.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&vCode=" + apiKey.getvCode();
                break;

            case ACC_CHARACTER_LIST:
                tempString = tempString + "account/Characters.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&vCode=" + apiKey.getvCode();
                break;
     
            case CORP_CORPORATION_SHEET:
                tempString = tempString + "corp/CorporationSheet.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&vCode=" + apiKey.getvCode();
                break;                

            case CORP_STARBASE_LIST:
                tempString = tempString + "corp/StarbaseList.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&vCode=" + apiKey.getvCode();
                break;     
                
            default:
                break;
        }
        
        return tempString;
    }

    public String getUrlString(APIKey apiKey, int characterID, int thirdID, APIType choice){ //with characterID & eventID
        tempString = "https://api.eveonline.com/";        
        switch(choice){
            case CHAR_CALENDAR_EVENT_ATTENDEES:
                tempString = tempString + "char/CharacterSheet.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&eventID=" + thirdID + "&vCode=" + apiKey.getvCode();
                break;

            case CHAR_CONTRACTS:
                tempString = tempString + "char/Contracts.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID;
                if (thirdID > 0) tempString = tempString + "&contractID=" + thirdID;
                tempString = tempString + "&vCode=" + apiKey.getvCode();
                break;

            case CHAR_CONTRACT_ITEMS:
                tempString = tempString + "char/ContractItems.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&contractID=" + thirdID + "&vCode=" + apiKey.getvCode();
                break;    
                
            case CHAR_KILL_LOG:
                tempString = tempString + "char/KillLog.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&beforeKillID=" + thirdID + "&vCode=" + apiKey.getvCode();
                break; 

            case CHAR_MARKET_ORDERS:
                tempString = tempString + "char/MarketOrders.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&orderID=" + thirdID + "&vCode=" + apiKey.getvCode();
                break; 

            case CORP_CONTRACTS:
                tempString = tempString + "corp/Contracts.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID;
                if (thirdID > 0) tempString = tempString + "&contractID=" + thirdID;
                tempString = tempString + "&vCode=" + apiKey.getvCode();
                break;
 
            case CORP_CONTRACT_ITEMS:
                tempString = tempString + "corp/ContractItems.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&contractID=" + thirdID + "&vCode=" + apiKey.getvCode();
                break;  

            case CORP_KILL_LOG:
                tempString = tempString + "corp/KillLog.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&contractID=" + thirdID + "&beforeKillID=" + apiKey.getvCode();
                break;  

            case CORP_MARKET_ORDERS:
                tempString = tempString + "corp/MarketOrders.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&orderID=" + thirdID + "&vCode=" + apiKey.getvCode();
                break;                
            
            case CORP_MEMBER_TRACKING:
                tempString = tempString + "corp/MemberTracking.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&extended=" + thirdID + "&vCode=" + apiKey.getvCode();
                break;   
                
            case CORP_OUTPOST_SERVICE_DETAIL:
                tempString = tempString + "corp/OutpostServiceDetail.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&itemID=" + thirdID + "&vCode=" + apiKey.getvCode();
                break; 

            case CORP_WALLET_JOURNAL:
                tempString = tempString + "corp/WalletJournal.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&accountKey=" + thirdID + "&vCode=" + apiKey.getvCode();
                break;                 

            case CORP_WALLET_TRANSACTIONS:
                tempString = tempString + "corp/WalletTransactions.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&accountKey=" + thirdID + "&vCode=" + apiKey.getvCode();
                break;                 
                
            default:
                break;
        }
        
        return tempString;
    }
    
    public String getUrlString(APIKey apiKey, int characterID, String thirdID, APIType choice){ //with characterID & thirdID string
        tempString = "https://api.eveonline.com/";        
        switch(choice){
                
            case CHAR_LOCATIONS:
                tempString = tempString + "char/Locations.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&IDs=" + thirdID + "&vCode=" + apiKey.getvCode();
                break; 
            
            case CHAR_MAIL_BODIES:
                tempString = tempString + "char/MailBodies.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&ids=" + thirdID + "&vCode=" + apiKey.getvCode();
                break; 

            case CHAR_NOTIFICATION_TEXTS:
                tempString = tempString + "char/NotificationTexts.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&IDs=" + thirdID + "&vCode=" + apiKey.getvCode();
                break;                 

            case CORP_LOCATIONS:
                tempString = tempString + "corp/Locations.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&IDs=" + thirdID + "&vCode=" + apiKey.getvCode();
                break;                 
                
            default:
                break;
        }
        
        return tempString;
    }  
    
    public String getUrlString(APIKey apiKey, int characterID, int thirdID, int fourthID, int fifthID, APIType choice){ //with characterID & eventID
        tempString = "https://api.eveonline.com/";       
        switch(choice){
            case CORP_WALLET_JOURNAL:
                tempString = tempString + "corp/WalletJournal.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&accountKey=" + thirdID + "&fromID=" + fourthID + "&rowCount=" + fifthID + "&vCode=" + apiKey.getvCode();
                break; 

            case CORP_WALLET_TRANSACTIONS:
                tempString = tempString + "corp/WalletTransactions.xml.aspx?" + "keyID=" + apiKey.getKeyID() + "&characterID=" + characterID + "&accountKey=" + thirdID + "&fromID=" + fourthID + "&rowCount=" + fifthID + "&vCode=" + apiKey.getvCode();
                break; 
                
                
            default:
                break;
        }
        
        return tempString;
    }
}
