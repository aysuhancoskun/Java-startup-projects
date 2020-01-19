package studentregistration;
/**
 *
 * @author aysuhan
 */
import java.util.Scanner;
public class StudentRegistration {

    public static void main(String[] args) {
        boolean exit = false;

        Course c2 = new Course();

        do {
            RegularStudent s = new RegularStudent();
            GraduateStudent g = new GraduateStudent();
            SpecialStudent ss = new SpecialStudent();
            Student os = new Student();
            Course c1 = new Course();

            System.out.println("1.Add new course");
            System.out.println("2.Add new student for course");
            System.out.println("3.Display students of a course");
            System.out.println("4.Exit");
            Scanner sc1 = new Scanner(System.in);
            int choice = sc1.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Course name :");
                    Scanner scanner = new Scanner(System.in);
                    String name = scanner.nextLine();
                    c1.setName(name);
                    System.out.println("Course code :");
                    Scanner scanner2 = new Scanner(System.in);
                    String code = scanner2.nextLine();
                    if (code.length() == 3) { //does not allow user to enter different than 3 digits for course code
                        c1.setCode(code);
                    } else {
                        System.out.println("Please enter code 3 digits.");
                        break;
                    }
                    if (c2.getCourseList().size() <= 10) {
                        c2.courseList.add(c1);
                    } else {
                        System.out.println("You exceeded the value of 10");
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Enter code of course you wanted to add student in :");
                    Scanner scanner3 = new Scanner(System.in);
                    String codeofCourse = scanner3.nextLine();
                    if (c2.getCourseList().size() != 0) {
                        for (Course crs : c2.getCourseList()) {
                            System.out.println("get code:" + crs.getCode());
                            if (crs.getCode().equals(codeofCourse)) {
                                if (codeofCourse.startsWith("1") || codeofCourse.startsWith("4")) {
                                    System.out.println("Name of student:");
                                    Scanner studentName = new Scanner(System.in);
                                    String stName = studentName.nextLine();
                                    s.setName(stName);
                                    System.out.println("Surname of student:");
                                    Scanner surname = new Scanner(System.in);
                                    String surnameSt = surname.nextLine();
                                    s.setSurname(surnameSt);
                                    int rand = (int) (Math.random() * 100); //Setting id randomly
                                    s.setStudent_id(rand);

                                    if (c2.bachelorCourse.size() <= 30) {
                                        c2.bachelorCourse.add(s);
                                        s.displayMethod(); // Accessing the extended method from Student class.
                                        System.out.println(".Student added to bachelor course.");
                                        System.out.println("*******************************");
                                    } else {
                                        System.out.println("A course only can have 30 students");
                                    }
                                } else if (codeofCourse.startsWith("5")) {
                                    System.out.println("Name of student:");
                                    Scanner studentName = new Scanner(System.in);
                                    String stName = studentName.nextLine();
                                    g.setName(stName);
                                    System.out.println("Surname of student:");
                                    Scanner surname = new Scanner(System.in);
                                    String surnameSt = surname.nextLine();
                                    g.setSurname(surnameSt);
                                    int rand = (int) (Math.random() * 100); //Setting id randomly
                                    g.setStudent_id(rand);
                                    if (c2.mastersCourse.size() <= 30) {
                                        c2.mastersCourse.add(g);
                                        g.displayMethod(); // Accessing the extended method from Student class.
                                        System.out.println(".Student added to masters course.");
                                        System.out.println("*******************************");
                                    } else {
                                        System.out.println("A course only can have 30 students");
                                    }
                                } else if (codeofCourse.startsWith("7")) {
                                    System.out.println("Name of student:");
                                    Scanner studentName = new Scanner(System.in);
                                    String stName = studentName.nextLine();
                                    ss.setName(stName);
                                    System.out.println("Surname of student:");
                                    Scanner surname = new Scanner(System.in);
                                    String surnameSt = surname.nextLine();
                                    ss.setSurname(surnameSt);
                                    int rand = (int) (Math.random() * 100); //Setting id randomly
                                    ss.setStudent_id(rand);
                                    if (c2.specialCourse.size() <= 30) {
                                        c2.specialCourse.add(ss);
                                        ss.displayMethod(); // Accessing the extended method from Student class.
                                        System.out.println(".Student added to special course.");
                                        System.out.println("*******************************");
                                    } else {
                                        System.out.println("A course only can have 30 students");
                                    }
                                } else if (codeofCourse.startsWith("2") || codeofCourse.startsWith("3") || codeofCourse.startsWith("6") || codeofCourse.startsWith("8") || codeofCourse.startsWith("9")) {
                                    System.out.println("Name of student:");
                                    Scanner studentName = new Scanner(System.in);
                                    String stName = studentName.nextLine();
                                    os.setName(stName);
                                    System.out.println("Surname of student:");
                                    Scanner surname = new Scanner(System.in);
                                    String surnameSt = surname.nextLine();
                                    os.setSurname(surnameSt);
                                    int rand = (int) (Math.random() * 100); //Setting id randomly
                                    os.setStudent_id(rand);
                                    if (c2.otherCourse.size() <= 30) {
                                        c2.otherCourse.add(os);
                                        os.displayMethod(); // Accessing the method from Student class.
                                        System.out.println(".Student added to other course.");
                                        System.out.println("*******************************");
                                    } else {
                                        System.out.println("A course only can have 30 students");
                                    }
                                }
                            } else {
                                System.out.println("Course could not found!");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter code of course and display students:");
                    Scanner enteredCode = new Scanner(System.in);
                    String enteredCodeofCourse = enteredCode.nextLine();
                    if (c2.getCourseList().size() != 0) {
                        for (Course crs : c2.getCourseList()) {
                            if (crs.getCode().equals(enteredCodeofCourse)) {
                               if (enteredCodeofCourse.startsWith("1") || enteredCodeofCourse.startsWith("4")) {
                                    for (RegularStudent rs : c2.getBachelorCourse()) {
                                        System.out.println("Students :" + rs.getStudent_id() + " " + rs.getName() + " " + rs.getSurname());
                                    }
                                } else if (enteredCodeofCourse.startsWith("5")) {
                                    for (GraduateStudent gs : c2.getMastersCourse()) {
                                        System.out.println("Students :" + gs.getStudent_id() + " " + gs.getName() + " " + gs.getSurname());
                                    }

                                } else if (enteredCodeofCourse.startsWith("7")) {
                                    for (SpecialStudent speStu : c2.getSpecialCourse()) {
                                        System.out.println("Students  :" + speStu.getStudent_id() + " " + speStu.getName() + " " + speStu.getSurname());
                                    }
                                } else {
                                    for (Student stu : c2.getOtherCourse()) {
                                        System.out.println("Students  :" + stu.getStudent_id() + " " + stu.getName() + " " + stu.getSurname());
                                    }
                                }
                            } else {
                                System.out.println("Course could not found !");
                            }
                        }
                    }
                    break;
                case 4:
                    exit = true;
                    break;
            }
        } while (!exit);
    }
}
