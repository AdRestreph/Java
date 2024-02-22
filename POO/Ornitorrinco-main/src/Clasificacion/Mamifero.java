package Clasificacion;

public class Mamifero {
    //ATRIBUTOS
    private String nombreCientifico;
    private int edad;

    //METODOS
    void amammantar(){
        System.out.println("Amamantando cria");
    }
    //CONSTRUCTOR

    public Mamifero(String nombreCientifico, int edad) {
        this.nombreCientifico = nombreCientifico;
        this.edad = edad;
    }

    protected void salirATierra() {
        System.out.println("Proteger crias..");
    }
}
