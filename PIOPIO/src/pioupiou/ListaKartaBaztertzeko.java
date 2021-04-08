package pioupiou;

import java.util.ArrayList;

public class ListaKartaBaztertzeko {
	
	//ATRIBUTUAK
	private ListaKarta lista;
	private static ListaKartaBaztertzeko nireListaKartaBaztertzeko = null;
	
	
	//ERAIKITZAILEA
	private ListaKartaBaztertzeko() {
		this.lista = new ListaKarta();
	}
	
	//BESTE METODOAK
	//GET LISTA KARTA BAZTERTZEKO METODOA
	public static ListaKartaBaztertzeko getnNireListaKartaBaztertzeko() 
	{
	 	if(nireListaKartaBaztertzeko == null) {
	 		nireListaKartaBaztertzeko = new ListaKartaBaztertzeko();
	 	}
	 	return nireListaKartaBaztertzeko;		
	}
	
	
	
	
}
