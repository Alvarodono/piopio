package pioupiou;

public class JokalariArrunta extends Jokalaria {
	
	//ATRIBUTUAK
	private String izena;
	private int aukera=0;
	private ListaKarta eskukoKartak;
	private ListaArrautza eskukoArrautzak;
	
	
	//ERAIKITZAILEA
	public JokalariArrunta(String pIzena, int pAdina){
		super(pAdina);
		this.izena = pIzena;
	}
	
	//BESTE METODOAK		
	//IMPRIMATU ESKUA METODOA
	public void imprimatuEskua() {
		System.out.println("Zure eskuko kartak:");
		System.out.println(" ");
		this.getEskukoKartak().imprimatuKartak();
	}
	
	//JOKALDIA EGIN METODOA
	public void jokaldiaEgin() {
		int sarrera;
		imprimatuEskua();
		if(!this.getKonbinazioak().konbinazioNormalikAhalDago(getEskukoKartak())) {
			System.out.println("Aukeratu karta bat baztertzeko eta berri bat hartu multzotik");			
			sarrera = Teklatua.getNireTeklatua().irakurriOsoa();
			while (sarrera != 1 || sarrera != 2 || sarrera != 3 || sarrera != 4) {
				System.out.println("Aukeratu berriz baztertuko duzun karta");
				sarrera = Teklatua.getNireTeklatua().irakurriOsoa();
			}
			ListaKartaBaztertzeko.getNireListaKartaBaztertzeko().gehituKarta(this.getEskukoKartak().getKarta(sarrera));
			this.getEskukoKartak().kenduKartaZenbakiz(sarrera);						
			this.getEskukoKartak().gehituKarta(HasierakoBaraja.getNireHasierakoBaraja().banaketa());
			turnoaBukatu();
		}
		else {
			System.out.println("Egin jokaldia");
		}
		 
		
	}
	
	//AUKERATU ESKUKO KARTA METODOA
	public Karta aukeratuEskukoKarta() {
		Karta k=null;
		Boolean denaOndo=false;
		String sarrera=Teklatua.getNireTeklatua().irakurriString();
		try {
			aukera=Integer.parseInt(sarrera);
			denaOndo=true;
		}catch(NumberFormatException e) {
			System.out.println("Sarrera zenbaki bat izan behar da.");
			this.aukeratuEskukoKarta();
		}
		if(denaOndo) {	
			try {
				k=getEskukoKartak().getKarta(aukera-1);
			}catch(IndexOutOfBoundsException e){
				System.out.println("Aukeratutako posizioan ez dago kartarik");
				this.aukeratuEskukoKarta();
			}
		}
		return k;
		
	}
	
	//AUKERATU MAHAIKO KARTAK METODOA
	public void aukeratuMahaikoKartak() {
		
	}
	
	//MAHAIKO AUKERAKETA EGIN
	public void mahaikoAukeraketaEgin() {
		
	}
	
	//TURNOA BUKATU METODOA
	public void turnoaBukatu() {
		
	}

}
