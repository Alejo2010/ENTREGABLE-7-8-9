import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //Palabra Inversa
        CadenaAlreves cadenaAlreves = new CadenaAlreves();
        cadenaAlreves.Alreves();
        System.out.println();

        //Array Unidimensional
        ArrayUnidimensional arrayUnidimensional = new ArrayUnidimensional();
        arrayUnidimensional.Recorrer();
        System.out.println();

        //Array Bidimensional
        ArrayBidimensional arrayBidimensional = new ArrayBidimensional();
        arrayBidimensional.Recorrer();
        System.out.println();

        //Vector
        Vectores vectores = new Vectores();
        vectores.VectorPrueba();
        System.out.println();
        /* El problema de tener vectores es que cuando se duplica el vector, puede llegar a gastar
        * muchisima memoria y afecta la velocidad de la aplicacion, siendo un problema grave si
        * llega a ocurrir.*/

        //ArrayList y Linked list
        ArrayListyLinkedList arrayListyLinkedList = new ArrayListyLinkedList();
        arrayListyLinkedList.pasarDatos();
        System.out.println();

        //ArrayList Int
        ArrayListInt arrayListInt = new ArrayListInt();
        arrayListInt.EliminarPares();
        System.out.println();

        //DivideCero
        int numeroA = 10;
        int numeroB = 0;
        try {
            int resultado = numeroA / numeroB;
            System.out.println("El resultado es : " + resultado);
        }catch(ArithmeticException e){
            System.out.println("En division no se puede usar el numero 0.");
        }finally {
            System.out.println("Demo Codigo");
        }
        System.out.println();

        //fileLn y fileOut
        fileLnfileOut fileLnfileOut = new fileLnfileOut();
        try {
            fileLnfileOut.Ficheros("archivo_origen.txt", "archivo_destino.txt");
        } catch (IOException e) {
            System.out.println("Error al copiar el archivo: " + e.getMessage());
        }
        System.out.println();
    }
}
