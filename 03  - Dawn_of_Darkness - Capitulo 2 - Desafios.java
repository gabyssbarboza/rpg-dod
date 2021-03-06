import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) throws Exception{
    int temp_dialog = 0, temp_narrativa = 0;
    Scanner entrada = new Scanner (System.in);
    Digita("\nMestre: Está pronto para vivenciar o verdadeiro desespero... hã, digo, aventura?",TimeUnit.MILLISECONDS, temp_dialog);
    System.out.println("\n1 - Sim | 2 - Com certeza! |3 - Não sei não hein...");
    int escolha_menu = entrada.nextInt();
        if(escolha_menu == 1 || escolha_menu == 2){
          Digita("\nMestre: Conheça o alvorecer da escuridão!",TimeUnit.MILLISECONDS, temp_dialog);
          menu();
        }else if(escolha_menu == 3){
           Digita("\nMestre: Não se engane jovem, não é como se você tivesse muita escolha... Abrace o destino!",TimeUnit.MILLISECONDS, temp_dialog);
           menu();
        }else{
            Digita("\nMestre: Mesmo digitando uma opção inválida, seu destino lhe aguarda! Viva muito, explore, venca seus desafios e encontre a cura...",TimeUnit.MILLISECONDS, temp_dialog);
           menu();
        }}
    static void menu() throws Exception { //Classe do menu;
    Scanner entrada = new Scanner (System.in);
    int escolha_menu;
    do{
    Digita("\n\n..:: DAWN OF DARKNESS ::.. \n\n1 - Jogar \n2 - Capítulos\n3 - Créditos \n4 - Sair",TimeUnit.MILLISECONDS, 25);
    System.out.println("\n");
    escolha_menu = entrada.nextInt();
    if(escolha_menu == 1){
              jogo();
    }
    else if(escolha_menu == 2){
             capitulos();
    }
    else if(escolha_menu == 3){
          creditos();
    }
    else if(escolha_menu == 4){
          System.exit(0);
    }
    else{
      System.out.println("\nOpção inválida, digite novamente: ");
    }}while(escolha_menu !=1 && escolha_menu !=2 && escolha_menu !=3 && escolha_menu !=4);
    }
     static void creditos()throws Exception {
     Scanner entrada = new Scanner (System.in);
        int escolha_menu;
        System.out.println("\n</> Desenvolvedores </>\n\n-> Ygor Oliveira \n-> Fillipe Vital \n-> Gabriely Barbosa \n-> Rodrigo Shuttleton \n-> Yasmim Candelária");
        do{
        System.out.println("\n2 - Voltar");
        escolha_menu = entrada.nextInt();
        if(escolha_menu == 2){
          menu();
        }else{
           System.out.println("\nOpção inválida, digite novamente: ");
        }}while(escolha_menu!=2);
     }
     static void capitulos()throws Exception {
     Scanner entrada = new Scanner (System.in);
        int escolha_capitulo;
        System.out.println("\n..:: DAWN OF DARKNESS - Capítulos da História ::..");
        do{
        System.out.println("\n\n1 - A Taverna dos Aventureiros\n2 - A Floresta dos Desafios\n3 - Praga\n4 - Voltar");
        escolha_capitulo = entrada.nextInt();
        if(escolha_capitulo == 1){
          capitulo_1();
        }else if(escolha_capitulo == 2){
           capitulo_2();
        }else if(escolha_capitulo == 3){
           capitulo_3();
        }else if(escolha_capitulo == 4){
          menu();
        }else{
          System.out.println("\nOpção inválida, digite novamente: ");
        }}while(escolha_capitulo!=1 && escolha_capitulo!=2 &&escolha_capitulo!=3 &&escolha_capitulo!=4);
     }

          static void jogo()throws Exception{
          int temp_dialog = 0, temp_narrativa = 0; //Classe do jogo;
          Scanner entrada = new Scanner (System.in);
          Digita("\nMestre: Hmm... veja só o que temos por aqui, será um corajoso ou um curioso? \n\nBem... vamos lá...",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\nMestre: Para começarmos, por favor, diga-me o seu nome.",TimeUnit.MILLISECONDS, temp_dialog);
          System.out.println("\n");
          String nome_aventureiro = entrada.next();
          Digita("\nMestre: Seja bem-vindo(a), ao intenso mundo de Alduin, " + nome_aventureiro + "!",TimeUnit.MILLISECONDS, 50);
          Digita("\n\nMestre: A partir daqui, serei seu guia e companheiro nesta jornada, pode me chamar de mestre.",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Gostaria de saber mais sobre a história do mundo no qual você está prestes a entrar ou ir direto para o jogo?",TimeUnit.MILLISECONDS, temp_dialog);
          int escolha_menu;
          do{
          System.out.println("\n\n1 - Conte-me mais, mestre!");
          System.out.println("2 - Naah, podemos ir direto para o jogo?");
          System.out.println("3 - Voltar");
          escolha_menu = entrada.nextInt();
          if(escolha_menu == 1){
          Digita("\n\nMestre: Muito bem, por onde começar...?",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nEsta é a história de um mundo mágico e incrível chamado Alduin.\nAlduin é um mundo repleto de vida, esperança e prosperidade, diversas criaturas e animais de várias espécies vivem em harmonia. Alduin é dividido em 4 grandes nações sendo elas: \n\n1) O Norte comandado pela corte de Elizabeth Clarke. Domínio dos bruxos.\n2) O Leste comandado pelos cavaleiros do reino de Luke Yeagher.\n3) O Sul comandado pelos Elfos e criaturas das florestas.\n4) E o Oeste comandado pelos Demônios e Monstros Ancestrais. \n\nUma praga se espalha pelas sombras, desolando toda a vida existente em Alduin, aquele que contrai a praga certamente morre em um mês. A praga destrói toda suas forças e apodrece aos poucos seus orgãos, ninguém sabe quem ou o que é o causador dessa doença, mas existem rumores de que ela teve início mas redondezas do Oeste. Território dos demônios.",TimeUnit.MILLISECONDS, temp_dialog);
                  
          Digita("\n\nMestre: "+nome_aventureiro+", hora de iniciar a aventura!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Neste mundo você assumirá o papel de um triste cavalei... quer dizer, um bravo cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
          capitulo_1();
          capitulo_2();

          }else if(escolha_menu == 3){
                 menu();
          }
          else if(escolha_menu == 2){
          Digita("\n\nMestre: "+nome_aventureiro+", hora de iniciar a aventura!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Neste mundo você assumirá o papel de um triste cavalei... quer dizer, um bravo cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
          capitulo_1();
          capitulo_2();
    
          }else{
            System.out.println("\nOpção inválida!");
          }
          }while(escolha_menu!= 1 ||escolha_menu!= 2 || escolha_menu!= 3);
          }

        static void capitulo_1() throws Exception{
        int temp_dialog = 0, temp_narrativa = 0, temp_transicao = 0;
        Scanner entrada = new Scanner (System.in);
        int resp;
        do{
        Digita("\n\n\n..:: DAWN OF DARKNESS ::.. - Capítulo 1 - A taverna dos aventureiros!",TimeUnit.MILLISECONDS, temp_transicao);
        Digita("\n\nIniciar aventura? ",TimeUnit.MILLISECONDS, temp_transicao);
        Digita("\n\n1 - Vamos !!!",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp = entrada.nextInt();
        if(resp != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, eu não ouvi direito hahaha.",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp!=1);
        Digita("\n\nMestre: 14 dias após sair com seu exército em busca da cura para seu pai, você se encontra em uma taverna próxima ao território dos demônios e criaturas ancestrais. \n\nO lugar está em pedaços, claramente dá para perceber que esta Taverna já teve seus momentos de gloria e felicidade, mas atualmente poucas pessoas ainda frequentam este local e as poucas restantes estão machucadas ou em sofrimento.\n\nO dono da Taverna é um velho anão, sem esperanças na vida, sua única fonte de renda era a taverna e com a chegada da praga seus lucros caíram muito. Mas mesmo assim ele continua com seu sorriso no rosto a ajudar quem for preciso na região.\nO taverneiro enquanto limpava o balcão se aproxima de você e pergunta:",TimeUnit.MILLISECONDS, temp_dialog);
        int resposta_menu;
        Digita("\n\nTaverneiro: Jovem rapaz, está tudo bem? Não achas que já bebeste muito? Algo lhe ocorreu?",TimeUnit.MILLISECONDS, temp_dialog);
        do{
        System.out.println("\n1 - Sim está tudo bem... | 2 - Não estou afim de conversar, anão...");
        resposta_menu = entrada.nextInt();
          if(resposta_menu != 1 && resposta_menu != 2){
              Digita("\n\nTaverneiro: Desculpe meu jovem, poderia repetir..?",TimeUnit.MILLISECONDS, temp_dialog);
          }
        }while(resposta_menu!=1 && resposta_menu!=2);
        Digita("\n\nMestre: O taverneiro ao ouvir suas palavras graves e fortes, lhe dá um sorriso e apenas continua a limpar sua taverna...",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nMestre: Você não ficou bebado devido a sua alta resistência, porém encontra-se em tremendo luto e angustia pois perdeu muitos amigos na busca pela cura de seu pai... O ato ocorreu em uma feroz batalha na floresta sombria... além disso seu pai está com a praga e provavelmente morrerá no próximo inverno... você não sabe a quem recorrer, e não sabe a causa dessa doença...",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nMestre: Pouco tempo depois surge um homem, com roupas pretas e uma capa grande com capuz. Logo atrás dele entra uma Elfa de pele clara que vestia uma roupa de couro e uma capa esverdeada que ia de seus ombros quase até o chão. Os dois seguem até o balcão aonde você está e sentam ao seu lado.",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\n** tensão no ar **",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nHomem do capuz: Já faz muito tempo, não é jovem principe da capital de Luke Yeagher?",TimeUnit.MILLISECONDS, temp_dialog);
        int escolha_menu3, escolha_menu4;
        do{
        System.out.println("\n\n1 - Quem é você?");
        System.out.println("2 - Por favor estranho, não estou afim de joguinhos..");
        escolha_menu3 = entrada.nextInt();
        if(escolha_menu3 == 1 || escolha_menu3 == 2){
          Digita("\n\nHomem do capuz: Hahahaha, não se lembra mais..?",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\n** observa **",TimeUnit.MILLISECONDS, temp_narrativa);
          do{
          System.out.println("\n\n1 - Espera ai, você é Rosswald? O grande bruxo Rosswald?!!");
          escolha_menu4 = entrada.nextInt();
          if(escolha_menu4!= 1){
            Digita("\n\nMestre: O homem não ouviu o que você falou...",TimeUnit.MILLISECONDS, temp_dialog);
          }}while(escolha_menu4!=1); 
        }else{
            Digita("\n\nMestre: O homem não ouviu o que você falou...",TimeUnit.MILLISECONDS, temp_dialog);
        }}while(escolha_menu3 != 1 && escolha_menu3 == 2);
        Digita("\n\n** o homem tira o capuz **",TimeUnit.MILLISECONDS, temp_narrativa);
          Digita("\n\nRosswald: Da última vez que te vi você era uma criança, jovem principe!",TimeUnit.MILLISECONDS, temp_dialog); 
          Digita("\n\nRosswald: Vejo que amadureceu bastante, hein. A capital inteira de Luke Yeagher está dizendo que você está procurando a cura da praga...",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nRosswald: Eu e minha companheira Idril temos pistas que talvez possam ajuda-lo, pistas que nos levam para o Oeste, Terra dos demonios...",TimeUnit.MILLISECONDS, temp_dialog);  
          Digita("\n\nIdril (Elfa): Meu nome é Idril, soubemos do que está aconteceu com os seus companheiros na busca pela floresta sombria... sinto muito.",TimeUnit.MILLISECONDS, temp_dialog);   
          Digita("\n\nIdril (Elfa): O fato é que às criaturas da floresta elfica estão morrendo pela praga, e em paralelo às suas motivações, creio que podemos fazer uma parceria para investigar essas pistas... Não aguento mais perder vida inocentes por essa doença!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nRosswald: Não se sinta obrigado a nos ajudar meu jovem principe, apenas não quero vê-lo em total desolação. Movido pelas suas motivações e de Idril, podemos partir agora! O que me diz?",TimeUnit.MILLISECONDS, temp_dialog);
          int escolha_menu5, escolha_menu6;
          do{
          System.out.println("\n\n1 - E como eu poderia ajuda-los? Estou muito preocupado com a saúde de meu pai... e sinto que se não fizer nada a respeito, ele pode morrer...");
          escolha_menu5 = entrada.nextInt();
          if(escolha_menu5!= 1){
            Digita("\n\nMestre: O homem não ouviu o que você falou...",TimeUnit.MILLISECONDS, temp_dialog);
          }}while(escolha_menu5!=1);
            Digita("\n\nIdril: Nos acompanhando até o covil dos demônios! Às pistas nos dizem que o Rei demonio é o causador dessa praga...",TimeUnit.MILLISECONDS, temp_dialog);
          do{
          System.out.println("\n\n1 - O rei demônio...? Maldito...");
          escolha_menu6 = entrada.nextInt();
          if(escolha_menu6!= 1){
            Digita("\n\nMestre: A Idril não ouviu o que você falou...",TimeUnit.MILLISECONDS, temp_dialog);
          }}while(escolha_menu6!=1);
          Digita("\n\nRosswald: E ai meu jovem, pronto para partirmos?",TimeUnit.MILLISECONDS, temp_dialog);
          int escolha_menu7, escolha_menu8;
          do{
          System.out.println("\n\n1 - Montar a parceria \n2 - Não participar dessa busca.");
          escolha_menu7 = entrada.nextInt();
          if(escolha_menu7!= 1 && escolha_menu7!= 2){
            Digita("\n\nMestre: A Idril não ouviu o que você falou...",TimeUnit.MILLISECONDS, temp_dialog);
          }
          else if(escolha_menu7 == 2){
            Digita("\n\nIdril: Este jovem está muito abalado, Rosswald. Vamos embora.",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\nRosswald: Bom amigão, entendo sua dor... Porém não temos mais tempo a perder aqui. Boa sorte com a busca da cura pelo seu pai.",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\nMestre: Os dois saem da taverna e você continua bebendo, bebendo e bebendo...",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\n** 2 meses depois **",TimeUnit.MILLISECONDS, temp_narrativa);
            Digita("\n\nMestre: O tempo passou e você não conseguir encontrar a cura, seu pai morreu e mundo está em repleto caos.",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\nMestre: Às vezes, só o que a gente precisa é de companheiros... O que poderia ter acontecido caso tivesse feito a parceria? Tarde demais para pensar.",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\nMestre: Agora só lhe resta morrer pela praga, bravo cavaleiro...",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\n** Fim de jogo **",TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n\n\n\n");
            menu();
          }
          else if(escolha_menu7 == 1){
                Digita("\n\nIdril: Perfeito!!! Rosswald, juntos eu sei que conseguiremos.",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nRosswald: Ah sim, levante meu jovem principe, vamos conseguir salvar seu pai e a floresta elfica, eu garanto.",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n**Você vira seu último caneco de cerveja**",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nMestre: E juntos, vocês partem para o Oeste, para caverna do Rei Demônio!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nTaverneiro: EI! Jovem cavaleiro?",TimeUnit.MILLISECONDS, temp_dialog);
                int escolha_menu9;
                do{
                   System.out.println("\n\n1 - O quê?");
                     escolha_menu9 = entrada.nextInt();
                      if(escolha_menu9!= 1){
                      Digita("\n\nMestre: O taverneiro não ouviu o que você falou...",TimeUnit.MILLISECONDS, temp_dialog);
          }}while(escolha_menu6!=1);
                      Digita("\n\nTaverneiro: Boa sorte na sua busca! Sei que seus amigos irão lhe ajudar!",TimeUnit.MILLISECONDS, temp_dialog);
                      Digita("\n\nMestre: E juntos vocês partem para aventura!",TimeUnit.MILLISECONDS, temp_dialog);

          }}while(escolha_menu7!= 1 && escolha_menu7!= 2);

     }
     static void capitulo_2() throws Exception{
       int temp_dialog = 0, temp_narrativa = 0, temp_transicao = 0;
        Scanner entrada = new Scanner (System.in);
        int resp;
        do{
        Digita("\n\n\n..:: DAWN OF DARKNESS ::.. - Capítulo 2 - A Floresta dos Desafios!",TimeUnit.MILLISECONDS, temp_transicao);
        Digita("\n\nIniciar aventura? ",TimeUnit.MILLISECONDS, temp_transicao);
        Digita("\n\n1 - Vamos !!!",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp = entrada.nextInt();
        if(resp != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, eu não ouvi direito hahaha.",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp!=1);
         Digita("\n\n** 1 dia de viagem se passa ** ",TimeUnit.MILLISECONDS, temp_narrativa);
         Digita("\n\nMestre: Para chegar na caverna do Rei Demônio, vocês precisam passar por uma floresta de desafios, será algo bem agradável... pode confiar...",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\n** tensão no ar **",TimeUnit.MILLISECONDS, temp_narrativa);
         Digita("\n\nMestre: Vocês chegam na floresta e ficam de guarda alta, pois a qualquer momento inimigos podem aparecer...",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nMestre: Reza a lenda que lobos circulam nessa floresta... e, infelizmente, três lobos cercam vocês... se quiserem evitar que mais apareçam, precisarão responder uma pergunta.",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nMestre: Só para avisar, para cada resposta errada a quantidade de lobos para enfrentar aumentará para 6, depois para 9, 12 e assim sucessivamente. Às alternativas estarão aleatoriamente bagunçadas, isto posto, fique atento bravo cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nMestre: Vocês aguentarão combater no máximo 6 lobos! Acima disso, a sorte que dirá o destino de vocês...",TimeUnit.MILLISECONDS, temp_dialog);

         //desafio 01;
          String a,b,c,d,e, pergunta_embaralhada, resposta_questao01;
          int qtd_lobos = 0, qtd_goblins = 0, resp_dado, random, resp_skill, escolha_fugir;
        a = "a) Apenas 3.";
        b = "b) 25 e 3.";
        c = "c) 25 e – 2.";
        d = "d) 3 e – 2.";
        e = "e) Apenas – 2.";
        do{
        ArrayList<String> alternativas = new ArrayList<String>();
        alternativas.add(0,a);
        alternativas.add(1,b);
        alternativas.add(2,c);
        alternativas.add(3,d);
        alternativas.add(4,e);

        Collections.shuffle(alternativas);
        Collections.shuffle(alternativas);
        Collections.shuffle(alternativas);

        pergunta_embaralhada = "\n\nMestre: Quais são às raízes reais da equação x2 – x = 6?" + "\n\n" +alternativas.get(0)+ "\n" +alternativas.get(1)+ "\n" +alternativas.get(2)+ "\n" +alternativas.get(3)+ "\n" +alternativas.get(4);
        System.out.println(pergunta_embaralhada);
        resposta_questao01 = entrada.next();
        switch (resposta_questao01) {
          case "a":
          case "A":
          case "b":
          case "B":
          case "c":
          case "C":
          case "e":
          case "E":
          qtd_lobos = qtd_lobos+3;
          Digita("\n\nMestre: Cavaleiro, você errou.",TimeUnit.MILLISECONDS, temp_dialog);
          break;
          case "d":
          case "D":
          qtd_lobos = qtd_lobos+3;
          Digita("\n\nMestre: Se preparem! "+ qtd_lobos + " lobos estão a caminho!",TimeUnit.MILLISECONDS, temp_dialog);
          //desafio 2;
          if(qtd_lobos >6){
            random = 1 + (int) (Math.random() * 6);
            Digita("\n\nMestre: Vocês foram avisados, tudo agora dependerá da sorte de vocês... lance o dado, acima de 4 vocês vivem, caso contrário vocês morrem.",TimeUnit.MILLISECONDS, temp_dialog);
              do{
              Digita("\n\n\n..:: DAWN OF DARKNESS ::.. - Dado de 6 lados.",TimeUnit.MILLISECONDS, temp_transicao);
              Digita("\n\nRodar os dados? ",TimeUnit.MILLISECONDS, temp_transicao);
              Digita("\n\n1 - Vamos lá !!!",TimeUnit.MILLISECONDS, temp_transicao);
               System.out.println("\n");
              resp_dado = entrada.nextInt();
              if(resp_dado != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, eu não ouvi direito hahaha.",TimeUnit.MILLISECONDS, 25);
        }}while(resp_dado!=1);
              if(random>=4){
               Digita("\n\n** Rodando os dados ** ",TimeUnit.MILLISECONDS, temp_narrativa);
               Digita("\n\nDado: "+random,TimeUnit.MILLISECONDS, temp_dialog);
               Digita("\n\nMestre: Parece que o dia de sua morte ainda não chegou cavaleiro... Enfrente os lobos.",TimeUnit.MILLISECONDS, temp_dialog);
              }else{
                Digita("\n\n** Rodando os dados ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nDado: "+random,TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nLobos: Aarrrrh aaarrhhh",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nRosswald: Ei ei ei ei ei ei ei não vamos conseguir enfrentar tantos...",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nIdril: Rosswald! Não há como fugir, o que vamos faremos?",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nIdril: ROSSWALD, ROSSWAAAAAAAAAAAAAALD!!!!!!!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Idril morre ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nRosswald: NÃÃÃÃÃÃÃÃÃOOOOOOOOO!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Rosswald morre ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                do{
                System.out.println("\n\n1 - Fugir...");
                escolha_fugir = entrada.nextInt();
                if(escolha_fugir!= 1){
                Digita("\n\nMestre: Ação inválida.",TimeUnit.MILLISECONDS, temp_dialog);
          }}while(escolha_fugir!=1); 
                Digita("\n\nMestre: Hummm, quando um dificil desafio nos é posto a prova, revelamos nossa verdadeira natureza.",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Os lobos o devoram inteiro em alguns segundos ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\n** FIM DE JOGO ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                menu();
              }}
          break;
          default:
          Digita("\n\nMestre: Desculpe jovem cavaleiro, eu não consegui ouvi-lo, pode repetir?",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(!resposta_questao01.equals("D") && !resposta_questao01.equals("d"));
               Digita("\n\nRosswald: VENHAM PRA CIMA, AAAAAAAAAAAAAAAHHHHHH!!!!",TimeUnit.MILLISECONDS, temp_dialog);
               Digita("\n\nRosswald: TROVÃO LUPINO!!!",TimeUnit.MILLISECONDS, temp_dialog);
               Digita("\n\nIdril: FÚRIA DE ELFHEIM!!!",TimeUnit.MILLISECONDS, temp_dialog);
               Digita("\n\nMestre: Chegou a hora de usar suas habilidades!",TimeUnit.MILLISECONDS, temp_dialog);
               do{
               System.out.println("\n\n1 - CORTE ESPECTRAL DE LUKE YEAGHER \n2 - PRINCIPE FANTASMA");
                resp_skill = entrada.nextInt();
                if(resp_skill != 1 && resp_skill != 2){
                   Digita("\n\nMestre: Eu não ouvi direito, cavaleiro.",TimeUnit.MILLISECONDS, temp_dialog);
                }}while(resp_skill != 1 && resp_skill!= 2);
                 Digita("\n\nMestre: Vocês mataram os lobos, porém ao chegar na entrada da caverna do Rei Demônio, se deparam 5 goblins guardiões.",TimeUnit.MILLISECONDS, temp_dialog);
                 Digita("\n\nIdril: O que faremos, Rosswald?",TimeUnit.MILLISECONDS, temp_dialog);
                 Digita("\n\nRosswald: Podemos tentar a sorte e enfrentá-los, ou procurar por alguma entrada alternativa...",TimeUnit.MILLISECONDS, temp_dialog);
                 //desafio 3;
                 int pontuacao = 0,resp_entrada;
              do{
               System.out.println("\n\n1 - Enfrentar os Goblins Guardiões \n2 - Procurar por outra entrada.");
                resp_entrada = entrada.nextInt();
                if(resp_entrada == 1){
                Digita("\n\nMestre: Cavaleiro corajoso! Para vencer os goblins você precisa responder 3 perguntas e acertar no mínimo duas. Às questões a seguir não poderão ser respondidas novamente. Se você não acertar pelo menos 2, então o cruel combate contra os goblins dependerá da sorte...",TimeUnit.MILLISECONDS, temp_dialog);
               


             String resp_bhaskara;  //Primeira questão;;;;;
          do{
          Digita("\n\nMestre: Aplicando a fórmula de Bhaskara, resolva as seguintes equações do 2º grau. \n\na) 3x² – 7x + 4 = 0\n\nb) 9y² – 12y + 4 = 0\n\nc) 5x² + 3x + 5 = 0\n\nEm seguida, digite a alternativa com os resultados corretos.",TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("\n\nA) Resolução -> a = S{4/3,1} | b = S{2/3,2/3} | c = Não possuem raízes. ");
        System.out.println("\nB) Resolução -> a = S{5/3,2} | b = S{3/2,4/3} | c = Não possuem raízes. ");
        System.out.println("\nC) Resolução -> a = S{4,1} | b = S{2/3,2/3} | c = Não possuem raízes. ");
        System.out.println("\nD) Resolução -> a = Não possuem raizes | b = S{2/3,2/3} | c = Não possuem raízes. ");
        System.out.println("\nE) Resolução -> a = Não possuem raizes | b = S{2/3,2/3} | c = S{4/3,1}");
        System.out.println("\n\nDigite a alternativa correta:");
        resp_bhaskara = entrada.next();
        switch (resp_bhaskara) {
          case "e":
          case "E":
          case "b":
          case "B":
          case "c":
          case "C":
          case "d":
          case "D":
          Digita("\n\nMestre: Resposta errada, cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
          break;
          case "a":
          case "A":
          pontuacao = pontuacao+1;
          Digita("\n\nMestre: Resposta certa, cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Pontuação igual à "+pontuacao,TimeUnit.MILLISECONDS, temp_dialog);
          break;
          default:
          Digita("\n\nMestre: Desculpe cavaleiro, eu não ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
        }}while(!resp_bhaskara.equals("A") && !resp_bhaskara.equals("a") && !resp_bhaskara.equals("b") && !resp_bhaskara.equals("B") && !resp_bhaskara.equals("c") && !resp_bhaskara.equals("C") && !resp_bhaskara.equals("d") && !resp_bhaskara.equals("D") && !resp_bhaskara.equals("e") && !resp_bhaskara.equals("E"));
        

         //Segunda questão;;;;;
        String resp_equacao;
        do{
        Digita("\n\nMestre: Determine cada elemento da seguinte equação: x2 – 4x – 5 = 0",TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("\n\nA) Resolução -> a = 1 | b = -5 | c = 4");
        System.out.println("\nB) Resolução -> a = -5 | b = -4 | c = 1");
        System.out.println("\nC) Resolução -> a = 0 | b = -4 | c = -5");
        System.out.println("\nD) Resolução -> a = -5 | b = 0 | c = 1");
        System.out.println("\nE) Resolução -> a = 1 | b = -4 | c = -5");
        System.out.println("\n\nDigite a alternativa correta: ");
        resp_equacao = entrada.next();
        switch (resp_equacao) {
          case "a":
          case "A":
          case "b":
          case "B":
          case "c":
          case "C":
          case "d":
          case "D":
          Digita("\n\nMestre: Resposta errada, cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
          break;
          case "e":
          case "E":
          pontuacao = pontuacao+1;
          Digita("\n\nMestre: Resposta certa, cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Pontuação igual à "+pontuacao,TimeUnit.MILLISECONDS, temp_dialog);
          break;
          default:
          Digita("\n\nMestre: Desculpe cavaleiro, eu não ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
        }}while(!resp_equacao.equals("A") && !resp_equacao.equals("a") && !resp_equacao.equals("b") && !resp_equacao.equals("B") && !resp_equacao.equals("c") && !resp_equacao.equals("C") && !resp_equacao.equals("d") && !resp_equacao.equals("D") && !resp_equacao.equals("e") && !resp_equacao.equals("E"));

    int vetor[] = new int [5], num_aleatorio, roda_dado, resp_dado_goblins;
    String resposta_mestre="";
    for (int i = 0;i<vetor.length;i++){ //criar vetor com o pensamento do mestre;
      num_aleatorio = 1 + (int) (Math.random() * 10);
      vetor[i] = num_aleatorio;
    }

    Digita("\n\nMestre: A 3ª pergunta, fica a critério de sua sorte. De 1 a 10, eu pensarei em exatamente 5 números e poderão ser eles repetidos e diferentes (não seguirá nenhuma ordem), desta forma você precisará acertar apenas 1 desses 5.",TimeUnit.MILLISECONDS, temp_dialog);
    System.out.print("\n\nTente acertar: ");
     int num = entrada.nextInt();
     for (int i = 0;i<vetor.length;i++){
         if(num == vetor[i]){
            resposta_mestre = "\n\nMestre: Você acertou, boa!";
            pontuacao=pontuacao+1;
            break;
        
         }else{
            resposta_mestre = "\n\nMestre: Infelizmente você errou.";
         }
         }
         Digita("\n\nMestre: Veja só os números que pensei: ",TimeUnit.MILLISECONDS, temp_dialog);
         System.out.print("\n");
          for (int i = 0;i<vetor.length;i++){ //escreve pensamento do mestre;
            System.out.println("\n"+(i+1)+"º número = "+vetor[i]);
            }
          Digita(resposta_mestre,TimeUnit.MILLISECONDS, temp_dialog); // Digita resposta do mestre;
          Digita("\n\nMestre: Pontuação = "+(pontuacao),TimeUnit.MILLISECONDS, temp_dialog); // Apresenta pontuação;
            if(pontuacao >=2){
                  Digita("\n\nMestre: Enfrentem os goblins!",TimeUnit.MILLISECONDS, temp_dialog);
            }else if(pontuacao < 2){
            Digita("\n\nMestre: Vocês foram avisados, tudo agora dependerá da sorte de vocês... lance o dado, acima de 4 vocês vivem, caso contrário vocês morrem.",TimeUnit.MILLISECONDS, temp_dialog);
              roda_dado = 1 + (int) (Math.random() * 6); //gera posição do dado;
              do{
               Digita("\n\n\n..:: DAWN OF DARKNESS ::.. - Dado de 6 lados.",TimeUnit.MILLISECONDS, temp_transicao);
               Digita("\n\nRodar os dados? ",TimeUnit.MILLISECONDS, temp_transicao);
               Digita("\n\n1 - Vamos lá !!!",TimeUnit.MILLISECONDS, temp_transicao); //roda os dados;
               System.out.println("\n");
               resp_dado_goblins = entrada.nextInt();
               System.out.println("\n");
               if(resp_dado_goblins != 1){
               Digita("\n\nMestre: Meu bravo cavaleiro, eu não ouvi direito hahaha.",TimeUnit.MILLISECONDS, temp_dialog);
               }}while(resp_dado_goblins != 1);
                Digita("\n\n** Rodando os dados ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nDado: "+roda_dado,TimeUnit.MILLISECONDS, temp_dialog);
                if(roda_dado<4){
                Digita("\n\nGoblins: Matem eles!!!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nRosswald: NÃÃÃO! Idril, fuja! Eles são fortes demais...",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Rosswald morre ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nIdril: ROSSWALD, NÃO... SEUS MALDITOS, IRÃO PAGAR POR ISSO!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nIdril: QUEIMEEEEEEEEM!!!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Idril conjura fogo com seu cajado ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nMestre: Mesmo com suas fortes habilidades de fogo, não foi suficiente...",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Idril morre ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nMestre: Só restou você em batalha, jovem cavaleiro. O que vai fazer?",TimeUnit.MILLISECONDS, temp_dialog);
                do{
                System.out.println("\n\n1 - Fugir... \n\n2 - Lutar");
                escolha_fugir = entrada.nextInt();
                if(escolha_fugir!= 1 && escolha_fugir!= 2){
                Digita("\n\nMestre: Ação inválida.",TimeUnit.MILLISECONDS, temp_dialog);
                }
                else if(escolha_fugir == 2){
                    Digita("\n\nMestre: Realmente muito corajoso, porém você sozinho não conseguirá...",TimeUnit.MILLISECONDS, 70);
                    Digita("\n\n** Goblins se aproximam ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\nMestre: Coragem nem sempre é a resposta meu jovem, é nos momentos de desespero onde mais precisamos manter a racionalidade e se deixar levar pelas emoções...",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\n** Goblins se aproximam ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\nMestre: Lembre disso...",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\n** Goblins te devoram ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\n** Fim de jogo ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    menu();
                }
                else if(escolha_fugir == 1){
                    Digita("\n\nMestre: Fugir? E eu pensando que cavaleiros eram corajosos...",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\n** Goblins se aproximam ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\nMestre: Não há como fugir meu jovem, encare seu destino.",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\n** Goblins se aproximam ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\nMestre: Aceitação é o primeiro passo para compreensão de um erro. Aprenda e faça melhor na próxima vez.",TimeUnit.MILLISECONDS, 70);
                    Digita("\n\n** Goblins te devoram ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\n** Fim de jogo ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    menu();
                }}while(escolha_fugir!= 1 && escolha_fugir!= 2); 
         
                }else if(roda_dado>=4){
                      Digita("\n\nMestre: Enfrentem os goblins!",TimeUnit.MILLISECONDS, temp_dialog);
                }


         }}
                else if(resp_entrada == 2){
                  System.exit(0);
                }

                Digita("\n\nIdril: SONO CELESTIAL!!!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Idril coloca 2 grandes goblins para dormir **",TimeUnit.MILLISECONDS, temp_narrativa); 
                Digita("\n\nRosswald: BOLA DE FOGO!!!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Rosswald queima 2 goblins **",TimeUnit.MILLISECONDS, temp_narrativa); 
                Digita("\n\nMestre: Chegou a hora de usar suas habilidades!",TimeUnit.MILLISECONDS, temp_dialog);
                do{
                System.out.println("\n\n1 - CORTE ESPECTRAL DE LUKE YEAGHER \n2 - PRINCIPE FANTASMA");
                resp_skill = entrada.nextInt();
                if(resp_skill != 1 && resp_skill != 2){
                   Digita("\n\nMestre: Eu não ouvi direito, cavaleiro.",TimeUnit.MILLISECONDS, temp_dialog);
                }}while(resp_skill != 1 && resp_skill!= 2);
                Digita("\n\n* Todos os goblins morrem **",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nMestre: E juntos vocês entram na caverna do Rei Demônio...",TimeUnit.MILLISECONDS, temp_dialog);
                
 } while(resp_entrada != 1 && resp_entrada!= 2);
 

 }








     static void capitulo_3() throws Exception{
        Scanner entrada = new Scanner (System.in);
        int resp;
        do{
        Digita("\n\n\n..:: DAWN OF DARKNESS ::.. - Capítulo 3 - Praga",TimeUnit.MILLISECONDS, 25);
        Digita("\n\nIniciar aventura? ",TimeUnit.MILLISECONDS, 50);
        Digita("\n\n1 - Vamos !!!",TimeUnit.MILLISECONDS, 25);
        System.out.println("\n");
        resp = entrada.nextInt();
        if(resp != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, eu não ouvi direito hahaha.",TimeUnit.MILLISECONDS, 25);
        }
        }while(resp!=1);
          System.exit(0);
     }
     public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
        System.out.print(caractere);
        unit.sleep(tempo_mensagem);
    }
}
    }
