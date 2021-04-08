package proiektua;

import java.util.*;

public class ListaJokalariak {
	//atributuak
	private Jokalaria[] lista;
	private static ListaJokalariak nireListaJokalariak = null;
    private int jokalariKop=2;//defektuz 2
	//eraikitazilea
	private ListaJokalariak() {
		this.lista = new Jokalaria[this.jokalariKop];
	}

	//gainotzeko metodoak
	public static synchronized ListaJokalariak getNireListaJokalariak() {
		if(ListaJokalariak.nireListaJokalariak == null) {
			ListaJokalariak.nireListaJokalariak = new ListaJokalariak();
		}
		return ListaJokalariak.nireListaJokalariak;
	}
	
	public void gehituJokalaria(Jokalaria pJokalaria) {
    //TODO
	}
	
	public void jokalarienTxandaKudeatu(int pJokalariKop) {
		//TODO
	}

	public void setJokalariKop(int pKop){
		//TODO
	}
}
