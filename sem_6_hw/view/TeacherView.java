package sem_6_hw.view;

import java.util.List;

import sem_6_hw.data.Teacher;

/* 
 * Принцип единственной ответственности (Single Responsibility):
 *  каждый класс или модуль в программе должен иметь только одну причину для изменения.
 * 
 * Например, TeacherView отвечает только за вывод в консоль класса Учитель
 *  
 */

public class TeacherView implements UserView<Teacher>{
    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
    }
}
