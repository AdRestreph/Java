package Terrestres;

// Definición de la clase HumanoCreador
public class HumanoFactory extends CreadorDeSeresVivos {

    @Override
    public SeresVivos crearSeresVivos() {
        return new Humano();
    }
}
