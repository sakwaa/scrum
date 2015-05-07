
package com.csuci.scrum.models;

/**
 *
 * @author sakwaa
 */
public class DistanceCannonX extends Calc {
    private double angle, v, result;
 
    public void distanceCannonX() // find total distance traveled of a ball shot out of a cannon at an angle in the x direction
    {
        if(angle % 360 > 180)
            this.setResult(-1.0); // improper input for angle
        
        DistanceCannonT dct = new DistanceCannonT();
        dct.setAngle(this.angle);
        dct.setV(this.v);
        dct.distanceCannonT();
        
        double vX = v * Math.cos(angle);
        
        this.setResult(vX * dct.getResult());
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
