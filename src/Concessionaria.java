public class Concessionaria {
    public void registrarVenda(Veiculo veículo, Cliente cliente, Double valor){
        System.out.println("Nome: " + cliente.getNome() + " " + cliente.getSobrenome());
        System.out.println("Contato: "+cliente.getContato());
        System.out.println("Veiculo: " + veículo.getModelo());
        System.out.println("Valor " + valor);
        System.out.println("Venda Realizada");
    }
}
