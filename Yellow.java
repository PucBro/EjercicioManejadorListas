import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Listas{

    String[] elementos=new String[0];
    Scanner sc =new Scanner(System.in);



    void create(int tamaño){
        elementos=new String[tamaño];
        for(int i=0;i<tamaño;i++){
            System.out.println("Ingrese el elemento "+ i +": ");
            elementos[i]=sc.nextLine();
        }
    }

    void add(String elementoAgregado){
        elementos=new String[elementos.length+1];
        elementos[elementos.length-1]=elementoAgregado;
    }

    String get(int pos){
        return elementos[pos];
    }

    void setNombresListas(String elementoAgregado, Listas arreglo){
        arreglo.add(elementoAgregado);
    }

    void getNombresListas(Listas arreglo){
        for(int i=0;i< elementos.length;i++){
            System.out.println(i+ "."+ " "+ arreglo.get(i));
        }
    }
}

public class Yellow {

    public static void main(String[] args) {
        
        Map<String, Listas> listasMap = new HashMap<>();
        Scanner sc =new Scanner(System.in);
        Boolean permanecer=true;
        Listas nombresListas=new Listas();

        while(permanecer){

        System.out.println("Elija la opcion que desee ingresando el numero correspondiente de la opción: ");
        System.out.println("1. Crear una lista");
        System.out.println("2. Ver listas");
        System.out.println("3. Modificar lista");
        System.out.println("4. Salir ");
        String opcion=sc.nextLine();
            
                switch(opcion){
                    case "1":
                        System.out.println("Ingrese el nombre de la lista o escriba exit para volver al menú principal: ");
                        String nombre =sc.nextLine();
                        if (nombre!="exit"){
                            nombresListas.add(nombre);
                            Listas nuevaLista=new Listas();
                            System.out.println("Ingrese el tamaño de la lista: ");
                            int tamaño = Integer.parseInt(sc.nextLine());//Esto se hace asi porque con nextInt hay un pequeño bug con un salto de linea 
                            nuevaLista.create(tamaño);
                            listasMap.put(nombre, nuevaLista);
                        }
                        break;
                    case "2":
                        System.out.println("Lista de listas ingrese el numero de la lista que desea ver o escriba exit para volver al menú principal: ");

                        
                        break;
                    case "3":
                        System.out.println("Lista de listas ingrese el numero de la lista que desea modificar o escriba exit para volver al menú principal: ");
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
