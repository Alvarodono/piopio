package pioupiou;

import java.util.ArrayList;
import java.util.Iterator;

public class Konbinazioak {
	
	//ATRIBUTUAK
	private static Konbinazioak nireKonbinazioak = null;
	private boolean aurkitua = false;
	private ListaKarta konbiKartak;
	private ArrayList<Karta> lista;
	private int konbinazioMota = 0;
	
	
	//ERAIKITZAILEA
	private Konbinazioak() {
		konbiKartak = new ListaKarta();
	}
	
	//BESTE METODOAK
	//GET KONBINAZIO MOTA METODOA
	public int getKonbinazioMota() {
		return this.konbinazioMota;
	}
	
	
	//GET NIRE KONBINAZIOAK METODOA
	public static Konbinazioak getNireKonbinazioak() {
		if (nireKonbinazioak==null){	
			nireKonbinazioak=new Konbinazioak();
		}
		return nireKonbinazioak;
	}
	
	//GET KONBI KARTAK METODOA
	public ListaKarta getKonbiKartak(){
		return konbiKartak;
	}
	
	//GET ITERADOREA METODOA
	private Iterator<Karta> getIteradorea(){
		return this.lista.iterator();
	}
	
	/*KONBINAZIORIK DAGO METODOA
	public boolean konbinazioNormalikAhalDago(ListaKarta pLista) {
		Karta k1;
		Karta k2;
		Karta k3;
		Karta k4;
		Iterator<Karta> itr = this.getIteradorea(); 
		boolean erantzuna = false;
		while(itr.hasNext() && !erantzuna) {			
			k1 = itr.next();
			k2 = itr.next();
			k3 = itr.next();
			k4 = itr.next();
		}		
		return erantzuna;	
	}*/
	
	//KONBINAZIOA DA METODOA
	public boolean konbinazioNormalikAhalDago(ListaKarta listaKarta, int arrautzaKop, int jokalaria)  {
		int i;
		boolean erantzuna = false;
		if (jokalaria == 1) {
			i = 0;
		}else {
			i = 1;
		}
		Karta k1 = new Karta("k1") ,k2 = new Karta("k2") ,k3 = new Karta("k3")  ,k4 = new Karta("k4");		
		Iterator<Karta> itr = listaKarta.getIteradorea(); 
		if(itr.hasNext()) {			
			k1 = itr.next();
			if(itr.hasNext()) {
				k2 = itr.next();
				if (itr.hasNext()) {
					k3 = itr.next();
					if (itr.hasNext()) {
						k4 = itr.next();
					}
				}				
			}
		}		
		int kont = 0;
		if (k1.getMota() == "Oilo" ) {//eclosionar un huevo
			kont++;
		}
		if (k2.getMota() == "Oilo") {
			kont++;
		}
		if (k3 != null && k3.getMota() == "Oilo") {
			kont++;
		}
		if (k4.getMota() == "Oilo") {
			kont++;			
		}
		if (kont >= 2 && arrautzaKop > 0) {
			erantzuna = true;
			konbinazioMota = 1;
		}else if ((ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().kopurua > 0) && ((k1.getMota() == "Oilo" && k2.getMota() == "Oilar" && k3.getMota() == "Habia") || (k1.getMota() == "Oilo" && k2.getMota() == "Habia" && k3.getMota() == "Oilar") || (k1.getMota() == "Oilar" && k2.getMota() == "Oilo" && k3.getMota() == "Habia") || (k1.getMota() == "Oilar" && k2.getMota() == "Habia" && k3.getMota() == "Oilo") || (k1.getMota() == "Habia" && k2.getMota() == "Oilo" && k3.getMota() == "Oilar") || (k1.getMota() == "Habia" && k2.getMota() == "Oilar" && k3.getMota() == "Oilo") || (k1.getMota() == "Oilo" && k2.getMota() == "Oilar" && k4.getMota() == "Habia") || (k1.getMota() == "Oilo" && k2.getMota() == "Habia" && k4.getMota() == "Oilar") || (k1.getMota() == "Oilar" && k2.getMota() == "Oilo" && k4.getMota() == "Habia") || (k1.getMota() == "Oilar" && k2.getMota() == "Habia" && k4.getMota() == "Oilo") || (k1.getMota() == "Habia" && k2.getMota() == "Oilo" && k4.getMota() == "Oilar") || (k1.getMota() == "Habia" && k2.getMota() == "Oilar" && k4.getMota() == "Oilo") || (k1.getMota() == "Oilo" && k3.getMota() == "Oilar" && k4.getMota() == "Habia") || (k1.getMota() == "Oilo" && k3.getMota() == "Habia" && k4.getMota() == "Oilar") || (k1.getMota() == "Oilar" && k3.getMota() == "Habia" && k4.getMota() == "Oilo") || (k1.getMota() == "Oilar" && k3.getMota() == "Oilo" && k4.getMota() == "Habia") || (k1.getMota() == "Habia" && k3.getMota() == "Oilo" && k4.getMota() == "Oilar") || (k1.getMota() == "Habia" && k3.getMota() == "Oilar" && k4.getMota() == "Oilo") || (k2.getMota() == "Oilo" && k3.getMota() == "Oilar" && k4.getMota() == "Habia") || (k2.getMota() == "Oilo" && k3.getMota() == "Habia" && k4.getMota() == "Oilar") || (k2.getMota() == "Oilar" && k3.getMota() == "Oilo" && k4.getMota() == "Habia") || (k2.getMota() == "Oilar" && k3.getMota() == "Habia" && k4.getMota() == "Oilo") || (k2.getMota() == "Habia" && k3.getMota() == "Oilo" && k4.getMota() == "Oilar") || (k2.getMota() == "Habia" && k3.getMota() == "Oilar" && k4.getMota() == "Oilo"))) {//coger huevo de la pila 2
				erantzuna = true;
				konbinazioMota = 2;	
		}else if((ListaJokalaria.getNireListaJokalariak().getZerrenda()[i].arrautzaKop > 0) && (k1.getMota() == "Azeria" || k2.getMota() == "Azeria" || k3.getMota() == "Azeria" || k4.getMota() == "Azeria" ))	{
				erantzuna = true;
				konbinazioMota = 3;
		}
		return erantzuna;
	}	
}				

