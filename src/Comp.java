import java.util.Comparator;

public class Comp implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        int m1=o1%10;
        int m2=o2%10;
        if(m1<m2) return -1;
        else if(m1>m2) return 1;
        else return 0;
    }

}
