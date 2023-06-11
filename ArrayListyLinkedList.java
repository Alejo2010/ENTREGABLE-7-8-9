import java.util.ArrayList;
import java.util.LinkedList;
public class ArrayListyLinkedList {
    public void pasarDatos(){
        ArrayList<String> arrayStrings = new ArrayList<>();
        arrayStrings.add("Hola");
        arrayStrings.add("Konishiwua");
        arrayStrings.add("Hello");
        arrayStrings.add("Bonjour");

        LinkedList<String> listaStrings = new LinkedList<>();

        for(String palabra : arrayStrings){
            listaStrings.add(palabra);
        }

        for(String array : arrayStrings){
            System.out.println("Recorriendo Array list : " + array);
            System.out.println();
        }

        for(String list : listaStrings){
            System.out.println("Recorriend Linked list : " + list);
            System.out.println();
        }
    }
}
