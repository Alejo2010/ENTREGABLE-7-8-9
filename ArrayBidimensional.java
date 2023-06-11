public class ArrayBidimensional {
    public void Recorrer(){
        int[][] arrayBidimensional = {
                {1, 2, 3},
                {3, 2, 1}
        };
        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                int elemento = arrayBidimensional[i][j];
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
