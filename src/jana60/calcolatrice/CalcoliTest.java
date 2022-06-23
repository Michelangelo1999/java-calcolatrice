package jana60.calcolatrice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcoliTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		System.out.println("inserisci due numeri decimali: ");

		double x = Double.parseDouble(scan.nextLine());
		double y = Double.parseDouble(scan.nextLine());
		
		System.out.println("La somma tra i due numeri è: " + CalcoliHelper.somma(x, y));
		System.out.println("La differenza in modulo tra i due numeri è: " + df.format(CalcoliHelper.differenza(x, y)));
		System.out.println("Il prodotto tra i due numeri è: " + df.format(CalcoliHelper.prodotto(x, y)));
		System.out.println("Il valore assoluto del primo numero è: " + CalcoliHelper.modulo(x));
		System.out.println("Il valore assoluto del secondo numeroè: " + CalcoliHelper.modulo(y));
		System.out.println("Il massimo tra i due numeri è: " + CalcoliHelper.max(x, y));
		System.out.println("Il minimo tra i due numeri è: " + CalcoliHelper.min(x, y));
		
		System.out.println("Elevamento a potenza: inserisci la base e l'esponente: ");
		double b  = Double.parseDouble(scan.nextLine());
		int e = Integer.parseInt(scan.nextLine());
		System.out.println(b + " elevato alla " + e +" fa " + df.format(CalcoliHelper.potenza(b, e)));
		
		System.out.println("Calcolo il fattoriale -> inserisci un numero");
		int k = Integer.parseInt(scan.nextLine());
		
		System.out.println(k + "! = " + CalcoliHelper.fattoriale(k));
		
		System.out.println("Inserisci 2 numeri interi: ");
		int p = Integer.parseInt(scan.nextLine());
		int q = Integer.parseInt(scan.nextLine());
		
		System.out.println("La somma tra i due numeri è: " + CalcoliHelper.somma(p, q));
		System.out.println("La differenza in modulo tra i due numeri è: " + CalcoliHelper.differenza(p, q));
		System.out.println("Il prodotto tra i due numeri è: " + CalcoliHelper.prodotto(p, q));
		System.out.println("Il valore assoluto del primo numero è: " + CalcoliHelper.modulo(p));
		System.out.println("Il valore assoluto del secondo numeroè: " + CalcoliHelper.modulo(q));
		System.out.println("Il massimo tra i due numeri è: " + CalcoliHelper.max(p, q));
		System.out.println("Il minimo tra i due numeri è: " + CalcoliHelper.min(p, q));
		
		
		scan.close();

	}

}
