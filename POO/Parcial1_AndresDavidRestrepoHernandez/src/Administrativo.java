public class Administrativo extends Persona{
    //Aca se crea un contructor primero de una superclase ya que profesor extiende de persona
    public Administrativo(String nombreCompleto, int edad, float peso, String identificacion, String rol) {
        super(nombreCompleto, edad, peso, identificacion, rol);
    }
    //Polimorfismo
    //Aca se realiza la utilizacion de polimorfismo sobreescribiendo el metodo desempeñar rol, para que cada persona tenga una tarea diferente que realizar dependiendo del rol
    @Override
    public void desempeñarRol() {
        System.out.println("Hacer cosas de administrativo. . . ");
    }
}
