package pioupiou;

import java.util.ArrayList;

public class ListaArrautza {
	
	//ATRIBUTUAK
	private ArrayList<Arrautza> lista;
	private int kopurua; 
	
	
	//ERAIKITZAILEA
	public ListaArrautza() {
		this.lista = new ArrayList<Arrautza>();
	}
	
	//BESTE METODOAK
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
		return this.kopurua;//
	}
	
	
}
