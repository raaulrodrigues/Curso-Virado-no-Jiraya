package ExerciciosAwari.Exercicio01.dominio;

public class ContaBancaria {
    private String nomeTitular;
    private int saldo;
    private int numConta;
    private int adicionarSaldo;
    private int retirarSaldo;
    public int novoSaldoAdicionar;
    public int novoSaldoRetirar;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }


    public void adicionarSaldo(int saldoAdicionado){
        novoSaldoAdicionar = (getSaldo() + saldoAdicionado);
        System.out.print("Novo saldo da conta: " + novoSaldoAdicionar);
    }

    public void retirarSaldo(int saldoRetirado){
        novoSaldoRetirar = (novoSaldoAdicionar - saldoRetirado);
        System.out.print("Novo saldo da conta: " + novoSaldoRetirar);
    }
}
