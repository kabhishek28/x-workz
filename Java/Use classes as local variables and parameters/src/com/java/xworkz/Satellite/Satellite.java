package com.java.xworkz.Satellite;

public class Satellite {
    private Type type;
    private long cost;
    private long weight;
    private long loadCapacity;

    public void setType(Type type){
        this.type = type;
    }
    public void setCost(long cost){
        this.cost=cost;
    }
    public void setWeight(long weight){
        this.weight=weight;
    }
    public void setLoadCapacity(long loadCapacity){
        this.loadCapacity=loadCapacity;
    }

    public Type getType(){
        return this.type;
    }
    public long getCost(){
        return this.cost;
    }
    public long getWeight(){
        return this.weight;
    }
    public long getLoadCapacity(){
        return this.loadCapacity;
    }
}
