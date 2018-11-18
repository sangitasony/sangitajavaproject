package org.sony.mosaapp.service.resource;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.sony.mosaapp.dao.resource.ProjectResourceDAO;
import org.sony.mosaapp.dto.project.ProjectDTO;
import org.sony.mosaapp.dto.resource.ProjectResourceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;
@Service
public class ProjectResourceService {
	@Autowired
	private ProjectResourceDAO dao;
	@Autowired
	 private SimpleMailMessage message;
	@Autowired
	private JavaMailSenderImpl mailSender;
	public ProjectResourceService() {
		System.out.println(this.getClass().getSimpleName()+"object is created");
	}
	public void resourceService(ProjectResourceDTO dto) {
		
		System.out.println("service is started");
		/*CharSequence passwod=UUID.randomUUID().toString().subSequence(0, 8);
		dto.setPasswod((String) passwod);*/
		dao.resourceDaoSave(dto);
		
		/*message.setTo(dto.getEmail());
		message.setFrom("sangitadas538@gmail.com");
		message.setCc(dto.getMangeremail());
		message.setSubject("project  allocation details ");
		message.setText("hii"+dto.getRname()+" you are the part of the"+dto.getProject()+"ur password is "+dto.getPasswod());
		mailSender.send(message);
		
		*/

		System.out.println("service is ended");

	}

	public List<ProjectDTO> fetchProjectService() {
		List<ProjectDTO> dt=dao.fetchproject();

		return dt;
	}


	public List<ProjectResourceDTO> getallresourceService() {
		List<ProjectResourceDTO>list=	dao.getResourcealldetailsDao();
		return list;
	}
	public ProjectResourceDTO getResourceUpdateById(int id) {
		System.out.println("getResourceUpdateService Started");
		ProjectResourceDTO dto=dao.getResourceUpdateByIdDao(id);


		System.out.println("getResourceUpdateService ended");
		return dto;


	}
	public void updateDetailsService(ProjectResourceDTO dto) {
		System.out.println("service is started");
		dao.updateDetailsDao(dto);
		/*message.setTo(dto.getEmail());
		message.setFrom("sangitadas538@gmail.com");
		message.setCc(dto.getMangeremail());
		message.setSubject("project  allocation details ");
		message.setText("hii"+dto.getRname()+" you are the part of the"+dto.getProject()+"project is updated" );
		mailSender.send(message);*/
		
		
		
		System.out.println("service is ended");
		
	}
	public boolean resourceLoginService(String emil,String pwd) {
		System.out.println("resourceLoginService Started");
		System.out.println("resourceLoginService ended");
		return dao.resourceLoginDao(emil,pwd);
	
	
	}

public void SendEmailToEmployee(ProjectResourceDTO dto) {
	message.setTo(dto.getEmail());
	message.setFrom("sangitadas538@gmail.com");
	message.setSubject("project  allocation details ");
	message.setText("hii"+dto.getRname()+" you are the part of the"+dto.getProject()+"ur password is "+dto.getPasswod());
	mailSender.send(message);
	
	
	
}
public void sendEmailToManager(ProjectResourceDTO dto) {
	message.setTo(dto.getMangeremail());
	message.setFrom("sangitadas538@gmail.com");
	message.setSubject("project  allocation details ");
	message.setText("hii"+dto.getRname()+" you are the part of the"+dto.getProject()+"and degination is"+dto.getDegination()+"empno is"+dto.getEmpno());
	mailSender.send(message);
	
	
}
public String getPassword() {
	 String uppperCase= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String	Lowercase="abcdefghijklmnopqrstuvwxyz";
	String number="0123456789";
	String symbols="@&#$*";
	String values= uppperCase+Lowercase+number+symbols;
	Random random= new Random();
	char [] password=new char[6];
	for(int i=0; i<6;i++) {
		password[i]= values.charAt(random.nextInt(values.length()+1));
	}
	String pwd=new String(password);
	return pwd;
		
	/*CharSequence password=UUID.randomUUID().toString().subSequence(0, 8);
	String pwd=new String((String) password);
	return pwd;*/
	

}
public List<ProjectResourceDTO> fetchProjectResource() {
List<ProjectResourceDTO>rlist=	dao.fetchprojectresourceDao();
	return rlist;
}
}
