import javax.swing.JOptionPane;

public class DiziOlusturma {

	public static void main(String[] args) {
		
		
		String eleman = JOptionPane.showInputDialog(null, "Dizinin kaç elemanlı olacağını giriniz: ");
		int elemanSayisi = Integer.parseInt(eleman);
		
		int[] dizi = new int[elemanSayisi];
		
		for(int i = 0; i<elemanSayisi; i++) {
			String deger = JOptionPane.showInputDialog(null, "Dizinin " + (i+1) + ". elemanını giriniz: ");
			dizi[0] = Integer.parseInt(deger);
		}
		
		JOptionPane.showMessageDialog(null, "Dizi oluşturuldu.");
		
		System.out.println("Dizi elemanları:");
		for (int i : dizi) {
			System.out.println(i);
		}
	
	
	
	}

}
