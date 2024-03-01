public class Profesor extends Persona{
    //Aca se crea un contructor primero de una superclase ya que profesor extiende de persona
    public Profesor(String nombreCompleto, int edad, float peso, String identificacion, String rol) {
        super(nombreCompleto, edad, peso, identificacion, rol);
    }
    //POLIMORFISMO
    //Aca se realiza la utilizacion de polimorfismo sobreescribiendo el metodo desempeñar rol, para que cada persona tenga una tarea diferente que realizar dependiendo del rol
    @Override
    public void desempeñarRol() {
        System.out.println("Calificando examenes Buaja ja aj");
    }

    public void vidaSecreta(){
        System.out.println("Superman por las noches. . .");
    }

}
