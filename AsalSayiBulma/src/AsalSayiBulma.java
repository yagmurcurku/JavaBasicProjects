import java.util.Scanner;

public class AsalSayiBulma {

	public static void main(String[] args) {
		// İstenen aralıktaki asal sayıları ekrana yazdırma.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Başlangıç değerini giriniz: ");
		int baslangic = scanner.nextInt();
		System.out.println("Bitiş değerini giriniz: ");
		int bitis = scanner.nextInt();
		
		System.out.println(baslangic + " ile " + bitis + " sayıları arasındaki asal sayılar:");
		
		baslangic = baslangic +1;
		
		for(; baslangic<bitis; baslangic++) {
			
			int toplam = 0;
			for(int j = 2; j<baslangic; j++) {
				if(baslangic % j == 0) {
					toplam = toplam + 1;
				}
			}
			if(toplam == 0) {
				System.out.println(baslangic + "asal bir sayıdır.");
			}			
		}
		
	}
}