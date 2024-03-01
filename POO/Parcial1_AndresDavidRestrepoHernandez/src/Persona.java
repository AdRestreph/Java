public abstract class Persona {
    //ATRIBUTOS
    private String nombreCompleto;
    private int edad;
    private float peso;
    private String identificacion;
    private String rol;

    //SETTERS Y GETTERS

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    //CONSTRUCTOR
    //CONSTRUCTOR PERSONALIZADO
    public Persona(String nombreCompleto, int edad, float peso, String identificacion, String rol) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.peso = peso;
        this.identificacion = identificacion;
        this.rol = rol;
    }

    //METODOS
    //Aca se crea un metodo abstracto (Sin cuerpo) para la utilizacion del polimorfismo en las clases que van a Heredar de esta superclase.
    public abstract void desempeñarRol();
    public void comer(){
        System.out.println("Momento del dia para comer.");
    }
    public void dormir(){
        System.out.println("Momento del dia para ir a dormir... ZzZ..");
    }

}
