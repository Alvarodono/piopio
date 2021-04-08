public class Tablero
{
	private static Tablero instancia = new Tablero();
	private Casilla[][] casillas;
	private int nFilas;
	private int nCols;

	private Tablero()
	{
		this.nFilas = 10;
		this.nCols = 8;
		
		this.casillas = new Casilla[nFilas][nCols]; 
		for (int f=0; f<nFilas; f++)
		{
			for (int c=0;c<nCols;c++)
			{
				casillas[f][c] = new Casilla(f + " y " + c);
			}
		}
	}

	public static Tablero getTablero()
	{
		return instancia;
	}
	public void imprimirCasilla(int pFila, int pCol)
	{  
		Casilla c = this.casillas[pFila][pCol] ;
		c.imprimir();
	}

	public void imprimirTablero()
	{
		for (int f=0; f<nFilas; f++)
		{
			System.out.print("|");
			for (int c=0;c<nCols;c++)
			{
				imprimirCasilla(f,c);
				System.out.print("|");
			}
			System.out.println("");
		}

	}
}

