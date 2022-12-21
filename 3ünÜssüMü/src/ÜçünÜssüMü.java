import java.util.Scanner;

public class ÜçünÜssüMü {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("3ün üssü olup olmadığını öğrenmek istediğiniz sayıyı giriniz");
		int sayi = scanner.nextInt();

		boolean ücünÜssüMü = false;
		for(int i = 1; i <= sayi; i++) {
			if(Math.pow(3, i)==sayi) {
				ücünÜssüMü = true;
				break;
			}
		}
	
		if(ücünÜssüMü) {
			System.out.println(sayi + " sayısı 3'ün üssüdür.");
		}
		else {
			System.out.println(sayi + " sayısı 3'ün üssü değildir.");
		}
		
	}
}