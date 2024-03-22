package Terrestres;

public class PerroFactory extends CreadorDeSeresVivos{
    @Override
    public SeresVivos crearSeresVivos() {
        return new Perro();
    }
}
