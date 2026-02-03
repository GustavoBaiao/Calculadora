public class Conta {

    private Double numero1;
    private Double numero2;
    private String operador;
    private Double resultado;

    public Conta(Double numero1, Double numero2, String operador, Double resultado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operador = operador;
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return numero1 + " " + operador + " " + numero2 + " = " + resultado;
    }
}
