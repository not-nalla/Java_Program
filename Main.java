class Complex {
    int real, imag;

    Complex() {
        real = 0;
        imag = 0;
    }

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    Complex(Complex c) {
        real = c.real;
        imag = c.imag;
    }

    Complex add(Complex c) {
        Complex temp = new Complex();
        temp.real = this.real + c.real;
        temp.imag = this.imag + c.imag;
        return temp;
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(5, 6);

        Complex c3 = c1.add(c2);
        Complex c4 = new Complex(c3);

        c1.display();
        c2.display();
        c3.display();
        c4.display();
    }
}
