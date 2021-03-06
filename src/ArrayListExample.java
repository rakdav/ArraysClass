import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample
{
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        //1. add-добавление элемента в коллекцию
        arrayList.add("Vasia");
        arrayList.add(5);
        arrayList.add(178.9);
        arrayList.remove("Vasia");
        System.out.println(arrayList);
        List<Integer> arrInteger=new ArrayList<Integer>();
        arrInteger.add(7);
        arrInteger.add(3);
        arrInteger.add(3);
        arrInteger.add(10);
        System.out.println(arrInteger);
        //2. addAll
        List<Integer> arrInt=new ArrayList<Integer>();
        arrInt.add(45);
        //addAll(int index,Collection ..)-добавление списка
        arrInt.addAll(0,arrInteger);
        System.out.println(arrInt);
        //3. get(int index)-возвращает объект из списка по индексу
        System.out.println(arrInt.get(3));
        //4. indexOf(Object obj)-индекс первого вхождения объекта obj в список. Если не найден возвращает -1
        System.out.println(arrInt.indexOf(3));
        System.out.println(arrInt.indexOf(11));
        //5.lastIndexOf(Object obj)-индекс последнего вхождения объекта obj в список. Если не найден возвращает -1
        System.out.println(arrInt.lastIndexOf(3));
        //6.size()-размер массива
        System.out.println(arrInt.size());
        //7.set(int index,E obj)-присватвает значение объекта obj элементу по индексу index
        arrInt.set(1,56);
        System.out.println(arrInt);
        //8.remove()-удаление элемента по индексу или значению
        arrInt.remove(1);
        System.out.println(arrInt);
        //9. clear()-очистка списка
        arrayList.clear();
        System.out.println(arrayList);
        //перебор с помощью for
        for (int i = 0; i <arrInt.size() ; i++) {
            System.out.print(arrInt.get(i)+" ");
        }
        System.out.println();
        //перебор с помощью foreach
        for (int i:arrInt) {
            System.out.print(i+" ");
        }
        System.out.println();
        //перебор с помощью iterator
        Iterator<Integer> iterator=arrInt.iterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }
        //10.toArray-преобразование в массив
        Object[] mas=arrInt.toArray();
        //11.contains(Object el)-проверка содержится элемент в списке
        if(arrInt.contains(10)) System.out.println("True");
        else System.out.println("False");
        //12.containsAll(Colection c)-проверка содержания коллекции
        if(arrInt.containsAll(arrInteger)) System.out.println("True");
        else System.out.println("False");
        //Collections аналог Arrays для работы с колл
        Collections.sort(arrInt);
        for (int i:arrInt) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(Collections.binarySearch(arrInt,10));
    }
}
