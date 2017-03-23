package com.gamedevelop;

/**
 * Created by KenTerror on 08.11.2016.
 */
public class Horse
{
    private String name;
    private double speed;
    private double distance;

    public Horse(String name, double speed, double distance)
    {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getSpeed()
    {
        return speed;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public double getDistance()
    {
        return distance;
    }

    public void setDistance(double distance)
    {
        this.distance = distance;
    }

    public void move() {
        this.distance += this.speed*Math.random();
        this.distance = Math.round(this.distance);
    }

    public void print() {
        for (int i = 0; i < this.distance; i++) {
            System.out.print(".");
        }
        System.out.println(this.name);
    }
}
