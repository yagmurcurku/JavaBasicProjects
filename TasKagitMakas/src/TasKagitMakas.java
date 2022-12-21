import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Taş-Kağıt-Makas oyununa hoşgeldiniz!");
		System.out.println("0:Taş, 1:Kağıt, 2:Makas");
		
		int gamer_scor = 0;
		int pc_scor = 0;
		
		while(true) {
			System.out.println("Seçiminiz: ");
			int gamer_secim = s.nextInt();
			int pc_secim = r.nextInt(3);
			
			if(gamer_secim == 0) {  //TAŞ
				if(pc_secim == 0) {
					System.out.println("Bilgisayarın seçimi : TAŞ");
					System.out.println("BERABERE !");
					System.out.println("Siz : "+gamer_scor+" - Bilgisayar : "+pc_scor);
				}
				else if(pc_secim == 1) {
					System.out.println("Bilgisayarın seçimi : KAĞIT");
					pc_scor ++;
					System.out.println("Siz : "+gamer_scor+" - Bilgisayar : "+pc_scor);
				}
				else {
					System.out.println("Bilgisayarın seçimi : MAKAS");
					gamer_scor ++;
					System.out.println("Siz : "+gamer_scor+" - Bilgisayar : "+pc_scor);
				}
			}
			
			else if(gamer_secim == 1) { //KAĞIT
				if(pc_secim == 0) {
					System.out.println("Bilgisayarın seçimi : TAŞ");
					gamer_scor ++;
					System.out.println("Siz : "+gamer_scor+" - Bilgisayar : "+pc_scor);
				}
				else if(pc_secim == 1) {
					System.out.println("Bilgisayarın seçimi : KAĞIT");
					System.out.println("BERABERE !");
					System.out.println("Siz : "+gamer_scor+" - Bilgisayar : "+pc_scor);
				}
				else {
					System.out.println("Bilgisayarın seçimi : MAKAS");
					pc_scor ++;
					System.out.println("Siz : "+gamer_scor+" - Bilgisayar : "+pc_scor);
				}
			}
			
			else if(gamer_secim == 2) {  //MAKAS
				if(pc_secim == 0) {
					System.out.println("Bilgisayarın seçimi : TAŞ");
					pc_scor ++;
					System.out.println("Siz : "+gamer_scor+" - Bilgisayar : "+pc_scor);
				}
				else if(pc_secim == 1) {
					System.out.println("Bilgisayarın seçimi : KAĞIT");
					gamer_scor ++;
					System.out.println("Siz : "+gamer_scor+" - Bilgisayar : "+pc_scor);
				}
				else {
					System.out.println("Bilgisayarın seçimi : MAKAS");
					System.out.println("BERABERE !");
					System.out.println("Siz : "+gamer_scor+" - Bilgisayar : "+pc_scor);
				}
			}
			
			
			else { System.out.println("Hatalı giriş yaptınız, tekrar deneyin!"); }
			
			System.out.println("-------------------------------------");
			
			if(gamer_scor == 3) { 
				System.out.println(gamer_scor+"-"+pc_scor+" KAZANDINIZ :) ");
				break;
				}
			if(pc_scor == 3) { 
				System.out.println(gamer_scor+"-"+pc_scor+" KAYBETTİNİZ :( ");
				break;
				}
			
		}
	
		System.out.println("Oyun Bitti !");
		
	}
}
