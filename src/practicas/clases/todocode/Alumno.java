package practicas.clases.todocode;

public class Alumno { //creacion clase alumno---------------------------------------------------------------------------

    int id;
    String nombre;
    String apellido;

    public Alumno() { //creacion constructor vacio----------------------------------------------------------------------
    }

    public Alumno(int id, String nombre, String apellido) { //creacion constructor con variables------------------------
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    // GETTERS Y SETTER VAN DESPUES DEL CONSTRUCTOR Y ANTES DE LOS METODOS----------------------------------------------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void mostrarNombre(String nombre) { //creacion de metodos para clase alumno-----------------------------------------------

        System.out.println("Mi nombre es " + nombre);
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
