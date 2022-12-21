import javax.swing.JOptionPane;

public class VizeFinal {

	public static void main(String[] args) {
		
		String vizeNotu =JOptionPane.showInputDialog(null, "Vize notunuzu girin: ");
		int vN = Integer.parseInt(vizeNotu);
		
		while(vN < 0 || vN > 100) {
			vizeNotu =JOptionPane.showInputDialog(null, "Vize notunuzu tekrar girin: ");
			vN = Integer.parseInt(vizeNotu);
		}
		
		
		String finalNotu = JOptionPane.showInputDialog(null, "Final notunuzu girin: ");
		int fN = Integer.parseInt(finalNotu);
		
		while(fN < 0 || fN > 100) {
			finalNotu = JOptionPane.showInputDialog(null, "Final notunuzu tekrar girin: ");
			fN = Integer.parseInt(finalNotu);
		}

		
		int ortalama = (int)(vN*0.3+fN*0.7);
		String ortalamaniz = " Ortalamanız: "+ortalama;
		if(ortalama >= 50) {
			
			JOptionPane.showMessageDialog(null, "TEBRİKLER, GEÇTİNİZ !"+ortalamaniz);
		}
		else {
			JOptionPane.showMessageDialog(null, "MAALESEF, KALDINIZ !"+ortalamaniz);
		}
		
		
		
	}

}
