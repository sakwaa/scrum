
package com.csuci.scrum.models;

/**
 *
 * @author sakwaa
 */
public class Power {
    private double work, time, result;
    
    public Power() {
        
    }
 
    public void power()
    {
        this.setResult(this.work / this.time);
    }
    
    public void setWork(double w) {
        this.work = w;
    }
    
    public void setTime(double t) {
        this.time = t;
    }
    
    public void setResult(double val) {
        this.result = val;
    }
    
    public double getWork() {
        return this.work;
    }
    
    public double getTime() {
        return this.time;
    }
    
    public double getResult() {
        return this.result;
    }
}
