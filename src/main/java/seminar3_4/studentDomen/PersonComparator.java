package seminar3_4.studentDomen;

import java.util.Comparator;

public class PersonComparator <T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        int resultComparing=o1.getName().compareTo(o2.getName());
        if(resultComparing==0){
            resultComparing=o1.getSurname().compareTo(o2.getSurname());
            return resultComparing;
        }else {
            return resultComparing;
        }
    }
}
