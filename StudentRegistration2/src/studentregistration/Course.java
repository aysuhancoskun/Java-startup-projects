package studentregistration;
/**
 *
 * @author aysuhan
 */
import java.util.ArrayList;


public class Course {

    public String name;
    public String code;

    ArrayList<RegularStudent> bachelorCourse = new ArrayList<>();

    ArrayList<GraduateStudent> mastersCourse = new ArrayList<>();

    ArrayList<SpecialStudent> specialCourse = new ArrayList<>();

    ArrayList<Student> otherCourse = new ArrayList<>();

    ArrayList<Course> courseList = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public ArrayList<RegularStudent> getBachelorCourse() {
        return bachelorCourse;
    }

    public void setBachelorCourse(ArrayList<RegularStudent> bachelorCourse) {
        this.bachelorCourse = bachelorCourse;
    }

    public ArrayList<GraduateStudent> getMastersCourse() {
        return mastersCourse;
    }

    public void setMastersCourse(ArrayList<GraduateStudent> mastersCourse) {
        this.mastersCourse = mastersCourse;
    }

    public ArrayList<SpecialStudent> getSpecialCourse() {
        return specialCourse;
    }

    public void setSpecialCourse(ArrayList<SpecialStudent> specialCourse) {
        this.specialCourse = specialCourse;
    }

    public ArrayList<Student> getOtherCourse() {
        return otherCourse;
    }

    public void setOtherCourse(ArrayList<Student> otherCourse) {
        this.otherCourse = otherCourse;
    }
}
