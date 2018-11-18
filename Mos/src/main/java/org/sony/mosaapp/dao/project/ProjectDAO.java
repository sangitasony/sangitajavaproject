package org.sony.mosaapp.dao.project;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.sony.mosaapp.dto.project.ProjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class ProjectDAO {
	@Autowired
	private SessionFactory factory;
	public ProjectDAO() {
		System.out.println("Creating..."+this.getClass().getSimpleName());
	}

	public void saveCreateproject(ProjectDTO dto) {
		System.out.println("dao is started");
		Session session=factory.openSession();
		Transaction  transaction=session.beginTransaction();
		session.save(dto);
		transaction.commit();
		System.out.println("dao is ended");
		session.close();
	}

	public List<ProjectDTO> viewProjectDao(){
		String query="select project from ProjectDTO  project";
		Session session=factory.openSession();
		try {
			Query query2=session.createQuery(query);
			List<ProjectDTO> list=query2.list();
			System.out.println("dao is ended"+list);
			return list;
		}
		finally 
		{
			session.close();	
		}
	}
	public void UpdateProjectStatus(int id,boolean status) {
		System.out.println("updateProjectStatusDao started");
		boolean val= false;
		if(!status)
			val=true;
		String hql=" update ProjectDTO p set p.status =:st where p.id=:key";
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		try {
			Query query=session.createQuery(hql);
			query.setParameter("st", val);
			query.setParameter("key", id);
			int res=query.executeUpdate();
			tx.commit();
			System.out.println("result---->"+res);
			System.out.println("updateProjectStatusDao ended");
		}
		finally {
			session.close();
		}
	}




}
