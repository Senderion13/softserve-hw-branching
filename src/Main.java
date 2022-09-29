import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int number = 4, a = 2, b = 4, c = 2;
        ex1(number);
        ex2(number);
        ex3(a, b, c);
    }

    static void ex1(int number) {
        while(number>=100){
            number%=10;
        }
        System.out.println(number==3);
    }

    static void ex2(int number) {
        if(number==1){
            System.out.println(number + " гривня");
        }
        else if (number > 1 && number < 5) {
            System.out.println(number + " гривні");
        }
        else if (number == 0 || number >= 5) {
            System.out.println(number + " гривень");
        }
    }

    static void ex3 (int a, int b, int c) {
        double d = b*b-4*a*c;
        if(d < 0){
            System.out.println("Дискримінант менше нуля");
        }
        else if(d==0){
            System.out.println("x=" + -b/(2*a));
        }
        else {
            System.out.println("x1=" + (-b + Math.sqrt(d)) / (2 * a));
            System.out.println("x2=" + (-b - Math.sqrt(d)) / (2 * a));
        }
    }
}