
package com.csuci.scrum.models;

/**
 *
 * @author sakwaa
 */
public class Work {
    private double force, displace, theta, result;
    
    public Work() {
        
    }
 
    public void work()
    {
        this.setResult(this.force * this.displace * Math.cos(this.theta));
    }
    
    public void setForce(double f) {
        this.force = f;
    }
    
    public void setDisplace(double d) {
        this.displace = d;
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
    
    public double getDisplace() {
        return this.displace;
    }
    
    public double getResult() {
        return this.result;
    }
}
