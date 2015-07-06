package com.character;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;



public class EVECharacter {
    private int characterID;
    private String name;
    private int homeStationID;
    private Date dob;
    private String race;
    private String bloodLine;
    private String ancestry;
    private String gender;
    private String corporationName;
    private int corporationID;
    private String allianceName;
    private int allianceID;
    private String factionName;
    private int factionID;
    private int cloneTypeID;
    private String cloneName;
    private int cloneSkillPoints;
    private int freeSkillPoints;
    private int freeRespecs;
    private Date cloneJumpDate;
    private Date lastRespecDate;
    private Date lastTimedRespec;
    private Date remoteStationDate;
    private Date jumpActivation;
    private Date jumpFatigue;
    private Date jumpLastUpdate;
    private double balance;
    private ArrayList<Skills> skillList;
    private ArrayList<Titles> titles;
    private Attributes attributes;
    private ArrayList<Implants> implants;
    private ArrayList<JumpClone> jumpClones;
    
    public EVECharacter (){
        attributes = new Attributes();
        implants = new ArrayList();
        jumpClones = new ArrayList();
        skillList = new ArrayList();
    }
    
    //public EVECharacter()
    
    public void addJumpClones(JumpClone jumpClone){
        jumpClones.add(jumpClone);
    }
    
    public void addJumpCloneImplants(JumpClone jumpClone, Implants implant){
        jumpClone.addImplants(implant);
    }
    
    public JumpClone getJumpClone(int jumpCloneID){
        JumpClone tempClone = null;
        for (int x = 0; x <= jumpClones.size(); x++){
            if (jumpClones.get(x).getJumpCloneID() == jumpCloneID) {
                tempClone = jumpClones.get(x);
                break;
                }
        }
            return tempClone;
    }
    
    
    public void addSkills (Skills skills){
        skillList.add(skills);
    }
    
    
    public void addImplants(Implants implant){
        implants.add(implant);
    }
    
    
    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public int getCharacterID() {
        return characterID;
    }

    public void setCharacterID(int characterID) {
        this.characterID = characterID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHomeStationID() {
        return homeStationID;
    }

    public void setHomeStationID(int homeStationID) {
        this.homeStationID = homeStationID;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getBloodLine() {
        return bloodLine;
    }

    public void setBloodLine(String bloodLine) {
        this.bloodLine = bloodLine;
    }

    public String getAncestry() {
        return ancestry;
    }

    public void setAncestry(String ancestry) {
        this.ancestry = ancestry;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCorporationName() {
        return corporationName;
    }

    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName;
    }

    public int getCorporationID() {
        return corporationID;
    }

    public void setCorporationID(int corporationID) {
        this.corporationID = corporationID;
    }

    public String getAllianceName() {
        return allianceName;
    }

    public void setAllianceName(String allianceName) {
        this.allianceName = allianceName;
    }

    public int getAllianceID() {
        return allianceID;
    }

    public void setAllianceID(int allianceID) {
        this.allianceID = allianceID;
    }

    public String getFactionName() {
        return factionName;
    }

    public void setFactionName(String factionName) {
        this.factionName = factionName;
    }

    public int getFactionID() {
        return factionID;
    }

    public void setFactionID(int factionID) {
        this.factionID = factionID;
    }

    public int getCloneTypeID() {
        return cloneTypeID;
    }

    public void setCloneTypeID(int cloneTypeID) {
        this.cloneTypeID = cloneTypeID;
    }

    public String getCloneName() {
        return cloneName;
    }

    public void setCloneName(String cloneName) {
        this.cloneName = cloneName;
    }

    public int getCloneSkillPoints() {
        return cloneSkillPoints;
    }

    public void setCloneSkillPoints(int cloneSkillPoints) {
        this.cloneSkillPoints = cloneSkillPoints;
    }

    public int getFreeSkillPoints() {
        return freeSkillPoints;
    }

    public void setFreeSkillPoints(int freeSkillPoints) {
        this.freeSkillPoints = freeSkillPoints;
    }

    public int getFreeRespecs() {
        return freeRespecs;
    }

    public void setFreeRespecs(int freeRespecs) {
        this.freeRespecs = freeRespecs;
    }

    public Date getCloneJumpDate() {
        return cloneJumpDate;
    }

    public void setCloneJumpDate(Date cloneJumpDate) {
        this.cloneJumpDate = cloneJumpDate;
    }

    public Date getLastRespecDate() {
        return lastRespecDate;
    }

    public void setLastRespecDate(Date lastRespecDate) {
        this.lastRespecDate = lastRespecDate;
    }

    public Date getLastTimedRespec() {
        return lastTimedRespec;
    }

    public void setLastTimedRespec(Date lastTimedRespec) {
        this.lastTimedRespec = lastTimedRespec;
    }

    public Date getRemoteStationDate() {
        return remoteStationDate;
    }

    public void setRemoteStationDate(Date remoteStationDate) {
        this.remoteStationDate = remoteStationDate;
    }

    public Date getJumpActivation() {
        return jumpActivation;
    }

    public void setJumpActivation(Date jumpActivation) {
        this.jumpActivation = jumpActivation;
    }

    public Date getJumpFatigue() {
        return jumpFatigue;
    }

    public void setJumpFatigue(Date jumpFatigue) {
        this.jumpFatigue = jumpFatigue;
    }

    public Date getJumpLastUpdate() {
        return jumpLastUpdate;
    }

    public void setJumpLastUpdate(Date jumpLastUpdate) {
        this.jumpLastUpdate = jumpLastUpdate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Skills> getSkillList() {
        return skillList;
    }

    public void setSkillList(ArrayList<Skills> skillList) {
        this.skillList = skillList;
    }

    public ArrayList<Titles> getTitles() {
        return titles;
    }

    public void setTitles(ArrayList<Titles> titles) {
        this.titles = titles;
    }

    public int getIntelligence() {
        return this.attributes.getIntelligence();
    }

    public void setIntelligence(int intelligence) {
        this.attributes.setIntelligence(intelligence);
    }

    public int getMemory() {
        return this.attributes.getMemory();
    }

    public void setMemory(int memory) {
        this.attributes.setMemory(memory);
    }

    public int getCharisma() {
        return this.attributes.getCharisma();
    }

    public void setCharisma(int charisma) {
        this.attributes.setCharisma(charisma);
    }

    public int getPerception() {
        return this.attributes.getPerception();
    }

    public void setPerception(int perception) {
        this.attributes.setPerception(perception);
    }

    public int getWillpower() {
        return this.attributes.getWillpower();
    }

    public void setWillpower(int willpower) {
        this.attributes.setWillpower(willpower);
    }

    @Override
    public String toString() {
        return "EVECharacter{" + "characterID=" + characterID + ", name=" + name + ", homeStationID=" + homeStationID + ", dob=" + dob + ", race=" + race + ", bloodLine=" + bloodLine + ", ancestry=" + ancestry + ", gender=" + gender + ", corporationName=" + corporationName + ", corporationID=" + corporationID + ", allianceName=" + allianceName + ", allianceID=" + allianceID + ", factionName=" + factionName + ", factionID=" + factionID + ", cloneTypeID=" + cloneTypeID + ", cloneName=" + cloneName + ", cloneSkillPoints=" + cloneSkillPoints + ", freeSkillPoints=" + freeSkillPoints + ", freeRespecs=" + freeRespecs + ", cloneJumpDate=" + cloneJumpDate + ", lastRespecDate=" + lastRespecDate + ", lastTimedRespec=" + lastTimedRespec + ", remoteStationDate=" + remoteStationDate + ", jumpActivation=" + jumpActivation + ", jumpFatigue=" + jumpFatigue + ", jumpLastUpdate=" + jumpLastUpdate + ", balance=" + balance + ", skillList=" + skillList + ", titles=" + titles + ", attributes=" + attributes + ", implants=" + implants + ", jumpClones=" + jumpClones + '}';
    }

    





    
    
}
