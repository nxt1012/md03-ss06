package ra.bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Giải phương trình a*x^2 + b*x +c");
        System.out.println("Nhập vào giá trị của các tham số");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào giá trị của a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập vào giá trị của b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập vào giá trị của c: ");
        double c = sc.nextDouble();
        solveQuadraticEquation(a, b, c);
    }
    public static void solveQuadraticEquation(double a, double b, double c) {
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        System.out.println("Giải phương trình " + a + "*x^2 + " + b + "*x +" + c + ":");
        if (qe.getDiscriminant() > 0) {
            System.out.println("Phương trình có hai nghiệm phân biệt:");
            System.out.println("r1 = " + qe.getRoot1());
            System.out.print("r2 = " + qe.getRoot2());
        } else if (qe.getDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệm kép:");
            System.out.print("r = " + qe.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }
    }

}
