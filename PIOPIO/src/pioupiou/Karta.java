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
	
	public void imprimatuKarta() {
		System.out.println(mota);
	}
}
