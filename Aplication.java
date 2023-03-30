import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // Citim datele despre studenti de la tastatura si ii adaugam in lista students

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter student surname:");
            String surname = scanner.nextLine();

            System.out.println("Enter student lastname:");
            String lastname = scanner.nextLine();

            System.out.println("Enter student age:");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter student major:");
            String gender = scanner.nextLine();
            students.add(new Student(surname,lastname, age, gender));
        }
        // Afisam lista de studenti
        System.out.println("List of students:");
        for (Student student : students) {
            System.out.println(student.getSurname() + " - " + student.getSurname()+ student.getAge() + " years old, majoring in " + student.getGender());
        }





        // Citim datele despre profesori de la tastatura si ii adaugam in lista teachers

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter student surname:");
            String surname = scanner.nextLine();

            System.out.println("Enter student lastname:");
            String lastname = scanner.nextLine();

            System.out.println("Enter student age:");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter student major:");
            String gender = scanner.nextLine();
            teachers.add(new Teacher(surname,lastname, age, gender));
        }


    }



}
