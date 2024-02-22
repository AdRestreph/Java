package SegundaGeneracion;

import PrimeraGeneracion.Vampiro;

public class Dracula extends Vampiro {
    private int estatura;
    public Dracula(String nombre, int edad, int estatura) {
        super(nombre, edad);//SE INVOCA EL CONSTRUCTOR DE LA SUPER CLASE
        this.estatura = estatura;//PRIMERO DEBE ESTAR LOS ATRIBUTOS DE LA SUPERCLASE Y LUEGO LOS PROPIOS
    }
    //ATRIBUTOS
    public void hipnotizar(){
        System.out.println("Venga que no es pa eso");
    }

}
