package manytomanyunim2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomanyunim2.dto.Courses;
import manytomanyunim2.dto.Students;

public class CoursesDao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}
	
	public void saveCourses(Courses courses) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(courses);
		entityTransaction.commit();
	}
	public void getCoursesById(int id) {
		EntityManager entityManager=getEntityManager();
		Courses courses=entityManager.find(Courses.class, id);
		if(courses!=null) {
			System.out.println(courses);
		}else {
			System.out.println("id is not present");
		}
	}
	

	public void deleteCoursesById(int id) {
		EntityManager entityManager=getEntityManager();
		Courses courses=entityManager.find(Courses.class, id);
		if(courses!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(courses);
			entityTransaction.commit();
		}else {
			System.out.println("id is not present");
		}
	}
	
	public void updateCourses(int id,Courses courses) {
		EntityManager entityManager=getEntityManager();
		Courses dbCourses=entityManager.find(Courses.class, id);
		if(dbCourses!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			courses.setId(id);
			entityManager.merge(courses);
			entityTransaction.commit();
		}else {
			System.out.println("id is not present");
		}
	}
	
	
	
	
	
}
