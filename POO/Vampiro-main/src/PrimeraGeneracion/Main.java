package PrimeraGeneracion;

import PrimeraGeneracion.Murcielago;
import PrimeraGeneracion.Vampiro;
import SegundaGeneracion.Dracula;

public class Main {
    public static void main(String[] args) {
        Dracula vamp1 = new Dracula("Vladimir",200,190);
        vamp1.morder();//HEREDADO DE VAMPIRO
        vamp1.chuparSangre();//HEREDADO DE VAMPIRO
        vamp1.volar();//HEREDADO DE VAMPIRO -> MURCIELAGO
        vamp1.comerFrutas();//HEREDADO DE VAMPIRO -> MURCIELAGO
        vamp1.dormirDeCabeza();//HEREDADO DE VAMPIRO -> MURCIELAGO
        vamp1.amamantar();//HEREDADO DE VAMPIRO -> MURCIELAGO -> MAMIFERO
        Murcielago.hacerGuano();//METODO ESTATICO
        vamp1.hacerChichi();//METODO DEFAULT -> MURCIELAGO

        Vampiro vamp2 = new Vampiro("Rosher",1000);
        vamp2.morder();

        vamp1.hipnotizar();
        vamp1.aguantarSol();

    }
}