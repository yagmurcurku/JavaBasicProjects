import java.util.Random;

import javax.swing.JOptionPane;

public class SayiTahmin {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Sayı tahmin oyununa hoşgeldin :)");
		JOptionPane.showMessageDialog(null, "Tahmin edilecek aralık 0-10'dur.");
		
		Random r = new Random();
		int sayi = r.nextInt(11);
		
		int deger = 1;
		
		while(true) {
			String tahmin = JOptionPane.showInputDialog("Tahmin gir: ");
			int t = Integer.parseInt(tahmin);
			
			
			if(t==sayi) {
				String mesaj = "TEBRİKLER! " + deger + ". tahminde bildiniz.";
				JOptionPane.showMessageDialog(null, mesaj);
				break;
			}
			else {
				deger++;
			}
		}
		
		
		

	}

}
