public class CadenaAlreves {
    public void Alreves(){
        String Palabra = "Hola Juan";
        String PalabraInversa = "";
        int Cantidad = Palabra.length();

        for(int i = Cantidad - 1 ; i >= 0; i --){
            PalabraInversa = PalabraInversa + Palabra.charAt(i);
        }
        System.out.println(PalabraInversa);
    }
}
