import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Scanner sc = new Scanner(System.in);

       Operacoes op = new Operacoes();

       int opcao = 9;
       try {
           while (opcao != 0){
               System.out.println("========= Calculadora ==========");
               System.out.print("Opções  \n" +
                       "1- Soma \n" +
                       "2- Subtração  \n" +
                       "3- Multiplicação  \n" +
                       "4- Divisão \n"+
                       "0- Sair \n" +
                       "Digite a opção desejada: " );

               opcao = sc.nextInt();

               double resultado;

               switch (opcao){

                   case 1: {
                       System.out.print("Digite o primeiro número: ");
                       double n1 = sc.nextDouble();
                       System.out.print("Digite o segundo número: ");
                       double n2 = sc.nextDouble();
                       resultado = op.soma(n1, n2);
                       System.out.println("Resultado = " + resultado);
                       break;
                   }
                   case 2: {
                       System.out.print("Digite o primeiro número: ");
                       double n1 = sc.nextDouble();
                       System.out.print("Digite o segundo número: ");
                       double n2 = sc.nextDouble();
                       resultado = op.subtrai(n1, n2);
                       System.out.println("Resultado = " + resultado);
                       break;
                   }
                   case 3: {
                       System.out.print("Digite o primeiro número: ");
                       double n1 = sc.nextDouble();
                       System.out.print("Digite o segundo número: ");
                       double n2 = sc.nextDouble();
                       resultado = op.multiplica(n1, n2);
                       System.out.println("Resultado = " + resultado);
                       break;
                   }
                   case 4: {
                       System.out.print("Digite o primeiro número: ");
                       double n1 = sc.nextDouble();
                       System.out.print("Digite o segundo número: ");
                       double n2 = sc.nextDouble();
                       resultado = op.divide(n1, n2);
                       System.out.println("Resultado = " + resultado);
                       break;
                   }
                   case 0:
                       System.out.println("Saindo");
                       break;
                   default:
                       System.out.println("Opção invalida");
                       return;
               }
           }
       }catch (Exception e){
           System.out.println("Entrada inválida. Por favor, digite apenas números.");
           sc.nextLine();
       }
       sc.close();

    }
}