package pioupiou;

import java.util.ArrayList;

public class ListaKartaHartzeko {
		
	//ATRIBUTUAK
	private ListaKarta lista;
	private static ListaKartaHartzeko nireListaKartaHartzeko = null;
		
		
	//ERAIKITZAILEA
	private ListaKartaHartzeko() {
		this.lista = new ListaKarta();
	}
		
	//BESTE METODOAK
	//GET LISTA KARTA HARTZEKO METODOA
	public static ListaKartaHartzeko getListaKartaHartzeko() 
	{
		 if(nireListaKartaHartzeko == null) {
			 nireListaKartaHartzeko = new ListaKartaHartzeko();
		 }
		 return nireListaKartaHartzeko;		
	}
}
