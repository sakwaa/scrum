
package com.csuci.scrum.models;

/**
 *
 * @author sakwaa
 */
public class DistanceCannonT extends Calc {
    private double angle, v, result;
    
    public DistanceCannonT() {
        
    }
    
    public void distanceCannonT() // find total time of a ball shot out of a cannon at an angle in the air
    {
        if(this.angle % 360 > 180)
            setResult(-1.0); // improper input for angle
        
        double vY = v * Math.sin(angle);
        
        this.setResult(((vY/super.grav) * 2));
    }
    
    public void setAngle(double angle) {
        this.angle = angle;
    }
    
    public void setV(double v) {
        this.v = v;
    }
    
    public void setResult(double val) {
        this.result = val;
    }
    
    public double getAngle() {
        return this.angle;
    }
    
    public double getV() {
        return this.v;
    }
    
    public double getResult() {
        return this.result;
    }
}
