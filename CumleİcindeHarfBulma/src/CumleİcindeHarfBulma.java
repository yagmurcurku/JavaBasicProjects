import java.util.Scanner;

public class CumleİcindeHarfBulma {

	public static void main(String[] args) {
		
//		Kullanıcının girdiği cümlede, kullanıcının seçtiği harften kaç tane olduğunu bulan kod.

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cümle giriniz: ");
		String cumle = scanner.nextLine();
		
		System.out.println("Harfi giriniz: ");
		char harf = scanner.next().charAt(0);
		
		int sayac = 0;
		for(int i = 0; i<cumle.length(); i++) {
			if(cumle.charAt(i)==harf) {
				sayac ++;
			}
		}
		System.out.println("Girdiğiniz cümledeki "+harf+" harfi sayısı : "+sayac);
	}
}
