import java.util.ArrayList;

public class ArrayListFile {
    public static void main(String args[]){
        ArrayList list = new ArrayList<>();
        list.add("Rohit");
        list.add("zemoso");
        list.add(1);
        list.add('R');



        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}