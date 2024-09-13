package sem_5_hw.controller;

import java.util.ArrayList;
import java.util.List;

import sem_5_hw.model.Student;
import sem_5_hw.model.StudentGroup;
import sem_5_hw.model.Teacher;
import sem_5_hw.model.Type;
import sem_5_hw.model.User;
import sem_5_hw.service.DataService;
import sem_5_hw.service.StudentGroupService;
import sem_5_hw.view.StudentView;

public class Controller {

    private final DataService service = new DataService();
    private final StudentView view = new StudentView();

    public void createStudent(String firstName, String secondName, String middleName) {
        service.create(firstName, secondName, middleName, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            Student student = (Student) user;
            view.printOnConsole(student);
        }
    }

    public void createStudentGroup(Integer teacherId, List<Integer> studentIdList) {
        Teacher teacher = (Teacher) DataService.getUserByID(Type.TEACHER, teacherId);
        List<Student> studentList = new ArrayList<>();
        for (Integer id : studentIdList) {
            studentList.add((Student) DataService.getUserByID(Type.STUDENT, id));
        }
        StudentGroupService.createGroup(teacher, studentList);
    }
}