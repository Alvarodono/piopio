package pioupiou;

import java.util.ArrayList;
import java.util.Iterator;


public class ListaArrautza {
	
	//ATRIBUTUAK
	private ArrayList<Arrautza> lista;
	private int arrautzaKop = 0; 
	
	
	//ERAIKITZAILEA
	public ListaArrautza() {
		this.lista = new ArrayList<Arrautza>();
	
	}
	
	//BESTE METODOAK
	//GET ITERADOREA METODOA
	private Iterator<Arrautza> getIteradorea(){
		return this.lista.iterator();
	}	
	
	
	//ARRAUTZA KENDU METODOA
	public void arrautzaKendu(int pPos) {
		this.lista.remove(pPos);
		arrautzaKop--;
	}
	
	//GEHITU ARRAUTZA METODOA
	public void gehituArrautza(Arrautza pArrautza) {
		this.lista.add(pArrautza);
	}
	
	//ERRESETEATU METODOA
	public void erreseteatu(){
		this.lista.clear();
		this.arrautzaKop = 0;
	}	
	
	//GET LISTA ARRAUTZA METODOA
	public ArrayList<Arrautza> getListaArrautza() {
		return lista;
	}
	
	
	//GET KOPURUA METODOA
	public int getKopurua() {
		return this.arrautzaKop;
	}
	
	
	//ARRAUTZARIK DAGO METODOA
	public boolean arrautzarikDago() {
		boolean erantzuna = false;
		/*Arrautza b;
		boolean erantzuna = false;
		Iterator<Arrautza> itr = this.getIteradorea();
		while (itr.hasNext() && !erantzuna) {
			b = itr.next();
			if(!b.getTxitxa()) {
				erantzuna = true;
			}
		}*/
		if (this.getKopurua() > 0) {
			erantzuna = true;
		}
		return erantzuna;		
	}
	
	
}
