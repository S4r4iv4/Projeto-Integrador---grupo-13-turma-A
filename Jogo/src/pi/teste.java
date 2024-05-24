
package pi;
import java.util.concurrent.TimeUnit;
public class teste {
    
  static int temp_dialog = 25, temp_narrativa = 35;
  public static void main(String[] args) throws Exception {
    teste();
  }
    
  public static void teste() throws Exception {
      

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
        int escolha = 1;

        int pontos = 0;
        int perguntasFeitas = 0;
        int limitePerguntas = 20;

        if (escolha == 1) {
          Digita("\n\nVocê escolheu ataques de Multiplicação!", TimeUnit.MILLISECONDS, temp_narrativa);
        } else if (escolha == 2) {
          Digita("\n\nVocê escolheu ataques de Divisão!", TimeUnit.MILLISECONDS, temp_narrativa);
        } else {
          Digita("\n\nOpção inválida. O jogo será encerrado.", TimeUnit.MILLISECONDS, temp_narrativa);
          
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
            int resposta = (numero1 * numero2);
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

            int resposta = numero2;
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
        String resposta = "N";
        if (!resposta.equalsIgnoreCase("S")) {
          jogarNovamente = false;
        }
      }
      
  }
        public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
          for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);
          }

        }
        

}

