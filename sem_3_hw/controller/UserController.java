package sem_3_hw.controller;

import sem_3_hw.data.Streams;
import sem_3_hw.data.Student;
import sem_3_hw.data.Teacher;
import sem_3_hw.data.User;
import sem_3_hw.service.DataService;
import sem_3_hw.service.StreamService;
import sem_3_hw.service.StudentGroupService;
import sem_3_hw.view.UserView;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

public class UserController {

    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final UserView userView = new UserView();
    private final StreamService streamService = new StreamService();

    public void createStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        List<User> userList = dataService.getAll();
        userView.sendOnConsole(userList);
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
    }

    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    }

    public List<Student> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();
    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
        return studentGroupService.getSortedByFIOStudentGroup();
    }

    public List<Streams> getSortedStreams(List<Streams> streams){
        return streamService.sortStreamsBySize(streams);
    }
}
