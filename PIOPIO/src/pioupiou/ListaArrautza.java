package pioupiou;

import java.util.ArrayList;
import java.util.Iterator;


public class ListaArrautza {
	
	//ATRIBUTUAK
	private ArrayList<Arrautza> lista;
	private int kopurua; 
	
	
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
	}
	
	//ARRAUTZA GEHITU
	public void arrautzaGehitu(Arrautza pArrautza) {
		this.lista.add(pArrautza);
	}
	
	//ERRESETEATU METODOA
	public void erreseteatu(){
		this.lista.clear();
	}	
	
	//GET LISTA ARRAUTZA METODOA
	public ArrayList<Arrautza> getListaArrautza() {
		return lista;
	}
	
	
	//KOPURUA METODOA
	public int kopurua() {
		return this.kopurua;
	}
	
	
	//ARRAUTZARIK DAGO METODOA
	public boolean arrautzarikDago() {
		Arrautza b;
		boolean erantzuna = false;
		Iterator<Arrautza> itr = this.getIteradorea();
		while (itr.hasNext() || !erantzuna) {
			b = itr.next();
			if(!b.getTxitxa()) {
				erantzuna = true;
			}
		}
		return erantzuna;
		
		
	}
	
	
}
