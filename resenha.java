
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gabriely.barboza
 */
public class resenha {

    //Gabys: inicio da intro. Para todos que vão alterar algo, eu não sou muito boa com JAVA(eu sou front), 
    //então eu tentei o máximo que pude. Coloquei as histórias dos perosnagem, e do mundo do jogo em 
    //funções que estão aqui abaixo, bem no inicio, logo em seguida temos a semi intro (onde um NPC lhe dá as boas-vindas).
    //Esse NPC pergunta seu nome e questiona se você quer saber a história do jogo e dos personagens. 
    
    
    
     
    static void keeping() {
        System.out.println("Teste de continuação sem história");
    }
    
    static void historia() {
        System.out.println("Teste história");
    }
    
    
    static void bruxo() {
        System.out.println("Teste história bruxo");
    }

    static void guerreiro() {
        System.out.println("Teste história guerreiro");

    }

    static void elfa() {
        System.out.println("Teste história elfa");
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Guardião do jogo: Bem-vindo ao mundo de Dawn of Darkness, caro viajante. Você está pronto para entrar em uma história incrivel?");
        System.out.println("Digite 1 - Sim ou 2 - Vamos nessa!");    
        int resposta = leitor.nextInt();
        
        
        System.out.println("Olha só o que temos aqui... será mesmo que finalmente encontrei um viajante corajoso?");
       

        System.out.println("Bem... vamos lá...");

        System.out.println("Para começarmos, por favor, diga-me o seu nome.");
        String nome = leitor.next();

        System.out.println("Seja bem-vinda(o), ao intenso mundo de Alduin, " + nome);
        System.out.println("Gostaria de saber mais sobre a história do mundo no qual você está prestes a entrar ou ir direto para o jogo?");
        System.out.print("1 - Saber mais sobre a história. ");
        System.out.print("2 - Ir direto para o jogo. ");
        int escolha = leitor.nextInt();
        
       

        switch (escolha) {
            case 1:
                System.out.println("Bem, tudo começou há muitas eras... ");
                historia();
                 break;
            case 2:
                System.out.println("Ok");
                 keeping();
                break;
        }

    }

}
