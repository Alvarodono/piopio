package pioupiou;

public class HasierakoBaraja {
	
	//ATRIBUTUAK
	private ListaKarta lista;
	private int kartaKop = 0;
	private static HasierakoBaraja nireBaraja = null;
	
	//ERAIKITZAILEA
	private HasierakoBaraja() {
		lista = new ListaKarta();
	}
	
	//BESTE METODOAK
	//GET NIRE HASIERAKO BARAJA METODOA
	public static HasierakoBaraja getNireBaraja() {
		if (nireBaraja == null) {
			nireBaraja = new HasierakoBaraja();
		}
		return nireBaraja;
	}
	
	//BARAJA BETE METODOA
	public void barajaBete() {
		int i = 0,x = 0,p = 0, k = 0;
		while (i<6) {
			lista.gehituKarta(new Karta ("Azeria"));
			i++;
		}
		while (x<11) {
			lista.gehituKarta(new Karta ("");
			x++;
		}
		while (p<15) {
			lista.gehituKarta(new Karta ("");
			p++;
		}
		while (k<15) {
			lista.gehituKarta(new Karta (""));
			k++;
		}
	}

	
	
	

}
