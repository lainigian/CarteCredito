
public class Operazione extends Thread
{

		public Elenco elenco;
		public String numeroCarta;
		public char tipoOperazione;
		public float importo;
		
		public Operazione(Elenco elenco, String numeroCarta, char tipoOperazione, float importo)
		{
			this.elenco=elenco;
			this.numeroCarta=numeroCarta;
			this.tipoOperazione='P';
			if (tipoOperazione=='r'|| tipoOperazione=='R')
				this.tipoOperazione='R';
			this.tipoOperazione=tipoOperazione;
			this.importo=importo;
			
		}
		
		public void run()
		{
			if (tipoOperazione=='R')
				elenco.ricarica(numeroCarta,importo);
			else
				elenco.pagamento(numeroCarta, importo);
			
		}
		
	
}
