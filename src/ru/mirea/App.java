package ru.mirea;

import java.util.Scanner;
import java.util.Comparator;
import ru.mirea.classes.Student;


public class App {
  private static final Scanner IN = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Введите имя студента #1: ");
    String firstStudName = IN.nextLine();

    System.out.print("Введите баллы студента #1: ");
    double firstStudGrade = IN.nextDouble();

    System.out.println();

    System.out.print("Введите имя студента #2: ");

    IN.nextLine();
    String secondStudName = IN.nextLine();

    System.out.print("Введите баллы студента #2: ");
    double secondStudGrade = IN.nextDouble();

    Student firstStud = new Student(firstStudName, firstStudGrade);
    Student secondStud = new Student(secondStudName, secondStudGrade);

    int compareResult = compare(firstStud, secondStud, (Student stud1, Student stud2) -> {
      return Double.compare(stud1.getTotalGrade(), stud2.getTotalGrade());
    });

    System.out.println();
    if (compareResult < 0) {
      System.out.println("У студента " + secondStud.getName() + " больше баллов!");
      return;
    }

    if (compareResult == 0) {
      System.out.println("У студентов " + firstStud.getName() + " и " + secondStud.getName() + " одинаковое количество баллов!");
      return;
    }

    System.out.println("У студента " + firstStud.getName() + " больше баллов!");
  }

  /**
   * Сравнивает двух студентов с помощью переданного метода
   * @param stud1         первый из сравниваемых студентов
   * @param stud2         второй из сравниваемых студентов
   * @param func          метод сравнивания
   */
  private static int compare(Student stud1, Student stud2, Comparator<Student> func) {
    return func.compare(stud1, stud2);
  }
}
