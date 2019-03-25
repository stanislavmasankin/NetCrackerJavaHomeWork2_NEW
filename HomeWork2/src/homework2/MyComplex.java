/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import static java.lang.Math.sqrt;


public class MyComplex {
    public double real = 0.0;
    public double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real,double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public void  setValue(double real,double imag){
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        if(imag>0)
        return " MyComplex:  (" + real + " + " + imag + "i) ";
        else return " MyComplex:  (" + real + " " + imag + "i) ";
    }
    
    public boolean isReal(){
        if(this.real != 0.0){
            return true;
        }else return false;          
    }
    public boolean isImaginary(){
        if(this.imag != 0.0){
            return true;
        }else return false;          
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.real) ^ (Double.doubleToLongBits(this.real) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.imag) ^ (Double.doubleToLongBits(this.imag) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MyComplex other = (MyComplex) obj;
        if (Double.doubleToLongBits(this.real) != Double.doubleToLongBits(other.real)) {
            return false;
        }
        if (Double.doubleToLongBits(this.imag) != Double.doubleToLongBits(other.imag)) {
            return false;
        }
        return true;
    }
    
    public double magnitude(){
        return sqrt(real*real +imag*imag);
    }
    
    public double argyment(){
        if (this.real > 0) {
            return Math.atan(imag / real);
        } else {
            if (real < 0 && imag > 0) {
                return Math.PI + Math.atan(imag / real);
            } else {
                return -Math.PI + Math.atan(imag / real);
            }
        }
    }
    
    public MyComplex add(MyComplex obj){
        this.real +=obj.real;
        this.imag +=obj.imag;
        return this;    
    }
    
    public MyComplex addNew(MyComplex obj){
        MyComplex obj2 = new MyComplex(this.real,this.imag);
        obj2.real +=obj.real;
        obj2.imag +=obj.imag;
        return obj2;    
    }
    
    public MyComplex subtract(MyComplex obj){
        this.real -=obj.real;
        this.imag -=obj.imag;
        return this;    
    }
    
    public MyComplex subtractNew(MyComplex obj){
        MyComplex obj2 = new MyComplex(this.real,this.imag);
        obj2.real -=obj.real;
        obj2.imag -=obj.imag;
        return obj2;    
    }

    public MyComplex multiply(MyComplex obj){
        this.real =obj.real*this.real - this.imag*obj.imag;
        this.imag =obj.real*this.real + this.imag*obj.imag;
        return this;    
    }
        
    public MyComplex divide(MyComplex obj){
        this.real = (obj.real*this.real + this.imag*obj.imag)/(obj.real*obj.real+obj.imag*obj.imag);
        this.imag =(this.imag*obj.real-this.real*obj.imag)/(obj.real*obj.real+obj.imag*obj.imag);
        return this;    
    }
    
    public MyComplex conjugate(){
        MyComplex obj2 = new MyComplex(this.real,-this.imag);
        return obj2;
    }
    
}
