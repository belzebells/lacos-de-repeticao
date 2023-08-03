package javatech;
import java.util.Scanner;

public class LacoRepeticaoWhile04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade; int sexo;int categoria;
		String pergunta = "S";		
		int NumBackend=0;
		int NumMulherFrontEnd=0;
		int NumHomemMobileMais40=0;
		int NumMulherFullMenos30=0;	
						
		Scanner leia = new Scanner(System.in);
		//inserir dados do loop - enquanto a opção for sim, o programa deve rodar
				while(pergunta.equalsIgnoreCase("S")) {
		// ler a informação da idade do colaborador
			System.out.println("\nqual é a sua idade?");
			idade = leia.nextInt();
								
		// ler a informação do gênero
			System.out.println("\nqual é o seu gênero?");
			System.out.println("\n1 - feminino");
			System.out.println("\n2 - masculino");
			System.out.println("\n3 - outro");
			sexo = leia.nextInt();
	
			// ler a informação da categoria - cargo
			System.out.println("\nqual é o seu cargo?");
			System.out.println("\n1 - backend");
			System.out.println("\n2 - frontend");
			System.out.println("\n3 - mobile");
			System.out.println("\n4 - fullstack");
			categoria = leia.nextInt();
				
			//perguntar se quer continuar a leitura de dados
			System.out.println("\nvocê gostaria de continuar a leitura de dados?"
					+ "\n S caso seja SIM, N caso seja NÃO");
			pergunta = leia.next();
			
			// número de pessoas desenvolvedoras backend
				if(categoria == 1) {
					     NumBackend++;
				}
				
			// número de mulheres desenvolvedoras frontend
				else if(categoria==2 && sexo==1) {
				NumMulherFrontEnd++;
				}
								
			// número de homens desenvolvedores mobile maiores de 40 anos 
				//=0
				else if(categoria==3 && sexo==2 && idade>40) {
					NumHomemMobileMais40++;
				}
				
			// número de mulheres desenvolvedoras fullstack menores de 30 anos
				else if(categoria==4 && sexo==1 && idade<30);
				NumMulherFullMenos30++;
				}
		
			//mostrar na tela quando o usuário digitar N - isso vem fora da estrutura do loop
			System.out.println("\no total de pessoas desenvolvedoras beckend é: " +NumBackend);
			System.out.println("\no total de mulheres desenvolvedoras frontend é: " +NumMulherFrontEnd);
			System.out.println("\no número total de homens desenvolvedores mobile maiores de 40 anos é: " +NumHomemMobileMais40);
			System.out.println("\no número total de mulheres desenvolvedoras fullstack com menos de 30 anos é: " +NumMulherFullMenos30);
					
			}
			
} 	



