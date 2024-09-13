package sem_4_hw.view;

import java.util.List;

import sem_4_hw.data.Teacher;

public class TeacherView implements UserView<Teacher>{
    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
    }
}
