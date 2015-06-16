
package com.character;


public class Implants {
    
    private int typeID;
    private String typeName;

    public Implants (int typeID, String typeName) {
        this.typeID = typeID;
        this.typeName = typeName;
    }    
    
    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "Implants{" + "typeID=" + typeID + ", typeName=" + typeName + "}\n";
    }

}
