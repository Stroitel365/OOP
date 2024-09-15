package sem_6_hw.data;

import java.util.Comparator;

/* 
 * 
 * Принцип подстановки Барбары Лисков (Liskov Substitution): 
 * объекты в программе должны быть заменяемыми на экземпляры 
 * их подтипов без изменения корректности программы.
 * 
 * 
 *  Компаратор может работать с любым классом ниже по иерархии с User
 */

public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0) {
                return o1.getPatronymic().compareTo(o2.getPatronymic());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}
