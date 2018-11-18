package org.sony.mosaapp.dao.resource;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.sony.mosaapp.dto.project.ProjectDTO;
import org.sony.mosaapp.dto.resource.ProjectResourceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class ProjectResourceDAO {
	@Autowired
	private SessionFactory factory;

	public void resourceDaoSave(ProjectResourceDTO dto) {
		System.out.println("dao is started");
		Session session=factory.openSession();
		Transaction  transaction=session.beginTransaction();
		session.save(dto);
		transaction.commit();
		System.out.println("dao is ended");
		session.close();
	}
	public List<ProjectDTO> fetchproject(){
		String fetch ="select project.projectname from ProjectDTO project ";
		Session session=factory.openSession();
		try {
			Query query=session.createQuery(fetch);
			List<ProjectDTO> list=query.list();
			return list;
		}
		finally {
			session.close();
		}



	}
	public List<ProjectResourceDTO> getResourcealldetailsDao() {
		String qry="select project from ProjectResourceDTO project";
		Session session=factory.openSession();
		try {
			Query query=session.createQuery(qry);
			List<ProjectResourceDTO> list=query.list();
			System.out.println("dao is ended"+list);

			return list;
		}
		finally {
			session.close();
		}
	}

	public ProjectResourceDTO getResourceUpdateByIdDao(int id) {
		System.out.println("getResourceUpdateByIdDao Started");

		String qry="select p from  ProjectResourceDTO p where p.id=:key"  ;
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		try {
			Query query=session.createQuery(qry);
			query.setParameter("key", id);
			ProjectResourceDTO dto=(ProjectResourceDTO) query.uniqueResult();
			System.out.println("result----->"+dto);
			System.out.println("getResourceUpdateByIdDao Ended");
			return dto;}
		finally {session.close();
		}
	}
	public void updateDetailsDao(ProjectResourceDTO dto) {
		System.out.println("update the record Started");
		Session session =factory.openSession();
		Transaction transaction=session.beginTransaction();
		String qry="update ProjectResourceDTO i set i.project=:st where i.id=:idd";
		try{
		Query query=session.createQuery(qry);
		query.setParameter("st", dto.getProject());
		query.setParameter("idd", dto.getId());
		query.executeUpdate();
		}
		finally {
		session.close();
		
	}
	}
	public boolean resourceLoginDao(String emil,String pwd) {
		System.out.println("resourceLoginDao started");
		Session session=factory.openSession();
		String qry= "from ProjectResourceDTO p where p.email=:em and p.password=:pas";
		try {
			Query query=session.createQuery(qry);
			query.setParameter("em", emil);
			query.setParameter("pas", pwd);
			ProjectResourceDTO dto=(ProjectResourceDTO) query.uniqueResult();
			if (dto!=null) {
				System.out.println("update the record ended");
				return true;
			}
			return false;
		}
		finally {
			session.close();
		}

	}
	public List<ProjectResourceDTO> fetchprojectresourceDao() {
		Session session =factory.openSession();
		String qry="select r.rname from  ProjectResourceDTO r";
		try {
			Query query=session.createQuery(qry);
			List<ProjectResourceDTO> rlist=query.list();
			return rlist;
		}
		finally {
			session.close();
		}

	}

} 