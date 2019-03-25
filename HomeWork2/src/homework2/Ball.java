/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;


/**
 *
 * @author Stas
 */
public class Ball {
    double x,y,xDelta,yDelta;
    int radius,spead,direction;

    public Ball(double x, double y, int radius, int spead,double degres) {
        double r =Math.toRadians(degres);
        this.x = (Double)Math.floor(x*100)/100.0;
        this.y = (Double)Math.floor(y*100)/100.0;
        this.radius = radius;
        xDelta = spead* Math.cos(r)  ;
        yDelta = spead* Math.sin(r);
        xDelta = (Double)Math.floor(xDelta*100)/100.0;
        yDelta = (Double)Math.floor(yDelta*100)/100.0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getxDelta() {
        return xDelta;
    }

    public double getyDelta() {
        return yDelta;
    }

    public int getRadius() {
        return radius;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setyDelta(float yDelata) {
        this.yDelta = yDelata;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public void move(){
        x += xDelta;
        y += yDelta;
    }
    
    public void reflectHorizontal(){
        yDelta*=-1;
    }
    
    public void reflectVertical(){
        xDelta*=-1;
    }

    @Override
    public String toString() {
        return "Ball " + " x = " + x + ", y = " + y + ", spead = " + xDelta + "  " + yDelta;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.xDelta) ^ (Double.doubleToLongBits(this.xDelta) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.yDelta) ^ (Double.doubleToLongBits(this.yDelta) >>> 32));
        hash = 31 * hash + this.radius;
        hash = 31 * hash + this.spead;
        hash = 31 * hash + this.direction;
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
        final Ball other = (Ball) obj;
        if (Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.x)) {
            return false;
        }
        if (Double.doubleToLongBits(this.y) != Double.doubleToLongBits(other.y)) {
            return false;
        }
        if (Double.doubleToLongBits(this.xDelta) != Double.doubleToLongBits(other.xDelta)) {
            return false;
        }
        if (Double.doubleToLongBits(this.yDelta) != Double.doubleToLongBits(other.yDelta)) {
            return false;
        }
        if (this.radius != other.radius) {
            return false;
        }
        if (this.spead != other.spead) {
            return false;
        }
        if (this.direction != other.direction) {
            return false;
        }
        return true;
    }
    
    
    
}
