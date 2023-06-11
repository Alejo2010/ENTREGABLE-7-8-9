import java.util.Vector;
public class Vectores {
    public void VectorPrueba(){
        Vector<String> Vector1 = new Vector<>();
        Vector1.add("Hola");
        Vector1.add("Hello");
        Vector1.add("Konishiwua");
        Vector1.add("Riza");
        Vector1.add("Bonjour");
        System.out.println("Vector original : " + Vector1);

        Vector1.remove(2);
        Vector1.remove(1);
        System.out.println("Vector actual : "+ Vector1);
    }
}
