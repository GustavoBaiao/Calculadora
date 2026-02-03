import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Operacoes op = new Operacoes();

        List<Conta> historico = new ArrayList<>();

        while (true) {

            System.out.println("========= Calculadora ==========");
            System.out.println("Digite uma expressão (ex: 5 * 3)");
            System.out.println("Digite 'historico' para ver as contas");
            System.out.println("Digite 'sair' para encerrar");
            System.out.print("> ");

            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                System.out.println("Programa encerrado.");
                break;
            }

            if (entrada.equalsIgnoreCase("historico")) {
                if (historico.isEmpty()) {
                    System.out.println("Histórico vazio.");
                } else {
                    System.out.println("===== Histórico =====");
                    for (Conta c : historico) {
                        System.out.println(c);
                    }
                }
                System.out.println();
                continue;
            }

            try {
                String[] partes = entrada.split(" ");

                if (partes.length != 3) {
                    System.out.println("Formato inválido. Use: número operador número");
                    continue;
                }

                double n1 = Double.parseDouble(partes[0]);
                String operador = partes[1];
                double n2 = Double.parseDouble(partes[2]);

                double resultado;

                switch (operador) {
                    case "+":
                        resultado = op.soma(n1, n2);
                        break;
                    case "-":
                        resultado = op.subtrai(n1, n2);
                        break;
                    case "*":
                        resultado = op.multiplica(n1, n2);
                        break;
                    case "/":
                        resultado = op.divide(n1, n2);
                        break;
                    default:
                        System.out.println("Operador inválido.");
                        continue;
                }

                Conta conta = new Conta(n1, n2, operador, resultado);
                historico.add(conta);

                System.out.println("Resultado: " + resultado);

            } catch (Exception e) {
                System.out.println("Erro na expressão. Verifique os valores digitados.");
            }

            System.out.println();
        }

        sc.close();
    }
}
