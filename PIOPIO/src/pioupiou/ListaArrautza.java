package pioupiou;

import java.util.ArrayList;

public class ListaArrautza {
	
	//ATRIBUTUAK
	private ArrayList<Arrautza> lista;
	
	//ERAIKITZAILEA
	public ListaArrautza() {
		this.lista = new ArrayList<Arrautza>();
	}
	
	//BESTE METODOAK
	public void arrautzaKendu(int pPos) {
		this.lista.remove(pPos);
	}
	
	//ARRAUTZA GEHITU
	public void arrautzaGehitu(Arrautza pArrautza) {
		this.lista.add(pArrautza);
	}
}
