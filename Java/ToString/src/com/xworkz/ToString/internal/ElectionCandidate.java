package com.xworkz.ToString.internal;

public class ElectionCandidate {
    private String name;
    private String party;
    private int age;

    public ElectionCandidate(String name, String party, int age) {
        this.name = name;
        this.party = party;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Candidate: " + name + ", Party: " + party + ", Age: " + age;
    }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof ElectionCandidate) {
                ElectionCandidate other = (ElectionCandidate) object;
                if (this.name.equals(other.name) &&
                        this.party.equals(other.party) &&
                        this.age == other.age) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner
