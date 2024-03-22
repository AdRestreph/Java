import Terrestres.*;
import Voladores.PatoFactory;
import Voladores.Volador;

public class Main {
    public static void main(String[] args) {

        HumanoFactory creador = new HumanoFactory();
        PatoFactory creador1 = new PatoFactory();
        PerroFactory creador2 = new PerroFactory();

        SeresVivos perro1 = creador2.crearSeresVivos();
        SeresVivos pato1 = creador1.crearSeresVivos();
        SeresVivos humano1 = creador.crearSeresVivos();


        ((Volador) humano1).volar();
        ((Volador) humano1).planear();
        ((Terrestre) humano1).caminar();

        ((Terrestre) perro1).caminar();
        perro1.reproducirse();

        ((Volador) pato1).volar();
        ((Volador) pato1).planear();
        ((Volador) pato1).caerEnPicada();
    }
}