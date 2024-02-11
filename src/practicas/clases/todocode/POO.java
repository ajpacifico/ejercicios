package practicas.clases.todocode;

public class POO {

    private static Object mostrarNom;

    public static void main(String[] args) {

        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(40, "antonio", "pacifico");
        Alumno alu3 = new Alumno(56, "maría","pérez");

        System.out.println("OPCION 1 ------------------------------------");
        int id = alu2.getId();
        System.out.println("El id del alumno 2 es: " + id); //OPCION 1--------------------------------------------------

        System.out.println("OPCION 2 ------------------------------------");
        //---------------------------------------ESTA OPCION ES MAS EFICIENTE PORQUE SE HACE EN UNA SOLA LINEA DE CODIGO
        System.out.println("El id del alumno 2 es: " + alu2.getId()); //OPCION 2----------------------------------------
        System.out.println("El id del alumno 3 es: " + alu3.getId() + ", el nombre es: " + alu3.getNombre() + " y el apellido es: " + alu3.getApellido() + ".");

        System.out.println("CARGA DE VARIABLES AL OBJETO VACIO MEDIANTE SETTERS ------------------------------------");
        //AL OBJETO ALU1 NO LE DIMOS VALORES ASI QUE SE LO DAMOS CON LOS SETTERS
        alu1.setId(12);
        alu1.setNombre("juan");
        alu1.setApellido("marcano");

        System.out.println("El id del alumno 1 es: " + alu1.getId() + ", el nombre es: " + alu1.getNombre() + " y el apellido es: " + alu1.getApellido() + ".");

        //AL OBJETO ALU2 LE CAMBIAMOS EL VALOR DEL ID MEDIANTE SU SETTER
        System.out.println("CAMBIO DE VARIABLE DEL Alu2 MEDIANTE SETTERS ------------------------------------");
        alu2.setId(1);
        System.out.println("El id del alumno 2 ahora es: " + alu2.getId());


        System.out.println("IMPLEMENTACION DE LOS METODOS ------------------------------------");
        alu1.saberAprobado(5);
        alu2.saberAprobado(7);
        alu3.saberAprobado(10);

        alu1.mostrarNombre(alu1.getNombre());



    }
}
