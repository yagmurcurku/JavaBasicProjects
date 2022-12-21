import java.util.Scanner;

public class VucütKitleİndeksi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kilonuzu giriniz: ");
		double kilo = scanner.nextDouble();
		System.out.println("Boyunuzu giriniz(cm): ");
		double boy = scanner.nextDouble();
		
		double indeks = kilo/Math.pow(boy/100, 2);
		System.out.println("Vücut kitle indeksiniz = " + indeks);
		
		System.out.print("Kilonuzun durumu: ");
		
		if(indeks < 18.5) {
			System.out.println("Düşük.");
			System.out.print("Minimum almanız gereken kilo: " + (18.5*Math.pow(boy/100,2)-kilo));
			
		} else if (indeks > 25) {
			System.out.println("Fazla.");
			System.out.print("Minimum vermeniz gereken kilo: " + (kilo-24.9*Math.pow(boy/100,2)));
			
		} else {
			System.out.println("Normal.");
		}
	
	}
}