import java.util.Arrays;
import java.util.Random;

public class MainClass
{
    public static void main(String[] args) {
        Integer[] a=new Integer[10];
        Arrays.fill(a,4);
        for (int i:a) {
            System.out.print(i+" ");
        }
        System.out.println();
        Arrays.fill(a,3,a.length,5);
        for (int i:a) {
            System.out.print(i+" ");
        }
        System.out.println();
        Random rnd=new Random();
        for(int i=0;i<a.length;i++)
        {
            a[i]=rnd.nextInt(90)+10;
            System.out.print(a[i]+" ");
        }
        System.out.println();
//        Arrays.sort(a);
//        for (int i:a) {
//            System.out.print(i+" ");
//        }
        Arrays.sort(a,a.length/2,a.length);
        for (int i:a) {
            System.out.print(i+" ");
        }
        System.out.println();
        Comp comp=new Comp();
        Arrays.sort(a,comp);
        for (int i:a) {
            System.out.print(i+" ");
        }
        System.out.println();
        Person[] p=new Person[4];
        p[0]=new Person("Vasia",34,67,167);
        p[1]=new Person("Boria",23,89,190);
        p[2]=new Person("Vlad",67,78,186);
        p[3]=new Person("Andrey",23,89,190);
//        Arrays.sort(p,new PersonNameComporartor());
//        for (Person i:p) {
//            System.out.print(i.getName()+" ");
//        }
        System.out.println();
        Arrays.sort(p,new PersonAgeComporator().thenComparing(new PersonNameComporartor()));
        for (Person i:p) {
            System.out.println(i.getName()+" "+i.getAge());
        }
        Arrays.sort(a);
        for (int i:a) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(a,56));
        Integer[] b=new Integer[10];
        for(int i=0;i<b.length;i++)
        {
            b[i]=rnd.nextInt(90)+10;
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.equals(a,b));
    }
}
