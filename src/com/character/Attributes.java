package com.character;



public class Attributes {
    private int intelligence;
    private int memory;
    private int charisma;
    private int perception;
    private int willpower;

    @Override
    public String toString() {
        return "Attributes{" + "intelligence=" + intelligence + ", memory=" + memory + ", charisma=" + charisma + ", perception=" + perception + ", willpower=" + willpower + '}';
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getPerception() {
        return perception;
    }

    public void setPerception(int perception) {
        this.perception = perception;
    }

    public int getWillpower() {
        return willpower;
    }

    public void setWillpower(int willpower) {
        this.willpower = willpower;
    }
    

}
