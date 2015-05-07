
package com.csuci.scrum.models;

/**
 *
 * @author sakwaa
 */
public class PowerNoWork {
    private double force, v, theta, result;
    
    public PowerNoWork() {
        
    }
 
    public void powerNoWork() 
    {
        this.setResult(this.force * this.v * Math.cos(this.theta));
    }
    
    public void setForce(double f) {
        this.force = f;
    }
    
    public void setV(double v) {
        this.v = v;
    }
    
    public void setTheta(double t) {
        this.theta = t;
    }
    
    public void setResult(double val) {
        this.result = val;
    }
    
    public double getForce() {
        return this.force;
    }
    
    public double getV() {
        return this.v;
    }
    
    public double getTheta() {
        return this.theta;
    }
    
    public double getResult() {
        return this.result;
    }
}
