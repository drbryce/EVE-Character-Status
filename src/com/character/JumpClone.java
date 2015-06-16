package com.character;

import java.util.ArrayList;



public class JumpClone {
    private int jumpCloneID;
    private int typeID;
    private int locationID;
    private String cloneName;
    private ArrayList<Implants> implants;
    
    public JumpClone(){
        implants = new ArrayList();
}

    public JumpClone(int jumpCloneID, int typeID, int locationID, String cloneName){
        implants = new ArrayList();
        this.jumpCloneID = jumpCloneID;
        this.typeID = typeID;
        this.locationID = locationID;
        this.cloneName = cloneName;
}    
    
    public void addImplants(Implants implant){
        implants.add(implant);
    }    

    public int getJumpCloneID() {
        return jumpCloneID;
    }

    public void setJumpCloneID(int jumpCloneID) {
        this.jumpCloneID = jumpCloneID;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public String getCloneName() {
        return cloneName;
    }

    public void setCloneName(String cloneName) {
        this.cloneName = cloneName;
    }

    @Override
    public String toString() {
        return "JumpClone{" + "jumpCloneID=" + jumpCloneID + ", \ntypeID=" + typeID + ", \nlocationID=" + locationID + ", \ncloneName=" + cloneName + ", \nimplants=" + implants + '}';
    }
}
