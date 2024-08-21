/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdatabasejpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Dell
 */
public class StudentDatabaseJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Student s1 = new Student(1, "John", 3.5);
        Student s2 = new Student(2, "Marry", 4.00);
        StudentTable.insertStudent(s1);
        StudentTable.insertStudent(s2);
           */
       /*Student s;
       s = StudentTable.findStudentById(1);
       if (s != null) {
           s.setName("Jack");
           StudentTable.deleteStudent(s);
           StudentTable.updateStudent(s);
       }   */
       
       /*List<Student> sList = StudentTable.findAllStudent();
       printAllStudent(sList);*/
       
       //printStudentById(2);
       printStudentByName("Marry");
    }
    
    public static void printAllStudent(List<Student> studentList) {
        for(Student s : studentList) {
           System.out.print(s.getId() + " ");
           System.out.print(s.getName() + " ");
           System.out.println(s.getGpa() + " ");
       }
    }
    
    public static void printStudentById(Integer id) {
        Student s;
        s = StudentTable.findStudentById(id);
        System.out.print(s.getId() + " ");
        System.out.print(s.getName() + " ");
        System.out.println(s.getGpa() + " ");
    }
    
    public static void printStudentByName(String name) {
        List<Student> sList;
        sList = StudentTable.findStudentByName(name);
        for(Student s : sList) {
           System.out.print(s.getId() + " ");
           System.out.print(s.getName() + " ");
           System.out.println(s.getGpa() + " ");
       }
    }
    
    public static void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentDatabaseJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    
    
}
