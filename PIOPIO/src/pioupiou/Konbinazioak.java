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
	public boolean konbinazioNormalikAhalDago(ListaKarta pLista) {
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
	public boolean konbinazioNormalikAhalDago(Karta k1, Karta k2, Karta k3, Karta k4, ListaArrautza lista)  {
		int kont = 0;
		boolean erantzuna = false;
		if (k1.getMota() == "Oilo" ) {
			kont++;
		}
		if (k2.getMota() == "Oilo") {
			kont++;
		}
		if (k3.getMota() == "Oilo") {
			kont++;
		}
		if (k4.getMota() == "Oilo") {
			kont++;			
		}
		if (kont >= 2 && lista.arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k1.getMota() == "Oilo" && k2.getMota() == "Oilar" && k3.getMota() == "Habia" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k1.getMota() == "Oilo" && k2.getMota() == "Habia" && k3.getMota() == "Oilar" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k1.getMota() == "Oilar" && k2.getMota() == "Oilo" && k3.getMota() == "Habia" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k1.getMota() == "Oilar" && k2.getMota() == "Habia" && k3.getMota() == "Oilo" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k1.getMota() == "Habia" && k2.getMota() == "Oilo" && k3.getMota() == "Oilar" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k1.getMota() == "Habia" && k2.getMota() == "Oilar" && k3.getMota() == "Oilo" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k1.getMota() == "Oilo" && k2.getMota() == "Oilar" && k4.getMota() == "Habia" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k1.getMota() == "Oilo" && k2.getMota() == "Habia" && k4.getMota() == "Oilar" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k1.getMota() == "Oilar" && k2.getMota() == "Oilo" && k4.getMota() == "Habia" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k1.getMota() == "Oilar" && k2.getMota() == "Habia" && k4.getMota() == "Oilo" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k1.getMota() == "Habia" && k2.getMota() == "Oilo" && k4.getMota() == "Oilar" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k1.getMota() == "Habia" && k2.getMota() == "Oilar" && k4.getMota() == "Oilo" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k1.getMota() == "Oilo" && k3.getMota() == "Oilar" && k4.getMota() == "Habia" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k1.getMota() == "Oilo" && k3.getMota() == "Habia" && k4.getMota() == "Oilar" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k1.getMota() == "Oilar" && k3.getMota() == "Habia" && k4.getMota() == "Oilo" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k1.getMota() == "Oilar" && k3.getMota() == "Oilo" && k4.getMota() == "Habia" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k1.getMota() == "Habia" && k3.getMota() == "Oilo" && k4.getMota() == "Oilar" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k1.getMota() == "Habia" && k3.getMota() == "Oilar" && k4.getMota() == "Oilo" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k2.getMota() == "Oilo" && k3.getMota() == "Oilar" && k4.getMota() == "Habia" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k2.getMota() == "Oilo" && k3.getMota() == "Habia" && k4.getMota() == "Oilar" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k2.getMota() == "Oilar" && k3.getMota() == "Oilo" && k4.getMota() == "Habia" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k2.getMota() == "Oilar" && k3.getMota() == "Habia" && k4.getMota() == "Oilo" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k2.getMota() == "Habia" && k3.getMota() == "Oilo" && k4.getMota() == "Oilar" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}
		else if(k2.getMota() == "Habia" && k3.getMota() == "Oilar" && k4.getMota() == "Oilo" && ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().arrautzarikDago()) {
			erantzuna = true;
		}			
	return erantzuna;		
	}
	
	


}
