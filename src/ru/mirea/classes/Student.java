package ru.mirea.classes;

public class Student {
  private String name;
  private String group;
  private double totalGrade;

  /**
   * Конструктор по умолчанию
   */
  public Student() {
    this.name = "";
    this.group = "";
    this.totalGrade = 0.0;
  }

  /**
   * Конструктор, создающий объект со всеми полями
   * @param name                  имя студента
   * @param group                 группа
   * @param totalGrade            набранные за семестр баллы
   */
  public Student(String name, String group, double totalGrade) {
    this.name = name;
    this.group = group;
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
   * Геттер для поля group
   * @return       группа студента
   */
  public String getGroup() {
    return this.group;
  }

  /**
   * Сеттер для поля group
   * @param group         новая группа
   */
  public void setGroup(String group) {
    this.group = group;
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
      + "  group: " + this.group + "\n"
      + "  totalGrade: " + this.totalGrade + "\n"
      + "}\n"
    );
  }
}
