package exercicio1;
import java.io.DataInput;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ado7 {
	
	static int temp_dialog = 1, temp_narrativa = 1, temp_transicao =0;
	public static int reputacaoGrupo = 0;
	public static int danoDoIran = 25;
	public static int vidaDoIran = 100;
	
		public static void main(String [] args) throws Exception {
			
			Scanner entrada = new Scanner(System.in);
	        int escolha;
	        do {
	            Digita("--------------------------------- ", TimeUnit.MILLISECONDS, temp_dialog);
	            Digita("\n|        Virtual Bhaskara       |", TimeUnit.MILLISECONDS, temp_dialog);
	            Digita("\n--------------------------------- ", TimeUnit.MILLISECONDS, temp_dialog);
	            Digita("\n\nPrecione 1 para iniciar.\nPrecione 2 para sair.", TimeUnit.MILLISECONDS, temp_dialog);
	            System.out.println("\n");
	            escolha = entrada.nextInt();
	            if(escolha == 1) {
	                capitulo2();
	            } else if (escolha == 2) {
	                Digita("Até a próxima!", TimeUnit.MILLISECONDS, temp_dialog);
	            } else {
	                Digita("\nOpção inválida!", TimeUnit.MILLISECONDS, temp_dialog);
	            }
	            System.out.println("\n");
	        } while (escolha != 1 && escolha != 2);
	        entrada.close();
	    }

	    static void menu() throws Exception {
	        Scanner entrada = new Scanner(System.in);
	        int escolha_menu;
	        do {
	            Digita("\n--------------------------------- ", TimeUnit.MILLISECONDS, temp_dialog);
	            Digita("\n|        Virtual Bhaskara       |", TimeUnit.MILLISECONDS, temp_dialog);
	            Digita("\n--------------------------------- ", TimeUnit.MILLISECONDS, temp_dialog);
	            Digita("\n1.Instruções \n2.Jogar \n3.Créditos \n4.Sair", TimeUnit.MILLISECONDS, temp_dialog);
	            System.out.println("\n");
	            escolha_menu = entrada.nextInt();
	            if (escolha_menu == 1) {
	                instrucoes();
	            } else if (escolha_menu == 2) {
	                login();
	            } else if (escolha_menu == 3) {
	                creditos();
	            } else if (escolha_menu == 4) {
	                int escolha_sair;
	                Digita("\nTem certeza que deseja sair? \n*1.Sim \n*2.Não", TimeUnit.MILLISECONDS, temp_dialog);
	                System.out.println("\n");
	                escolha_sair = entrada.nextInt();
	                switch (escolha_sair) {
	                    case 1:
	                        Digita("Até a próxima!", TimeUnit.MILLISECONDS, temp_dialog);
	                        break;
	                    case 2:
	                        menu();
	                        break;
	                }
	            } else {
	                Digita("\nOpção inválida, digite novamente.", TimeUnit.MILLISECONDS, temp_dialog);
	            }
	        } while (escolha_menu != 1 && escolha_menu != 2 && escolha_menu != 3 && escolha_menu != 4);
	        entrada.close();
	    }

	    static void instrucoes() throws Exception {
	        Scanner entrada = new Scanner(System.in);
	        int escolha_instrucoes;
	        Digita( "\nInstruções do jogo: O jogo é um Rpg inspirado na franquia Sword Art Online. Batalhe, recrute amigos e desvende mistérios usando a matemática para poder escapar do mundo virtual.", TimeUnit.MILLISECONDS, temp_dialog);
	        Digita("\n*Pressione 1 para voltar ao menu", TimeUnit.MILLISECONDS, temp_dialog);
	        System.out.println("\n");
	        escolha_instrucoes = entrada.nextInt();
	        while (true) {
	            if (escolha_instrucoes == 1) {
	                menu();
	                break;
	            } else {
	                Digita("\n**Opção inválida, digite novamente.**", TimeUnit.MILLISECONDS, temp_dialog);
	            }
	        }
	        entrada.close();
	    }

	    static void login() throws Exception {
	        Scanner entrada = new Scanner(System.in);
	        String user = "";
	        String password = "";
	        String login, senha;
	        int escolhaLogin, escolhaCadastro;
	        do {
	            Digita("\nDesesa fazer cadastro? \n1.Sim \n2.Não", TimeUnit.MILLISECONDS, temp_dialog);
	            System.out.println("\n");
	            escolhaCadastro = entrada.nextInt();
	            if (escolhaCadastro == 1) {
	                Digita("\nEscolha um usuário: ", TimeUnit.MILLISECONDS, temp_dialog);
	                System.out.println("\n");
	                user = entrada.next();
	                Digita("\nEscolha sua senha: ", TimeUnit.MILLISECONDS, temp_dialog);
	                System.out.println("\n");
	                password = entrada.next();
	                Digita("\nCadastro feito com sucesso!\n", TimeUnit.MILLISECONDS, temp_dialog);
	            } else if (escolhaCadastro == 2) {
	                menu();
	            } else {
	                Digita("Opção inválida!", TimeUnit.MILLISECONDS, temp_dialog);
	            }
	        } while (escolhaCadastro != 1 && escolhaCadastro != 2);
	        do {
	            Digita("\nDeseja efetuar loguin? \n1.Sim \n2.Não", TimeUnit.MILLISECONDS, temp_dialog);
	            System.out.println("\n");
	            escolhaLogin = entrada.nextInt();
	            switch (escolhaLogin) {
	                case 1:
	                    Digita("\n*Login*", TimeUnit.MILLISECONDS, temp_dialog);
	                    while (true) {
	                        Digita("\nDigite seu usuário: ", TimeUnit.MILLISECONDS, temp_dialog);
	                        System.out.println("\n");
	                        login = entrada.next();
	                        Digita("\nDigite sua senha: ", TimeUnit.MILLISECONDS, temp_dialog);
	                        System.out.println("\n");
	                        senha = entrada.next();
	                        if (login.equals(user) && senha.equals(password)) {
	                            Digita("\nBem vindo, " + user + "!\n", TimeUnit.MILLISECONDS, temp_dialog);
	                            capitulo1();
	                            break;
	                        } else {
	                            Digita("\n**Usuário ou senha inválidos, tente novamente.**", TimeUnit.MILLISECONDS, temp_dialog);
	                        }
	                    }
	                    break;
	                case 2:
	                    menu();
	                    break;
	                default:
	                    Digita("\nOpção inválida, digite novamente.", TimeUnit.MILLISECONDS, temp_dialog);
	            }
	        } while (escolhaLogin != 1 && escolhaLogin != 2);
	        entrada.close();
	    }

	    static void creditos() throws Exception {
	        Scanner entrada = new Scanner(System.in);
	        int escolha_creditos;
	        Digita("\nCréditos: Jogo criado por Vini.", TimeUnit.MILLISECONDS, temp_dialog);// creditos provisorios
	        Digita("\n*1. Voltar ao menu", TimeUnit.MILLISECONDS, temp_dialog);
	        System.out.println("\n");
	        escolha_creditos = entrada.nextInt();
	        while (true) {
	            if (escolha_creditos == 1) {
	                menu();
	                break;
	            } else {
	                Digita("**Opção inválida, digite novamente.**", TimeUnit.MILLISECONDS, temp_dialog);
	            }
	            break;
	        }
	        entrada.close();
	    }

	    public static void capitulo1() throws Exception {
	        Scanner entrada = new Scanner(System.in);
	        String nome_rival = "Alice";
	        Digita("\nNarrador: Você acorda um dia com uma mensagem da sua melhor amiga: 'Acorda, acorda!!'", TimeUnit.MILLISECONDS, temp_narrativa);
	        Digita("\n\nNarrador: O nome dela é Alice.", TimeUnit.MILLISECONDS, temp_narrativa);
	        Digita("\n\nNarrador: Você e a " + nome_rival + " ja são velhos amigos de infância, e também grandes rivais no mundo dos games.", TimeUnit.MILLISECONDS, temp_narrativa);
	        Digita("\n\n" + nome_rival + ": Vamos, finalmente lançou aquele novo jogo de VR que a gente queria tanto!\n", TimeUnit.MILLISECONDS, temp_narrativa);
	        Digita("\nNarrador: Você e " + nome_rival + " estavam a meses esperando o novo jogo VIRTUAL DUNGEON, então, os dois vão correndo até a loja de games.", TimeUnit.MILLISECONDS, temp_narrativa);
	        Digita( "\n\nVendedor: Eai galera! acabou de chegar um estoque do novo jogo, e separei dois para os meus clientes favoritos!", TimeUnit.MILLISECONDS, temp_narrativa);
	        Digita("\n\n" + nome_rival + ": Primeiro euu :P", TimeUnit.MILLISECONDS, temp_narrativa);
	        Digita("\n\nNarrador: Voce... \n1.Compra logo o jogo! \n2.Ta duro...", TimeUnit.MILLISECONDS, temp_narrativa);
	        System.out.println("\n");
	        int escolha_loja = entrada.nextInt();
	        do {
	            if (escolha_loja == 1) {
	                Digita("\nNarrador: Você compra o jogo.", TimeUnit.MILLISECONDS, temp_narrativa);
	                Digita(nome_rival + "\n: Boaa, agora, vamos jogar!!", TimeUnit.MILLISECONDS, temp_narrativa);
	                Digita("Narrador: Você vai para casa e conecta no jogo com sua amiga.", TimeUnit.MILLISECONDS, temp_narrativa);
	            } else if (escolha_loja == 2) {
	                Digita("\n\nNarrador: Você vai pra casa e vai dormir.", TimeUnit.MILLISECONDS, temp_narrativa);
	                Digita("\nGAME OVER", TimeUnit.MILLISECONDS, temp_narrativa);
	                Digita("\nFinal 1: Ta duro, dorme!", TimeUnit.MILLISECONDS, temp_narrativa);
	                System.exit(0);
	            } else {
	                Digita("\n\nNarrador: Eu nem dei essa opção!.", TimeUnit.MILLISECONDS, temp_narrativa);
	            }
	        } while (escolha_loja != 1 && escolha_loja != 2);
	        Digita("\nNarrador: Ao conectar no jogo, você sente uma dor estranha, mas não liga muito.", TimeUnit.MILLISECONDS, temp_narrativa);
	        Digita("\nNarrador: No lobby no jogo, vc escuta uma voz familiar...", TimeUnit.MILLISECONDS, temp_narrativa);
	        Digita("\n" + nome_rival + ": Ai, vc tbm sentiu aquilo? Doeu um pouco, mas deve ser o jogo calibrando né?", TimeUnit.MILLISECONDS, temp_narrativa);
	        Digita("\n" + nome_rival + ": Caraca, olha esses gráficos! Parece mesmo a vida real!", TimeUnit.MILLISECONDS, temp_narrativa);
	        
	        
	        
	        
	        
	        entrada.close();
	    }
	 

        public static void capitulo2() throws Exception {
        	
        	
        	Scanner sc = new Scanner(System.in);
        	
        	
        	Digita("\n\nNarrador: Após uma noite de sono em cima de uma arvore, voce encontra um grupo de quatro integrantes treinando e estudando o jogo pra ficarem mais fortes.", TimeUnit.MILLISECONDS, temp_narrativa);
            Digita("\nPensando consigo mesmo, voce decide se aproximar deles.", TimeUnit.MILLISECONDS, temp_narrativa);
            String perso1 = "primeiro integrante";
            String perso2 = "segundo integrante";
            String perso3 = "terceiro integrante";
            String perso4 = "quarto integrante";
            
            
            Digita("\n" + perso1, TimeUnit.MILLISECONDS, temp_narrativa);
            Digita(": Quem é voce?", TimeUnit.MILLISECONDS, temp_narrativa);
            Digita("\n\n(1) meu nome é Iran, e eu estou sozinho por agora, posso me juntar a voces?"
            		+ "\n(2) voces nao precisam saber meu nome, quem são voces?", TimeUnit.MILLISECONDS, temp_narrativa);
            
            System.out.println("\n");
            int opcaoResposta = sc.nextInt();
            
            switch (opcaoResposta) {
			case 1: {
				reputacaoGrupo ++;
				Digita("\n" + perso1, TimeUnit.MILLISECONDS, temp_narrativa);
				Digita(": Claro!, prazer em te conhecer Iran, me chamo Róger Guedes, nós estavamos treinando, se quiser pode se juntar a gente.", TimeUnit.MILLISECONDS, temp_narrativa);
				Digita("\n" + perso2,TimeUnit.MILLISECONDS, temp_narrativa);
				Digita(": voce ja havia treinado antes nesse jogo? Estamos com alguma dificuldades pra aprender a jogar mas ja pegamos mais ou menos o jeito do jogo, nós podemos ensinar algumas coisas"
						+ "\npra voce e em troca voce pode nos ajudar a ficarmos mais fortes.", TimeUnit.MILLISECONDS, temp_narrativa);
				Digita("\n\n(1) Sim, eu estava treinando com uma amiga a algum tempo, nós aprendemos algumas coisas bem legais que eu posso compartilhar com voces."
						+ "\n(2) Não, eu ainda nem tive a oportunidade de treinar ou de explorar o mapa pois ainda sou muito novato.", TimeUnit.MILLISECONDS, temp_narrativa);
				
				System.out.println("\n");
				int opcaoResposta2 = sc.nextInt();
				if (opcaoResposta2 == 1) {
					 reputacaoGrupo ++;
					 reputacaoGrupo ++;
					Digita("\n" + perso2, TimeUnit.MILLISECONDS, temp_narrativa);
					Digita(": Isso prarece ótimo! Vamos treinar e compartilhar informações para ficarmos muito melhores juntos!", TimeUnit.MILLISECONDS, temp_narrativa);
					
					capitulo2_2();
				}else if (opcaoResposta2 == 2) {
					reputacaoGrupo ++;
					Digita("\n" + perso2, TimeUnit.MILLISECONDS, temp_narrativa);
					Digita(": Não tem problema! nós vamos te ensinar varias coisas pra voce se familiarizar com o jogo e se tornar mais forte.", TimeUnit.MILLISECONDS, temp_narrativa);
						capitulo2_2();
					
				}else {
					Digita("\n\nNarrador: Eu nem dei essa opção!.", TimeUnit.MILLISECONDS, temp_narrativa);
					sc.close();
				}
				
				

				}break;
            case 2:	{
            	
            	Digita("\n" + perso1, TimeUnit.MILLISECONDS, temp_narrativa);
            	Digita(": Prazer, me chamo Róger Guedes, nós estamos treinando por agoora, voce tem algum em interesse em se juntar a gente?", TimeUnit.MILLISECONDS, temp_narrativa);
            	Digita("\n\n(1) Sim, temho interesse em me juntar a voces."
            			+ "\n(2) Não sei se posso confiar em voces ainda.", TimeUnit.MILLISECONDS, temp_narrativa);
            	
            	System.out.println("\n");
            	int opcaoResposta3 = sc.nextInt();
            	do {
            	if (opcaoResposta3 == 1) {
            		reputacaoGrupo ++;
            		Digita("\n" + perso2, TimeUnit.MILLISECONDS, temp_narrativa);
            		Digita(": Ok, voce pode se juntar a gente, mas vamos ficar de olho em voce por enquanto ate terermos um laço mais forte de confinça.", TimeUnit.MILLISECONDS, temp_narrativa);
            		
            		Digita(": voce ja havia treinado antes nesse jogo? Estamos com alguma dificuldades pra aprender a jogar mas ja pegamos mais ou menos o jeito do jogo, nós podemos ensinar algumas coisas"
    						+ "\npra voce e em troca voce pode nos ajudar a ficarmos mais fortes.", TimeUnit.MILLISECONDS, temp_narrativa);
    				Digita("\n\n(1) Sim, eu estava treinando com uma amiga a algum tempo, nós aprendemos algumas coisas bem legais que eu posso compartilhar com voces."
    						+ "\n(2) Não, eu ainda nem tive a oportunidade de treinar ou de explorar o mapa pois ainda sou muito novato.", TimeUnit.MILLISECONDS, temp_narrativa);
    				
    				int opcaoResposta4 = sc.nextInt();
    					if (opcaoResposta4 == 1) {
    						
    						reputacaoGrupo ++;
    						Digita("\n" + perso2, TimeUnit.MILLISECONDS, temp_narrativa);
    						Digita(": Isso prarece ótimo! Vamos treinar e compartilhar informações para ficarmos muito melhores juntos!", TimeUnit.MILLISECONDS, temp_narrativa);
    							capitulo2_2();
    							
    						
    						} else if (opcaoResposta4 == 2) {
    							
    							Digita("\n" + perso2, TimeUnit.MILLISECONDS, temp_narrativa);
    							Digita(": Não tem problema! nós vamos te ensinar varias coisas pra voce se familiarizar com o jogo e se tornar mais forte.", TimeUnit.MILLISECONDS, temp_narrativa);
    								capitulo2_2();
    							
    							}else {
    								
    								Digita("\n\nNarrador: Eu nem dei essa opção!.", TimeUnit.MILLISECONDS, temp_narrativa);
    								sc.close();
    								}
    				
    				

            		
            	}else if (opcaoResposta3 == 2){
            		Digita("\n" + perso4, TimeUnit.MILLISECONDS, temp_narrativa);
            		Digita(": voce tambem não acha que nós podemos desconfiar de voce? E que teria uma chance de estarmos sendo enganados por voce?", TimeUnit.MILLISECONDS, temp_narrativa);
            		Digita("\nNarrador: Mesmo relutante, você acena com a cabeça para o quarto integrante do grupo e concorda previamente em entrar no grupo desses jogadores.", TimeUnit.MILLISECONDS, temp_narrativa);
            			capitulo2_2();
            		
            		
            	}else {
            		Digita("\n\nNarrador: Eu nem dei essa opção!.", TimeUnit.MILLISECONDS, temp_narrativa);
            		sc.close();
            		
            	}
            	
            } while (opcaoResposta3!= 1 && opcaoResposta3 != 2);
            	
        }
			
		
			}            
        }

	    public static void capitulo2_2() throws Exception {
	    
	    	 Scanner sc = new Scanner(System.in);
	    	 
	    	String perso1 = "Róger Guedes";
            String perso2 = "segundo integrante";
            String perso3 = "terceiro integrante";
            String perso4 = "quarto integrante";
            
            switch (reputacaoGrupo) {
			case 3: 
				
	//sua reputação do grupo é 3/3
				

				
				Digita("\n\n" + perso2, TimeUnit.MILLISECONDS, temp_narrativa);
				Digita(": Vem com a gente!", TimeUnit .MILLISECONDS, temp_narrativa);
				Digita("\nNarrador: Voce segue o terceiroe e o quarto integrante", TimeUnit.MILLISECONDS, temp_narrativa);
				Digita("\n" + perso4, TimeUnit.MILLISECONDS, temp_narrativa);
				Digita(": Agora nós vamos voltar a treinar Pablo Marçal?", TimeUnit.MILLISECONDS, temp_narrativa);
				perso3 = "Pablo Marçal";
				Digita("\n" + perso3, TimeUnit.MILLISECONDS, temp_narrativa);
				Digita(": Vamos voltar a treinar sim!", TimeUnit.MILLISECONDS, temp_narrativa);
				
				Digita("\nIran, antes de voce ir treinar pegue esse item, como voce faz parte do nosso grupo agora, voce vai ter que ficar mais forte"
						+ "\npara nos ajudar em nossas batalhas!", TimeUnit.MILLISECONDS, temp_narrativa);
				Digita("\n\n*********************"
					+  "\nDANO AUMENTADO EM 30%"
					+ "\n*********************\n", TimeUnit.MILLISECONDS, temp_narrativa);
				danoDoIran = 33;
				
				Digita("\nAgora, pegue essa folha e clique em treinar!", TimeUnit.MILLISECONDS, temp_narrativa);
				Digita(   "\n1. ~~~~~~~~~~~~~~~"
						+ "\n   |   treinar   |"
						+ "\n   ~~~~~~~~~~~~~~~", TimeUnit.MILLISECONDS, temp_narrativa);
				System.out.println("\n");
				int opcaoTreino3 = sc.nextInt();
				
				if (opcaoTreino3 == 1) {
					treino();
				}else if (opcaoTreino3 == 44) {
					capitulo2_3();
				}else {
					System.out.println("nao existe essa opcao");
				}
				
				
				break;
			
			case 2: 
				
	//sua reputação do grupo é 2/3
				
				
				Digita("\n\n" + perso2, TimeUnit.MILLISECONDS, temp_narrativa);
				Digita(": Vem com a gente!", TimeUnit .MILLISECONDS, temp_narrativa);
				Digita("\nNarrador: Voce segue o terceiroe e o quarto integrante", TimeUnit.MILLISECONDS, temp_narrativa);
				Digita("\n" + perso4, TimeUnit.MILLISECONDS, temp_narrativa);
				Digita(": Agora nós vamos voltar a treinar Pablo Marçal?", TimeUnit.MILLISECONDS, temp_narrativa);
				perso3 = "Pablo Marçal";
				Digita("\n" + perso3, TimeUnit.MILLISECONDS, temp_narrativa);
				Digita(": Vamos voltar a treinar sim!", TimeUnit.MILLISECONDS, temp_narrativa);
				
				Digita("\n" + perso3 + ": Iran, antes de voce ir treinar pegue esse item, como voce faz parte do nosso grupo agora, voce vai ter que ficar mais forte"
						+ "\npara nos ajudar em nossas batalhas!", TimeUnit.MILLISECONDS, temp_narrativa);
				Digita("\n\n*********************"
					+  "\nDANO AUMENTADO EM 20%"
					+ "\n*********************\n", TimeUnit.MILLISECONDS, temp_narrativa);
				danoDoIran = 30;
				Digita("\n" + perso3 + ": Agora, pegue essa folha e clique em treinar!", TimeUnit.MILLISECONDS, temp_narrativa);
				Digita(   "\n1. ~~~~~~~~~~~~~~~"
						+ "\n   |   treinar   |"
						+ "\n   ~~~~~~~~~~~~~~~", TimeUnit.MILLISECONDS, temp_narrativa);
				System.out.println("\n");
				int opcaoTreino2 = sc.nextInt();
				
				if (opcaoTreino2 == 1) {
					treino();
				}else if (opcaoTreino2 == 44) {
					capitulo2_3();
				}else {
					System.out.println("nao existe essa opcao");
				}
				
				
				
				
				break;
			
			case 1: 
				
	//sua reputação do grupo é 1/3
				
				
				Digita("\n\n" + perso2, TimeUnit.MILLISECONDS, temp_narrativa);
				Digita(": Vem com a gente!", TimeUnit .MILLISECONDS, temp_narrativa);
				Digita("\nNarrador: Voce segue o terceiroe e o quarto integrante", TimeUnit.MILLISECONDS, temp_narrativa);
				Digita("\n" + perso4, TimeUnit.MILLISECONDS, temp_narrativa);
				Digita(": Agora nós vamos voltar a treinar Pablo Marçal?", TimeUnit.MILLISECONDS, temp_narrativa);
				perso3 = "Pablo Marçal";
				Digita("\n" + perso3, TimeUnit.MILLISECONDS, temp_narrativa);
				Digita(": Vamos voltar a treinar sim!", TimeUnit.MILLISECONDS, temp_narrativa);
				
				Digita("\n" + perso3 + ": Iran, antes de voce ir treinar pegue esse item, como voce faz parte do nosso grupo agora, voce vai ter que ficar mais forte"
						+ "\npara nos ajudar em nossas batalhas!", TimeUnit.MILLISECONDS, temp_narrativa);
				Digita("\n\n*********************"
					+  "\nDANO AUMENTADO EM 10%"
					+ "\n*********************\n", TimeUnit.MILLISECONDS, temp_narrativa);
				danoDoIran = 28;
				Digita("\n" + perso3 + ": Agora, pegue essa folha e clique em treinar!", TimeUnit.MILLISECONDS, temp_narrativa);
				Digita(   "\n1. ~~~~~~~~~~~~~~~"
						+ "\n   |   treinar   |"
						+ "\n   ~~~~~~~~~~~~~~~", TimeUnit.MILLISECONDS, temp_narrativa);
				System.out.println("\n");
				int opcaoTreino1 = sc.nextInt();
				
				if (opcaoTreino1 == 1) {
					treino();
				}else if (opcaoTreino1 == 44) {
					capitulo2_3();
				}else {
					System.out.println("nao existe essa opcao");
				}
				
				
				break;
			
			case 0:
				
	//sua reputação do grupo é 0/3
				
				
				Digita("\n\n" + perso2, TimeUnit.MILLISECONDS, temp_narrativa);
				Digita(": Vem com a gente!", TimeUnit .MILLISECONDS, temp_narrativa);
				Digita("\nNarrador: Voce segue o terceiroe e o quarto integrante", TimeUnit.MILLISECONDS, temp_narrativa);
				Digita("\n" + perso4, TimeUnit.MILLISECONDS, temp_narrativa);
				Digita(": Agora nós vamos voltar a treinar Pablo Marçal?", TimeUnit.MILLISECONDS, temp_narrativa);
				perso3 = "Pablo Marçal";
				Digita("\n" + perso3, TimeUnit.MILLISECONDS, temp_narrativa);
				Digita(": Vamos voltar a treinar sim!", TimeUnit.MILLISECONDS, temp_narrativa);
				Digita("\n" + perso3 + ": Iran, pegue essa folha e clique em treinar!", TimeUnit.MILLISECONDS, temp_narrativa);
				Digita(   "\n1. ~~~~~~~~~~~~~~~"
						+ "\n   |   TREINAR   |"
						+ "\n   ~~~~~~~~~~~~~~~", TimeUnit.MILLISECONDS, temp_narrativa);
				System.out.println("\n");
				int opcaoTreino = sc.nextInt();
				
				if (opcaoTreino == 1) {
					treino();
				}else if (opcaoTreino == 44) {
					capitulo2_3();
				}else {
					System.out.println("nao existe essa opcao");
				}
				
				
				break;
			
			
			default:
			
				System.out.println("nao existe essa opcao");
			}
	    	
	    	
	    }
	    
	    public static void treino() throws Exception {
	        Scanner sc = new Scanner(System.in);
	        
	        boolean jogarNovamente = true;

	        while (jogarNovamente) {
	        Digita("\nBem-vindo ao Game de treinamendo de Matemática!", TimeUnit.MILLISECONDS, temp_narrativa);
	        Digita("\nVocê é um(a) jovem estudante em busca de conhecimento.", TimeUnit.MILLISECONDS, temp_narrativa);
	        Digita("\nAntes de começar, gostaría de saber em qual área você prefere treinar: ", TimeUnit.MILLISECONDS, temp_narrativa);
	        Digita("\n1. Multiplicação", TimeUnit.MILLISECONDS, temp_narrativa);
	        Digita("\n2. Divisão", TimeUnit.MILLISECONDS, temp_narrativa);
	        Digita("\nEscolha a opção desejada: ", TimeUnit.MILLISECONDS, temp_narrativa);
	        
	        System.out.println("\n");
	        int escolha = sc.nextInt();

	        int pontos = 0;
	        int perguntasFeitas = 0;
	        int limitePerguntas = 15;

	        if (escolha == 1) {
	            Digita("\n\nVocê escolheu a área de Multiplicação!", TimeUnit.MILLISECONDS, temp_narrativa);
	        } else if (escolha == 2) {
	            Digita("\nVocê escolheu a área de Divisão!", TimeUnit.MILLISECONDS, temp_narrativa);
	        } else {
	            Digita("\nOpção inválida. O jogo será encerrado.", TimeUnit.MILLISECONDS, temp_narrativa);
	            sc.close();
	        }

	        Digita("\nSeu objetivo é acumular pelo menos 100 pontos para finalizar o treinamento.", TimeUnit.MILLISECONDS, temp_narrativa);
	        Digita("\nVocê terá que responder a " + limitePerguntas + " perguntas para alcançar seu objetivo.\n", TimeUnit.MILLISECONDS, temp_narrativa);

	        while (pontos < 100 && perguntasFeitas < limitePerguntas) {
	            int numero1 = (int) (Math.random() * 15) + 3; // 3 a 18
	            int numero2 = (int) (Math.random() * 15) + 3; // 3 a 18

	            if (escolha == 1) { // x miti
	            	Digita("\nDesafio " + (perguntasFeitas + 1) + "/" + limitePerguntas + ": Qual é o resultado de " + numero1 + " x " + numero2 + "?\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
	                int resposta = sc.nextInt();
	                if (resposta == numero1 * numero2) {
	                	Digita("\nResposta correta! Você ganhou 10 pontos.", TimeUnit.MILLISECONDS, temp_narrativa);
	                	
	                    pontos += 10;
	                } else {
	                   
	                    Digita("\nResposta incorreta! Você perdeu 5 pontos.", TimeUnit.MILLISECONDS, temp_narrativa);
	                    pontos -= 5;
	                }
	            } else if (escolha == 2) { // ÷ divi
	                int resultado = numero1 * numero2;
	                Digita("\nDesafio " + (perguntasFeitas + 1) + "/" + limitePerguntas + ": Qual é o resultado de " + resultado + " ÷ " + numero1 + "?\n\n", TimeUnit.MILLISECONDS, temp_narrativa);

	                int resposta = sc.nextInt();
	                if (resposta == numero2) {
	                	Digita("\nResposta correta! Você ganhou 10 pontos.", TimeUnit.MILLISECONDS, temp_narrativa);

	                    pontos += 10;
	                } else {
	                    
	                	Digita("\nResposta incorreta! Você perdeu 5 pontos.", TimeUnit.MILLISECONDS, temp_narrativa);

	                    pontos -= 5;
	                }
	            }

	            perguntasFeitas++;
	            Digita("\nPontuação atual: " + pontos + " pontos\n", TimeUnit.MILLISECONDS, temp_narrativa);

	        }

	        if (pontos >= 100) {
	        	Digita("\nParabéns! Você concluiu seu treinamento!", TimeUnit.MILLISECONDS, temp_narrativa);

	        } else {
	        	Digita("\nFim do jogo! Você não conseguiu acumular pontos suficientes.", TimeUnit.MILLISECONDS, temp_narrativa);
	        	}
	        
	        Digita("\nDeseja treinar novamente? (S/N): ", TimeUnit.MILLISECONDS, temp_narrativa);
	        String resposta = sc.next();
	        if (!resposta.equalsIgnoreCase("S")) {
	            jogarNovamente = false;

	 
	        }
	        
	        
	        capitulo2_3();
	    }
	    
	}  
	    
	    public static void capitulo2_3() throws Exception {
	    	
	    	Scanner sc = new Scanner(System.in);
	    	Random random = new Random();
	    	
	    	 
	    	String perso1 = "Róger Guedes";
            String perso2 = "segundo integrante";
            String perso3 = "terceiro integrante";
            String perso4 = "quarto integrante";
	    	
	    	Digita("\n\n" + perso3 + ": Boa!! Agora que voce ja treinou podemos iniciar uma simulação de confronto."
	    			+ "\nVoce pode fazer essa simulação com o manéu gomes", TimeUnit.MILLISECONDS, temp_narrativa);
	    	perso4 = "manéu gomes";
	    	Digita("\n" + perso4 + ": Vem tranquilo que eu não vou deixar voce ganhar facil não."
	    					+ "\nNarrador: voce entra em uma batalha com o quarto integrante do grupo.", TimeUnit.MILLISECONDS, temp_narrativa);
	    	
	    	
	    	
	    	System.out.println("Bem-vindo à batalha!");

	        double vidaJogador = vidaDoIran;
	        int vidaInimigo = 100;

	        while (vidaJogador > 0 && vidaInimigo > 0) {
	            System.out.println("\nEscolha uma ação:");
	            System.out.println("1. Atacar");
	            System.out.println("2. Atacar com golpe crítico (mais dano, mas mais difícil de acertar)");
	            System.out.print("Sua escolha: ");
	            int escolha = sc.nextInt();

	            double danoJogador = calcularDano(escolha == 2); 

	            
	            if (danoJogador == 0) {
	                System.out.println("Você tentou um ataque, mas errou o ataque.");
	            } else {
	                System.out.println("Você atacou o inimigo e causou " + danoJogador + " de dano.");
	            }
	            vidaInimigo -= danoJogador;

	            // Ataque do inimigo
	            int danoInimigo = 18;
	            vidaJogador -= danoInimigo;
	            System.out.println("O inimigo atacou você e causou " + danoInimigo + " de dano.");

	            System.out.println("\nVida atual: ");
	            System.out.println("Jogador: " + vidaJogador);
	            System.out.println("Inimigo: " + vidaInimigo);
	        }

	        if (vidaJogador <= 0) {
	            System.out.println("Você foi derrotado. Game over!");
	        } else {
	            System.out.println("Parabéns! Você derrotou o inimigo!");
	        }
	    }

	    public static int calcularDano(boolean critico) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        int coeficiente = random.nextInt(10) + 1; // Coeficiente aleatório entre 1 e 10
	        int constante = random.nextInt(20) + 1; // Constante aleatória entre 1 e 20
	        int resultadoC = coeficiente * random.nextInt(20) + 10 + constante; // Resultado da equação

	        if (critico) {
	            System.out.println("Resolva a equação para efetuar o ataque crítico: " + coeficiente + "x + " + constante + " = " + resultadoC);
	        } else {
	            System.out.println("Resolva a equação para efetuar o ataque: " + coeficiente + "x + " + constante + " = " + resultadoC);
	        }

	        System.out.print("Digite o valor de x: ");
	        int resposta = scanner.nextInt();
	        int resultado = ((resultadoC - constante) / coeficiente);
	        if (resposta == resultado) {
	            if (critico) {
	                return danoDoIran * 2; // Dano crítico é o dobro do dano normal
	            } else {
	                return danoDoIran;
	            }
	        } else {
	            return 0; // Se a resposta estiver incorreta, não causa dano
	        }
	    	
	    	
	    	
	    }
	    
	    
	    public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
	        for (char caractere : mensagem.toCharArray()) {
	            System.out.print(caractere);
	            unit.sleep(tempo_mensagem);
	        }
			
			
			
		}
		
		

}
