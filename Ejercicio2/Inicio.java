// Universidad del Valle de Guatemala
//Nombre: María José Yee Vidal      Carnet: 231193
//Materia: Programación Orientada a Objetos     Sección: 11
// Descripción: Asignación y reserva de habitaciones de un hotel. (no funciona)

import java.util.Scanner;

public class Inicio{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        String usuario;
        String nombre;
        int visitas;
        int cant;
        int opcion;
        boolean salir = false;
        int[] habitaciones = {0,0,0};
        //String[] ListaEspera()
        // {suite,deluxe,estandar}
       
        //Menu
        while (salir != true){
            System.out.println("Bienvenido al programa del Hotel. Elige lo que deseas hacer:");
            System.out.println("1. Reservar una habitación");
            System.out.println("2. (Empleados) Asignar una habitación");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            
            //Preguntas
            switch (opcion){
                case 1:
                    System.out.println("1.Ingrese su nombre para la reserva: ");
                    nombre = sc.nextLine();
                    System.out.println("2.¿Para cuántas personas es la reserva?");
                    cant = sc.nextLine();
                    System.out.println("3.¿Cuántas veces ha visitado el hotel?");
                    visitas = sc.nextLine();

                    public static visita(String nombre, int cant, int visitas){
                        fprecio = cant * 50
                    }
                    
                    //guardar en 

                    
                case 2:
                //asignacion de habitaciones, clase Asignacion
                    public static Asignacion(String nombre, int cant, int visitas){

                    }
            }
        }
    }
}



