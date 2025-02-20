import java.util.*;
public class Roatate{
    public static<T>void rotate(List<T> list , int pos){
        if(pos<0 || pos>=list.size()){
            System.out.println("invalid position");
            return;
        }
        else{
            Collections.rotate(list,-pos);
    }
}
    public static void main(String[] args) {
        List<Integer> num= new ArrayList<>(Arrays.asList(10,20,30,40,50));
        rotate(num,2);
        System.out.println(num);
    
}
    }
