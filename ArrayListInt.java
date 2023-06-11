import java.util.ArrayList;
public class ArrayListInt {
    public void EliminarPares(){
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < 11; i ++){
            arrayList.add(i);
        }
        System.out.println("ArrayList original : " + arrayList);

        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) == 0){
                continue;
            }
            if(arrayList.get(i) % 2 == 0){
                arrayList.remove(i);
            }
        }
        System.out.println("ArrayList con impares : " + arrayList);


    }
}
