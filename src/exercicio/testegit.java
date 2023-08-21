package exercicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class testegit {

	public static void main(String[] args) {
		
		 Scanner leitor = new Scanner(System.in);
		 List<Double> notas = new ArrayList<>(); 
		
		 
		 
		  
		  
		  for(int i=0; i<5; i++){
			  
			  System.out.println("Digite a nota do aluno: "); 
			  notas.add(leitor.nextDouble());	  
			  
		  }
		  
		  System.out.println("Todas as notas dos 5 alunos são: " + notas);
		  
		  System.out.println("A media de notas dos alunos é " + media(notas));
		  
		
		  
//		  double soma = 0;
//		  for  (Double nota : notas) {
//			  soma += nota;
//		  }
//		  
//		  double media = soma/notas.size();
		  
		  
	}
	
	
	public static double media(List<Double> notas) {
	  double soma = 0;
	  for  (Double nota : notas) {
		  soma += nota;
	  }
	  
	  double media = soma/notas.size();
	  return media;
	  
		
	}
	
	
	
		 
		  
		  

	}


