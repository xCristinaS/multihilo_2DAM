package ejemplo02_isInterrumpted;

public class Hilo extends Thread{
	private long num = 1L;
	
	public void run(){
		while(true){
			if (esPrimo(num))
				System.out.printf("- %d es un numero primo.\n", num);
			
			if (isInterrupted()){
				System.out.println("Hilo interrumpido.");
				return;
			}
			num++;
		}
	}
	
	private boolean esPrimo(long numero){
		if (numero <= 2)
			return true;
		
		for (long i = 2; i < numero/2; i++)
			if ((numero % i) == 0)
				return false;
		
		return true;
	}
}
