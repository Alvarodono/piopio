package pioupiou;

public class Karta {
	
	//ATRIBUTUAK
	private String mota;
	private boolean aukeratua;
	
	//ERAIKITZAILEA
	public Karta (String pMota) {
		this.mota = pMota;
	}
	
	//BESTE METODOAK
	//GET MOTA METODOA
	public String getMota(){
		return this.mota;
	}
	
	//AUKERATUA METODOA
	public boolean aukeratua() {
		return aukeratua;
	}
	
	//SET AUKERATUA METODOA
	public void aukeratua(boolean a) {
		this.aukeratua = a;
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
