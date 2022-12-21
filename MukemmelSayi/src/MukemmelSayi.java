import javax.swing.JOptionPane;

public class MukemmelSayi {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Mükemmel sayıları bulma oyununa hoşgeldin!", ":)", JOptionPane.INFORMATION_MESSAGE);
		
		String baslangicDegeri = JOptionPane.showInputDialog(null, "Mükemmel sayıyı arama hangi sayıdan itibaren başlasın ?");
		int baslangic = Integer.parseInt(baslangicDegeri);
		
		if(baslangic == 0) {
			baslangicDegeri = JOptionPane.showInputDialog(null, "Lütfen 0'dan daha yüksek bir sayıdan başlatın. Arama hangi sayıdan itibaren başlasın ? ");
			baslangic = Integer.parseInt(baslangicDegeri);
		}
		
		String bitisDegeri = JOptionPane.showInputDialog(null, "Mükemmel sayıyı arama hangi sayıya kadar yapılsın ? ");
		int bitis = Integer.parseInt(bitisDegeri);
		
		
		if(baslangic>bitis) {
			JOptionPane.showMessageDialog(null, "BAŞLANGIÇ DEĞERİ BİTİŞ DEĞERİNDEN KÜÇÜK OLMALI !!!");
		}
		else {
		JOptionPane.showMessageDialog(null, baslangic + " ile " + bitis + " sayıları arasındaki mükemmel sayılar şunlardır: "); 
		mukemmelSayi(baslangic, bitis);
		}
	
	}
	
	public static void mukemmelSayi(int basla, int bitir) {
		
		for(int i = basla; i<bitir; i++) {

			boolean mukemmelSayiMi = false;
			int toplam = 0;
			for(int j = 1; j<i; j++) {
				if(i%j==0) {
					toplam += j;
				}
			}
			if(toplam == i) {
				mukemmelSayiMi = true;
			}
			else if(toplam != i) {
				mukemmelSayiMi = false;
			}
			
			
			
			if(mukemmelSayiMi == true) {
				JOptionPane.showMessageDialog(null, i + " sayısı mükemmel sayıdır !");
			}
			
			
			
		}		
	}
	
}