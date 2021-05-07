package pioupiou;

public class Karta {
	
	//ATRIBUTUAK
	private String mota;

	
	//ERAIKITZAILEA
	public Karta (String pMota) {
		this.mota = pMota;
	}
	
	//BESTE METODOAK
	//GET MOTA METODOA
	public String getMota(){
		return this.mota;
	}
	
	
	
	//IMPRIMATU KARTA METODOA
	public void imprimatuKarta() {
		System.out.print(this.mota);
		if (this.mota == "Oilo") {
			System.out.println("                 ║");
		}else if (this.mota == "Oilar" || this.mota == "Habia") {
			System.out.println("                ║");
		}else if (this.mota == "Azeria") {
			System.out.println("               ║");
		}
	}
}
