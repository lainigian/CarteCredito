
public class MainClass 
{

	public static void main(String[] args) 
	{
		Elenco elencoCarte= new Elenco();	
		elencoCarte.nuovaCarta("000000",1000);
		elencoCarte.nuovaCarta("000001",2000);
		elencoCarte.nuovaCarta("000002",3000);
		elencoCarte.nuovaCarta("000003",4000);
		elencoCarte.nuovaCarta("000004",5000);
			
			
		
			for (int i = 0; i <1000; i++) 
			{
				Operazione pagamento=new Operazione(elencoCarte, "000000", 'P', 100);
				Operazione ricarica=new Operazione(elencoCarte, "000000", 'R', 100);
				pagamento.start();
				ricarica.start();
				try 
				{
					pagamento.join();
				} 
				catch (InterruptedException e) 
				{
					
				}
				try 
				{
					ricarica.join();
				} 
				catch (InterruptedException e) 
				{
					
				}
			}
			
		
		System.out.println(elencoCarte.getSaldo("000000"));		
	}
		
}
