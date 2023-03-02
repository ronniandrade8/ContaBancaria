package Entities;

public class ContaBancaria {
    public int NumeroConta;
    public String NomeTitular;
    public double Deposito;
    public double SaldoBancario;

    //public ContaBancaria(){}

    public ContaBancaria(int numeroConta, String nomeTitular, double deposito){
        NumeroConta = numeroConta;
        NomeTitular = nomeTitular;
        Deposito = deposito;
    }

    public int getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        NumeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return NomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        NomeTitular = nomeTitular;
    }

    public double getSaldoBancario() {
        return SaldoBancario;
    }

    public void setSaldoBancario(double saldoBancario) {
        SaldoBancario = saldoBancario;
    }

    public double getDeposito() {
        return Deposito;
    }

    public void setDeposito(double deposito) {
        Deposito = deposito;
    }

    public void AdicionarDeposito(double deposito){
        SaldoBancario += deposito;
    }

    public void RemoverDeposito(double deposito){
        SaldoBancario -= deposito;
    }

    @Override
    public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append("Numero Conta: " + NumeroConta);
         sb.append(", Titular: " + NomeTitular);
         sb.append(String.format(", Saldo: %.2f", SaldoBancario + Deposito));

         return sb.toString();
    }
}