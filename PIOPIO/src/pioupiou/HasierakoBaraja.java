package pioupiou;

import java.util.Random;
import java.util.Iterator;

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
		while (i<6) {
			lista.gehituKarta(new Karta ("Azeria"));
			i++;
		}
		while (x<11) {
			lista.gehituKarta(new Karta ("Habia"));
			x++;
		}
		while (p<15) {
			lista.gehituKarta(new Karta ("Oilar"));
			p++;
		}
		while (k<15) {
			lista.gehituKarta(new Karta ("Oilo"));
			k++;
		}
		lista.setKartaKop(47);
	}	
	
	
	//BANAKETA METODOA (KARTA BAT BANATZEKO)
	public Karta banaketa() { 
		if (!kartakGeratzenDira()) {
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
	
	//KARTAK GERATZEN DIRA METODOA
		public boolean kartakGeratzenDira() {
			Iterator<Karta> itr = lista.getIteradorea();
			if (itr.hasNext()) {
				return true;
			}else {
				return false;
			}
		}
	
	/*KARTAK BANATU METODOA
	public void kartakBanatu() {
		int kont = 4;
		while (kont > 0) {
			Karta k = null;
			k = HasierakoBaraja.getNireHasierakoBaraja().banaketa();
			this.getZerrenda()[0].getEskukoKartak().gehituKarta(k);
			k = HasierakoBaraja.getNireHasierakoBaraja().banaketa();
			this.getZerrenda()[1].getEskukoKartak().gehituKarta(k);
			kont--;
		}
	}*/
}
