package com.xworkz.object.runner;

import com.xworkz.object.external.Bucket;

import java.io.*;

public class BucketRunner {
    public static void main(String[] args) {
//        Using Deserialization how to create this using object

        try {
            Bucket bucket = new Bucket("yellow" , 300);
            bucket.display();
            System.out.println("hash code bucket : " + bucket.hashCode());
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("bucket.ser"));
            out.writeObject(bucket);
            System.out.println("Object serialized!");
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("bucket.ser"));
            Bucket bucket1 = (Bucket) inputStream.readObject();
            bucket1.display();
            System.out.println("hash code bucket1 : " + bucket1.hashCode() );
            System.out.println("Object deserialized!");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
