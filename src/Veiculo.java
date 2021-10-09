public class Veiculo {
     private String marca;
     private String modelo;
     private int fabricacao;
     private String cor;
     private double quilometragem;

    public Veiculo() {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricacao = fabricacao;
        this.cor = cor;
        this.quilometragem = quilometragem;
    }

    public Veiculo(String marca, String modelo, int fabricacao, String cor, double quilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricacao = fabricacao;
        this.cor = cor;
        this.quilometragem = quilometragem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(int fabricacao) {
        this.fabricacao = fabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
}
