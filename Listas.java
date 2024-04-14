import java.util.Scanner;
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
        String[] temporal = elementos;
        elementos=new String[elementos.length+1];
        for(int i=0;i<temporal.length;i++){
            elementos[i]=temporal[i];
        }
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
    void modElemento(int pos, String nuevoElemento){
        elementos[pos]=nuevoElemento;
    }

    void borrarElemento(int pos){
        String[] nuevoArreglo = new String[elementos.length-1];
        for(int i=0;i<elementos.length;i++){
            if(i<pos){
                nuevoArreglo[i]=elementos[i];
            }else if(i>pos){
                nuevoArreglo[i-1]=elementos[i];
            }
        }
    }

    void moverElemento(int pos1, int pos2){
        String temporal = elementos[pos1];
        elementos[pos1]=elementos[pos2];
        elementos[pos2]=temporal;
    }
}