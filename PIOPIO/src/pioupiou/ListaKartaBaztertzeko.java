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
	public static ListaKartaBaztertzeko getNireListaKartaBaztertzeko() 
	{
	 	if(nireListaKartaBaztertzeko == null) {
	 		nireListaKartaBaztertzeko = new ListaKartaBaztertzeko();
	 	}
	 	return nireListaKartaBaztertzeko;		
	}
	
	//ERRESETEATU METODOA
	public void erreseteatu() {
		lista.erreseteatu();
	}
	
	//GEHITU KARTA METODOA
	public void gehituKarta(Karta pKarta) {
		this.lista.gehituKarta(pKarta);
	}
	
	
	
	
	
	
}
