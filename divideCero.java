public class divideCero {
    public void Division(int numeroA, int numeroB) throws ArithmeticException{
        try{
            int r = numeroA / numeroB;
        }catch(ArithmeticException e){
            System.out.println("En division no se acepta el numero 0.");
        }finally {
            System.out.println("Demo codigo");
        }

        if(numeroA == 0 || numeroB == 0){
            throw new ArithmeticException();
        }
    }
}
