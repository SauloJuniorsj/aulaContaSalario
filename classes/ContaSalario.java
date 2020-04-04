

public class ContaSalario extends Conta {

    private String nomeEmpresa;
    private int limiteDeposito;

    public ContaSalario(String titular, String numero, double saldo, String nomeEmpresa, int limiteDeposito) {
        super(titular, numero, saldo);
        this.nomeEmpresa = nomeEmpresa;
        this.limiteDeposito = limiteDeposito;
    }

    public void depositar(double deposito) {
        if(this.limiteDeposito > 0){
            double saldoAtual = this.getSaldo() + deposito;
            this.setSaldo(saldoAtual);
            --this.limiteDeposito;
        }else{
            throw new Exception("Limite de depósito excedido");
        }
    }

    @Override
    public String toString() {
        return " Conta salario{" +
                "titular ='" + this.getTitular() + '\'' +
                ", numero ='" + this.getNumero() + '\'' +
                ", Empresa = R$ '" + this.nomeEmpresa +
                ", saldo = R$ " + this.getSaldo() +
                '}';
    }


}