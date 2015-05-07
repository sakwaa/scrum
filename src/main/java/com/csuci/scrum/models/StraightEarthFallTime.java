
package com.csuci.scrum.models;

/**
 *
 * @author sakwaa
 */
public class StraightEarthFallTime extends Calc {
    private double dist, result;
    
    public StraightEarthFallTime() {
        
    }
    
    public void straightEarthFallTime()
    {
        this.setResult(Math.sqrt(this.dist/(super.grav/2)));
    }
    
    public void setDist(double d) {
        this.dist = d;
    }
    
    public void setResult(double val) {
        this.result = val;
    }
    
    public double getDist() {
        return this.dist;
    }
    
    public double getResult() {
        return this.result;
    }
}
