import java.util.Scanner;

public class UsAlma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("üssü alınacak sayıyı giriniz: ");
		int sayi1 = scanner.nextInt();
		System.out.println("üssü giriniz: ");
		int sayi2 = scanner.nextInt();
		
		Us us = new Us();
		System.out.println(sayi1+"^"+sayi2+"="+us.usAlma(sayi1, sayi2)); 
	}

}