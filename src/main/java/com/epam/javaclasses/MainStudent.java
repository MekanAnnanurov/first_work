package com.epam.javaclasses;

/**
 * Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа
 */
public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student("0", "Аннануров", "Мекан", "Атагелдиевич",
                "16.04.1994", "375123456789", "IEF", "3", "123");
        Student student1 = new Student("1", "Киров", "Кира", "Кирович", "01.01.1995",
                "375123456788", "Фтк", "2", "124");
        Student student2 = new Student("2", "Миров", "Мира", "Мирович", "12.12.1999",
                "375111222333", "ФиТу", "4", "223");

        StudentList newList = new StudentList();
        newList.addStudent(student);
        newList.addStudent(student1);
        newList.addStudent(student2);
        newList.facultyPrint("IEF");
        newList.groupPrint("123");
        newList.yearOfBirthPrint("1997");
    }
}
