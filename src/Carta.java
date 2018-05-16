
public class Carta 
{

		public String numero;
		public float saldo;
		
		public Carta(String numero, float saldo)
		{
			this.numero=numero;
			setSaldo(saldo);
		}
		
		public Carta(Carta carta)
		{
			this.numero=carta.getNumero();
			setSaldo(carta.getSaldo());
		}

		public float getSaldo() {
			return saldo;
		}

		public void setSaldo(float saldo) {
			this.saldo = saldo;
		}

		public String getNumero() {
			return numero;
		}
}
