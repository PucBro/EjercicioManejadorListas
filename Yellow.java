import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Yellow {

    public static void main(String[] args) {
        
        Map<String, Listas> listasMap = new HashMap<>();
        Scanner sc =new Scanner(System.in);
        Boolean permanecer=true;
        Listas nombresListas=new Listas();

        while(permanecer){

        System.out.println("Menú Principal: ");
        System.out.println("1. Crear una lista");
        System.out.println("2. Ver listas");
        System.out.println("3. Modificar lista");
        System.out.println("4. Salir ");
        System.out.print("Elija la opcion que desee ingresando el numero correspondiente de la opción: ");
        String opcion=sc.nextLine();
            
                switch(opcion){
                    case "1":
                        System.out.print("Ingrese el nombre de la lista ");
                        String nombre =sc.nextLine();
                        switch (nombre){
                            case "exit":
                                break;
                            default:    
                                nombresListas.add(nombre);
                                Listas nuevaLista=new Listas();
                                System.out.print("Ingrese el tamaño de la lista: ");
                                int tamaño = Integer.parseInt(sc.nextLine());//Esto se hace asi porque con nextInt hay un pequeño bug con un salto de linea 
                                nuevaLista.create(tamaño);
                                listasMap.put(nombre, nuevaLista);
                        }
                        break;
                    case "2":
                        System.out.println("Lista de listas ingrese el numero de la lista que desea ver o escriba exit para volver al menú principal: ");
                        nombresListas.getNombresListas(nombresListas);
                        String listaElegida=sc.nextLine();
                        switch(listaElegida){
                            case "exit":
                                break; 
                            default:
                                int listaElegidaInt=Integer.parseInt(listaElegida); 

                                listaElegida=nombresListas.get(listaElegidaInt); //Se saca el nombre de la lista elegida

                                Listas listaMostrada=listasMap.get(listaElegida);// Se saca la lista elegida

                                listaMostrada.getNombresListas(listaMostrada);// Muestra todos los elementos de la lista al usuario

                                System.out.println("Presione enter para continuar");
                                sc.nextLine();
                        }
                        break;

                    case "3":
                        System.out.println("ingrese el numero de la lista que desea modificar o escriba exit para volver al menú principal: ");
                        nombresListas.getNombresListas(nombresListas);
                        String listaElegida1=sc.nextLine();

                        switch(listaElegida1){
                            case "exit":
                                break; 
                            default:
                                //Nota hay un bug si el usuario no ingresa un numero
                                int listaElegida1Int=Integer.parseInt(listaElegida1);//Se convierte el numero de la lista elegida a un entero

                                //falta validar que el numero de la lista elegida sea valido pues si no se cae el programa
                                listaElegida1=nombresListas.get(listaElegida1Int); //Se saca el nombre de la lista elegida

                                Listas listaMostrada1=listasMap.get(listaElegida1); //Se saca la lista elegida

                                //Vamos a hacer un bucle para que puedan quedarse todo el tiempo que quieran modificando la lista
                                Boolean permanecer1=true;


                                while(permanecer1){

                                        System.out.println("Seleccione que quiere hacer con la lista: ");
                                        System.out.println("1. Agregar un elemento");
                                        System.out.println("2. Modificar un elemento");
                                        System.out.println("3. Eliminar un elemento");
                                        System.out.println("4. Mover un elemento"); 
                                        System.out.println("5. Salir al menu principal");
                                        String opcion1=sc.nextLine();
                                        switch(opcion1){
                                            case "1":
                                                System.out.println("Ingrese el elemento que desea agregar: ");
                                                String elementoAgregado=sc.nextLine();
                                                listaMostrada1.add(elementoAgregado);
                                                break;
                                            case "2":
                                                listaMostrada1.getNombresListas(listaMostrada1);
                                                System.out.println("Ingrese el numero del elemento que desea modificar: ");
                                                int modificado = Integer.parseInt(sc.nextLine());
                                                System.out.println("Ingrese el nuevo elemento: ");
                                                String nuevoElemento=sc.nextLine();
                                                listaMostrada1.modElemento(modificado, nuevoElemento);
                                                break;
                                            case "3":
                                                listaMostrada1.getNombresListas(listaMostrada1);
                                                System.out.println("Ingrese el numero del elemento que desea eliminar: ");
                                                int eliminado = Integer.parseInt(sc.nextLine());
                                                listaMostrada1.borrarElemento(eliminado);
                                                break;
                                            case "4":
                                                listaMostrada1.getNombresListas(listaMostrada1);
                                                System.out.println("Ingrese el numero del elemento que desea mover: ");
                                                int mover1 = Integer.parseInt(sc.nextLine());
                                                System.out.println("Ingrese el numero de la posición a la que desea mover el elemento: ");
                                                int mover2 = Integer.parseInt(sc.nextLine());
                                                listaMostrada1.moverElemento(mover1, mover2);
                                                break;
                                            case "5":
                                                permanecer1=false;
                                                break;
                                            default:
                                                System.out.println("Opción no valida, las opciones validas son 1, 2, 3, 4 y 5");
                                                break;
                                        }
                                }
                        }
                        break;
                    case "4":
                        System.out.println("Gracias por usar el programa");
                        permanecer=false;
                        break;
                    default:
                        System.out.println("Opción no valida, las opciones validas son 1, 2, 3 y 4");
                        break;
        }
    


    }

    }
    
}
