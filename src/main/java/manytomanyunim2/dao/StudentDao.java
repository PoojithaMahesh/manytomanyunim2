package manytomanyunim2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.border.EtchedBorder;

import manytomanyunim2.dto.Students;

public class StudentDao {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}
	
	public void saveStudent(Students students) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(students);
		entityTransaction.commit();
	}
	
	public void getStudentById(int id) {
		EntityManager entityManager=getEntityManager();
		Students students=entityManager.find(Students.class, id);
		if(students!=null) {
			System.out.println(students);
		}else {
			System.out.println("id is not present");
		}
	}
	
	public void deleteStudentById(int id) {
		EntityManager entityManager=getEntityManager();
		Students students=entityManager.find(Students.class, id);
		if(students!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(students);
			entityTransaction.commit();
		}else {
			System.out.println("id is not present");
		}
	}
	
	public void updateStudent(int id,Students students) {
		EntityManager entityManager=getEntityManager();
		Students dbStudents=entityManager.find(Students.class, id);
		if(dbStudents!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			students.setId(id);
			students.setCourses(dbStudents.getCourses());
			entityManager.merge(students);
			entityTransaction.commit();
		}else {
			System.out.println("id is not present");
		}
	}
	
	
	
	
	
	
	
	
}
