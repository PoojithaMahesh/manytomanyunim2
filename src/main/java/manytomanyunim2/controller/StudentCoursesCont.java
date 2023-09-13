package manytomanyunim2.controller;

import java.util.ArrayList;
import java.util.List;

import manytomanyunim2.dao.CoursesDao;
import manytomanyunim2.dao.StudentDao;
import manytomanyunim2.dto.Courses;
import manytomanyunim2.dto.Students;

public class StudentCoursesCont {
public static void main(String[] args) {
//	Courses courses1=new Courses();
//	courses1.setId(1);
//	courses1.setName("java");
//	courses1.setFees(1000);
//	
//	Courses courses2=new Courses();
//	courses2.setId(2);
//	courses2.setName("adv java");
//	courses2.setFees(1500);
//	
//	Courses courses3=new Courses();
//	courses3.setId(3);
//	courses3.setName("sql");
//	courses3.setFees(2000);
//	
//	
//	Students students1=new Students();
//	students1.setId(1);
//	students1.setName("avidi");
//	students1.setAddress("delhi");
//	
//	List<Courses> coursesofavidi=new ArrayList<Courses>();
//	coursesofavidi.add(courses3);
//	coursesofavidi.add(courses2);
//	
//	students1.setCourses(coursesofavidi);
//	
//	
//	
//	Students students2=new Students();
//	students2.setId(2);
//	students2.setName("rashmi");
//	students2.setAddress("mumbai");
//	students2.setCourses(coursesofavidi);
//	
//	
//	Students students3=new Students();
//	students3.setId(3);
//	students3.setName("ajay");
//	students3.setAddress("pune");
//	List<Courses> coursesofajay=new ArrayList<Courses>();
//	coursesofajay.add(courses3);
//	coursesofajay.add(courses2);
//	coursesofajay.add(courses1); 
//	
//	students3.setCourses(coursesofajay);
	
	StudentDao studentDao=new StudentDao();
	CoursesDao coursesDao=new CoursesDao();
	
//	coursesDao.saveCourses(courses1);
//	coursesDao.saveCourses(courses2);
//	coursesDao.saveCourses(courses3);
//	
//	studentDao.saveStudent(students1);
//	studentDao.saveStudent(students2);
//	studentDao.saveStudent(students3);
	
//	select the data
//	coursesDao.getCoursesById(1);
//    studentDao.getStudentById(1);	
	
//	delete the data
//	coursesDao.deleteCoursesById(1);
	
//	studentDao.deleteStudentById(1);
	
//	Courses courses1=new Courses();
//
//	courses1.setName("corejava");
//	courses1.setFees(1200);
//	coursesDao.updateCourses(1, courses1);
	
	Students students2=new Students();

	students2.setName("rashmiD");
	students2.setAddress("mumbai");
	
	studentDao.updateStudent(2, students2);
	
	
	
}
}
