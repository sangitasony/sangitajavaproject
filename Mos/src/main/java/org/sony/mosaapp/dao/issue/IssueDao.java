package org.sony.mosaapp.dao.issue;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.sony.mosaapp.dto.issue.IssueDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IssueDao {
	@Autowired
	private SessionFactory factory;
	public IssueDao() {
		System.out.println(getClass().getSimpleName()+"dao is created");
	}

	public void create(IssueDto dto) {
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		try {
			session.save(dto);
			transaction.commit();
			
		}
	
		finally {
			session.close();
		}
	}

	public List<IssueDto> viewissue() {
		String qry="select project from IssueDto project";
		Session session=factory.openSession();
		try {
			Query query=session.createQuery(qry);
			List<IssueDto> list=query.list();
			System.out.println("dao is ended"+list);

			return list;
		}
		finally {
			session.close();
		}
	}

	public IssueDto searchIssueDao(String issuenum) {
		
		String qry="select p from IssueDto p where p.issuenum=:key"  ;
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		try {
			Query query=session.createQuery(qry);
			System.out.println(issuenum);
			query.setParameter("key", issuenum);
			IssueDto dto=(IssueDto) query.uniqueResult();
			System.out.println("result----->"+dto);
			System.out.println("edit is ened Ended");
			transaction.commit();
			return dto;
			}
		finally {
			session.close();
		}
	}

	public void updateStatusDao(String status, int id) {
		System.out.println("update dao started");
		String qry="update IssueDto i set i.status=:st where i.id=:idd";
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		try {
			Query query=session.createQuery(qry);
			query.setParameter("st", status);
			query.setParameter("idd", id);
			query.executeUpdate();
			transaction.commit();
			
			System.out.println("update dao ended");
		}
		finally {
			session.close();
		}
		
	}
		

}
