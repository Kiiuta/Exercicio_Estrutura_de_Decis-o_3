import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner leitor = new Scanner (System.in);
		
		float x,y,z,c,m;
		int mat;
		
		System.out.println("Descubra a resultado em F�sica! Digite sua matr�cula:");
		mat=leitor.nextInt();
		System.out.println(" Digite a primeira das quatro notas:");
		x=leitor.nextFloat();
		System.out.println(" Digite a segunda nota:");
		y=leitor.nextFloat();
		System.out.println(" Digite a terceira nota:");
		z=leitor.nextFloat();
		System.out.println(" Digite a quarta nota:");
		c=leitor.nextFloat();
		m=((x+y+z+c)/4);
		System.out.println("Sua m�dia foi de "+m);
		
		if (m>=7)
		    System.out.println("Voc�, aluno referente � matr�cula "+mat+" foi aprovado.");
		if (m>=3.5&&m<=7)
			System.out.println("Voc�, aluno referente � matr�cula "+mat+" est� de recupera��o.");
		if (m<3.5)
			System.out.println("Voc�, aluno referente � matr�cula "+mat+" foi reprovado.");
		
		
		
	}

}
