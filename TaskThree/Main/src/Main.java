import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();


        //Students
        ArrayList<String> passedCourses1 = new ArrayList<>();
        passedCourses1.add("Spaghetti Code");
        Student student1 = new Student("Frodo",passedCourses1);
        persons.add(student1);

        ArrayList<String> passedCourses2 = new ArrayList<>();
        passedCourses2.add("Coding Golf");
        Student student2 = new Student("Samwise",passedCourses2);
        persons.add(student2);

        //Teachers
        ArrayList<String> canTeach1 = new ArrayList<>();
        canTeach1.add("Spaghetti Code");
        Teacher teacher1 = new Teacher("Mrs. Sauron", canTeach1);
        persons.add(teacher1);

        ArrayList<String> canTeach2 = new ArrayList<>();
        canTeach2.add("Coding Golf");
        canTeach2.add("Coding with strangers");
        Teacher teacher2 = new Teacher("Mr. Durin", canTeach2);
        persons.add(teacher2);

        //Adding Spaghetti Code course to everyone, should say if people already have it passed or not

        for (Person p : persons){
            if(!p.addCourse("Spaghetti Code")) {
                if (p instanceof Student) {
                    System.out.println(p.getName() + " has already passed this course.");
                } else if (p instanceof Teacher) {
                    System.out.println(p.getName() + " can't teach in this course.");
                }
                }else{
                    if (p instanceof Student){
                        System.out.println(p.getName()+" has added Spaghetti Code to their courses.");
                    }else if(p instanceof Teacher){
                        System.out.println(p.getName()+" is now teaching the Spaghetti Code course");
                }
            }
        }
    }
}
