package sem_6_hw.view;

import sem_6_hw.data.User;

import java.util.List;

/* Принцип инверсии зависимостей (Dependency Inversion).
 Зависимости внутри системы должны строиться на основе абстракций, а не деталей.


 Как этот интерфейс не зависит от других элементов системы
 */

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
