
package com.csuci.scrum.models;

/**
 *
 * @author sakwaa
 */
public class Force {
    private double mass, a, result;
    
    public Force() {
        
    }
 
    public void force()
    {
        this.setResult(this.mass * this.a);
    }
    
    public void setMass(double m) {
        this.mass = m;
    }
    
    public void setA(double a) {
        this.a = a;
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
    
    public double getResult() {
        return this.result;
    }
}
