package pioupiou;

import java.util.ArrayList;
import java.util.Iterator;

public class Konbinazioak {
	
	//ATRIBUTUAK
	private static Konbinazioak nireKonbinazioak = null;
	private boolean aurkitua = false;
	private ListaKarta konbiKartak;
	private ArrayList<Karta> lista;
	
	
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
		Iterator<Karta> itr = this.getIteradorea(); 
		boolean erantzuna = false;
		while(itr.hasNext()) {
			k1 = itr.next();
			k2 = itr.next();			
		}
		
		
		return erantzuna;
		
	}
	
	//KONBINAZIOA DA METODOA
	public boolean konbinazioaDa(Karta k1, Karta k2, Karta k3, ListaArrautza lista) {
		boolean erantzuna = false;
		if (k1.getMota() == "Oilo" && k2.getMota() == "Oilo" && lista.getListaArrautza().kopurua() >= 1)
		return erantzuna;
	}

}
