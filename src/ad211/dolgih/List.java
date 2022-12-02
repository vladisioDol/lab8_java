package ad211.dolgih;

import java.util.*;

public class List<T extends Number>{
    private LinkedList<T> list;

    public void setList(LinkedList<T> list) {
        this.list = list;
    }

    public LinkedList<T> getList() {
        return list;
    }

    public LinkedList<T> generateItems(LinkedList<T> list, int size){
        LinkedList<Number> list1 = new LinkedList<Number>();

        for(int i=0;i<size;i++){
            list1.add((int) (1+Math.random()*10));
        }
        list.addAll((Collection<? extends T>) list1);
        return list;

    }

    public LinkedList<Number> intersection(LinkedList<Number> list1,LinkedList<Number> list2){
        LinkedList<Number> result = new LinkedList<Number>();
        for(int i=0;i<list1.size();i++){
            for (int j=0;j<list2.size();j++){
                if(list1.get(i)==list2.get(j))
                    result.add(list1.get(i));
                result.sort(null);
            }
        }
        HashSet set = new HashSet(result);
        result.clear();
        result.addAll(set);
        return  result;
    }

}
