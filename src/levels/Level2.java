package levels;

import models.Subject;
import models.Teacher;
import utils.Data;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Level2 {

    public static void main(String[] args) {
        List<Teacher> teachers = Data.employees();

        /* TO DO 1: Retourner le nombre des enseignants dont le nom commence avec s */
        long nbr = teachers.stream()
                .filter(teacher -> teacher.getName().toLowerCase().startsWith("s"))
                .count();
        System.out.println("Number of teachers whose name starts with 's': " + nbr);

        /* TO DO 2: Retourner la somme des salaires de tous les enseignants Flutter (hint: mapToInt) */
        long sum = teachers.stream()
                .filter(teacher -> teacher.getSubject() == Subject.FLUTTER)
                .mapToLong(Teacher::getSalary)
                .sum();
        System.out.println("Total salary of Flutter teachers: " + sum);

        /* TO DO 3: Retourner la moyenne des salaires des enseignants dont le nom commence avec a */
        double average = teachers.stream()
                .filter(teacher -> teacher.getName().toLowerCase().startsWith("a"))
                .mapToDouble(Teacher::getSalary)
                .average()
                .orElse(0.0);
        System.out.println("Average salary of teachers whose name starts with 'a': " + average);

        /* TO DO 4: Retourner la liste des enseignants dont le nom commence par f */
        List<Teacher> teachers1 = teachers.stream()
                .filter(teacher -> teacher.getName().toLowerCase().startsWith("f"))
                .collect(Collectors.toList());
        System.out.println("Teachers whose names start with 'f': " + teachers1);

        /* TO DO 5: Retourner la liste des enseignants dont le nom commence par s */
        List<Teacher> teachers2 = teachers.stream()
                .filter(teacher -> teacher.getName().toLowerCase().startsWith("s"))
                .collect(Collectors.toList());
        System.out.println("Teachers whose names start with 's': " + teachers2);

        /* TO DO 6: Retourner true si il y a au min un enseignants dont le salaire > 100000, false si non */
        boolean test = teachers.stream()
                .anyMatch(teacher -> teacher.getSalary() > 100000);
        System.out.println("Is there at least one teacher with a salary > 100000? " + test);

        /* TO DO 7: Afficher le premier enseignant Unity le nom commence avec g avec 2 manières différentes */
        /* First way */
        Optional<Teacher> firstUnityTeacher = teachers.stream()
                .filter(teacher -> teacher.getSubject() == Subject.UNITY)
                .filter(teacher -> teacher.getName().toLowerCase().startsWith("g"))
                .findFirst();
        firstUnityTeacher.ifPresent(System.out::println);

        /* Second way */
        teachers.stream()
                .filter(teacher -> teacher.getSubject() == Subject.UNITY)
                .filter(teacher -> teacher.getName().toLowerCase().startsWith("g"))
                .limit(1)
                .forEach(System.out::println);

        /* TO DO 8: Afficher le deuxième enseignant dont le nom commence avec s */
        teachers.stream()
                .filter(teacher -> teacher.getName().toLowerCase().startsWith("s"))
                .skip(1) // Skip the first teacher
                .findFirst() // Get the second one
                .ifPresent(System.out::println);
    }
}
