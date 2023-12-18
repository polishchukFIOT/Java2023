import java.util.Comparator;
import java.util.Arrays;

/*
Клас слугує для зберігання масиву об'єктів-студентів з властивостями
 */
public class Student {
    public String name;
    public String surname;
    public int age;
    public int group_num;
    public String faculty;
    public int course;

    /**
     * Конструктор - створення нового об'єкту з певними значеннями
     *
     * @param name      - ім'я
     * @param surname   - прізвище
     * @param age       - вік
     * @param group_num - номер у списку групи
     * @param faculty   - факультет
     * @param course    - курс
     */
    public Student(String name, String surname, int age, int group_num, String faculty, int course) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.group_num = group_num;
        this.faculty = faculty;
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public int getGroup_num() {
        return group_num;
    }

    /**
     * Головний метод програми.
     * Створює масив з 7 об'єктів та встановлює для них значення властивостей.
     * Сортує об'єкти за віком {@link Student#getAge()} у порядку зростання та за номером у списку групи {@link Student#getGroup_num()} у порядку спадання за допомогою Comparator.
     * Виводить на екран відсортований масив об'єктів.
     */
    public static void main(String[] args) {

        Student[] students = {
                new Student("Dmytro", "Polishchuk", 18, 13, "FIOT", 2),
                new Student("Denis", "Shkarivskiy", 20, 12, "TEF", 3),
                new Student("Aliona", "Poliakova", 21, 21, "FIOT", 4),
                new Student("Roman", "Groshovik", 17, 23, "FBMI", 1),
                new Student("Andrey", "Romanov", 24, 33, "FSP", 4),
                new Student("Egor", "Pron", 18, 1, "TEF", 1),
                new Student("Maksim", "Kvasha", 21, 4, "FBMI", 4)};


        Comparator<Student> studentsComparator
                = Comparator.comparing(Student::getAge);
        Arrays.sort(students, studentsComparator);

        System.out.println("Сортування масиву за віком");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " - " + students[i].surname + " - " + students[i].age);
        }

        System.out.println("---------------------");

        Comparator<Student> studentsComparator2
                = Comparator.comparing(Student::getGroup_num).reversed();
        Arrays.sort(students, studentsComparator2);

        System.out.println("Сортування масиву за номером у групі");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " - " + students[i].surname + " - " + students[i].group_num);
        }
    }
}