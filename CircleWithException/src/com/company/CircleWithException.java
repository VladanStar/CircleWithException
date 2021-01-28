package com.company;

public class CircleWithException {
    // poluprecnik kruga
    private double radius;
    private static int numberOfObjects = 0;
    // konstruisanje kruga sa poluprecnikom 1


    public CircleWithException() {
        this(1.0);
    }

    public CircleWithException(double newRadius) {
       setRadius(newRadius);
       numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) throws IllegalArgumentException{
       if(newRadius>=0){
           radius = newRadius;
       }
       else{
           throw new IllegalArgumentException("Radius can not be negative");
       }

    }
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /**
     * Vraća površinu ovog kruga
     */
    public double findArea() {
        return radius * radius * 3.14159;
    }
}
