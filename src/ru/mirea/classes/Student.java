package ru.mirea.classes;

public class Student {
  private String name;
  private double totalGrade;

  /**
   * Конструктор по умолчанию
   */
  public Student() {
    this.name = "";
    this.totalGrade = 0.0;
  }

  /**
   * Конструктор, создающий объект со всеми полями
   * @param name                  имя студента
   * @param totalGrade            набранные за семестр баллы
   */
  public Student(String name, double totalGrade) {
    this.name = name;
    this.totalGrade = totalGrade;
  }

  /**
   * Геттер для поля name
   * @return        имя студента
   */
  public String getName() {
    return this.name;
  }

  /**
   * Сеттер для поля name
   * @param name        новое имя студента
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Геттер для поля totalGrade
   * @return          набранные за семестр баллы
   */
  public double getTotalGrade() {
    return this.totalGrade;
  }

  /**
   * Сеттер для поля totalGrade
   * @param totalGrade      новые баллы за семетр
   */
  public void setTotalGrade(double totalGrade) {
    this.totalGrade = totalGrade;
  }

  /**
   * Возвращает строку с информацией об объекте
   */
  @Override
  public String toString() {
    return (
      "Student " + this.name + " {\n"
      + "  totalGrade: " + this.totalGrade + "\n"
      + "}\n"
    );
  }
}
