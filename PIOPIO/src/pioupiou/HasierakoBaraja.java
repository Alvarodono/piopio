package pioupiou;

import java.util.Random;


public class HasierakoBaraja {
	
	//ATRIBUTUAK
	private ListaKarta lista;
	private static HasierakoBaraja nireBaraja = null;
	
	//ERAIKITZAILEA
	private HasierakoBaraja() {
		lista = new ListaKarta();
	}
	
	//BESTE METODOAK
	//GET NIRE HASIERAKO BARAJA METODOA
	public static synchronized HasierakoBaraja getNireHasierakoBaraja() {
		if (nireBaraja == null) {
			nireBaraja = new HasierakoBaraja();
		}
		return nireBaraja;
	}
	
	//BARAJA BETE METODOA
	public void barajaBete() {
		int i = 0,x = 0,p = 0, k = 0;
		while (i<24) {
			lista.gehituKarta(new Karta ("Azeria"));
			i++;
		}
		while (x<44) {
			lista.gehituKarta(new Karta ("Habia"));
			x++;
		}
		while (p<60) {
			lista.gehituKarta(new Karta ("Oilar"));
			p++;
		}
		while (k<60) {
			lista.gehituKarta(new Karta ("Oilo"));
			k++;
		}
		lista.setKartaKop(188);
	}	
	
	
	//BANAKETA METODOA (KARTA BAT BANATZEKO)
	public Karta banaketa() { 
		if (lista.getKartaKop() == 0) {
			barajaBete(); //gure eskuko kartak ez dira kontutan hartzen
			ListaKartaBaztertzeko.getNireListaKartaBaztertzeko().erreseteatu();
		}
		Karta k = null;
		Random r = new Random();
		if(lista.getKartaKop()>1){
			int random = r.nextInt(lista.getKartaKop());
			k = lista.getKarta(random);
		}
		lista.kenduKartaKartaz(k);
		return k;		
	}
	
	//RESET METODOA
	public void reset() {
		lista.erreseteatu();
		barajaBete();
	}
	
	
}
