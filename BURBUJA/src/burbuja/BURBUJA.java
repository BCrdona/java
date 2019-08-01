package burbuja;

public class BURBUJA {

    public static void main(String[] args) {
        int[] arreglo = new int[30];
        int a = 0;
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (1 + Math.random() * 1000);
            a++;
            System.out.print(" " + arreglo[i]);
            if (a == 6) {
                System.out.println(" ");
                a = 0;
            }
        }
        burbuja(arreglo);
        System.out.println(" ");
        System.out.println("ordenado");
        System.out.println(" ");
        a=0;
        for (int i = 0; i < arreglo.length ; i++) {
            System.out.print(" " + arreglo[i]);
            a++;
            if (a == 6) {
                System.out.println(" ");
                a = 0;
            }
        }
    }

    static void burbuja(int arreglo[]) {
        boolean cambio;
        int aux;
        do {
            cambio = false;
            //i llega hasta el tamaño del arreglo            
            for (int i = 0; i < arreglo.length-1; i++) {
                //compara si el arreglo dela derecha es mayor al de la izquierda
                if (arreglo[i] > arreglo[i + 1]) {
                    //a la variable auxiliar se le da el valor de la izquierda
                    aux = arreglo[i];
                    //a la variable de la izquierda se le da el valor de la derecha
                    arreglo[i] = arreglo[i +1];
                    arreglo[i+1] = aux;
                    /*a la variable derecha se le da el valor de auxiliar
                       * (la que estaba en la derecha)
                    */
                    cambio = true;
                }
            }
        } while (cambio);
    }
}
