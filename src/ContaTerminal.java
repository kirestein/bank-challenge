public class ContaTerminal {
    private String nomeCliente;
    private String agencia;
    private int numeroConta;
    private double saldo = 0.00;

    public ContaTerminal(String nomeCliente, String agencia, int numeroConta) {
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    public void depositar(double value) { this.saldo += value; }
    public void sacar(double value) { this.saldo -= value; }
    public double getSaldo() { return saldo; }
    public void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }
    public String getNomeCliente() { return nomeCliente; }
    public String getAgencia() { return agencia; }
    public int getNumeroConta() { return numeroConta; }
}
