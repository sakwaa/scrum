/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csuci.scrum.models;

/**
 *
 * @author sakwaa
 */
public class Distance extends Calc {
    private double time, acc, vel, offset, result;
    
    public Distance() {
        
    }
    
    public void distance() // find total distance traveled
    {
        if(time < 0)
            this.setResult(-1); // iimproper input for time
        this.setResult((Math.pow(this.time, 2)*(this.acc/2)) + (this.vel * this.time) + this.offset);
    }
    
    public void setTime(double time) {
        this.time = time;
    }
    
    public void setAcc(double acc) {
        this.acc = acc;
    }
    
    public void setVel(double vel) {
        this.vel = vel;
    }
    
    public void setOffset(double offset) {
        this.offset = offset;
    }
    
    public void setResult(double val) {
        this.result = val;
    }
    
    public double getTime() {
        return this.time;
    }
    
    public double getAcc() {
        return this.acc;
    }
    
    public double getVel() {
        return this.vel;
    }
    
    public double getOffset() {
        return this.offset;
    }
    
    public double getResult() {
        return this.result;
    }
    
}
