
package com.csuci.scrum.models;

/**
 * @author sakwaa
 * @author Sean Machen
 */
public class Calc {
    protected double grav; //gravity
    protected final double G = 0.0000000667;
    
    public Calc()
    {
        grav = 9.81; //Earth's gravity
    }
    
    public double getGrav() // get current gravity
    {
        return this.grav;
    }
    
    public void setGrav(double newGrav) // change gravity
    {
        this.grav = newGrav;
    }
    
    
    
//    public double universalGrav(double m1, double m2, double r) //Law of universal gravitation
//    {
//        if((m1 < 0) || (m2 < 0) || (r < 0))
//            return -1.0; // masses and radius cannot be negative
//        
//        return ((G * m1 * m2)/(Math.pow(r, 2)));
//    }
    
//    public double distance(double time, double acc, double vel, double offset) // find total distance traveled
//    {
//        if(time < 0)
//            return -1; // iimproper input for time
//        return (Math.pow(time, 2)*(acc/2)) + (vel * time) + offset;
//    }
    
//    public double straitEarthFallDist(double time) // distance of a fall strait down with Earth's gravity for a given time
//    {
//        if(time < 0)
//            return -1; // iimproper input for time
//        return ((grav/2) * Math.pow(time, 2));
//    }
    
//    public double straitEarthFallTime(double dist) // time taken to fall strait down with Earth's gravity for a given distance
//    {
//        return (Math.sqrt(dist/(grav/2)));
//    }
    
//    public double distanceCannonX(double angle, double v) // find total distance traveled of a ball shot out of a cannon at an angle in the x direction
//    {
//        if(angle % 360 > 180)
//            return -1.0; // improper input for angle
//        
//        double vX = v * Math.cos(angle);
//        
//        return (vX * distanceCannonT(angle, v));
//    }
    
//    public double distanceCannonY(double angle, double v) // find highest point of a ball shot out of a cannon at an angle
//    {
//        if(angle % 360 > 180)
//            return -1.0; // improper input for angle
//        
//        double vY = v * Math.sin(angle);
//        
//        return (vY * (distanceCannonT(angle, v)/2));
//    }
    
//    public double distanceCannonT(double angle, double v) // find total time of a ball shot out of a cannon at an angle in the air
//    {
//        if(angle % 360 > 180)
//            return -1.0; // improper input for angle
//        
//        double vY = v * Math.sin(angle);
//        
//        return ((vY/grav) * 2);
//    }
    
//    public double work(double force, double displace, double theta) // find work
//    {
//        return(force * displace * Math.cos(theta));
//    }
    
//    public double power(double work, double time) // find power
//    {
//        return(work/time);
//    }
    
//    public double force(double mass, double a) // find force
//    {
//        return (mass * a);
//    }
    
//    public double gravForce(double mass) // find gravitational force on an object
//    {
//        return force(mass, grav);
//    }
    
//    public double powerNoWork(double force, double theta, double v) // find power without knowing work
//    {
//        return (force * v * Math.cos(theta));
//    }
    
//    public double kineticEnergy(double mass, double v) // find kinetic energy
//    {
//        return (0.5 * mass * Math.pow(v,2));
//    }
    
//    public double potentialEnergy(double mass, double a, double height) // find potential energy
//    {
//        return (mass * a * height);
//    }
    
//    public double potentialEnergyGrav(double mass, double height) // find the gravitational potential energy
//    {
//        return potentialEnergy(mass, grav, height);
//    }
}