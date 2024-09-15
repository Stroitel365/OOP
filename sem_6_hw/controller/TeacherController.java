package sem_6_hw.controller;

import java.time.LocalDate;
import java.util.List;

import sem_4_hw.data.Teacher;
import sem_4_hw.service.TeacherService;
import sem_4_hw.view.TeacherView;

public class TeacherController implements UserController<Teacher>{

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();


    @Override
    public void create(String secondName, String firstName, String patronymic, LocalDate dateOfBirth) {
        teacherService.create(secondName,firstName,patronymic,dateOfBirth);
    }
    public void editTeacher(Integer teacherId, String surname,String firstname, String patronymic){
        teacherService.editTeacher(teacherId,surname,firstname,patronymic);
    }
    public void initTeacherList(List<Teacher> list){
        teacherService.initData(list);
    }
    public void printTeachers(){
        teacherView.sendOnConsole(teacherService.getAll());
    }

}