package sayiTahmin;

import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Sayı tahmin oyununa hoşgeldiniz!");
		
		System.out.println("1-100 aralığında bir sayı giriniz: ");
		int tahmin = s.nextInt();
		int tahminDegeri = 1;
		
		int sayi = r.nextInt(101);
		
		
		while(tahmin != sayi) {
			if(tahmin < 0 || tahmin > 100){
				System.out.println("Lütfen 1 ile 100 arasında bir sayı giriniz: ");
				tahmin = s.nextInt();
			}
			
			else if(tahmin < sayi) {
				System.out.println("Daha büyük bir sayı giriniz: ");
				tahmin = s.nextInt();
				tahminDegeri++;
			}
			else {
				System.out.println("Daha küçük bir sayı giriniz: ");
				tahmin = s.nextInt();
				tahminDegeri++;
			}
		}
		
		System.out.println("Tebrikler, bildiniz! ");
		System.out.println(tahminDegeri +". tahminde buldunuz.");
	}
}