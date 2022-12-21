import java.util.Scanner;

public class CumledekiKelimeSayisiniBulma {

	public static void main(String[] args) {
		
		System.out.println("Cümleyi giriniz : ");
		Scanner scanner = new Scanner(System.in);
		String cumle = scanner.nextLine();

		int sayac = 0;
		for(int i = 0;i<cumle.length();i++) {
			if(cumle.charAt(i)==' ') {
				sayac++;
			}
		}
		
		System.out.println("Cümledeki kelime sayısı = " + (sayac+1));

	}
}