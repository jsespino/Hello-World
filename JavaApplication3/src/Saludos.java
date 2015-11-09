 import java.util.*;
 //pequeño programa que permite ingresar un nombre y devuelve un saludo con el nombre ingresado
 public class Saludos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce un nombre: ");
        cadena = sc.nextLine();
        System.out.println("Buenos Días " + cadena +" Chao");
    }
}