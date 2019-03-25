# NetCrackerJavaHomeWork2_NEW
run:
Задание 1:
    c1.toString() MyComplex:  (1.0 -3.0i)  c2.toString()  MyComplex:  (0.0 + 12.0i) 
    c2.isReal() = false   c2.isImaginary() = true
    c1.equals(c2)   false
    c1.addNew(c2)    MyComplex:  (1.0 + 9.0i) 
        c1.toString()     MyComplex:  (1.0 -3.0i)  c2.toString()  MyComplex:  (0.0 + 12.0i) 
    c1.conjugate()   MyComplex:  (1.0 + 3.0i) 
    c1.hashCode -38263441
    c2.hashCode 1076372847
    c1.equals(c2 false
    c2.equals(c1 false


Задание 2:
    p1.toString()    MyPolynomial : 1.0 + 3.0*X^2//ds 1-ый члены равны 0
    p2.toString()    MyPolynomial : 3.0 + 4.0*X^1 + 5.0*X^2
    p2.getDegre()   2// полином второй степени
    p1.multiply(p2)    MyPolynomial : 3.0 + 4.0*X^1 + 14.0*X^2 + 12.0*X^3 + 15.0*X^4// при умнажении создаеться новый полином 
    p1.multiply(p2).getDegre()   4// рзамер новго полнинома
    p1.add(p2)    MyPolynomial : 4.0 + 4.0*X^1 + 8.0*X^2//при сложение новый полниом не создаеться
    p1.hashCode()2116056418
    p2.hashCode()1611429218
    p2.equals(p1)false


Задание 3:
    z.toString()Ball  x = 0.0, y = 0.0, spead = 8.66  4.99//только создали
    z.toString()Ball  x = 8.66, y = 4.99, spead = 8.66  4.99// один раз проехал
    z.toString()Ball  x = -8.66, y = 14.97, spead = -8.66  4.99// отразил по Х и два раза проехал
    z.hashCode()1367152063
СБОРКА УСПЕШНО ЗАВЕРШЕНА (общее время: 0 секунд)
