public class App {
    public static void main(String[] args) throws Exception {

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 55);
        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45);
        Carro utilitario = new Carro("Utilitario", TipoCombustivel.DIESEL, 5, 70);
        Carro suv = new Carro("SUV", TipoCombustivel.GASOLINA, TipoCombustivel.FLEX, 8, 55);

        System.out.println("Tipos de veiculos:");
        System.out.println(suv);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro suv com gasolina");
        suv.abastece(TipoCombustivel.GASOLINA, 70);
        System.out.println(suv);
        System.out.println("\nViajando com o carro suv");
        suv.viaja(250);
        suv.viaja(150);
        System.out.println(suv);
    }
}
