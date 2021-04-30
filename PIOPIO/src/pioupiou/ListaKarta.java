package pioupiou;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaKarta {
	
	//ATRIBUTUAK
	private ArrayList<Karta> lista;
	private int kartaKop = 0;
	
	//ERAIKITZAILEA
	public ListaKarta() {
		this.lista = new ArrayList<Karta>();
	}
	
	//BESTE METODOAK
	//GET KARTA METODOA
	public Karta getKarta(int pPos) {
		Karta k = lista.get(pPos);
		return k;
	}
	
	//KENDU KARTA METODOA
	public void kenduKarta(int pPos) {
		lista.remove(pPos);
		kartaKop--;
	}	
	
	
	//GEHITU KARTA METODOA
	public void gehituKarta(Karta pKarta) {
		this.lista.add(pKarta);
		this.kartaKop++;
	}
	
	//SET KARTA KOP METODOA
	public void setKartaKop(int pKartaKop) {
		this.kartaKop = pKartaKop;
	}
	
	//GET KARTA KOP METODOA
	public int getKartaKop() {
		return this.kartaKop;
	}
		
	//ERRESETEATU METODOA
	public void erreseteatu(){
		this.lista.clear();
	}
	
	//GET ITERADOREA METODOA
	private Iterator<Karta> getIteradorea(){
		return this.lista.iterator();
	}
	
	//IMPRIMATU KARTAK METODOA
	public void imprimatuKartak() {
		Iterator<Karta> itr = this.getIteradorea();
		Karta k = null;
		while (itr.hasNext()) {
			k = itr.next();
			k.imprimatuKarta();
		}
	}
	
	//KONBINAZIORIK DAGO METODOA
	public boolean konbinaziorikDago() {
		
		return erantzuna;
	}
}



