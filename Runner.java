import com.ds.ArrayList;

public class Runner {

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        System.out.println("CurrentCapacity "+arr.currentCapacity());
        for(int i=0;i<10;i++){
            arr.add(i);
        }

        arr.add("test");
        arr.remove(9);

        for(int i=0;i<arr.size();i++) {
            System.out.println(arr.get(i));
        }

        System.out.println("CurrentCapacity "+arr.currentCapacity());
        System.out.println("isEmpty "+arr.isEmpty());
        System.out.println("size "+arr.size());
    }

}
