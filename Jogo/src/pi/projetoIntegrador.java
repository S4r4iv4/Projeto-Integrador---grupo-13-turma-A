
import java.io.DataInput;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.math.*;
import java.util.Random;

public class projetoIntegrador {
  static int temp_dialog = 25, temp_narrativa = 35, temp_transicao = 70, temp_segundo = 1000, temp_drama = 2222;
  public static int reputacaoGrupo = 0;
  public static int danoDoIran = 25;
  public static int vidaDoIran = 100;

  public static void main(String[] args) throws Exception {

    Scanner entrada = new Scanner(System.in);
    int escolha;
    do {
      Digita("--------------------------------- ", TimeUnit.MILLISECONDS, temp_dialog);
      Digita("\n|        Virtual Bhaskara       |", TimeUnit.MILLISECONDS, temp_dialog);
      Digita("\n--------------------------------- ", TimeUnit.MILLISECONDS, temp_dialog);
      Digita("\n\nPressione 1 para iniciar.\nPressione 2 para sair.", TimeUnit.MILLISECONDS, temp_dialog);
      System.out.println("\n");
      escolha = entrada.nextInt();
      if (escolha == 1) {
        buscarVinganca();
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
    Digita(
        "\nInstruções do jogo: O jogo é um RPG inspirado na franquia Sword Art Online. Batalhe, recrute amigos e desvende mistérios usando a matemática para poder escapar do mundo virtual.",
        TimeUnit.MILLISECONDS, temp_dialog);
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
      Digita("\nDeseja fazer cadastro? \n1.Sim \n2.Não", TimeUnit.MILLISECONDS, temp_dialog);
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
      Digita("\nDeseja efetuar login? \n1.Sim \n2.Não", TimeUnit.MILLISECONDS, temp_dialog);
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
              Digita("\n**Usuário ou senha inválidos, tente novamente.**", TimeUnit.MILLISECONDS,
                  temp_dialog);
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
    Digita("\nCréditos: Jogo criado por Gabriel Rodrigues\nJoão Victor Lopes\nLeonardo Dudalski\nVinicius Saraiva.", TimeUnit.MILLISECONDS, temp_dialog);// creditos provisorios
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
    int confiancaAmiga[] = { 5 };

    Digita("\nNarrador: Você acorda um dia com uma mensagem da sua melhor amiga: 'Acorda, acorda!!'",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita("\n\nNarrador: O nome dela é Alice.", TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita("\n\nNarrador: Você e a " + nome_amiga
        + " ja são velhos amigos de infância, e também grandes rivais no mundo dos games.",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita("\n\n" + nome_amiga
        + ": Vamos, finalmente lançou aquele novo jogo de VR que a gente queria tanto!\n",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita("\nNarrador: Você e " + nome_amiga
        + " estavam a meses esperando o novo jogo VIRTUAL DUNGEON, então, os dois vão correndo até a loja de games.",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita(
        "\n\nVendedor: Eai galera! acabou de chegar um estoque do novo jogo, e separei dois para os meus clientes favoritos!",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita("\n\n" + nome_amiga + ": Primeiro euu :P", TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita("\n\nNarrador: você... \n1.Compra logo o jogo! \n2.Ta duro...",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    System.out.println("\n");
    int escolha_loja = entrada.nextInt();
    do {
      if (escolha_loja == 1) {
        Digita("\nNarrador: Você compra o jogo.",
            TimeUnit.MILLISECONDS,
            temp_narrativa);
        Digita("\n\n"+ nome_amiga + ": Boaa, agora, vamos jogar!!",
            TimeUnit.MILLISECONDS,
            temp_narrativa);
        Digita("\n\nNarrador: Você vai para casa e conecta no jogo com sua amiga.",
            TimeUnit.MILLISECONDS,
            temp_narrativa);
      } else if (escolha_loja == 2) {
        Digita("\n\nNarrador: Você vai pra casa e vai dormir.",
            TimeUnit.MILLISECONDS,
            temp_narrativa);
        Digita("\n\nGAME OVER", TimeUnit.MILLISECONDS,
            temp_narrativa);
        Digita("\n\nFinal 1: Ta duro, dorme!",
            TimeUnit.MILLISECONDS,
            temp_narrativa);
        System.exit(0);
      } else {
        Digita("\n\nNarrador: Eu nem dei essa opção!.",
            TimeUnit.MILLISECONDS,
            temp_narrativa);
      }
    } while (escolha_loja != 1 && escolha_loja != 2);
    Digita("\n\nNarrador: Ao conectar no jogo, você sente uma dor estranha, mas não liga muito.",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita("\n\nNarrador: No lobby no jogo, vc escuta uma voz familiar...",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita("\n\n" + nome_amiga
        + ": Ai, vc tbm sentiu aquilo? Doeu um pouco, mas deve ser o jogo calibrando né?",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita("\n\n" + nome_amiga + ": Caraca, olha esses gráficos! Parece mesmo a vida real!",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita("\n\n" + nome_amiga
        + ": Olha ali, os jogadores estão se reunindo na praça principal, vamos até lá!",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita("\n\nNarrador: Ao chegar na praça principal, vocês veem uma multidão enorme em volta de um telão.",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita(
        "\n\nVoz do telão: Sejam muito bem vindos ao VIRTUAL DUNGEON! Espero que vocês gostem de aventura e muito...",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita(
        "\n\nNarrador: A voz é estranhamente interrompida por um som extremamente ensurdecedor, e todas as luzes da cidade começam a bugar intensamente. Quando o som para, todos os jogadores se olham em dúvida.",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita(
        "\n\nPlayer aleatório: Ah que saco! Gastei dinheiro com essa porcaria e nem funciona!! To fora! Pera, eu não to conseguindo sair do jogo!!",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita(
        "\n\nNarrador: Todos os players tentam incansavelmente sair do jogo, mas sem sucesso. Uma onda de desespero atinge a cidade, e tudo se torna um grande caos!",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita("\n\n" + nome_amiga + ":Iran, o que vamos fazer???", TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita("\n\nNarrador: você...", TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita(
        "\n\n(1) Pega na mão da sua amiga e vocês dois correm para um lugar seguro. \n(2) você ignora ela e tenta desesperadamente sair do jogo. ",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    System.out.println("\n");
    int escolha1 = entrada.nextInt();
    do {
      if (escolha1 == 1) {
        Digita("\n\nIran: Vem comigo!", TimeUnit.MILLISECONDS,
            temp_narrativa);
        Digita("\n\nNarrador: você e " + nome_amiga
            + " entram dentro de uma das casas da cidade, e se escondem enquanto escutam o som da população enlouquecida.",
            TimeUnit.MILLISECONDS,
            temp_narrativa);
        Digita("\n\n" + nome_amiga + ": Vai ficar tudo bem, não vai?.",
            TimeUnit.MILLISECONDS,
            temp_narrativa);
        confiancaAmiga[0]++;
      } else if (escolha1 == 2) {
        Digita("\n\nNarrador: Por mais que vc tente, você não consegue sair do jogo.",
            TimeUnit.MILLISECONDS,
            temp_narrativa);
        Digita(
            "\n\nNarrador: Depois de longos e cansativos minutos, vc desiste. Ao procurar sua amiga, você a encontra inconsciente no chão.",
            TimeUnit.MILLISECONDS,
            temp_narrativa);
        Digita("\n\nIran: " + nome_amiga + "! Você ta bem???",
            TimeUnit.MILLISECONDS,
            temp_narrativa);
        Digita("\n\nNarrador: Você leva sua amiga até uma casa da cidade, e cuida dos ferimentos dela.",
            TimeUnit.MILLISECONDS,
            temp_narrativa);
        confiancaAmiga[0]--;
      } else {
        Digita("\n\nNarrador: Eu nem dei essa opção!.",
            TimeUnit.MILLISECONDS,
            temp_narrativa);
      }
    } while (escolha1 != 1 && escolha1 != 2);
    Digita("\n\nNarrador: Na casa, você encontra um kit, mas, está criptografado por um código estranho. Você: ",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita("\n\n(1) Tenta descriptografar o código. \n(2) Deixa pra la.",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    System.out.println("\n");
    int escolha2 = entrada.nextInt();
    do {
      if (escolha2 == 1) {
        if (escolha1 == 1) {
          Digita("Iran: " + nome_amiga + ", vamos ver o que tem aqui.",
              TimeUnit.MILLISECONDS,
              temp_narrativa);
          Digita("Narrador: Ao encostar na caixa, você se deparacom uma estranha conta matemática: ",
              TimeUnit.MILLISECONDS,
              temp_narrativa);
          Digita(nome_amiga
              + ": Parece uma equação de primeiro grau! Vamos resolver e ver o que tem nela!",
              TimeUnit.MILLISECONDS,
              temp_narrativa);
          Digita("\n\nNarrador: Ao pressionar a tela da caixa, uma equação aparece na tela: 5x +1 = -9 ",
              TimeUnit.MILLISECONDS,
              temp_narrativa);
          Digita("\n\n" + nome_amiga
              + ": Essa é a equação? Eu sei que o 1 passa para o outro lado! Fica 5x = -10, mas não sei o resto :P",
              TimeUnit.MILLISECONDS,
              temp_narrativa);
          int x;
          do {
            Digita("\n\nNarrador: Então, você chega a conclusão que x é igual a... ",
                TimeUnit.MILLISECONDS,
                temp_narrativa);
            x = entrada.nextInt();
            if (x == (-2)) {
              Digita(
                  "\n\nNarrador: Parabéns, você acertou! A caixa se abre e revela um kit de primeiros socorros, e você guarda no inventário.",
                  TimeUnit.MILLISECONDS,
                  temp_narrativa);
            } else if (x != (-2)) {
              Digita("\n\nNarrador: Não é bem isso, mas tente novamente.",
                  TimeUnit.MILLISECONDS,
                  temp_narrativa);
            } else {
              Digita("\n\nNarrador: Resposta inválida.",
                  TimeUnit.MILLISECONDS,
                  temp_narrativa);
            }
          } while (x != (-2));
        } else if (escolha1 == 2) {
          Digita("\n\nNarrador: ao pressionar a tela, aparece uma equação estranha: 10x - 100 = 1000",
              TimeUnit.MILLISECONDS,
              temp_narrativa);
          int x;
          do {
            Digita("\n\nNarrador: você chega a conclusão de que x é igual a... ",
                TimeUnit.MILLISECONDS,
                temp_narrativa);
            x = entrada.nextInt();
            if (x == 110) {
              Digita(
                  "\n\nNarrador: Parabéns, você acertou! A caixa se abre e revela um kit de primeiros socorros, e você usa para curar sua amiga.",
                  TimeUnit.MILLISECONDS,
                  temp_narrativa);
              Digita("\n\nNarrador: Sua amiga está melhorando devagar, mas continua inconsciente.",
                  TimeUnit.MILLISECONDS,
                  temp_narrativa);
            } else if (x != 110) {
              Digita("\n\nNarrador: Não é bem isso, mas tente novamente.",
                  TimeUnit.MILLISECONDS,
                  temp_narrativa);
            } else {
              Digita("\n\nNarrador: Resposta inválida.",
                  TimeUnit.MILLISECONDS,
                  temp_narrativa);
            }
          } while (x != 110);
        }
      } else if (escolha2 == 2) {
        Digita("\n\nNarrador: Você decide não descriptografar o código e continua a ajudar sua amiga, mas sem sucesso.",
            TimeUnit.MILLISECONDS,
            temp_narrativa);
      }
    } while (escolha2 != 1 && escolha2 != 2);
    Digita(
        "\n\nNarrador: Ao passar do tempo, os gritos e barulhos do caos da cidade vão diminuindo, mas você escuta uma batida na porta.",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita("\n\nNarrador: Você...", TimeUnit.MILLISECONDS, temp_narrativa);
    Digita("\n\n(1) Cria coragem e olha la fora. \n(2) Decide ficar dentro da casa por mais um tempo.",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    System.out.println("\n");
    int escolha3 = entrada.nextInt();
    do {
      if (escolha3 == 1) {
        if (escolha1 == 1) {
          Digita("\n\n" + nome_amiga + ": Estou logo atrás de vc!",
              TimeUnit.MILLISECONDS,
              temp_narrativa);
        } else if (escolha1 == 2) {
          Digita("\n\nNarrador: Você decide dar uma olhada la fora.",
              TimeUnit.MILLISECONDS,
              temp_narrativa);
        }
      } else if (escolha3 == 2) {
        if (escolha1 == 1) {
          Digita("\n\nNarrador: Você decide ficar dentro da casa por mais um tempo. "
              + nome_amiga
              + ": Iran, vamos olhar o que tem la fora!",
              TimeUnit.MILLISECONDS,
              temp_narrativa);
        } else if (escolha1 == 2) {
          Digita(
              "\n\nNarrador: Você decide não abandonar sua amiga, mas o barulho vai aumentando cada vez mais, e você acaba ficando preocupado e vai dar uma olhada.",
              TimeUnit.MILLISECONDS,
              temp_narrativa);
        }
      }
    } while (escolha3 != 1 && escolha3 != 2);
    Digita(
        "\n\nNarrador: Ao olhar do lado de fora, voçê se depara com um grupo de quatro players equipados com armamento pesado.",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita(
        "\n\nBandido 1: Ora Ora, o que temos aqui rapaziada! Parecem dois cachorrinhos indefesos, e eu to com uma fome de cachorro-quente!!",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    batalha1();
    Digita("\n\n(1) Calma ai, nós não queremos encrenca! \n(2) É melhor vocês sairem fora seus nojentos!! ",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    int escolha_bandidos = entrada.nextInt();
    do {
      if (escolha_bandidos == 1) {
        if (escolha1 == 1) {
          Digita("\n\n" + nome_amiga
              + ": Isso, não queremos encrenca, só nos escondemos por que...",
              TimeUnit.MILLISECONDS,
              temp_narrativa);
          Digita("\n\nBandido 3: Voçê não quer encrenca, mas nós queremos!!",
              TimeUnit.MILLISECONDS,
              temp_narrativa);
          batalha1();
        } else if (escolha1 == 2) {
          Digita("\n\nIran: Minha amiga está muito machucada, eu não quero encrenca!",
              TimeUnit.MILLISECONDS,
              temp_narrativa);
          Digita("\n\nBandido 3: Voçê não quer encrenca, mas nós queremos!!",
              TimeUnit.MILLISECONDS,
              temp_narrativa);
          batalha1();

        }
      } else if (escolha_bandidos == 2) {
        if (escolha1 == 1) {
          Digita("\n\n" + nome_amiga + ": isso ai, não temos medo de voçês!",
              TimeUnit.MILLISECONDS,
              temp_narrativa);
          Digita("\n\nBandido 3: Então, vamos ser obrigados a partir voçês no meio!",
              TimeUnit.MILLISECONDS,
              temp_narrativa);
          batalha1();

        } else if (escolha1 == 2) {
          Digita("\n\nIran: Minha amiga está muito machucada, se vierem pra cima vou acabar com voçês!",
              TimeUnit.MILLISECONDS,
              temp_narrativa);
          Digita("\n\nBandido 3: Então, vamos ser obrigados a partir voçê no meio!",
              TimeUnit.MILLISECONDS,
              temp_narrativa);
          batalha1();

        }
      }
    } while (escolha_bandidos != 1 && escolha_bandidos != 2);

    // batalha1();
    Digita("\n", TimeUnit.MILLISECONDS, temp_transicao);

    entrada.close();
  }

  public static void batalha1() throws Exception {
    Scanner sc = new Scanner(System.in);

    boolean jogarNovamente = true;

    while (jogarNovamente) {
      Digita("\n\n1. ~~~~~~~~~~~~~~~"
          + "\n   |   Batalha   |"
          + "\n   ~~~~~~~~~~~~~~~", TimeUnit.MILLISECONDS, temp_narrativa);
      Digita("\n\nNarrador: O grupo de selvagens cerca você!.", TimeUnit.MILLISECONDS, temp_narrativa);
      Digita("\n\nNarrador: Você deve usar a matemática para dar dano nos inimigos e vencer. você escolhe...",
          TimeUnit.MILLISECONDS,
          temp_narrativa);
      Digita("\n\n1. Multiplicação", TimeUnit.MILLISECONDS, temp_narrativa);
      Digita("\n2. Divisão", TimeUnit.MILLISECONDS, temp_narrativa);
      Digita("\nEscolha a opção desejada: ", TimeUnit.MILLISECONDS, temp_narrativa);

      System.out.println("\n");
      int escolha = sc.nextInt();

      int pontos = 0;
      int perguntasFeitas = 0;
      int limitePerguntas = 20;

      if (escolha == 1) {
        Digita("\n\nVocê escolheu ataques de Multiplicação!", TimeUnit.MILLISECONDS, temp_narrativa);
      } else if (escolha == 2) {
        Digita("\n\nVocê escolheu ataques de Divisão!", TimeUnit.MILLISECONDS, temp_narrativa);
      } else {
        Digita("\n\nOpção inválida. O jogo será encerrado.", TimeUnit.MILLISECONDS, temp_narrativa);
        sc.close();
      }

      Digita("\n\nSeu objetivo é causar pelo menos 100 pontos de dano para derrotar os inimigos.",
          TimeUnit.MILLISECONDS, temp_narrativa);
      Digita("\nVocê terá que responder a " + limitePerguntas + " perguntas para alcançar seu objetivo.\n",
          TimeUnit.MILLISECONDS, temp_narrativa);

      while (pontos < 100 && perguntasFeitas < limitePerguntas) {
        int numero1 = (int) (Math.random() * 15) + 3; // 3 a 18
        int numero2 = (int) (Math.random() * 15) + 3; // 3 a 18

        if (escolha == 1) { // x miti
          Digita("\nDesafio " + (perguntasFeitas + 1) + "/" + limitePerguntas + ": Qual é o resultado de "
              + numero1 + " x " + numero2 + "?\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
          int resposta = sc.nextInt();
          if (resposta == numero1 * numero2) {
            Digita("\nResposta correta! Você causou 10 pontos de dano.", TimeUnit.MILLISECONDS,
                temp_narrativa);

            pontos += 10;
          } else {

            Digita("\nResposta incorreta! O inimigo te causou 5 pontos de dano.", TimeUnit.MILLISECONDS,
                temp_narrativa);
            pontos -= 5;
          }
        } else if (escolha == 2) { // ÷ divi
          int resultado = numero1 * numero2;
          Digita("\nDesafio " + (perguntasFeitas + 1) + "/" + limitePerguntas + ": Qual é o resultado de "
              + resultado + " ÷ " + numero1 + "?\n\n", TimeUnit.MILLISECONDS, temp_narrativa);

          int resposta = sc.nextInt();
          if (resposta == numero2) {
            Digita("\nResposta correta! Você causou 10 pontos de dano.", TimeUnit.MILLISECONDS,
                temp_narrativa);

            pontos += 10;
          } else {

            Digita("\nResposta incorreta! O inimigo te causou 5 pontos de dano.", TimeUnit.MILLISECONDS,
                temp_narrativa);

            pontos -= 5;
          }
        }

        perguntasFeitas++;
        Digita("\nPontuação atual: " + pontos + " pontos\n", TimeUnit.MILLISECONDS, temp_narrativa);

      }

      if (pontos >= 100) {
        Digita("\nParabéns! Você derrotou os inimigos!", TimeUnit.MILLISECONDS, temp_narrativa);

      } else {
        Digita("\nFim do jogo! Você foi derrotado!", TimeUnit.MILLISECONDS,
            temp_narrativa);
      }

      Digita("\nDeseja tentar novamente? (S/N): ", TimeUnit.MILLISECONDS, temp_narrativa);
      String resposta = sc.next();
      if (!resposta.equalsIgnoreCase("S")) {
        jogarNovamente = false;

      }
      Digita("\n\nNarrador: Ao derrotar os inimigos, você sente uma forte pancada na cabeça e cai no chão.",
          TimeUnit.MILLISECONDS, temp_narrativa);
      Digita(
          "\n\nNarrador: Desnorteado, a última coisa que você vê são mais bandidos cercando sua amiga, e os gritos dela, e então, você apaga.",
          TimeUnit.MILLISECONDS, temp_narrativa);
      Digita(
          "\n\nNarrador: Ao acordar, você ve a casa destruída, e não encontra sua amiga em lugar nenhum, então, sai vagando para encontrá-la.",
          TimeUnit.MILLISECONDS, temp_narrativa);
      capitulo2();

    }

  }

  public static void capitulo2() throws Exception {

    Scanner sc = new Scanner(System.in);

    Digita(
        "\n\nNarrador: Após uma noite de sono em cima de uma arvore, você encontra um grupo de quatro integrantes treinando e estudando o jogo pra ficarem mais fortes.",
        TimeUnit.MILLISECONDS, temp_narrativa);
    Digita("\nPensando consigo mesmo, você decide se aproximar deles.", TimeUnit.MILLISECONDS, temp_narrativa);
    String perso1 = "primeiro integrante";
    String perso2 = "segundo integrante";
    String perso3 = "terceiro integrante";
    String perso4 = "quarto integrante";

    Digita("\n\n" + perso1, TimeUnit.MILLISECONDS, temp_narrativa);
    Digita(": Quem é você?", TimeUnit.MILLISECONDS, temp_narrativa);
    Digita("\n\n(1) meu nome é Iran, e eu estou sozinho por agora, posso me juntar a vocês?"
        + "\n(2) vocês nao precisam saber meu nome, quem são vocês?", TimeUnit.MILLISECONDS, temp_narrativa);

    System.out.println("\n");
    int opcaoResposta = sc.nextInt();

    switch (opcaoResposta) {
      case 1: {
        reputacaoGrupo++;
        Digita("\n" + perso1, TimeUnit.MILLISECONDS, temp_narrativa);
        Digita(
            ": Claro!, prazer em te conhecer Iran, me chamo Róger Guedes, nós estavamos treinando, se quiser pode se juntar a gente.",
            TimeUnit.MILLISECONDS, temp_narrativa);
        Digita("\n\n" + perso2, TimeUnit.MILLISECONDS, temp_narrativa);
        Digita(
            ": você ja havia treinado antes nesse jogo? Estamos com alguma dificuldades pra aprender a jogar mas ja pegamos mais ou menos o jeito do jogo, nós podemos ensinar algumas coisas"
                + "\npra você e em troca você pode nos ajudar a ficarmos mais fortes.",
            TimeUnit.MILLISECONDS,
            temp_narrativa);
        Digita(
            "\n\n(1) Sim, eu estava treinando com uma amiga a algum tempo, nós aprendemos algumas coisas bem legais que eu posso compartilhar com vocês."
                + "\n(2) Não, eu ainda nem tive a oportunidade de treinar ou de explorar o mapa pois ainda sou muito novato.",
            TimeUnit.MILLISECONDS, temp_narrativa);

        System.out.println("\n");
        int opcaoResposta2 = sc.nextInt();
        if (opcaoResposta2 == 1) {
          reputacaoGrupo++;
          reputacaoGrupo++;
          Digita("\n" + perso2, TimeUnit.MILLISECONDS, temp_narrativa);
          Digita(": Isso paarece ótimo! Vamos treinar e compartilhar informações para ficarmos muito melhores juntos!",
              TimeUnit.MILLISECONDS, temp_narrativa);

          capitulo2_2();
        } else if (opcaoResposta2 == 2) {
          reputacaoGrupo++;
          Digita("\n" + perso2, TimeUnit.MILLISECONDS, temp_narrativa);
          Digita(
              ": Não tem problema! nós vamos te ensinar varias coisas pra você se familiarizar com o jogo e se tornar mais forte.",
              TimeUnit.MILLISECONDS, temp_narrativa);
          capitulo2_2();

        } else {
          Digita("\n\nNarrador: Eu nem dei essa opção!.", TimeUnit.MILLISECONDS, temp_narrativa);
          sc.close();
        }

      }
        break;
      case 2: {

        Digita("\n" + perso1, TimeUnit.MILLISECONDS, temp_narrativa);
        Digita(
            ": Prazer, me chamo Róger Guedes, nós estamos treinando por agoora, você tem algum em interesse em se juntar a gente?",
            TimeUnit.MILLISECONDS, temp_narrativa);
        Digita("\n\n(1) Sim, temho interesse em me juntar a vocês."
            + "\n(2) Não sei se posso confiar em vocês ainda.", TimeUnit.MILLISECONDS, temp_narrativa);

        System.out.println("\n");
        int opcaoResposta3 = sc.nextInt();
        do {
          if (opcaoResposta3 == 1) {
            reputacaoGrupo++;
            Digita("\n" + perso2, TimeUnit.MILLISECONDS, temp_narrativa);
            Digita(
                ": Ok, você pode se juntar a gente, mas vamos ficar de olho em você por enquanto ate terermos um laço mais forte de confinça.",
                TimeUnit.MILLISECONDS, temp_narrativa);

            Digita(
                ": você ja havia treinado antes nesse jogo? Estamos com alguma dificuldades pra aprender a jogar mas ja pegamos mais ou menos o jeito do jogo, nós podemos ensinar algumas coisas"
                    + "\npra você e em troca você pode nos ajudar a ficarmos mais fortes.",
                TimeUnit.MILLISECONDS, temp_narrativa);
            Digita(
                "\n\n(1) Sim, eu estava treinando com uma amiga a algum tempo, nós aprendemos algumas coisas bem legais que eu posso compartilhar com vocês."
                    + "\n(2) Não, eu ainda nem tive a oportunidade de treinar ou de explorar o mapa pois ainda sou muito novato.",
                TimeUnit.MILLISECONDS, temp_narrativa);

            int opcaoResposta4 = sc.nextInt();
            if (opcaoResposta4 == 1) {

              reputacaoGrupo++;
              Digita("\n" + perso2, TimeUnit.MILLISECONDS, temp_narrativa);
              Digita(
                  ": Isso parece ótimo! Vamos treinar e compartilhar informações para ficarmos muito melhores juntos!",
                  TimeUnit.MILLISECONDS, temp_narrativa);
              capitulo2_2();

            } else if (opcaoResposta4 == 2) {

              Digita("\n" + perso2, TimeUnit.MILLISECONDS, temp_narrativa);
              Digita(
                  ": Não tem problema! nós vamos te ensinar varias coisas pra você se familiarizar com o jogo e se tornar mais forte.",
                  TimeUnit.MILLISECONDS, temp_narrativa);
              capitulo2_2();

            } else {

              Digita("\n\nNarrador: Eu nem dei essa opção!.", TimeUnit.MILLISECONDS, temp_narrativa);
              sc.close();
            }

          } else if (opcaoResposta3 == 2) {
            Digita("\n" + perso4, TimeUnit.MILLISECONDS, temp_narrativa);
            Digita(
                ": você tambem não acha que nós podemos desconfiar de você? E que teria uma chance de estarmos sendo enganados por você?",
                TimeUnit.MILLISECONDS, temp_narrativa);
            Digita(
                "\nNarrador: Mesmo relutante, você acena com a cabeça para o quarto integrante do grupo e concorda previamente em entrar no grupo desses jogadores.",
                TimeUnit.MILLISECONDS, temp_narrativa);
            capitulo2_2();

          } else {
            Digita("\n\nNarrador: Eu nem dei essa opção!.", TimeUnit.MILLISECONDS, temp_narrativa);
            sc.close();

          }

        } while (opcaoResposta3 != 1 && opcaoResposta3 != 2);

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

        // sua reputação do grupo é 3/3

        Digita("\nVem com a gente!", TimeUnit.MILLISECONDS, temp_narrativa);
        Digita("\n\nNarrador: você segue o terceiroe e o quarto integrante", TimeUnit.MILLISECONDS, temp_narrativa);
        Digita("\n\n" + perso4, TimeUnit.MILLISECONDS, temp_narrativa);
        Digita(": Agora nós vamos voltar a treinar Pablo Marçal?", TimeUnit.MILLISECONDS, temp_narrativa);
        perso3 = "Pablo Marçal";
        Digita("\n\n" + perso3, TimeUnit.MILLISECONDS, temp_narrativa);
        Digita(": Vamos voltar a treinar sim!", TimeUnit.MILLISECONDS, temp_narrativa);

        Digita(
            "\nIran, antes de você ir treinar pegue esse item, como você faz parte do nosso grupo agora, você vai ter que ficar mais forte"
                + "\npara nos ajudar em nossas batalhas!",
            TimeUnit.MILLISECONDS, temp_narrativa);
        Digita("\n\n*********************" + "\nDANO AUMENTADO EM 30%" + "\n*********************\n",
            TimeUnit.MILLISECONDS, temp_narrativa);
        danoDoIran = 33;

        Digita("\nAgora, pegue essa folha e clique em treinar!", TimeUnit.MILLISECONDS, temp_narrativa);
        Digita("\n1. ~~~~~~~~~~~~~~~" + "\n   |   treinar   |" + "\n   ~~~~~~~~~~~~~~~", TimeUnit.MILLISECONDS,
            temp_transicao);
        System.out.println("\n");
        int opcaoTreino3 = sc.nextInt();

        if (opcaoTreino3 == 1) {
          treino();
        } else if (opcaoTreino3 == 44) {
          capitulo2_3();
        } else {
          System.out.println("nao existe essa opcao");
        }

        break;

      case 2:

        // sua reputação do grupo é 2/3

        Digita("\nVem com a gente!", TimeUnit.MILLISECONDS, temp_narrativa);
        Digita("\n\nNarrador: você segue o terceiroe e o quarto integrante", TimeUnit.MILLISECONDS, temp_narrativa);
        Digita("\n\n" + perso4, TimeUnit.MILLISECONDS, temp_narrativa);
        Digita(": Agora nós vamos voltar a treinar Pablo Marçal?", TimeUnit.MILLISECONDS, temp_narrativa);
        perso3 = "Pablo Marçal";
        Digita("\n\n" + perso3, TimeUnit.MILLISECONDS, temp_narrativa);
        Digita(": Vamos voltar a treinar sim!", TimeUnit.MILLISECONDS, temp_narrativa);

        Digita("\n" + perso3
            + ": Iran, antes de você ir treinar pegue esse item, como você faz parte do nosso grupo agora, você vai ter que ficar mais forte"
            + "\npara nos ajudar em nossas batalhas!", TimeUnit.MILLISECONDS, temp_narrativa);
        Digita("\n\n*********************" + "\nDANO AUMENTADO EM 20%" + "\n*********************\n",
            TimeUnit.MILLISECONDS, temp_narrativa);
        danoDoIran = 30;
        Digita("\n" + perso3 + ": Agora, pegue essa folha e clique em treinar!", TimeUnit.MILLISECONDS,
            temp_narrativa);
        Digita("\n1. ~~~~~~~~~~~~~~~" + "\n   |   treinar   |" + "\n   ~~~~~~~~~~~~~~~", TimeUnit.MILLISECONDS,
            temp_transicao);
        System.out.println("\n");
        int opcaoTreino2 = sc.nextInt();

        if (opcaoTreino2 == 1) {
          treino();
        } else if (opcaoTreino2 == 44) {
          capitulo2_3();
        } else {
          System.out.println("nao existe essa opcao");
        }

        break;

      case 1:

        // sua reputação do grupo é 1/3

        Digita("\nVem com a gente!", TimeUnit.MILLISECONDS, temp_narrativa);
        Digita("\n\nNarrador: você segue o terceiroe e o quarto integrante", TimeUnit.MILLISECONDS, temp_narrativa);
        Digita("\n\n" + perso4, TimeUnit.MILLISECONDS, temp_narrativa);
        Digita(": Agora nós vamos voltar a treinar Pablo Marçal?", TimeUnit.MILLISECONDS, temp_narrativa);
        perso3 = "Pablo Marçal";
        Digita("\n\n" + perso3, TimeUnit.MILLISECONDS, temp_narrativa);
        Digita(": Vamos voltar a treinar sim!", TimeUnit.MILLISECONDS, temp_narrativa);

        Digita("\n" + perso3
            + ": Iran, antes de você ir treinar pegue esse item, como você faz parte do nosso grupo agora, você vai ter que ficar mais forte"
            + "\npara nos ajudar em nossas batalhas!", TimeUnit.MILLISECONDS, temp_narrativa);
        Digita("\n\n*********************" + "\nDANO AUMENTADO EM 10%" + "\n*********************\n",
            TimeUnit.MILLISECONDS, temp_narrativa);
        danoDoIran = 28;
        Digita("\n" + perso3 + ": Agora, pegue essa folha e clique em treinar!", TimeUnit.MILLISECONDS,
            temp_narrativa);
        Digita("\n1. ~~~~~~~~~~~~~~~" + "\n   |   treinar   |" + "\n   ~~~~~~~~~~~~~~~", TimeUnit.MILLISECONDS,
            temp_transicao);
        System.out.println("\n");
        int opcaoTreino1 = sc.nextInt();

        if (opcaoTreino1 == 1) {
          treino();
        } else if (opcaoTreino1 == 44) {
          capitulo2_3();
        } else {
          System.out.println("nao existe essa opcao");
        }

        break;

      case 0:

        // sua reputação do grupo é 0/3

        Digita("\nVem com a gente!", TimeUnit.MILLISECONDS, temp_narrativa);
        Digita("\n\nNarrador: você segue o terceiroe e o quarto integrante", TimeUnit.MILLISECONDS, temp_narrativa);
        Digita("\n\n" + perso4, TimeUnit.MILLISECONDS, temp_narrativa);
        Digita(": Agora nós vamos voltar a treinar Pablo Marçal?", TimeUnit.MILLISECONDS, temp_narrativa);
        perso3 = "Pablo Marçal";
        Digita("\n\n" + perso3, TimeUnit.MILLISECONDS, temp_narrativa);
        Digita(": Vamos voltar a treinar sim!", TimeUnit.MILLISECONDS, temp_narrativa);
        Digita("\nIran, pegue essa folha e clique em treinar!", TimeUnit.MILLISECONDS, temp_narrativa);
        Digita("\n1. ~~~~~~~~~~~~~~~" + "\n   |   TREINAR   |" + "\n   ~~~~~~~~~~~~~~~", TimeUnit.MILLISECONDS,
            temp_transicao);
        System.out.println("\n");
        int opcaoTreino = sc.nextInt();

        if (opcaoTreino == 1) {
          treino();
        } else if (opcaoTreino == 44) {
          capitulo2_3();
        } else {
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
      Digita("\n\nVocê é um(a) jovem estudante em busca de conhecimento.", TimeUnit.MILLISECONDS, temp_narrativa);
      Digita("\nAntes de começar, gostaría de saber em qual área você prefere treinar: ", TimeUnit.MILLISECONDS,
          temp_narrativa);
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

      Digita("\nSeu objetivo é acumular pelo menos 100 pontos para finalizar o treinamento.",
          TimeUnit.MILLISECONDS, temp_narrativa);
      Digita("\nVocê terá que responder a " + limitePerguntas + " perguntas para alcançar seu objetivo.\n",
          TimeUnit.MILLISECONDS, temp_narrativa);

      while (pontos < 100 && perguntasFeitas < limitePerguntas) {
        int numero1 = (int) (Math.random() * 15) + 3; // 3 a 18
        int numero2 = (int) (Math.random() * 15) + 3; // 3 a 18

        if (escolha == 1) { // x miti
          Digita("\nDesafio " + (perguntasFeitas + 1) + "/" + limitePerguntas + ": Qual é o resultado de "
              + numero1 + " x " + numero2 + "?\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
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
          Digita("\nDesafio " + (perguntasFeitas + 1) + "/" + limitePerguntas + ": Qual é o resultado de "
              + resultado + " ÷ " + numero1 + "?\n\n", TimeUnit.MILLISECONDS, temp_narrativa);

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
        Digita("\nFim do jogo! Você não conseguiu acumular pontos suficientes.", TimeUnit.MILLISECONDS,
            temp_narrativa);
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

    Digita("\n\n" + perso3 + ": Boa!! Agora que você ja treinou podemos iniciar uma simulação de confronto."
        + "\nvocê pode fazer essa simulação com o manéu gomes", TimeUnit.MILLISECONDS, temp_narrativa);
    perso4 = "manéu gomes";
    Digita("\n\n" + perso4 + ": Vem tranquilo que eu não vou deixar você ganhar facil não."
        + "\n\nNarrador: você entra em uma batalha com o quarto integrante do grupo.", TimeUnit.MILLISECONDS,
        temp_narrativa);

    Digita("\n\n\nBem-vindo à batalha!", TimeUnit.MILLISECONDS, temp_narrativa);
    capitulo2_3_1();
  }

  public static void capitulo2_3_1() throws Exception {

    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    String perso1 = "Róger Guedes";
    String perso2 = "segundo integrante";
    String perso3 = "Pablo Marçal";
    String perso4 = "manéu gomes";

    double vidaJogador = vidaDoIran;
    int vidaInimigo = 100;

    while (vidaJogador > 0 && vidaInimigo > 0) {
      Digita("\n\nEscolha uma ação:" + "\n1. Atacar" + "\n2. Atacar com golpe crítico" + "\nSua escolha: ",
          TimeUnit.MILLISECONDS, temp_narrativa);

      int escolha = sc.nextInt();
      if (escolha == 200){

        Digita("\n\nVoce deu um 200!!!! full box, quase vomitei, vem x1 seu random, e seu inimigo morreu de cringe!", TimeUnit.MILLISECONDS, temp_narrativa);
        capitulo2_4();
    }
      double danoJogador = calcularDano(escolha == 2);

      if (danoJogador == 0) {
        Digita("\nVocê tentou um ataque, mas errou o ataque.", TimeUnit.MILLISECONDS, temp_narrativa);
      } else {
        Digita("\nVocê atacou o inimigo e causou " + danoJogador + " de dano.", TimeUnit.MILLISECONDS,
            temp_narrativa);
      }
      vidaInimigo -= danoJogador;

      int danoInimigo = 18;
      vidaJogador -= danoInimigo;
      Digita("\nO inimigo atacou você e causou " + danoInimigo + " de dano." + "\n\nVida atual: " + "\nVocê: "
          + vidaJogador + "\nInimigo: " + vidaInimigo, TimeUnit.MILLISECONDS, temp_narrativa);
    }

    if (vidaJogador <= 0) {
      Digita("\nVocê foi derrotado. Game over!", TimeUnit.MILLISECONDS, temp_narrativa);
      capitulo2_3_2();
    } else {
      Digita("\nParabéns! Você derrotou o inimigo!", TimeUnit.MILLISECONDS, temp_narrativa);
      capitulo2_4();
    }
  }

  public static int calcularDano(boolean critico) throws Exception {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int coeficiente = random.nextInt(10) + 1;
    int constante = random.nextInt(20) + 1;
    int resultadoC = coeficiente * random.nextInt(20) + 10 + constante;

    if (critico) {
      Digita("\nResolva a equação para efetuar o ataque crítico: " + coeficiente + "x + " + constante + " = "
          + resultadoC, TimeUnit.MILLISECONDS, temp_narrativa);

    } else {
      Digita("\nResolva a equação para efetuar o ataque: " + coeficiente + "x + " + constante + " = "
          + resultadoC, TimeUnit.MILLISECONDS, temp_narrativa);

    }

    Digita("\nDigite o valor de x: ", TimeUnit.MILLISECONDS, temp_narrativa);
    int resposta = scanner.nextInt();
    int resultado = ((resultadoC - constante) / coeficiente);
    if (resposta == resultado) {
      if (critico) {
        return danoDoIran + (danoDoIran / 2);
      } else {
        return danoDoIran;
      }
    } else {
      return 0;
    }

  }

  public static void capitulo2_4() throws Exception {

    Scanner sc = new Scanner(System.in);

    String perso1 = "Róger Guedes";
    String perso2 = "segundo integrante";
    String perso3 = "Pablo Marçal";
    String perso4 = "manéu gomes";

    Digita("\n\n" + perso4 + ": Nossa! você é mesmo muito bom nisso."
        + "\n\nNarrador: como ja esta ficando tarde, o primeiro e o segundo integrante voltam de seus postos."
        + "\n\n" + perso1 + ": Em resumo, pegamos algumas comidas e achamos uma chalé para passarmos a noite."
        + "\nComo andou o treino de hoje?" + "\n\n" + perso3
        + ": Hoje nós treinamos aquelas contas de mutiplicação e divisão na folha de calculos e o " + perso4
        + " teve uma batalha com o Iran como treinamendo, e o Iran ganhou a batalha!" + "\n\n" + perso4
        + ": Ocorreu mais coisas no dia de vocês dois?" + "", TimeUnit.MILLISECONDS, temp_narrativa);

    perso2 = "Xx_king_2012_xX";
    Digita("\n\n" + perso1
        + ": Bom, já tá ficando tarde. Vamos pro chalé antes que outro maluco entre e nos roube o lugar."
        + "\n\n" + perso3 + ": Boa ideia, vamos nessa.", TimeUnit.MILLISECONDS, temp_narrativa);

    Digita("\n\n‎‎ " + "\n‎‎ " + "\n‎‎ " + "\n‎‎ " + "\n‎‎ " + "\n " + "\n ‎", TimeUnit.MILLISECONDS, temp_segundo);

    Digita(
        "\n\nNarrador: Depois de uma caminhada sinistra em direção ao chalé, vocês finalmente chegam e se acomodam lá."
            + "\nCada um encontra seu canto para passar a noite, e você encontra o seu."
            + "\nÀ medida que tenta dormir, calafrios percorrem sua espinha, mas você os ignora rapidamente e fecha os olhos.",
        TimeUnit.MILLISECONDS, temp_transicao);

    Digita("\n\n." + "\n.." + "\n..." + "\n...." + "\n..", TimeUnit.MILLISECONDS, temp_segundo);

    Digita("\n\n!!!!!!!!!!", TimeUnit.MILLISECONDS, temp_dialog);

    Digita("\nNarrador: VOCÊ ACORDA AO SOM DE UM GRITO DESESPERADO VINDO DO LADO DE FORA DO CHALÉ!"
        + "\nVocê reconhece o grito e se apressa para investigar.", TimeUnit.MILLISECONDS, temp_narrativa);

    Digita("\n\n‎‎ " + "\n‎‎ " + "\n‎‎ ", TimeUnit.MILLISECONDS, temp_segundo);

    Digita(
        "\nChegando lá, você entra na floresta, entre as árvores, e se depara com alguém, com um MACHADO CRAVADO NA CABEÇA, clamando por ajuda!"
            + "\nÀ medida que se aproxima, percebe que é Alice, chorando convulsivamente e suplicando por socorro."
            + "\n" + "\n(1) Fica calma, Alice. Estou aqui para ajudar."
            + "\n(2) Como diabos você veio parar aqui, Alice? Isso não pode ser real.\n",
        TimeUnit.MILLISECONDS,
        temp_narrativa);
    int pesadelo = sc.nextInt();

    if (pesadelo == 1) {
      Digita("\n\nAlice: COMO EU POSSO FICAR CALMA??? EU VOU MORRER.", TimeUnit.MILLISECONDS, temp_dialog);
    } else if (pesadelo == 2) {
      Digita("\n\nAlice: EU NÃO FAÇO A MÍNIMA IDEIA DO QUE ESTÁ ACONTECENDO, SÓ ME TIRA DAQUI, POR FAVOR, DOI MUITO.",
          TimeUnit.MILLISECONDS, temp_dialog);
    } else {
      System.out.println("Essa opção não existe!");
      sc.close();
    }

    Digita(
        "\n\nNarrador: Você tenta ajudá-la, mas se sente impotente. Ajudá-la a andar é tudo o que consegue fazer enquanto voltam para o chalé."
            + "\nCaminhando, vocês são atacados por flechas, uma atinge seu peito."
            + "\nAo olhar para a flecha em seu peito, você ergue levemente a cabeça e vê uma fechada em direção à sua cabeça, e",
        TimeUnit.MILLISECONDS, temp_narrativa);
    Digita("....", TimeUnit.MILLISECONDS, temp_drama);

    Digita("\n\n\n\nAAAAAAAAAAA", TimeUnit.MILLISECONDS, temp_dialog);

    Digita("\n\nNarrador: Você acorda, tudo não passou de um terrível pesadelo", TimeUnit.MILLISECONDS,
        temp_narrativa);
    Digita(".....", TimeUnit.MILLISECONDS, temp_drama);
    Digita(
        "\nOlhando ao redor, vê todos ainda dormindo, mesmo após seu grito, todos permaneceram inerte por estarem exaustos."
            + "\nVocê se levanta e o pesadelo retorna à sua mente." + "\nUm sentimento de raiva te consome."
            + "\nInconscientemente, pensamentos de vingança contra o grupo que tirou a vida de Alice começam a surgir."
            + "\nVocê sente uma leve vontade de ignorar esses sentimentos e voltar a dormir."
            + "\nApesar da indecisão, você sabe que precisa tomar uma decisão",
        TimeUnit.MILLISECONDS,
        temp_transicao);

    Digita("...", TimeUnit.MILLISECONDS, temp_segundo);

    Digita("\n\n‎‎ " + "\n‎‎ ", TimeUnit.MILLISECONDS, temp_segundo);
    Digita(
        "\n(1). BUSCAR VINGANÇA, ao buscar vingança seu corpo imerge em uma raiva imutável, inconscientemente, você mata todos que estão no chalé pra pegar mais poder e ir buscar sua vingança."
            + "\n(2). voltar a dormir, ao voltar a dormir você ignora todos aqules sentimentos de raiva e ódio, você da mais valor ao seu grupo de amigos e aceita essa nova vida.\n",
        TimeUnit.MILLISECONDS, temp_narrativa);
    int escolha_final = sc.nextInt();

    if (escolha_final == 1) {
      buscarVinganca();
    } else if (escolha_final == 2) {
      voltaDormir();
    } else {
      System.out.println("eu nao dei essa opcao!");
      sc.close();
    }

  }

  public static void capitulo2_3_2() throws Exception {

    Digita("\n\nNarrador: Você perdeu, tente novamente.", TimeUnit.MILLISECONDS, temp_narrativa);
    capitulo2_3_1();

  }

  public static void buscarVinganca() throws Exception {
    Scanner entrada = new Scanner(System.in);

    Digita("\nNarrador: Após uma chacina no chalé, você retoma sua consciência e fica desesperado com tudo aquilo,\n"
                + "Não acreditando que fosse capaz de tamanha brutalidade e explosão de força.\n"
                + "Decide então, seguir mesmo assim e tentar concertar seus erros e não ser apenas mais um player incapaz de controlar seu poder!", TimeUnit.MILLISECONDS, temp_narrativa);

        Digita("...", TimeUnit.MILLISECONDS, temp_drama);
        Digita(
                "\n(1)Saquear todos seus amigos que você matou para tentar adquirir recursos que fossem importantes para sua vingança. "
                        + "\n(2)Ir sem mexer em nada totalmente arrependido pelo que fez e com sentimento de culpa.\n", TimeUnit.MILLISECONDS, temp_narrativa);
        int escolha_saque = entrada.nextInt();
        do {
            if (escolha_saque == 1) {
                Digita(
                        "\n\nNarrador: Você encontra alguns itens de primeiro socorros,uma lança cujo nome era Lança de Zeus,"
                                +
                                "\ne um anel dourado com um simbolo de porção e não entende muito o que é, "
                                + " mas mesmo assim coloca no dedo por achar que é valioso.\n", TimeUnit.MILLISECONDS, temp_narrativa);
            } else if (escolha_saque == 2) {
                Digita(" Apenas vai em busca do seu objetivo", TimeUnit.MILLISECONDS, temp_narrativa);
            } else {
                Digita("Eu não dei essa opcao", TimeUnit.MILLISECONDS, temp_narrativa);
                entrada.close();
            }

        } while (escolha_saque != 1 && escolha_saque != 2);
        Digita(
                "\n\nNarrador: Ao sair do chalé, você segue a caminho por uma trilha da floresta,\napós essa trilha se depara com uma estrada abandonada na qual,"
                        + "\navista um Outdoor apresentando os melhores players do jogo e quando você olha apenas congela", TimeUnit.MILLISECONDS, temp_narrativa);

        Digita("...", TimeUnit.MILLISECONDS, temp_narrativa);
        Digita("Enxerga aquele ... que acabou com a vida da sua melhor amiga na sua frente!\n" +
                "Você grita de raiva, uma aura te contorna, você sente um poder ainda mais forte dentro de você!", TimeUnit.MILLISECONDS, temp_narrativa);
        Digita("\n\n\n\nVocê: AAAAAAAAAAAAAAAAAAAAAAAA EU VOU MATAR VOCÊ!!!\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Digita("\n\nNarrador: No mesmo momento busca uma forma de encontrar o grupo cruel que um dia cruzou o seu caminho e você se sentiu imponente de proteger sua amiga."
                + "\nAvista chegando pela estrada abandona uma caminhote buzinando para você sair da rua,\nmas você está destinado a efetuar sua vingança. Você: ", TimeUnit.MILLISECONDS, temp_narrativa);
        Digita("\n(1)Fica na frente da caminhote e espera que ele pare, te dando assim uma carona. "
                + "\n(2)Corre da estrada e vê a caminhote ir embora e terá que ir a pé encontrar os assasinos da sua amiga.\n", TimeUnit.MILLISECONDS, temp_narrativa);
        int escolha_estrada = entrada.nextInt();
        do {
            if (escolha_estrada == 1) {
                Digita("\n\nNarrador: No último momento arrastando toda a poeira da caminhote para frente a você,\n" + //
                        "No meio de toda poeira arrastada, a porta se abre e você, desesperado apenas entra pela porta buscando uma carona,\n"
                        + "Você senta no banco e olha para ao lado enquanto o condutor desconhecido apenas dirige pela estrada vazia. ", TimeUnit.MILLISECONDS, temp_narrativa);
            } else if (escolha_estrada == 2) {
                Digita("Você decide ir andando ao encontro dos seus alvos...\\n" + //
                        " correndo  na floresta, após escapar do acidente, se depara com uma alcateia de lobos Cybernéticos Assasinos...\\n"
                        + //
                        "e apenas sua vontade de vingança não são suficientes.\\n" + //
                        " Você morreu", TimeUnit.MILLISECONDS, temp_narrativa);
                entrada.close();
            } else {
                Digita(" Eu não te dei essa opção!", TimeUnit.MILLISECONDS, temp_narrativa);
            }
        } while (escolha_estrada != 1);
        Digita(
                "\n\nNarrador: Você não sabe para onde está indo, o motorista apenas dirige pela estrada sem fim..."
                        + "\nele entra num atalho e você começa a avistar uma grande vila, e acaba reconhecendo alguns dos vigias.\nO motorista desconhecido tinha acesso a essa área. Você está mais perto do que imagina do seu alvo!\n", TimeUnit.MILLISECONDS, temp_narrativa);

        Digita(
                "\n\nNarrador:Você é deixado perto de um ferreiro,\na primeira coisa que você faz, é pegar uma espada super quente e deferir contra sua perna,"
                        + "\nfazendo assim você ser socorrido por médicos locais e infiltrar a base. ", TimeUnit.MILLISECONDS, temp_narrativa);

        Digita(
                "\nSe passando como paciente você consegue andar livremente pela vila,"
                        + "\nInvestigando o local descobre que aconteceu uma reunião para escolha de um lider.\n"
                        + "\nE esse líder era seu alvo, visto do Outdoor!\n", TimeUnit.MILLISECONDS, temp_narrativa);

        Digita("\nEscuta de moradores locais que haverá uma coroação, vendo assim sua chance de vingança!\n"
                + "\nPara isso abre sua mochila para verificar se tem os itens necessários.\n", TimeUnit.MILLISECONDS, temp_narrativa);
        Digita("Tecle E para ver a mochila: ", TimeUnit.MILLISECONDS, temp_narrativa);

        String[] mochila = { "Anel Dourado", "Kit de Primeiros socorros", "Lança de Zeus" };

        String input = "";
        while (!input.equalsIgnoreCase("E")) {
            input = entrada.nextLine();
            if (input.equalsIgnoreCase("E")) {
                Digita("Itens na mochila:", TimeUnit.MILLISECONDS, temp_narrativa);
                for (String item : mochila) {
                    Digita(" - " + item, TimeUnit.MILLISECONDS, temp_narrativa);
                }
            } else if (!input.equalsIgnoreCase(input)) {
                Digita("Não foi isso que eu pedi.", TimeUnit.MILLISECONDS, temp_narrativa);
            }
        }
    }


  public static void voltaDormir() throws Exception {
  }

  public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
    for (char caractere : mensagem.toCharArray()) {
      System.out.print(caractere);
      unit.sleep(tempo_mensagem);
    }

  }
}

