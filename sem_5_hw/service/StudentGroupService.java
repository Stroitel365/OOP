package sem_5_hw.service;

import java.util.List;

import sem_5_hw.model.Student;
import sem_5_hw.model.StudentGroup;
import sem_5_hw.model.Teacher;

public class StudentGroupService {
    private final StudentGroup studentGroup = new StudentGroup();
    Integer groupID = 0;

    public void createGroup(Teacher teacher, List<Student> studentList){
        studentGroup.setGroupID(++groupID);
        studentGroup.setTeacher(teacher);
        studentGroup.setStudentList(studentList);
    }
    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
}
