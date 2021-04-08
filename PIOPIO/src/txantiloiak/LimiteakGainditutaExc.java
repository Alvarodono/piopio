package proiektua;

public class LimiteakGainditutaExc extends Exception {
	//atributuak-atributos
    private String mezua;
	//eraikitzailea-constructora
	 LimiteakGainditutaExc(){
		 super();
		 this.mezua="Balio Desegokia; Limiteak gaindituta";
	 }
	//gainontzeko metodoak-metodos adicionales
	 public void mezuaInprimatu() {
		 System.out.println(this.mezua);
	 }
}
