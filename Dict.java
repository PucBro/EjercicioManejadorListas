//Esta clase sirve para guardar dinamicamente las listas que se crean en el programa, para que puedan ser accedidas en cualquier momento

class Dict {

    Listas listaMostrada []= new Listas[0];
    String listaElegida[]=new String[0];

    void addLista(String nombre, Listas nuevaLista){
        String[] temporal = listaElegida;
        Listas[] temporal2 = listaMostrada;
        listaElegida=new String[listaElegida.length+1];
        listaMostrada=new Listas[listaMostrada.length+1];
        for(int i=0;i<temporal.length;i++){
            listaElegida[i]=temporal[i];
            listaMostrada[i]=temporal2[i];
        }
        listaElegida[listaElegida.length-1]=nombre;
        listaMostrada[listaMostrada.length-1]=nuevaLista;
    }

    Listas getLista(String nombre){
        for(int i=0;i<listaElegida.length;i++){
            if(listaElegida[i].equals(nombre)){
                return listaMostrada[i];
            }
        }
        return null;
    }
    
}
