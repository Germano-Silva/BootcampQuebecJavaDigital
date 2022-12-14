package bancoDigital;

public interface ContaDigital {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, ContaDigital contaDestino);

    void imprimirExtrato();
}
