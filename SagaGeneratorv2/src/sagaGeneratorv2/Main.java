package sagaGeneratorv2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		
		/* Tela Inicial */
	    System.out.println("\n=== Saga Generator - Em busca do FullStack em Java ===");
	    System.out.println("--------------------------------------------------------");		
        System.out.println("1. Iniciar jogo");
        System.out.println("2. Sair");
        System.out.print("Escolha uma opção (1-2): ");
        
        /* Obtém a opção selecionada pelo usuário */
        int opcao = leia.nextInt();
        leia.nextLine(); // Consumir a quebra de linha 
		
        /* Iniciar o jogo se o usuário selecionou a opção 1 */
        if (opcao == 1) {
            // Tela de configuração do personagem
        	System.out.println("-----------------------------------------------------");	 	
            System.out.print("Digite o nome do seu personagem: ");
            String nome = leia.nextLine();
            System.out.println("                                                           ");
            System.out.println("Bem-vinde, " + nome+ "!");
            System.out.println("															");
        				}
        else if (opcao==2) {
        					System.out.println("                                             ");
        					System.out.println("\nSaindo do jogo....");
        					System.exit(0);
        				}
		//Perguntas, opções de respostas, resposta correta
        				//Fase 1
        dadosJogador[][] perguntas = {
                {new dadosJogador("Qual das opções abaixo representa corretamente a linha de código que faz a leitura dos dados digitados por um usuário?",
                        new String[]{"Scanner leia = new Scanner(System.in);", "leia = scanner new scanner(system.in)",
                        		"scanner leia = new scanner(system.in):"},1),
                        new dadosJogador("Qual das opções abaixo iremos utilizar para exibir o resultado de uma divisão limitado à duas casas decimais?",
                                new String[]{"System.out.println(\"O resultado da soma é: %.2f\"+resultado);", "System.out.printf(\"O resultado da soma é: %.2f \"+resultado);",
                                        "System.out.printf(\"O resultado da soma é: %.2f\",resultado);"},3)
                },//Fase 2
                {new dadosJogador("Quais são os principais laços condicionais em lógica de programação? ",
                        new String[]{"if, if-else, else-if e switch", "else-if, if, for e switch", "while, if-else, while, do-while",
                                },1),
                        new dadosJogador("Qual é a estrutura condicional mais adequada para testar várias condições?",
                                new String[]{"if", "else-if",
                                        "switch-case"},3)
                },//Fase 3
                {new dadosJogador("Quais são os principais laços de repetição em lógica de programação??",
                        new String[]{"For, if e while", "for, while e do-while",
                                "for, if e switch"},2),
                        new dadosJogador("Qual a diferença entre o laço for e o laço while em programação?",
                                new String[]{"O laço for é baseado em uma condição e o while em uma contagem", "O laço for é baseado em uma contagem e o while em uma condição",
                                        "Não há diferença entre os dois laços"},2)
                },//Fase 4
                {new dadosJogador("A implementação LinkedList ou Lista Vinculada é uma estrutura de dados...",
                        new String[]{"Dimensional", "Abstrata",
                                "Linear"},3),
                        new dadosJogador("Por quê a implementação HashSet é a mais rápida de todas?",
                                new String[]{"Porque ela utiliza internamente uma HashTable", "Por causa da implementação TreeSet",
                                        "Porque ela organiza elementos da Collection automaticamente"},1)
                },//Fase 5
                {new dadosJogador("Qual é o tipo de estrutura de uma pilha(Stack)?",
                        new String[]{"Primeiro a entrar, primeiro a sair (FIFO)", "Último a entrar, primeiro a sair(LIFO)",
                                "Último a entrar, último a sair(LILO)"},2),
                        new dadosJogador("Em uma Array do tipo String qual é a maneira correta de se usar a Interface Iterator?",
                                new String[]{"ArrayList <Integer> nome = new ArrayList <Integer>();", "ArrayList <String> nome = new ArrayList <String>;",
                                        "ArrayList <String> nome = new ArrayList <String>();"},3)
                },//Fase 6
                {new dadosJogador("Quais são os modificadores de acesso de métodos e atributos?",
                        new String[]{"padrão, public, protected e private", "public, private, pattern e p",
                                "abstract, final, public e private"},1),
                        new dadosJogador("Quais são os modificadores de acesso de classes?",
                                new String[]{"abstract e public", "padrão e public",
                                        "abstract e final"},2)
                }
                
        };  
                
		int pontuacao=0;
		
		
		// Primeiro índice [i] para as perguntas
		for (int x = 0; x < 6; x++) {
			 System.out.println("==================== FASE " + (x+1) + " =========================");
		for (int i = 0; i < 2; i++) {
		    System.out.println("               ___ PERGUNTA " + (i+1) + "___");
		    System.out.println("                                                                     ");
		    dadosJogador perguntaAtual = perguntas[x][i];
		    System.out.println(perguntaAtual.getPergunta());
		    String[] opcoesResposta = perguntaAtual.getOpcoesResposta();
		    
		    //Segundo índice para [j] para as opções de resposta
		    for (int j = 0; j < 3; j++) {
		        System.out.println("\n	"+(j+1) + ") " + opcoesResposta[j]);
		    }
		    
		    // Faz a leitura da resposta e compara se é a correta
		    int resposta = leia.nextInt();
		    if (resposta == perguntaAtual.getRespostaCorreta()) {
		        pontuacao += 10;
		        System.out.println("Resposta certa! Sua pontuação atual é de " + pontuacao + " pontos.");
		        System.out.println("                                                                   ");
		        System.out.println("                                                                   ");
		        // Caso não seja a resposta certa, imprimir a mensagem 
		    }else {
            	System.out.println("\nLamento, não era a resposta certa. ");
		}
		
	} //for (int i = 0; i < perguntas.length; i++) 
		
		}
		System.out.println("Parabéns ! Você chegou ao fim da sua jornada da Saga Generator e conseguiu obter "+pontuacao+" pontos!");
		
		
		
	
		
		
		
		
		
}
}
