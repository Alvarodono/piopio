package pioupiou;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaKarta {
	
	//ATRIBUTUAK
	private ArrayList<Karta> lista;
	private int kartaKop;
	
	//ERAIKITZAILEA
	public ListaKarta() {
		this.lista = new ArrayList<Karta>();
	}
	
	//BESTE METODOAK
	public Karta getKarta(int pPos) {
		Karta k = lista.get(pPos);
		return k;
	}
	
	public void kenduKarta(int pPos) {
		lista.remove(pPos);
		kartaKop--;
	}
	
	public void setKartaKop(int pKartaKop) {
		this.kartaKop = pKartaKop;
	}
	
	public void gehituKarta(Karta pKarta) {
		this.lista.add(pKarta);
		this.kartaKop++;
	}
		
	public void erreseteatu(){
		this.lista.clear();
	}
	
	private Iterator<Karta> getIteradorea(){
		return this.lista.iterator();
	}
}



