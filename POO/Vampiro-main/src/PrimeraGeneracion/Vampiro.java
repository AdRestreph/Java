package PrimeraGeneracion;

public class Vampiro implements Murcielago {
    //ATRIBUTOS
    private String nombre;
    private int edad;

    //CONSTRUCTOR
    public Vampiro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //METODOS
    public void morder(){
        System.out.println("Vampiro mordiendo...");
    }
    public void chuparSangre(){
        System.out.println("Vampiro alimentandose...");
    }

    @Override
    public void volar() {
        System.out.println("Volando con ecolocalizacion...");
    }

    @Override
    public void comerFrutas() {

    }

    @Override
    public void dormirDeCabeza() {

    }

    @Override
    public void amamantar() {

    }

    protected void aguantarSol() {
        System.out.println("No asara pa'..");
    }
}
