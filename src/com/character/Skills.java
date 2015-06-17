package com.character;



public class Skills {
    private int typeID;
    private int skillPoints;
    private int level;
    private boolean published;
    
    public Skills(int typeID, int skillPoints, int level, boolean published){
        this.typeID = typeID;
        this.skillPoints = skillPoints;
        this.level = level;
        this.published = published;
        
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public int getSkillPoints() {
        return skillPoints;
    }

    public void setSkillPoints(int skillPoints) {
        this.skillPoints = skillPoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return "Skills{" + "TypeID=" + typeID + ", skillPoints=" + skillPoints + ", level=" + level + ", published=" + published + '}';
    }
    
    
    
    
}
