import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lettura da tastiera
		Scanner tastiera = new Scanner(System.in);
		/*
		int eta =  tastiera.nextInt();
		System.out.println("Hai : "+eta+" anni" );

	    //Stampa Primi x numeri
	
	int num = 1;
	System.out.println(num);
	while(num<=10){
		System.out.println(num);
		num++;
	}
		*/
	
	   //Somma primi 100 numeri
	/*int somma=0, conta=1;
	while(conta<=100)
	{
		somma=somma+conta;
		conta++;
	}
	System.out.println("La somma dei primi 100 numeri è: " +somma);
	*/
	// somma numeri tra a e b
	
	int a, b, diff, index;
	int sum=0;
	System.out.println("Inserisci il primo numero: ");
	a = tastiera.nextInt(); 
	System.out.println("Inserisci il secondo numero: ");
	b = tastiera.nextInt(); 
	if (b>a)
	{
	int temp;
	temp=b;
	b=a;
	a=temp;
	}
	
	index=b;
	while(index<=a) {
			sum+=index++;
	}
	System.out.println("La somma è: "+sum);

	//inserire da tastiera finche la somma è inferiore a 1000
}
}
