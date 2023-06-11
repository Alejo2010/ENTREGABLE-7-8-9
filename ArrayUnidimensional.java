public class ArrayUnidimensional {
    public void Recorrer(){
        String[] arrayStrings = new String[3];
        arrayStrings[0] = "Hola";
        arrayStrings[1] = "Bonjour";
        arrayStrings[2] = "Hello";

        for(int i = 0; i < arrayStrings.length; i ++){
            System.out.println(arrayStrings[i]);
        }
    }
}
