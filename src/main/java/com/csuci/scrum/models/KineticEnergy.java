
package com.csuci.scrum.models;

/**
 *
 * @author sakwaa
 */
public class KineticEnergy {
    private double mass, v, result;
    
    public KineticEnergy() {
        
    }
 
    public void kineticEnergy() // find kinetic energy
    {
        this.setResult(0.5 * this.mass * Math.pow(this.v,2));
    }
    
    public void setMass(double m) {
        this.mass = m;
    }
    
    public void setV(double v) {
        this.v = v;
    }
    
    public void setResult(double val) {
        this.result = val;
    }
    
    public double getMass() {
        return this.mass;
    }
    
    public double getV() {
        return this.v;
    }
    
    public double getResult() {
        return this.result;
    }
}
