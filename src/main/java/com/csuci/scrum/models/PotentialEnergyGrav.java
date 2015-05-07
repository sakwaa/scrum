
package com.csuci.scrum.models;

/**
 *
 * @author sakwaa
 */
public class PotentialEnergyGrav extends Calc {
    private double mass, height, result;
    
    public PotentialEnergyGrav() {
        
    }
    
    public void potentialEnergyGrav() // find potential energy
    {
        this.setResult(this.mass * super.grav * this.height);
    }
    
    public void setMass(double m) {
        this.mass = m;
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
    
    public double getHeight() {
        return this.height;
    }
    
    public double getResult() {
        return this.result;
    }
}
