public class Venda {
    Cliente cliente;
    Veiculo veiculo;
    double valorDeVenda;

    public Venda(Cliente cliente, Veiculo veiculo, double valorDeVenda) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.valorDeVenda = valorDeVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public double getValorDeVenda() {
        return valorDeVenda;
    }

    public void setValorDeVenda(double valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }
}
