package pioupiou;

import java.util.ArrayList;
import java.util.Iterator;

public class Konbinazioak {
	
	//ATRIBUTUAK
	private static Konbinazioak nireKonbinazioak = null;
	private boolean aurkitua = false;
	private ListaKarta konbiKartak;
	private ArrayList<Karta> lista;
	private int konbinazioMota;
	
	
	//ERAIKITZAILEA
	private Konbinazioak() {
		konbiKartak = new ListaKarta();
	}
	
	//BESTE METODOAK
	
	//
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
	
	//KONBINAZIORIK DAGO METODOA
	public boolean konbinaziorikDago(ListaKarta pLista) {
		Karta k1;
		Karta k2;
		Karta k3;
		Karta k4;
		Iterator<Karta> itr = this.getIteradorea(); 
		boolean erantzuna = false;
		while(itr.hasNext()) {
			while (!erantzuna) {
				k1 = itr.next();
				k2 = itr.next();
				k3 = itr.next();
				k4 = itr.next();
			}
		
		}		
		return erantzuna;	
	}
	
	//KONBINAZIOA DA METODOA
	public boolean konbinazioaDa(Karta k1, Karta k2, Karta k3, Karta k4, ListaArrautza lista1, ListaArrautza lista2, )  {
		boolean erantzuna = false;
		if (k1.getMota() == "Oilo" && k2.getMota() == "Oilo" && lista1.kopurua() >= 1) {
			erantzuna = true;
			this.konbinazioMota = 1;
		}
		else if (k1.getMota() == "Oilo" && k2.getMota() == "Oilar" && k3.getMota() == "Habia" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().kopurua() >=1) {
			erantzuna = true;
			this.konbinazioMota = 2;
		}
		else if (k1.getMota() == "Azeria" && lista2.kopurua() >= 1) {
			erantzuna = true;
			this.konbinazioMota = 3;
		}
		else if (k1.getMota() == "Oilar" && k2.getMota() == "Oilar" && CPU.azeriaErabiliDu()) {
			erantzuna = true;
			this.konbinazioMota = 4;
		}
		return erantzuna;
		
	}
	
	
	//

}
