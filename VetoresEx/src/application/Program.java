package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        System.out.println("Digite os números:");
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }
        
        System.out.println("NÚMEROS NEGATIVOS:");
        for (int i = 0; i < n; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
