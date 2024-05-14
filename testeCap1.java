
package testes;

import java.io.DataInput;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class testeCap1 {

	static int temp_dialog = 20, temp_narrativa = 25, temp_transicao = 50;
	public static int reputacaoGrupo = 0;

	public static void main(String[] args) throws Exception {

		Scanner entrada = new Scanner(System.in);
		int escolha;
		do {
			Digita("--------------------------------- ", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n|        Virtual Bhaskara       |", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n--------------------------------- ", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\nPrecione 1 para iniciar.\nPrecione 2 para sair.", TimeUnit.MILLISECONDS, temp_dialog);
			System.out.println("\n");
			escolha = entrada.nextInt();
			if (escolha == 1) {
				menu();
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
		Digita("\nInstruções do jogo: O jogo é um Rpg inspirado na franquia Sword Art Online. Batalhe, recrute amigos e desvende mistérios usando a matemática para poder escapar do mundo virtual.", TimeUnit.MILLISECONDS, temp_dialog);
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
		String nome_amiga = "Alice";
		int confiancaAmiga[] = {5};

		Digita("\nNarrador: Você acorda um dia com uma mensagem da sua melhor amiga: 'Acorda, acorda!!'", TimeUnit.MILLISECONDS, temp_narrativa);
		Digita("\n\nNarrador: O nome dela é Alice.", TimeUnit.MILLISECONDS, temp_narrativa);
		Digita("\n\nNarrador: Você e a " + nome_amiga + " ja são velhos amigos de infância, e também grandes rivais no mundo dos games.", TimeUnit.MILLISECONDS, temp_narrativa);
		Digita("\n\n" + nome_amiga + ": Vamos, finalmente lançou aquele novo jogo de VR que a gente queria tanto!\n", TimeUnit.MILLISECONDS, temp_narrativa);
		Digita("\nNarrador: Você e " + nome_amiga + " estavam a meses esperando o novo jogo VIRTUAL DUNGEON, então, os dois vão correndo até a loja de games.", TimeUnit.MILLISECONDS, temp_narrativa);
		Digita("\n\nVendedor: Eai galera! acabou de chegar um estoque do novo jogo, e separei dois para os meus clientes favoritos!", TimeUnit.MILLISECONDS, temp_narrativa);
		Digita("\n\n" + nome_amiga + ": Primeiro euu :P", TimeUnit.MILLISECONDS, temp_narrativa);
		Digita("\n\nNarrador: Voce... \n1.Compra logo o jogo! \n2.Ta duro...", TimeUnit.MILLISECONDS, temp_narrativa);
		System.out.println("\n");
		int escolha_loja = entrada.nextInt();
		do {
			if (escolha_loja == 1) {
				Digita("\nNarrador: Você compra o jogo. ", TimeUnit.MILLISECONDS, temp_narrativa);
				Digita("\n" + nome_amiga + ": Boaa, agora, vamos jogar!!", TimeUnit.MILLISECONDS, temp_narrativa);
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
		Digita("\n" + nome_amiga + ": Ai, vc tbm sentiu aquilo? Doeu um pouco, mas deve ser o jogo calibrando né?", TimeUnit.MILLISECONDS, temp_narrativa);
		Digita("\n" + nome_amiga + ": Caraca, olha esses gráficos! Parece mesmo a vida real!", TimeUnit.MILLISECONDS, temp_narrativa);
		Digita("\n\n" + nome_amiga + ": Olha ali, os jogadores estão se reunindo na praça principal, vamos até lá!", TimeUnit.MILLISECONDS, temp_narrativa);
		Digita("\n\nNarrador: Ao chegar na praça principal, voces veem uma multidão enorme em volta de um telão.", TimeUnit.MILLISECONDS, temp_narrativa);
		Digita("\n\nVoz do telão: Sejam muito bem vindos ao VIRTUAL DUNGEON! Espero que voces gostem de aventura e muito...", TimeUnit.MILLISECONDS, temp_narrativa);
		Digita("\n\nNarrador: A voz é estranhamente interrompida por um som extremamente ensurdecedor, e todas as luzes da cidade começam a bugar intensamente. Quando o som para, todos os jogadores se olham em dúvida.", TimeUnit.MILLISECONDS, temp_narrativa);
		Digita("\n\nPlayer aleatório: Ah que saco! Gastei dinheiro com essa porcaria e nem funciona!! To fora! Pera, eu não to conseguindo sair do jogo!!", TimeUnit.MILLISECONDS,
			temp_narrativa);
		Digita("\n\nNarrador: Todos os players tentam incansavelmente sair do jogo, mas sem sucesso. Uma onda de desespero atinge a cidade, e tudo se torna um grande caos!", TimeUnit.MILLISECONDS,
			temp_narrativa);
		Digita("\n\n" + nome_amiga + ":Iran, o que vamos fazer???", TimeUnit.MILLISECONDS,
			temp_narrativa);
		Digita("\n\nNarrador: Voce...", TimeUnit.MILLISECONDS,
			temp_narrativa);
		Digita("\n\n(1) Pega na mão da sua amiga e voces dois correm para um lugar seguro. \n(2) Voce ignora ela e tenta desesperadamente sair do jogo. ", TimeUnit.MILLISECONDS,
			temp_narrativa);
		System.out.println("\n");
		int escolha1 = entrada.nextInt();
		do {
			if (escolha1 == 1) {
				Digita("\n\nIran: Vem comigo!", TimeUnit.MILLISECONDS, temp_narrativa);
				Digita("\n\nNarrador: Voce e " + nome_amiga + " entram dentro de uma das casas da cidade, e se escondem enquanto escutam o som da população enlouquecida.", TimeUnit.MILLISECONDS, temp_narrativa);
				Digita("\n\n" + nome_amiga + ": Vai ficar tudo bem, não vai?.", TimeUnit.MILLISECONDS, temp_narrativa);
				confiancaAmiga[0]++;
			} else if (escolha1 == 2) {
				Digita("\n\nNarrador: Por mais que vc tente, voce não consegue sair do jogo.", TimeUnit.MILLISECONDS, temp_narrativa);
				Digita("\n\nNarrador: Depois de longos e cansativos minutos, vc desiste. Ao procurar sua amiga, você a encontra inconsciente no chão.", TimeUnit.MILLISECONDS, temp_narrativa);
				Digita("\n\nIran: " + nome_amiga + "! Você ta bem???", TimeUnit.MILLISECONDS, temp_narrativa);
				Digita("\n\nNarrador: Você leva sua amiga até uma casa da cidade, e cuida dos ferimentos dela.", TimeUnit.MILLISECONDS, temp_narrativa);
				confiancaAmiga[0]--;
			} else {
				Digita("\n\nNarrador: Eu nem dei essa opção!.", TimeUnit.MILLISECONDS, temp_narrativa);
			}
		} while (escolha1 != 1 && escolha1 != 2);

		Digita("\n", TimeUnit.MILLISECONDS, temp_transicao);

		entrada.close();
	}


public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
          for (char caractere : mensagem.toCharArray()) {
              System.out.print(caractere);
              unit.sleep(tempo_mensagem);
          }



    }
  }
