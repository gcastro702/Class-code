import java.util.Scanner;

public class Ex19_1_BitlletBus {

	public static void main(String[] args) {
		Scanner teclat=new Scanner(System.in);
		int origen=0,desti=0,descompte=0,i=0,kms=0,aux=0;
		double preu=0.08;
		char doble=' ';
		String[]llocs= {"Tarragona","Altafulla","Torredembarra","Creixell","Roda de Berà","El Vendrell"};
		int []km= {14,3,8,5,10};

//Mostrar opions del trajecte
		System.out.println("**********************************************************************************************");
		System.out.println("Les possibles destinacions son :");	
		for(i=0;i<llocs.length;i++)
		{
			System.out.print(i+"."+llocs[i]+"    ");
		}
		System.out.println();
		System.out.println("**********************************************************************************************");

//Introduir dades del trajecte
		System.out.println("Orgien: ");
		origen=teclat.nextInt();
		System.out.println("Desti: ");
		desti=teclat.nextInt();
		System.out.println("Anada/Tornada (s/n): ");
		doble=teclat.next().charAt(0);

//Calcular km del trajecte
		if(origen>desti)
		{
			aux=origen;
			origen=desti;
			desti=aux;
		}
		
		for(i=origen;i<desti;i++)
		{
			kms=km[i]+kms;
		}
		
//Calcular preu del trajecte
		if(doble=='n' || doble=='N')preu=kms*preu;	
		else if(doble=='s' || doble=='S') 
		{
			kms=kms*2;
			preu=kms*preu;
			
			descompte=5;
			preu=preu*0.95;
		}
//Mostrar resultats
		System.out.println("Origen: "+llocs[origen]);
		System.out.println("Desti: "+llocs[desti]);
		System.out.println("Km: "+kms);
		System.out.print("A/T: ");
		if(doble=='s' || doble=='S') System.out.println("Si");
		else System.out.println("No");
		System.out.println("Descompte: "+descompte);
		System.out.println("Preu: "+preu);
		System.out.println("**********************************************************************************************");

		
	}
}
