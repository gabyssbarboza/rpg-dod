import java.util.Scanner;
import java.util.concurrent.TimeUnit;
class Main {
  public static void main(String[] args) throws Exception{
    Scanner entrada = new Scanner (System.in);
    Digita("\nMestre: Está pronto para vivenciar o verdadeiro desespero... hã, digo, aventura?",TimeUnit.MILLISECONDS, 70);
    System.out.println("\n1 - Sim | 2 - Com certeza! |3 - Não sei não hein...");
    int escolha_menu = entrada.nextInt();
        if(escolha_menu == 1 || escolha_menu == 2){
          Digita("\nMestre: Conheça o alvorecer da escuridão!",TimeUnit.MILLISECONDS, 70);
          menu();
        }else if(escolha_menu == 3){
           Digita("\nMestre: Não se engane jovem, não é como se você tivesse muita escolha... Abrace o destino!",TimeUnit.MILLISECONDS, 70);
           menu();
        }else{
            Digita("\nMestre: Mesmo digitando uma opção inválida, seu destino lhe aguarda! Viva muito, explore, venca seus desafios e encontre a cura...",TimeUnit.MILLISECONDS, 70);
           menu();
        }}
    static void menu() throws Exception { //Classe do menu;
    Scanner entrada = new Scanner (System.in);
    Digita("\n\n..:: DAWN OF DARKNESS ::.. \n\n1 - Jogar \n2 - Créditos\n3 - Sair",TimeUnit.MILLISECONDS, 25);
    System.out.println("\n");
    int escolha_menu = entrada.nextInt();
    if(escolha_menu == 1){
              jogo();
    }
    else if(escolha_menu == 2){
              creditos();
    }
    else{
          Digita("\nMestre: Não demore para voltar meu aventureiro, uma jornada lhe aguarda...",TimeUnit.MILLISECONDS, 70);
          System.exit(0);
    }}
     static void creditos()throws Exception { //Classe dos créditos;
     Scanner entrada = new Scanner (System.in);
        int escolha_menu;
        System.out.println("\n</> Desenvolvedores </>\n\n-> Ygor Oliveira \n-> Fillipe Vital \n-> Gabryele Barbosa \n-> Rodrigo Shuttleton \n-> Yasmim Candelária");
        do{
        System.out.println("\n2 - Voltar");
        escolha_menu = entrada.nextInt();
        if(escolha_menu == 2){
          menu();
        }else{
           System.out.println("\nOpção inválida, digite novamente: ");
        }}while(escolha_menu!=2);
     }

          static void jogo()throws Exception{ //Classe do jogo;
          Scanner entrada = new Scanner (System.in);
          Digita("\nMestre: Hmm... veja só o que temos por aqui, será um corajoso ou um curioso? \n\nBem... vamos lá...",TimeUnit.MILLISECONDS, 50);
          Digita("\nMestre: Para começarmos, por favor, diga-me o seu nome.",TimeUnit.MILLISECONDS, 50);
          System.out.println("\n");
          String nome_aventureiro = entrada.next();
          Digita("\nMestre: Seja bem-vindo(a), ao intenso mundo de Alduin, " + nome_aventureiro + "!",TimeUnit.MILLISECONDS, 50);
          Digita("\n\nMestre: A partir daqui, serei seu guia e companheiro nesta jornada, pode me chamar de mestre.",TimeUnit.MILLISECONDS, 50);
          Digita("\n\nMestre: Gostaria de saber mais sobre a história do mundo no qual você está prestes a entrar ou ir direto para o jogo?",TimeUnit.MILLISECONDS, 50);
          int escolha_menu;
          do{
          System.out.println("\n\n1 - Conte-me mais, mestre!");
          System.out.println("2 - Naah, podemos ir direto para o jogo?");
          System.out.println("3 - Voltar.");
          escolha_menu = entrada.nextInt();
          if(escolha_menu == 1){
          Digita("\n\nMestre: Muito bem, por onde começar...?",TimeUnit.MILLISECONDS, 50);
          Digita("\n\nEsta é a história de um mundo mágico e incrível chamado Alduin.\nAlduin é um mundo repleto de vida, esperança e prosperidade, diversas criaturas e animais de várias espécies vivem em harmonia. Alduin é dividido em 4 grandes nações sendo elas: \n\n1) O Norte comandado pela corte de Elizabeth Clarke. Domínio dos bruxos.\n2) O Leste comandado pelos cavaleiros do reino de Luke Yeagher.\n3) O Sul comandado pelos Elfos e criaturas das florestas.\n4) E o Oeste comandado pelos Demônios e Monstros Ancestrais. \n\nUma praga se espalha pelas sombras, desolando toda a vida existente em Alduin, aquele que contrai a praga certamente morre em um mês. A praga destrói toda suas forças e apodrece aos poucos seus orgãos, ninguém sabe quem ou o que é o causador dessa doença, mas existem rumores de que ela teve início mas redondezas do Oeste. Território dos demônios.",TimeUnit.MILLISECONDS, 70);
                  
          Digita("\n\nMestre: "+nome_aventureiro+", hora de iniciar a aventura!",TimeUnit.MILLISECONDS, 70);
          Digita("\n\nMestre: Neste mundo você assumirá o papel de um triste cavalei... quer dizer, um bravo cavaleiro!",TimeUnit.MILLISECONDS, 70);
          capitulo_1();
          capitulo_2();

          }else if(escolha_menu == 3){
                 menu();
          }
          else if(escolha_menu == 2){
           Digita("\n\nMestre: "+nome_aventureiro+", hora de iniciar a aventura!",TimeUnit.MILLISECONDS, 70);
          Digita("\n\nMestre: Neste mundo você assumirá o papel de um triste cavalei... quer dizer, um bravo cavaleiro!",TimeUnit.MILLISECONDS, 70);
          capitulo_1();
          capitulo_2();
    
          }else{
            System.out.println("\nOpção inválida!");
          }
          }while(escolha_menu!= 1 ||escolha_menu!= 2 || escolha_menu!= 3);
          }

        static void capitulo_1() throws Exception{
        Scanner entrada = new Scanner (System.in);
        int resp;
        do{
        Digita("\n\n\n..:: DAWN OF DARKNESS ::.. - Capítulo 1 - A taverna dos aventureiros!",TimeUnit.MILLISECONDS, 25);
        Digita("\n\nIniciar aventura? ",TimeUnit.MILLISECONDS, 50);
        Digita("\n\n1 - Vamos !!!",TimeUnit.MILLISECONDS, 25);
        System.out.println("\n");
        resp = entrada.nextInt();
        if(resp != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, eu não ouvi direito hahaha.",TimeUnit.MILLISECONDS, 25);
        }
        }while(resp!=1);
        Digita("\n\nMestre: 14 dias após sair com seu exército em busca da cura para seu pai, você se encontra em uma taverna próxima ao território dos demônios e criaturas ancestrais. \n\nO lugar está em pedaços, claramente dá para perceber que esta Taverna já teve seus momentos de gloria e felicidade, mas atualmente poucas pessoas ainda frequentam este local e as poucas restantes estão machucadas ou em sofrimento.\n\nO dono da Taverna é um velho anão, sem esperanças na vida, sua única fonte de renda era a taverna e com a chegada da praga seus lucros caíram muito. Mas mesmo assim ele continua com seu sorriso no rosto a ajudar quem for preciso na região.\nO taverneiro enquanto limpava o balcão se aproxima de você e pergunta:",TimeUnit.MILLISECONDS, 70);
        int resposta_menu;
        Digita("\n\nTaverneiro: Jovem rapaz, está tudo bem? Não achas que já bebeste muito? Algo lhe ocorreu?",TimeUnit.MILLISECONDS, 70);
        do{
        System.out.println("\n1 - Sim está tudo bem... | 2 - Não estou afim de conversar, anão...");
        resposta_menu = entrada.nextInt();
          if(resposta_menu != 1 && resposta_menu != 2){
              Digita("\n\nTaverneiro: Desculpe meu jovem, poderia repetir..?",TimeUnit.MILLISECONDS, 70);
          }
        }while(resposta_menu!=1 && resposta_menu!=2);
        Digita("\n\nMestre: O taverneiro ao ouvir suas palavras graves e fortes, lhe dá um sorriso e apenas continua a limpar sua taverna...",TimeUnit.MILLISECONDS, 70);
        Digita("\n\nMestre: Você não ficou bebado devido a sua alta resistência, porém encontra-se em tremendo luto e angustia pois perdeu muitos amigos na busca pela cura de seu pai... O ato ocorreu em uma feroz batalha na floresta sombria... além disso seu pai está com a praga e provavelmente morrerá no próximo inverno... você não sabe a quem recorrer, e não sabe a causa dessa doença...",TimeUnit.MILLISECONDS, 70);
        Digita("\n\nMestre: Pouco tempo depois surge um homem, com roupas pretas e uma capa grande com capuz. Logo atrás dele entra uma Elfa de pele clara que vestia uma roupa de couro e uma capa esverdeada que ia de seus ombros quase até o chão. Os dois seguem até o balcão aonde você está e sentam ao seu lado.",TimeUnit.MILLISECONDS, 70);
        Digita("\n\n** tensão no ar **",TimeUnit.MILLISECONDS, 130);
        Digita("\n\nHomem do capuz: Já faz muito tempo, não é jovem principe da capital de Luke Yeagher?",TimeUnit.MILLISECONDS, 70);
        int escolha_menu3, escolha_menu4;
        do{
        System.out.println("\n\n1 - Quem é você?");
        System.out.println("2 - Por favor estranho, não estou afim de joguinhos..");
        escolha_menu3 = entrada.nextInt();
        if(escolha_menu3 == 1 || escolha_menu3 == 2){
          Digita("\n\nHomem do capuz: Hahahaha, não se lembra mais..?",TimeUnit.MILLISECONDS, 70);
          Digita("\n\n** observa **",TimeUnit.MILLISECONDS, 110);
          do{
          System.out.println("\n\n1 - Espera ai, você é Rosswald? O grande bruxo Rosswald?!!");
          escolha_menu4 = entrada.nextInt();
          if(escolha_menu4!= 1){
            Digita("\n\nMestre: O homem não ouviu o que você falou...",TimeUnit.MILLISECONDS, 70);
          }}while(escolha_menu4!=1); 
        }else{
            Digita("\n\nMestre: O homem não ouviu o que você falou...",TimeUnit.MILLISECONDS, 70);
        }}while(escolha_menu3 != 1 && escolha_menu3 == 2);
        Digita("\n\n** o homem tira o capuz **",TimeUnit.MILLISECONDS, 130);
          Digita("\n\nRosswald: Da última vez que te vi você era uma criança, jovem principe!",TimeUnit.MILLISECONDS, 70); 
          Digita("\n\nRosswald: Vejo que amadureceu bastante, hein. A capital inteira de Luke Yeagher está dizendo que você está procurando a cura da praga...",TimeUnit.MILLISECONDS, 70);
          Digita("\n\nRosswald: Eu e minha companheira Idril temos pistas que talvez possam ajuda-lo, pistas que nos levam para o Oeste, Terra dos demonios...",TimeUnit.MILLISECONDS, 70);  
          Digita("\n\nIdril (Elfa): Meu nome é Idril, soubemos do que está aconteceu com os seus companheiros na busca pela floresta sombria... sinto muito.",TimeUnit.MILLISECONDS, 70);   
          Digita("\n\nIdril (Elfa): O fato é que às criaturas da floresta elfica estão morrendo pela praga, e em paralelo às suas motivações, creio que podemos fazer uma parceria para investigar essas pistas... Não aguento mais perder vida inocentes por essa doença!",TimeUnit.MILLISECONDS, 70);
          Digita("\n\nRosswald: Não se sinta obrigado a nos ajudar meu jovem principe, apenas não quero vê-lo em total desolação. Movido pelas suas motivações e de Idril, podemos partir agora! O que me diz?",TimeUnit.MILLISECONDS, 70);
          int escolha_menu5, escolha_menu6;
          do{
          System.out.println("\n\n1 - E como eu poderia ajuda-los? Estou muito preocupado com a saúde de meu pai... e sinto que se não fizer nada a respeito, ele pode morrer...");
          escolha_menu5 = entrada.nextInt();
          if(escolha_menu5!= 1){
            Digita("\n\nMestre: O homem não ouviu o que você falou...",TimeUnit.MILLISECONDS, 70);
          }}while(escolha_menu5!=1);
            Digita("\n\nIdril: Nos acompanhando até o covil dos demônios! Às pistas nos dizem que o Rei demonio é o causador dessa praga...",TimeUnit.MILLISECONDS, 70);
          do{
          System.out.println("\n\n1 - O rei demônio...? Maldito...");
          escolha_menu6 = entrada.nextInt();
          if(escolha_menu6!= 1){
            Digita("\n\nMestre: A Idril não ouviu o que você falou...",TimeUnit.MILLISECONDS, 70);
          }}while(escolha_menu6!=1);
          Digita("\n\nRosswald: E ai meu jovem, pronto para partirmos?",TimeUnit.MILLISECONDS, 70);
          int escolha_menu7, escolha_menu8;
          do{
          System.out.println("\n\n1 - Montar a parceria \n2 - Não participar dessa busca.");
          escolha_menu7 = entrada.nextInt();
          if(escolha_menu7!= 1 && escolha_menu7!= 2){
            Digita("\n\nMestre: A Idril não ouviu o que você falou...",TimeUnit.MILLISECONDS, 70);
          }
          else if(escolha_menu7 == 2){
            Digita("\n\nIdril: Este jovem está muito abalado, Rosswald. Vamos embora.",TimeUnit.MILLISECONDS, 70);
            Digita("\n\nRosswald: Bom amigão, entendo sua dor... Porém não temos mais tempo a perder aqui. Boa sorte com a busca da cura pelo seu pai.",TimeUnit.MILLISECONDS, 70);
            Digita("\n\nMestre: Os dois saem da taverna e você continua bebendo, bebendo e bebendo...",TimeUnit.MILLISECONDS, 70);
            Digita("\n\n** 2 meses depois **",TimeUnit.MILLISECONDS, 110);
            Digita("\n\nMestre: O tempo passou e você não conseguir encontrar a cura, seu pai morreu e mundo está em repleto caos.",TimeUnit.MILLISECONDS, 70);
            Digita("\n\nMestre: Às vezes, só o que a gente precisa é de companheiros... O que poderia ter acontecido caso tivesse feito a parceria? Tarde demais para pensar.",TimeUnit.MILLISECONDS, 70);
            Digita("\n\nMestre: Agora só lhe resta morrer pela praga, bravo cavaleiro...",TimeUnit.MILLISECONDS, 70);
            Digita("\n\n** Fim de jogo **",TimeUnit.MILLISECONDS, 130);
            System.out.println("\n\n\n\n");
            menu();
          }
          else if(escolha_menu7 == 1){
                Digita("\n\nIdril: Perfeito!!! Rosswald, juntos eu sei que conseguiremos.",TimeUnit.MILLISECONDS, 70);
                Digita("\n\nRosswald: Ah sim, levante meu jovem principe, vamos conseguir salvar seu pai e a floresta elfica, eu garanto.",TimeUnit.MILLISECONDS, 70);
                Digita("\n\n**Você vira seu último caneco de cerveja**",TimeUnit.MILLISECONDS, 130);
                Digita("\n\nMestre: E juntos, vocês partem para o Oeste, para cova do Rei Demônio!",TimeUnit.MILLISECONDS, 70);
                Digita("\n\nTaverneiro: EI! Jovem cavaleiro?",TimeUnit.MILLISECONDS, 70);
                int escolha_menu9;
                do{
                   System.out.println("\n\n1 - O quê?");
                     escolha_menu9 = entrada.nextInt();
                      if(escolha_menu9!= 1){
                      Digita("\n\nMestre: O taverneiro não ouviu o que você falou...",TimeUnit.MILLISECONDS, 70);
          }}while(escolha_menu6!=1);
                      Digita("\n\nTaverneiro: Boa sorte na sua busca! Sei que seus amigos irão lhe ajudar!",TimeUnit.MILLISECONDS, 70);
                      Digita("\n\nMestre: E juntos vocês partem para aventura!",TimeUnit.MILLISECONDS, 130);

          }}while(escolha_menu7!= 1 && escolha_menu7!= 2);

     }
     static void capitulo_2() throws Exception{
        Scanner entrada = new Scanner (System.in);
        int resp;
        do{
        Digita("\n\n\n..:: DAWN OF DARKNESS ::.. - Capítulo 2 - A Floresta dos Desafios!",TimeUnit.MILLISECONDS, 25);
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
     public static void Digita(String data, TimeUnit unit, long delay) throws InterruptedException {
        for (char ch : data.toCharArray()) {
        System.out.print(ch);
        unit.sleep(delay);
    }
}
    }
