package pioupiou;

public class JokalariArrunta extends Jokalaria {
	
	//ATRIBUTUAK
	private String izena;
	private int aukera=0;
	private ListaKarta eskukoKartak;
	private ListaArrautza eskukoArrautzak;
	private int txandaZenbakia;
	
	
	//ERAIKITZAILEA
	public JokalariArrunta(String pIzena, int pAdina, int pJ){
		super(pAdina);
		this.izena = pIzena;
		this.txandaZenbakia = pJ;
	}
	
	//BESTE METODOAK		
	//IMPRIMATU ESKUA METODOA
	public void imprimatuEskua() {
		System.out.println("Zure eskuko kartak:");
		System.out.println(" ");
		System.out.println("╔═════════════════════════╗");
		this.getEskukoKartak().imprimatuKartak();
		System.out.println("╠═════════════════════════╣");
		System.out.print("║");
		System.out.print(" Arrautzak:");
		System.out.print(this.arrautzaKop);
		System.out.print("    Txitak:");
		System.out.print(this.puntuak);
		System.out.println(" ║");
		System.out.println("╚═════════════════════════╝");	
		System.out.println(" ");
	}
	
	//GET TXANDA ZENBAKIA METODOA
	public int getTxandaZenbakia() {
		return this.txandaZenbakia;
	}
	
	//JOKALDIA EGIN METODOA
	public void jokaldiaEgin() {
		int s1, s2;
		//this.getEskukoArrautzak().gehituArrautza(ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().banaketa());
		//this.arrautzaKop++;
		imprimatuEskua();		
		if(!this.getKonbinazioak().konbinazioNormalikAhalDago(getEskukoKartak(),this.getEskukoArrautzak().arrautzarikDago(), txandaZenbakia)) {
			System.out.println("Aukeratu karta bat baztertzeko eta berri bat hartu multzotik");			
			s1 = Teklatua.getNireTeklatua().irakurriOsoa();
			while (s1 != 1 && s1 != 2 && s1 != 3 && s1 != 4) {
				System.out.println("Aukeratu berriz baztertuko duzun karta");
				s1 = Teklatua.getNireTeklatua().irakurriOsoa();
			}
			ListaKartaBaztertzeko.getNireListaKartaBaztertzeko().gehituKarta(this.getEskukoKartak().getKarta(s1-1));
			this.getEskukoKartak().kenduKartaZenbakiz(s1-1);						
			this.getEskukoKartak().gehituKarta(HasierakoBaraja.getNireHasierakoBaraja().banaketa());			
			imprimatuEskua();
		}
		else {
			System.out.println("Aukeratu kartak jokaldia egiteko:");
			ListaKarta lista = new ListaKarta();
			boolean arrautza = this.getEskukoArrautzak().arrautzarikDago();
			s2 = Teklatua.getNireTeklatua().irakurriOsoa();
			lista.gehituKarta(this.getEskukoKartak().getKarta(s2-1));
			while (!this.getKonbinazioak().konbinazioNormalikAhalDago(lista, arrautza, txandaZenbakia)) {
				s2 = Teklatua.getNireTeklatua().irakurriOsoa();
				lista.gehituKarta(this.getEskukoKartak().getKarta(s2-1));				
			}
			if (Konbinazioak.getNireKonbinazioak().getKonbinazioMota() == 1) {//oilo oilo
				ListaKartaBaztertzeko.getNireListaKartaBaztertzeko().gehituKarta(this.getEskukoKartak().baztertuKartaMotaJakinda("Oilo"));
				ListaKartaBaztertzeko.getNireListaKartaBaztertzeko().gehituKarta(this.getEskukoKartak().baztertuKartaMotaJakinda("Oilo"));
				this.getEskukoKartak().kenduKartaKartaz(this.getEskukoKartak().baztertuKartaMotaJakinda("Oilo"));
				this.getEskukoKartak().kenduKartaKartaz(this.getEskukoKartak().baztertuKartaMotaJakinda("Oilo"));
				this.getEskukoKartak().gehituKarta(HasierakoBaraja.getNireHasierakoBaraja().banaketa());
				this.getEskukoKartak().gehituKarta(HasierakoBaraja.getNireHasierakoBaraja().banaketa());
				this.getEskukoArrautzak().getArrautza(0).bueltaEman();
				this.puntuak++;
				this.arrautzaKop--;
				imprimatuEskua();
			} else if (Konbinazioak.getNireKonbinazioak().getKonbinazioMota() == 2) {//oilo oilar habia
				ListaKartaBaztertzeko.getNireListaKartaBaztertzeko().gehituKarta(this.getEskukoKartak().baztertuKartaMotaJakinda("Oilo"));
				ListaKartaBaztertzeko.getNireListaKartaBaztertzeko().gehituKarta(this.getEskukoKartak().baztertuKartaMotaJakinda("Oilar"));
				ListaKartaBaztertzeko.getNireListaKartaBaztertzeko().gehituKarta(this.getEskukoKartak().baztertuKartaMotaJakinda("Habia"));
				this.getEskukoKartak().kenduKartaKartaz(this.getEskukoKartak().baztertuKartaMotaJakinda("Oilo"));
				this.getEskukoKartak().kenduKartaKartaz(this.getEskukoKartak().baztertuKartaMotaJakinda("Oilar"));
				this.getEskukoKartak().kenduKartaKartaz(this.getEskukoKartak().baztertuKartaMotaJakinda("Habia"));
				this.getEskukoKartak().gehituKarta(HasierakoBaraja.getNireHasierakoBaraja().banaketa());
				this.getEskukoKartak().gehituKarta(HasierakoBaraja.getNireHasierakoBaraja().banaketa());
				this.getEskukoKartak().gehituKarta(HasierakoBaraja.getNireHasierakoBaraja().banaketa());
				this.getEskukoArrautzak().gehituArrautza(ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().banaketa());
				this.arrautzaKop++;
				imprimatuEskua();				
			}else if (Konbinazioak.getNireKonbinazioak().getKonbinazioMota() == 3) {//zorro
				Arrautza ar = new Arrautza (false);
				ListaKartaBaztertzeko.getNireListaKartaBaztertzeko().gehituKarta(this.getEskukoKartak().baztertuKartaMotaJakinda("Azeria"));
				this.getEskukoKartak().kenduKartaKartaz(this.getEskukoKartak().baztertuKartaMotaJakinda("Azeria"));
				this.getEskukoKartak().gehituKarta(HasierakoBaraja.getNireHasierakoBaraja().banaketa());
				ListaJokalaria.getNireListaJokalariak().getZerrenda()[this.aurkariarenTxanda()].getEskukoArrautzak().arrautzaKendu(0);
				ListaJokalaria.getNireListaJokalariak().getZerrenda()[this.aurkariarenTxanda()].arrautzaKop--;
				this.getEskukoArrautzak().gehituArrautza(ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().banaketa());
				this.arrautzaKop++;
				ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().getListaArrautza().gehituArrautza(ar);		
				this.azeriaErabiliDu = true;
				imprimatuEskua();
				
			}
		}
		System.out.println("IA-ren txanda da.");
	}
			/*System.out.println("Aukeratu jokatu nahi dituzun kartak:");
			
			if (Konbinazioak.getNireKonbinazioak().getKonbinazioMota() == 2) {//oilo oilar habia
				s2 = Teklatua.getNireTeklatua().irakurriOsoa();
				s3 = Teklatua.getNireTeklatua().irakurriOsoa();
				s4 = Teklatua.getNireTeklatua().irakurriOsoa();
				ListaKartaBaztertzeko.getNireListaKartaBaztertzeko().gehituKarta(this.getEskukoKartak().getKarta(s2-1));
				ListaKartaBaztertzeko.getNireListaKartaBaztertzeko().gehituKarta(this.getEskukoKartak().getKarta(s3-1));
				ListaKartaBaztertzeko.getNireListaKartaBaztertzeko().gehituKarta(this.getEskukoKartak().getKarta(s4-1));
				this.getEskukoKartak().kenduKartaZenbakiz(s4-1);
				this.getEskukoKartak().kenduKartaZenbakiz(s3-1);
				this.getEskukoKartak().kenduKartaZenbakiz(s2-1);
				this.getEskukoKartak().gehituKarta(HasierakoBaraja.getNireHasierakoBaraja().banaketa());
				this.getEskukoKartak().gehituKarta(HasierakoBaraja.getNireHasierakoBaraja().banaketa());
				this.getEskukoKartak().gehituKarta(HasierakoBaraja.getNireHasierakoBaraja().banaketa());
				this.getEskukoArrautzak().gehituArrautza(ListaArrautzaHartzeko.getNireListaArrautzaHartzeko().banaketa());
				this.arrautzaKop++;
				imprimatuEskua();				
			}
			else if((Konbinazioak.getNireKonbinazioak().getKonbinazioMota() == 1)) {//bi oilo
				s2 = Teklatua.getNireTeklatua().irakurriOsoa();
				s3 = Teklatua.getNireTeklatua().irakurriOsoa();
				ListaKartaBaztertzeko.getNireListaKartaBaztertzeko().gehituKarta(this.getEskukoKartak().getKarta(s2-1));
				ListaKartaBaztertzeko.getNireListaKartaBaztertzeko().gehituKarta(this.getEskukoKartak().getKarta(s3-1));
				this.getEskukoKartak().kenduKartaZenbakiz(s3-1);
				this.getEskukoKartak().kenduKartaZenbakiz(s2-1);
				this.getEskukoKartak().gehituKarta(HasierakoBaraja.getNireHasierakoBaraja().banaketa());
				this.getEskukoKartak().gehituKarta(HasierakoBaraja.getNireHasierakoBaraja().banaketa());
				this.getEskukoArrautzak().getArrautza(0).bueltaEman();
				this.puntuak++;
				this.arrautzaKop--;
				imprimatuEskua();				
			}		
		}*/		
	//}
	
	//JOKALDI EXTRA EGIN METODOA
	public boolean jokaldiExtraEgin() {
		boolean erantzuna = false;
		int s1,s2;
		if (this.getEskukoKartak().defendatuDezaket()) {
			System.out.println("Aukeratu kartak defendatzeko");
			s1 = Teklatua.getNireTeklatua().irakurriOsoa();
			s2 = Teklatua.getNireTeklatua().irakurriOsoa();
			ListaKartaBaztertzeko.getNireListaKartaBaztertzeko().gehituKarta(this.getEskukoKartak().getKarta(s1-1));
			ListaKartaBaztertzeko.getNireListaKartaBaztertzeko().gehituKarta(this.getEskukoKartak().getKarta(s2-1));
			this.getEskukoKartak().kenduKartaZenbakiz(s2-1);
			this.getEskukoKartak().kenduKartaZenbakiz(s1-1);
			this.getEskukoKartak().gehituKarta(HasierakoBaraja.getNireHasierakoBaraja().banaketa());
			this.getEskukoKartak().gehituKarta(HasierakoBaraja.getNireHasierakoBaraja().banaketa());	
			erantzuna = true;
		}
		return erantzuna;
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
