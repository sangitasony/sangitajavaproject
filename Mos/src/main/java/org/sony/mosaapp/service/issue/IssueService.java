package org.sony.mosaapp.service.issue;

import java.util.List;
import java.util.Random;

import org.sony.mosaapp.dao.issue.IssueDao;
import org.sony.mosaapp.dto.issue.IssueDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IssueService {
	@Autowired
	 private IssueDao dao;
	public IssueService() {
		System.out.println(getClass().getSimpleName()+"service is created");
	}

	public void createIssueservice(IssueDto dto) {
		System.out.println("createIssueservice started");
		dao.create(dto)	;
		System.out.println("createIssueservice ended");
	}

	public List<IssueDto> viewIssueService() {
		List<IssueDto>issue=dao.viewissue();
		
		return issue;
	}

	public IssueDto searchIssueService(String issuenum) {
		System.out.println("service started");
	IssueDto dto=dao.searchIssueDao(issuenum);
	System.out.println("service started");
		return dto;
	}

	public void updateStatusservice(String status, int id) {
		dao.updateStatusDao(status,id);
		
	}
	public String getissueNo() {
		 //String uppperCase= "issu";
		String number="0123456789";
		String values= "issue"+number;
		Random random= new Random();
		char [] issu=new char[6];
		for(int i=0; i<6;i++) {
			issu[i]= values.charAt(random.nextInt(values.length()+1));
		}
		String issue=new String(issu);
		return issue;

}}
