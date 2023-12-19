package org.launchcode;

public abstract class AbstractEntity {
    private final int ID;
    private static int nextID = 1;
    public AbstractEntity() {
        ID = nextID;
        nextID++;
    }

    public int getID() {
        return ID;
    }


}
