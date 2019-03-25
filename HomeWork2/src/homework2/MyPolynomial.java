/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.util.Arrays;

/**
 *
 * @author Stas
 */
public class MyPolynomial {
    double[] coefs;

    public MyPolynomial(double[] coefs) {
        this.coefs = new double[coefs.length];
        this.coefs = coefs;
    }
    
    public int getDegre(){
        return coefs.length-1;
    }

    @Override
    public String toString() {
        String result = " MyPolynomial : ";
        result += coefs[0] + " + ";
        for(int i = 1;i<coefs.length - 1;i++){
            if(coefs[i] != 0){
                result += coefs[i] + "*X^" + i + " + ";
            }            
        }
        result += coefs[coefs.length - 1] + "*X^" + (coefs.length - 1);
        return result;
    }
    public double evaluate(int x){
        if(x<0 || x>coefs.length){
            return 9999999;
        }
        return coefs[x];
    }
    
    public MyPolynomial add(MyPolynomial obj){
        MyPolynomial obj2 = new MyPolynomial(this.coefs);
        if(obj2.coefs.length<obj.coefs.length){
            for(int i = 0;i<obj2.coefs.length;i++){
                obj2.coefs[i] += obj.coefs[i];
            }
        }else{        
            for(int i = 0;i<obj.coefs.length;i++){
                obj2.coefs[i] += obj.coefs[i];
            }       
        }
        return obj2;    
    }
    
    public MyPolynomial multiply(MyPolynomial obj){
        
        MyPolynomial obj2 = new MyPolynomial(this.coefs);
        double[] coefs2 = new double[obj.getDegre() * obj2.getDegre() + 1];
        for(double z:coefs2){
            z = 0;
        }
        
        MyPolynomial obj3 = new MyPolynomial(coefs2);
        //System.out.println("obj3.getDegre() " +obj3.getDegre());
        
        for(int i = 0;i<obj.coefs.length;i++){ 
            //System.out.println(" i = " + i);
            //System.out.println("obj3" + obj3.toString()); 
            for(int j = 0;j<obj.coefs.length;j++){
                obj3.coefs[j+i] += obj.coefs[i] * obj2.coefs[j];
                //System.out.println(" i = " + i + " j = " + j);
                //System.out.println("obj3" + obj3.toString());
            }
        }
        
        return obj3;    
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Arrays.hashCode(this.coefs);
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
        final MyPolynomial other = (MyPolynomial) obj;
        if (!Arrays.equals(this.coefs, other.coefs)) {
            return false;
        }
        return true;
    }
    
}
