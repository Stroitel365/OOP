package sem_5_hw.model;

import java.util.List;

public class StudentGroup {
     private Teacher teacher;
     List<Student> studentList;
     private Integer groupID;

     public Teacher getTeacher() {
          return teacher;
     }

     public void setTeacher(Teacher teacher) {
          this.teacher = teacher;
     }

     public List<Student> getStudentList() {
          return studentList;
     }

     public void setStudentList(List<Student> studentList) {
          this.studentList = studentList;
     }

     public Integer getGroupID() {
          return groupID;
     }

     public void setGroupID(Integer groupID) {
          this.groupID = groupID;
     }

     @Override
     public String toString() {
          return "StudentGroup [teacher=" + teacher + ", studentList=" + studentList + ", groupID=" + groupID + "]";
     }

}