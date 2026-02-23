
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("digite qual opção voce deseja");
//        System.out.println(" ");
//        System.out.println("opção 1: jogar  opção 2: novo jogo opção 3: sair");
//        int opcao = sc.nextInt();
//
//        switch (opcao) {
//            case 1:
//                System.out.println("o jogo ja vai começar");
//           break;
//           case 2:
//               System.out.println("vai se iniciar um novo jogo");
//               break;
//
//           case 3:
//                System.out.println("voce esta saindo");
//            break;
//
//        }


//        System.out.println("informe sua menção");
//        int media = sc.nextInt();
//
//        switch (media) {
//            case 1:
//                System.out.println("nao desenvolveu");
//            break;
//            case 2:
//                System.out.println("em desenvolvimento");
//                break;
//                case 3:
//                    System.out.println("desnenvolveu");
//                 break;
//
//        }


//        System.out.println("informe o primeiro numero:  ");
//        int num1 = sc.nextInt();
//        System.out.println("informe o segundo numero:   ");
//        int num2 = sc.nextInt();
//
//        System.out.println("informe a operação que voce quer:   1 - soma   2 - multiplicação   3 - divisão   4- subtração");
//        int operacoes = sc.nextInt();
//
//        switch (operacoes) {
//            case 1:
//                System.out.println("a soma dos numeros é: ");
//                if (num1 > num2) {
//                    System.out.println(num1 + num2);
//                } else {
//                    System.out.println(num2 + num1);
//                }
//                break;
//            case 2:
//                System.out.println("a multiplicação dos seus numeros é: " );
//                if (num1 > num2) {
//                    System.out.println(num1 * num2);
//                } else {
//                    System.out.println(num2 * num1);
//                }
//                break;
//            case 3:
//                System.out.println("a divisão dos seus numeros é: ");
//                if (num1 > num2) {
//                    System.out.println(num1 / num2);
//                } else {
//                    System.out.println(num2 / num1);
//                }
//                break;
//            case 4:
//                System.out.println("a subtração dos numeros é:");
//                if (num1 > num2) {
//                    System.out.println(num1 - num2);
//                } else {
//                    System.out.println(num2 - num1);
//                }
//
//

        System.out.println("indique a direção que voce quer ir: (w/a/s/d)");
        String direcao = sc.next();

        switch (direcao ) {
            case "w":
                System.out.println("o W anda para frente");
            break;

            case "a":
                System.out.println("o A anda para a esquerda");
            break;
            case "s":
                System.out.println("o S anda para trás");
            break;
            case "d":
                System.out.println("o D anda para a esqueda");
        }


    }
}