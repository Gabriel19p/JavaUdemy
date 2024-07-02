package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();						
		}
		
		System.out.println("Valores: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f ", vect[i]);
        }
        System.out.println();
        
		double sum = 0.0;
		
		for (int i=0; i<n; i++) {
		sum += vect [i];
		}
		double med = sum / n;
		
		System.out.println("Soma: " + sum);
		System.out.println("Media: " + med);
		sc.close();
		}		
}

