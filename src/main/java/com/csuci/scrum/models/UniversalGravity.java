package com.csuci.scrum.models;

/**
 *
 * @author sakwaa
 */
public class UniversalGravity extends Calc {
    private double m1, m2, r, result;
    
    public UniversalGravity() {
        
    }
       
    public void universalGrav() //Law of universal gravitation
    {
        if((m1 < 0) || (m2 < 0) || (r < 0))
            this.setResult( -1.0 ); // masses and radius cannot be negative
        
        this.setResult ((super.G * m1 * m2)/(Math.pow(r, 2)));
    }
    
    public void setM1(double m1) {
        this.m1 = m1;
    }
    
    public void setM2(double m2) {
        this.m2 = m2;
    }
    
    public void setR(double r) {
        this.r = r;
    }
    
    public double getM1() {
        return this.m1;
    }
    
    public double getM2() {
        return this.m2;
    }
    
    public double getR() {
        return this.r;
    }
    
    public double getResult()
    {
        return this.result;
    }
    
    public void setResult(double val)
    {
        this.result = val;
    }
    
}
