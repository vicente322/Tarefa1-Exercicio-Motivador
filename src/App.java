public class App {
    public static void main(String[] args) throws Exception {

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA,
        10, 55);
        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA,
        6, 45);
        Carro utilitario = new Carro("Utilitario", TipoCombustivel.DIESEL,
        5, 70);
        Carro suv = new Carro("SUV", TipoCombustivel.GASOLINA, 8,
        TipoCombustivel.FLEX, 55);
        Carro suvFlex = new Carro("SUVFlex", 6, 8,
        65);
        Carro econo = new Carro("Econo", TipoCombustivel.GASOLINA,
        20, 10, 55);

        System.out.println("\n\nTipos de veiculos:");

        System.out.println(basico);
        System.out.println("\nAbastencendo carro basico com gasolina");
        basico.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(basico);
        System.out.println("\nViajando com o carro basico");
        basico.viaja(250);
        basico.viaja(150);
        System.out.println(basico);

        System.out.println("\n\n----------------\n\n");

        System.out.println(esportivo);
        System.out.println("\nAbastencendo carro esportivo com gasolina");
        esportivo.abastece(TipoCombustivel.GASOLINA, 45);
        System.out.println(esportivo);
        System.out.println("\nViajando com o carro esportivo");
        esportivo.viaja(250);
        esportivo.viaja(150);
        System.out.println(esportivo);

        System.out.println("\n\n----------------\n\n");

        System.out.println(utilitario);
        System.out.println("\nAbastencendo carro utilitario com diesel");
        utilitario.abastece(TipoCombustivel.DIESEL, 70);
        System.out.println(utilitario);
        System.out.println("\nViajando com o carro utilitario");
        utilitario.viaja(250);
        utilitario.viaja(150);
        System.out.println(utilitario);

        System.out.println("\n\n----------------\n\n");

        System.out.println(suv);
        System.out.println("\nAbastencendo carro suv com gasolina");
        suv.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(suv);
        System.out.println("\nViajando com o carro suv");
        suv.viaja(250);
        suv.viaja(150);
        System.out.println(suv);

        System.out.println("\n\n----------------\n\n");

        System.out.println(suvFlex);
        System.out.println("\nAbastecendo carro suvFlex com gasolina");
        suvFlex.abastece(TipoCombustivel.GASOLINA, 30);
        System.out.println(suvFlex);
        System.out.println("\nViajando com o carro suvFlex");
        suvFlex.viaja(150);
        System.out.println(suvFlex);
        System.out.println("\nAbastecendo carro suvFlex com alcool");
        suvFlex.abastece(TipoCombustivel.ALCOOL, 40);
        System.out.println(suvFlex);
        System.out.println("\nViajando com o carro suvFlex");
        suvFlex.viaja(200);
        System.out.println(suvFlex);

        System.out.println("\n\n----------------\n\n");

        System.out.println(econo);
        System.out.println("\nAbastecendo carro econo com gasolina");
        econo.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(econo);
        System.out.println("\nViajando com o carro econo");
        econo.viaja(348);
        System.out.println(econo);
        System.out.println("\nAbastecendo carro econo com gasolina");
        econo.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(econo);
        System.out.println("\nViajando com o carro econo");
        econo.viaja(1000);
        System.out.println(econo);
        System.out.println("\nAbastecendo carro econo com gasolina");
        econo.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(econo);
        System.out.println("\nViajando com o carro econo");
        econo.viaja(1000);
        System.out.println(econo);
        System.out.println("\nAbastecendo carro econo com gasolina");
        econo.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(econo);
        System.out.println("\nViajando com o carro econo");
        econo.viaja(1000);
        System.out.println(econo);
        System.out.println("\nAbastecendo carro econo com gasolina");
        econo.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(econo);
        System.out.println("\nViajando com o carro econo");
        econo.viaja(1000);
        System.out.println(econo);
        System.out.println("\nAbastecendo carro econo com gasolina");
        econo.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(econo);
        System.out.println("\nViajando com o carro econo");
        econo.viaja(1000);
        System.out.println(econo);

        System.out.println("\n");
    }
}
