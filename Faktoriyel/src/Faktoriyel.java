import java.util.Scanner;

public class Faktoriyel {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Faktöriyelini almak istediğiniz sayıyı giriniz: ");
		int sayi = scanner.nextInt();
		
		int toplam = 1;
		for(int i = 0; sayi>i; sayi--) {
			toplam = toplam * sayi;
		}
		
		System.out.println("Sonuç = " + toplam);
	
	}
}