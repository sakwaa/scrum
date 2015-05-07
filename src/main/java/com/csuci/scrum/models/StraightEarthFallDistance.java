
package com.csuci.scrum.models;

/**
 *
 * @author sakwaa
 */
public class StraightEarthFallDistance extends Calc {
    private double time, result;
    
    public StraightEarthFallDistance() {
        
    }
    
    public void straightEarthFallDistance() // distance of a fall strait down with Earth's gravity for a given time
    {
        if(time < 0)
            this.setResult(-1.0); // iimproper input for time
        this.setResult((super.grav/2) * Math.pow(time, 2));
    }
    
    public void setTime(double t) {
        this.time = t;
    }
    
    public void setResult(double val) {
        this.result = val;
    }
    
    public double getTime() {
        return this.time;
    }
    
    public double getResult() {
        return this.result;
    }
}
