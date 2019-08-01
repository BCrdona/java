package lab1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab1 {

    public static String[] nombre = new String[5];

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner entrada = new Scanner(System.in);
        int op;
        System.out.println("MENU");
        System.out.println("1. VARIABLES Y OPERADORES");
        System.out.println("2. CONDICIONALES");
        System.out.println("3. CICLOS(generar 100 numeros aleatorios)");
        System.out.println("4. ARREGLOS");
        System.out.println("5. FUNCIONES Y PROCEDIMIENTOS(ordenamiento arreglo)");
        op = entrada.nextInt();
        System.out.println(op);
        switch (op) {
            case 1:
                operacion();
                break;
            case 2:
                condicional();
                break;
            case 3:
                ciclos();
                break;
            case 4:
                arreglo();
                break;
            case 5:
                ordenar();
                break;
        }
    }
    
    public static void ordenar(){
        int[] arreglo=new int[10];
        int aux;
        for (int i = 0; i < 5; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR " + (i + 1) + ": "));
        }

            for(int j = 0; j < arreglo.length - 1; j++)
            {
                if (arreglo[j] < arreglo[j + 1])
                {
                   aux = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        
        for(int i = 0;i < arreglo.length; i++)
        {
            System.out.print(arreglo[i]+"\n");
        }
    }
    
    public static void arreglo() {
        for (int i = 0; i < 5; i++) {
            nombre[i] = JOptionPane.showInputDialog("INGRESE EL NOMBRE " + (i + 1) + ": ");
        }
        JOptionPane.showMessageDialog(null, "NOMBRES:\n" + nombre[0] + "\n" + nombre[1] + "\n" + nombre[2] + "\n"
                + nombre[3] + "\n" + nombre[4] + "\n");
    }

    public static void ciclos() {
        int v1, ln = 0;
        String salida = "";
        for (int i = 0; i < 100; i++) {
            ln++;
            v1 = (int) (1 + Math.random() * 600);
            salida += v1 + " ";
            if (ln == 10) {
                salida += "\n";
                ln = 0;
            }

        }
        JOptionPane.showMessageDialog(null, salida);
    }

    public static void condicional() {
        int v1;
        boolean res = false;
        do {
            v1 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN VALOR EN EL RANGO 250-1000"));
            if (v1 > 249 && v1 < 1001) {
                res = true;
            }
            if (res == false) {
                JOptionPane.showMessageDialog(null, "EL VALOR " + v1 + " NO ESTA EN EL RANGO 250-1000");
            } else {
                JOptionPane.showMessageDialog(null, "EL VALOR " + v1 + " SI ESTA EN EL RANGO 250-1000");
            }
        } while (res == false);
        menu();
    }

    public static void operacion() {
        int v1, v2, op;
        v1 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL PRIMER VALOR"));
        v2 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL SEGUNDO VALOR"));
        op = Integer.parseInt(JOptionPane.showInputDialog(" 1. SUMA\n 2. RESTA\n 3. MULTIPLICACION\n 4. DIVICION\n INGRESE OPCION"));
        switch (op) {
            case 1:
                JOptionPane.showMessageDialog(null, "SUMA: " + v1 + "+" + v2 + "=" + (v1 + v2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "RESTA: " + v1 + "-" + v2 + "=" + (v1 - v2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "MULTIPLICACION: " + v1 + "*" + v2 + "=" + (v1 * v2));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "DIVICION: " + v1 + "/" + v2 + "=" + (v1 / v2));
                break;
        }
        menu();
    }

}
