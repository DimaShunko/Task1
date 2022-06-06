import java.util.ArrayList;

public class Maven {

    //Пузырьковая сортировка
    public static void BubbleSort(ArrayList<Integer> list){
        int tmp;
        boolean b = true;
        while (b){
            b = false;
            for (int i = 1; i<list.size(); i++){
                if (list.get(i) < list.get(i-1)){
                    tmp = list.get(i);
                    list.set(i, list.get(i-1));
                    list.set(i-1, tmp);

                    b = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(4);
        BubbleSort(list);
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
