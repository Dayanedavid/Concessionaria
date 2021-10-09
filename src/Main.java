public class Main {
    public static void main(String[] args) {
        Concessionaria concessionaria= new Concessionaria();
        Cliente cliente = new Cliente("Fatima","Soares","49928922");
        Veiculo veiculo = new Veiculo("Ford", "Fordk", 2018, "Cinza chumbo", 800);

        concessionaria.registrarVenda(veiculo,cliente,15000.0);
    }
}
