package com.xworkz.ToString.internal;

public class DNASequence {
    private String id;
    private String sequence;
    private int length;

    public DNASequence(String id, String sequence, int length) {
        this.id = id;
        this.sequence = sequence;
        this.length = length;
    }

    @Override
    public String toString() {
        return "DNA ID: " + id + ", Sequence: " + sequence + ", Length: " + length;
    }
}
