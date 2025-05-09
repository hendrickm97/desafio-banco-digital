import java.text.DecimalFormat;

public class ContaPoupanca extends Conta {
    private static final double TAXA_RENDIMENTO_MENSAL = 0.005;

    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    public void renderJuros(){
        double rendimento = this.getSaldo() * TAXA_RENDIMENTO_MENSAL;
        this.depositar(rendimento);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("Rendimento de R$" + df.format(rendimento) + " aplicado à conta " + this.getNumero());
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
