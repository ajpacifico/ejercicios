package practicas.clases.ironhack.lab1_04;

public class Main {

    public static void main(String []args){

        //1. Write a method in Java to get the difference between the largest and smallest values in an array of integers.
        //The length of the array must be 1 and above -------------------------------------------------------------------

        /*int[] array = {10, 20, 5, 80, 7, 30, 4};

        int numMenorArray = difNumArray(array);

        System.out.println("La diferencia entre el número menor y mayor del array es : " + numMenorArray + ".");
        */

        //2. Resolver esta ecuacion x2 (4y75 - x)2 -------------------------------------------------------------------

        /*double x = 2;
        double y = 3;

        double resultadoFinal=ecuacion(x,y);
        System.out.println(resultadoFinal);
        */
    }




        //1. Método del ejercicio 1 ------------------------------------------------------------------------

     /* public static int difNumArray(int[]array){
        int mayor = array[0];
        int menor = array[0];
        int resultado = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor)
            {
                mayor = array[i];
            }
        }

        for (int i = 1; i < array.length; i++)
        {
            if (array[i] < menor)
            {
                menor = array[i];
            }
        }
        resultado = mayor - menor;
        return resultado;
    }
    */

    //2. Método del ejercicio 2-----------------------------------------------------------------

     /* public static double ecuacion(double x, double y){

        double elevado = Math.pow(x, 2);
        double parentesis = (4 * y)/5 - 2;
        double parentesisElevado = Math.pow(parentesis, 2);
        double resultFinal = elevado + parentesisElevado;

        return resultFinal;
    }
    */

}
