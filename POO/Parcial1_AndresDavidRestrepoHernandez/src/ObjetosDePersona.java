public class ObjetosDePersona {
    public static void main(String[] args) {
        Estudiante Estudiante1 = new Estudiante("Andres David Restrepo Hernandez",24,115,"1037670818","Estudiante");
        Administrativo Administrativo1 = new Administrativo("Pepito Gomez",45,95,"1927319273'1273","Administrativo");
        Profesor Profesor1 = new Profesor("Alexander De Jesus Narvaez Berrio",34,90,"193710237123h","Profesor");

        System.out.println(Estudiante1);
        Estudiante1.desempeñarRol();
        Estudiante1.comer();
        Estudiante1.dormir();

        Administrativo1.desempeñarRol();
        Administrativo1.comer();
        Administrativo1.dormir();

        Profesor1.desempeñarRol();
        Profesor1.comer();
        Profesor1.vidaSecreta();
        Profesor1.dormir();
    }
}