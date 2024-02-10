package practicas.clases.logica;

public class Alumno { //creacion clase alumno----------------------------------------------------

    int id;
    String nombre;
    String apellido;

    public Alumno() { //creacion constructor vacio----------------------------------------------------
    }

    public Alumno(int id, String nombre, String apellido) { //creacion constructor con variables----------------------------------------------------
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void mostrarNombre() { //creacion de metodos para clase alumno-------------------------------------

        System.out.println("Soy un alumno y se decir mi nombre");
    }
    public void saberAprobado (double calificacion){

            if (calificacion >=6){
                System.out.println("Alumno esta aprobado");
            }
            else {
                System.out.println("Alumno esta suspendido");
            }
    }











}
