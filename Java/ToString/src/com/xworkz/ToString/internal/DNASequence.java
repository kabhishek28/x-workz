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

    @Override
    public int hashCode(){
        return 4;
    }
    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof DNASequence) {
                DNASequence other = (DNASequence) object;
                if (this.id.equals(other.id) &&
                        this.sequence.equals(other.sequence) ) {
                    return true;
                }
            }
        }
        return false;
    }
}
