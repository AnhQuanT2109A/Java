public class TestPerson {
    public static void main(String[] args) {
        Student s1 = new Student("tan ah teck" ,"1 happy ave");
        s1.addCourseGrade("im101", 97);
        s1.addCourseGrade("im102", 68);
        s1.printGrader();//student tan ah teck(1 happy ave) im101:97 im102:68
        System.out.println("average is: " + s1.getAverageGrade());
        //average is 82.5
        Teacher t1 = new Teacher("paul tan", "8 sunset way");
        System.out.println(t1);
        String[] courses = {"im101", "im102", "im101"};
        for (String course : courses){
            if (t1.addCourse(course)){
                System.out.println(course + " added");
            }else{
                System.out.println(course + " cannot be added");
            }
        }
        for (String course: courses){
            if (t1.rewmoveCourse(course)){
                System.out.println(course + " removed");
            }else{
                System.out.println(course + " cannot be removed");
            }
        }
        //im101, im102 removed
        //im101 cannot be removed
    }
}