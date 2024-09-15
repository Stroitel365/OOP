package sem_6_hw.view;

import sem_6_hw.data.Student;
import sem_6_hw.data.StudentGroup;

import java.util.List;
import java.util.logging.Logger;

/* 
 * Принцип единственной ответственности (Single Responsibility):
 *  каждый класс или модуль в программе должен иметь только одну причину для изменения.
 * 
 *  StudentView отвечает  за вывод в консоль класса Студент и ГруппаСтудентов. 
 * Этот код стоит разбить на 2 разных вывода в консоль для соблюдения этого принципа.
 *  
 */

public class StudentView implements UserView<Student>{

    Logger logger = Logger.getLogger(StudentView.class.getName());

    @Override
    public void sendOnConsole(List<Student> students) {
        for(Student user: students){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

}
