package pioupiou;

import java.util.ArrayList;
import java.util.Iterator;

public class JokalariCPU extends Jokalaria{
	//ATRIBUTUAK
	private String izena;
	private ListaKarta eskukoKartak;
	private ListaArrautza eskukoArrautzak;
	
	//ERAIKITZAILEA 
	public JokalariCPU(int pAdina) {
		super(pAdina);
		this.izena = "CPU"; 
	}
	
	//BESTE METODOAK	
	//JOKALDIA EGIN METODOA
	public void jokaldiaEgin() {
		Karta k1 = null,k2 = null,k3 = null,k4 = null;
		imprimatuEskua();
		if(!this.getKonbinazioak().konbinazioNormalikAhalDago(getEskukoKartak(),this.getEskukoArrautzak().arrautzarikDago())) {
			Iterator<Karta> itr = this.eskukoKartak.getIteradorea();
			while (itr.hasNext()) {
				k1 = itr.next();
				k2 = itr.next();
				k3 = itr.next();
				k4 = itr.next();			
			}
			zerBaztertuCPU(k1, k2, k3, k4);
		}
	}
	
	//JOKALDI EXTRA EGIN METODOA
		public void jokaldiExtraEgin() {
			
		}
	
	
	//TURNOA BUKATU METODOA
	public void turnoaBukatu() {
		
	}
	
	//IMPRIMATU ESKUA METODOA
	public void imprimatuEskua() {
		System.out.println("Makinaren kartak:");
		System.out.println(" ");
		this.getEskukoKartak().imprimatuKartak();
		System.out.println("-----------------------");
		System.out.print("Arrautzak:");
		System.out.print(this.arrautzaKop);
		System.out.print("    Txitak:");
		System.out.println(this.puntuak);
		System.out.println("-----------------------");
	}
	
	
	//KONBINAZIO ONENA METODOA
	public ListaKarta konbinazioOnena() {
		int i = 0;
		Karta k = null;
		Karta kt = this.getEskukoKartak().getKarta(i);
		String ktm = kt.getMota();					
	}
	
	//ZER BAZTERTU CPU METODOA
	public Karta zerBaztertuCPU(Karta k1, Karta k2, Karta k3, Karta k4) {
		Karta k = null;
		int azeriKont = 0;
		int habiaKont = 0;
		int oiloKont = 0;
		int oilarKont = 0;
		if (k1.getMota() == "Azeria") {
			azeriKont++;
		}
		if (k2.getMota() == "Azeria") {
			azeriKont++;
		}
		if (k3.getMota() == "Azeria") {
			azeriKont++;
		}
		if (k4.getMota() == "Azeria") {
			azeriKont++;
		}
		if (k1.getMota() == "Habia") {
			habiaKont++;
		}
		if (k2.getMota() == "Habia") {
			habiaKont++;
		}
		if (k3.getMota() == "Habia") {
			habiaKont++;
		}
		if (k4.getMota() == "Habia") {
			azeriKont++;
		}
		if (k1.getMota() == "Oilo") {
			oiloKont++;
		}
		if (k2.getMota() == "Oilo") {
			oiloKont++;
		}
		if (k3.getMota() == "Oilo") {
			oiloKont++;
		}
		if (k4.getMota() == "Oilo") {
			oiloKont++;
		}
		if (k1.getMota() == "Oilar") {
			oilarKont++;
		}
		if (k2.getMota() == "Oilar") {
			oilarKont++;
		}
		if (k3.getMota() == "Oilar") {
			oilarKont++;
		}
		if (k4.getMota() == "Oilar") {
			oilarKont++;
		}
		if (oiloKont > 2) { //1.egoera
			if (k1.getMota() == "Oilo") {
				k = k1;
			}else if (k2.getMota() == "Oilo") {
				k = k2;
			}
		}else if (oilarKont > 2) { //2.egoera
			if (k1.getMota() == "Oilar") {
				k = k1;
			}else if (k2.getMota() == "Oilo") {
				k = k2;
			}
		}else if (habiaKont > 1) { //3.egoera
			if (k1.getMota() == "Habia") {
				k = k1;
			}else if (k2.getMota() == "Habia") {
				k = k2;
			}else if (k3.getMota() == "Habia") {
				k = k3;
			}
		}else if (azeriKont > 1) { //4.egoera
			if (k1.getMota() == "Azeria") {
				k = k1;
			}else if (k2.getMota() == "Azeria") {
				k = k2;
			}else if (k3.getMota() == "Azeria") {
				k = k3;
			}
		}else if (oiloKont == 2 && oilarKont == 2) { //5.egoera
			if (this.arrautzaKop > 0) { //descartar gallo  
				if (k1.getMota() == "Oilar") {
					k = k1;
				}else if (k2.getMota() == "Oilar") {
					k = k2;
				}else if (k3.getMota() == "Oilar") {
					k = k3;
				}
			}else { //descartar gallina
				if (k1.getMota() == "Oilo") {
					k = k1;
				}else if (k2.getMota() == "Oilo") {
					k = k2;
				}else if (k3.getMota() == "Oilo") {
					k = k3;
				}
			}
		}else if (azeriKont == 1 && habiaKont == 1 && oiloKont == 2) { //6.egoera
			if (this.arrautzaKop > 0) {//descartar nido
				if (k1.getMota() == "Habia") {
					k = k1;
				}else if (k2.getMota() == "Habia") {
					k = k2;
				}else if (k3.getMota() == "Habia") {
					k = k3;
				}else if (k4.getMota() == "Habia") {
					k = k4;
				}
			}else { // descartar gallina
				if (k1.getMota() == "Oilo") {
					k = k1;
				}else if (k2.getMota() == "Oilo") {
					k = k2;
				}else if (k3.getMota() == "Oilo") {
					k = k3;
				}
			}
		}else if (azeriKont == 1 && habiaKont == 1 && oilarKont == 2) { //7.egoera
			if (this.arrautzaKop > 0) { //descartar zorro
				if (k1.getMota() == "Azeria") {
					k = k1;
				}else if (k2.getMota() == "Azeria") {
					k = k2;
				}else if (k3.getMota() == "Azeria") {
					k = k3;
				}else if (k4.getMota() == "Azeria") {
					k = k4;
				}
			}else {	//descartar gallo
				if (k1.getMota() == "Oilar") {
					k = k1;
				}else if (k2.getMota() == "Oilar") {
					k = k2;
				}else if (k3.getMota() == "Oilar") {
					k = k3;
				}
				
			}
		}
		
		return k;
	}
	
	
	
}
