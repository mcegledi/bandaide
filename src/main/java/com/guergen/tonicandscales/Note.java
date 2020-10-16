package com.guergen.tonicandscales;

public enum Note {
    C("C"),
    C_SQUARE( "C#"),
    D( "D"),
    D_SQUARE( "D#"),
    E("E"),
    F("F"),
    F_SQUARE("F#"),
    G("G"),
    G_SQUARE("G#"),
    A("A"),
    A_SQUARE("A#"),
    B("B");

    private String representation;
    Note(String representation) {
        this.representation = representation;
    }

    public String getRepresentation() {
        return representation;
    }


    @Override
    public String toString() {
        return this.representation;
    }
}
