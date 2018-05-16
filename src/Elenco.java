public class Elenco
{

	private Carta[] carte;
	private int numeroCarte=0;
	public final int MAX_NUMERO_CARTE=1000000;
	
	public Elenco ()
	{
		carte= new Carta[MAX_NUMERO_CARTE];
		numeroCarte=0;
	}
	
	private int cercaCarta(String numero)
	{
		for (int i = 0; i < numeroCarte; i++) 
		{
			if (carte[i].getNumero().compareTo(numero)==0)
				return i;
		}
		return -1;
	}
	
	public int nuovaCarta(String numero, float saldo)
	{
		
		carte[numeroCarte]=new Carta ( numero, saldo);
		numeroCarte++;
		return numeroCarte-1;
		
	}
	public int nuovaCarta (Carta carta)
	{
		carte[numeroCarte]=new Carta(carta.getNumero(), carta.getSaldo());
		numeroCarte++;
		return numeroCarte-1;
	}
	
	public int getNumeroCarte()
	{
		return numeroCarte;
	}
	
	public Carta getCarta (int indice)
	{
		return carte[indice];
	}
	
	public Carta getCarta (String numero)
	{
		int posizione=cercaCarta(numero);
		return carte[posizione];
	}
	
	public boolean ricarica(String numeroCarta, float importo)
	{
		int posizione=cercaCarta(numeroCarta);
		if (posizione<0)
			return false;
		
		float saldo;
		
		
		saldo=carte[posizione].getSaldo();
		saldo=saldo+importo;
		carte[posizione].setSaldo(saldo);
		return true;
				
	}
	
	public boolean pagamento (String numero, float importo)
	{
		int posizione = cercaCarta(numero);
		if (posizione <0)
			return false;
		float saldo;
		saldo=carte[posizione].getSaldo();
		saldo=saldo-importo;
		carte[posizione].setSaldo(saldo);
		return true;
	}
	
	public float getSaldo(String numero)
	{
		int posizione= cercaCarta(numero);
		if (posizione<0)
			return 0;
		return carte[posizione].getSaldo();
	}
}
