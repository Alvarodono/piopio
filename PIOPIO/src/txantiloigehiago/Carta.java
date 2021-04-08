
public class Carta {

	private String nombre;
	private String palo;
    private double valor;  // en juegos como el Siete y Medio las figuras valen 0.5 puntos

    public Carta(String pNombre, String pPalo, double pValor)
    {
        this.nombre = pNombre;
        this.palo = pPalo;
        this.valor = pValor;
    }

    public void imprimir()
    {
    	System.out.println(nombre + " de " + palo);
    }

	public String getNombre()
	{
		return nombre;
	}

	public String getPalo()
	{
		return palo;
	}

	public double getValor()
	{
		return valor;
	}
    
}
