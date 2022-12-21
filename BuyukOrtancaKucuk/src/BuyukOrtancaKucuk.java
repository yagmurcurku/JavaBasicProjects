import java.util.Scanner;

public class BuyukOrtancaKucuk {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1.sayıyı giriniz");
		int sayi1 = scan.nextInt();
		System.out.println("2.sayıyı giriniz");
		int sayi2 = scan.nextInt();
		System.out.println("3.sayıyı giriniz");
		int sayi3 = scan.nextInt();

		if(sayi1>sayi2 && sayi1>sayi3) {
			System.out.println("En büyük sayı : " + sayi1);
			if(sayi2>sayi3) {
				System.out.println("Ortanca sayı : " + sayi2 + "\n" + "En küçük sayı : " + sayi3);
			}
			else {
				System.out.println("Ortanca sayı : " + sayi3 + "\n" + "En küçük sayı : " + sayi2);
			}
		}
		
		else if(sayi2>sayi1 && sayi2>sayi3) {
			System.out.println("En büyük sayı : " + sayi2);
			if(sayi1>sayi3) {
				System.out.println("Ortanca sayı : " + sayi1 + "\n" + "En küçük sayı : " + sayi3);
			}
			else {
				System.out.println("Ortanca sayı : " + sayi3 + "\n" + "En küçük sayı : " + sayi1);
			}
		}
		
		else {
			System.out.println("En büyük sayı : " + sayi3);
			if(sayi2>sayi1) {
				System.out.println("Ortanca sayı : " + sayi2 + "\n" + "En küçük sayı : " + sayi1);
			}
			else {
				System.out.println("Ortanca sayı : " + sayi1 + "\n" + "En küçük sayı : " + sayi2);
			}
		}
		
		
	}

}
