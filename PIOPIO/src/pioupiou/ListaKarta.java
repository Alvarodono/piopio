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
	public void kenduKartaZenbakiz(int pPos) {
		lista.remove(pPos);
		kartaKop--;
	}
	
	//KENDU KARTA KARTAZ METODOA
	public void kenduKartaKartaz(Karta pKarta) {
		lista.remove(pKarta);
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
	public Iterator<Karta> getIteradorea(){
		return this.lista.iterator();
	}
	
	//IMPRIMATU KARTAK METODOA
	public void imprimatuKartak() {
		int i = 1;
		Iterator<Karta> itr = this.getIteradorea();
		Karta k = null;
		while (itr.hasNext()) {
			k = itr.next();
			
			System.out.print("║  ");
			System.out.print(i+".");
			k.imprimatuKarta();
			i++;
		}
	}
	
	//BAZTERTU KARTA MOTA JAKINDA METODOA
	public Karta baztertuKartaMotaJakinda(String sarrera) {
		Karta k = null, b;
		
		Iterator<Karta> itr = this.getIteradorea();
		while (itr.hasNext() && k == null) {
			b = itr.next();
			if (b.getMota() == sarrera) {
				k = b;
			}
		}
		return k;
		
		
	}
	
	//KONBINAZIORIK DAGO METODOA
	public boolean konbinaziorikDago() {
		boolean erantzuna = true;
		return erantzuna;
	}
}



