public class Casilla
{
	private String id;

	public String getId() {
		return id;
	}

	public Casilla(String id)
	{
		this.id = id;
	}
	public void imprimir()
	{
		System.out.print(this.id);
	}

}
