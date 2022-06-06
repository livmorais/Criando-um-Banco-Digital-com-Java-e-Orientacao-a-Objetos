public class Main {
    public static void main(String[] args) {
        
        Cliente livia = new Cliente();
        livia.setNome("Lívia");
        
        Conta cc = new ContaCorrente(livia);
        Conta poupanca = new ContaPoupanca(livia);
        
        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        
    }
}
