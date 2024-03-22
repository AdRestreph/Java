package Voladores;

import Terrestres.CreadorDeSeresVivos;
import Terrestres.SeresVivos;

public class PatoFactory extends CreadorDeSeresVivos {
    @Override
    public SeresVivos crearSeresVivos() {
        return new Pato();
    }
}
