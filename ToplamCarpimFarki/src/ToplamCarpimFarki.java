import java.util.Scanner;

public class ToplamCarpimFarki {

	public static void main(String[] args) {
		
//		Girilen sayının rakamlarının toplamının ve rakamlarının çarpımının farkını yazdıran kod:

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("sayıyı giriniz: ");
		int sayi = scanner.nextInt();
		
		
		int toplam = 0;
		int yeni_sayi;
		int carpim = 1;
		
		while(sayi > 0) {
			yeni_sayi = sayi % 10;
			carpim = carpim * yeni_sayi;
			toplam = toplam + yeni_sayi;
			sayi = sayi / 10;
		}
		
		System.out.println("Girilen sayının rakamlarının toplamı = " + toplam);
		System.out.println("Girilen sayının rakamlarının çarpımı = " + carpim);
		
		System.out.println((toplam) + " - "+ (carpim) + " = " + (toplam-carpim));
		

	}

}
