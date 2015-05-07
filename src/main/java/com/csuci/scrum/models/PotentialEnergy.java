
package com.csuci.scrum.models;

/**
 *
 * @author sakwaa
 */
public class PotentialEnergy {
    private double mass, a, height, result;
    
    public PotentialEnergy() {
        
    }
    
    public void potentialEnergy() // find potential energy
    {
        this.setResult(this.mass * this.a * this.height);
    }
    
    public void setMass(double m) {
        this.mass = m;
    }
    
    public void setA(double a) {
        this.a = a;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public void setResult(double val) {
        this.result = val;
    }
    
    public double getMass() {
        return this.mass;
    }
    
    public double getA() {
        return this.a;
    }
    
    public double getHeight() {
        return this.height;
    }
    
    public double getResult() {
        return this.result;
    }
}
