package com.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entites.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "my program started" );
        //spring JdbcTemplate
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
      //  ApplicationContext context=new ClassPathXmlApplicationContext("com/springjdbc/config.xml");
       StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
      // Student student=new Student();
       //student.setId(666);
       // student.setName("krishna");
      // student.setCity("cpt");
     //  int result=studentDao.insert(student);
    // System.out.println("student added:"+result);
    //  int result=studentDao.change(student);
    // System.out.println("Data change:"+result);
    // int result=studentDao.delete(666);
    //  Student student=studentDao.getStudent(222);
     // System.out.println(student);
       List<Student> students=studentDao.getAllStudents();
       for(Student s:students) {
    	   System.out.println(s);
       }
   	
       
       
        
        
        
       
    }
}
