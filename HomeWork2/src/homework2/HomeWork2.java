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
public class HomeWork2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(1,-3);
        MyComplex c2 = new MyComplex(0,12);
        System.out.println("Задание 1:");
        System.out.println("    c1.toString()" + c1.toString() + " c2.toString() " + c2.toString());
        System.out.println("    c2.isReal() = "+c2.isReal() + "   c2.isImaginary() = "+ c2.isImaginary());
        System.out.println("    c1.equals(c2)   " + c1.equals(c2));
        System.out.println("    c1.addNew(c2)   " + c1.addNew(c2));
        System.out.println("        c1.toString()    "+ c1.toString() + " c2.toString() " + c2.toString());
        System.out.println("    c1.conjugate()  " + c1.conjugate());
        System.out.println("    c1.hashCode " + c1.hashCode());
        System.out.println("    c2.hashCode " + c2.hashCode());
        System.out.println("    c1.equals(c2 " + c1.equals(c2));
        System.out.println("    c2.equals(c1 " + c2.equals(c1));
        System.out.println("");
        System.out.println("");
        
        
        double[] coefs1 = {1,0,3};
        double[] coefs2 = {3,4,5};
        MyPolynomial p1 = new MyPolynomial(coefs1);
        MyPolynomial p2 = new MyPolynomial(coefs2);
        System.out.println("Задание 2:");
        System.out.println("    p1.toString()   "+p1.toString() + "//ds 1-ый члены равны 0");
        System.out.println("    p2.toString()   "+p2.toString());
        System.out.println("    p2.getDegre()   "+p2.getDegre() + "// полином второй степени");
        System.out.println("    p1.multiply(p2)   "+p1.multiply(p2) + "// при умнажении создаеться новый полином ");
        System.out.println("    p1.multiply(p2).getDegre()   "+p1.multiply(p2).getDegre() +"// рзамер новго полнинома");
        System.out.println("    p1.add(p2)   "+p1.add(p2) + "//при сложение новый полниом не создаеться");
        System.out.println("    p1.hashCode()" + p1.hashCode());
        System.out.println("    p2.hashCode()" + p2.hashCode());
        System.out.println("    p2.equals(p1)" + p2.equals(p1));
        System.out.println("");
        System.out.println("");
        
        
        Ball z = new Ball(0,0,4,10,30);
        System.out.println("Задание 3:");
        System.out.println("    z.toString()"+z.toString() + "//только создали");
        z.move();
        System.out.println("    z.toString()"+z.toString() +"// один раз проехал");
        z.reflectVertical();
        z.move();
        z.move();
        System.out.println("    z.toString()"+z.toString()+"// отразил по Х и два раза проехал");
        System.out.println("    z.hashCode()" + z.hashCode());
    }
    
}
