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
public class GravForce extends Calc {
    private double mass, result;
    
    public GravForce() {
        
    }
 
    public void gravForce() // find force
    {
        this.setResult(this.mass * super.grav);
    }
    
    public void setMass(double m) {
        this.mass = m;
    }
    
    public void setResult(double val) {
        this.result = val;
    }
    
    public double getMass() {
        return this.mass;
    }
    
    public double getResult() {
        return this.result;
    }
}
