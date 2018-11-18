package org.sony.mosaapp.controller.resource;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.sony.mosaapp.dto.project.ProjectDTO;
import org.sony.mosaapp.dto.resource.ProjectResourceDTO;
import org.sony.mosaapp.service.resource.ProjectResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class ProjectResourceConroller {
	@Autowired
	private ProjectResourceService service;
	public ProjectResourceConroller() {
		System.out.println(this.getClass().getSimpleName()+"object is created");

	}	
	@RequestMapping( value="/createresource.do",method=RequestMethod.POST)
	public ModelAndView resourceController( ProjectResourceDTO dto ) {
		System.out.println("controller is started");
		System.out.println(dto);
		String pwd=service.getPassword();
		dto.setPasswod(pwd);
		service.resourceService(dto);
		service.SendEmailToEmployee(dto);
		service.sendEmailToManager(dto);
		
		System.out.println("controller is ended");
		return new ModelAndView("createResource.jsp","msg","resource is created");

	}
	@RequestMapping(value="getProject.do",method=RequestMethod.GET)
	public ModelAndView fetchProjectController() {
		List<ProjectDTO> list=service.fetchProjectService();
		
		return new ModelAndView("createResource.jsp").addObject("prolist",list);
	}
	@RequestMapping(value="getView.do",method=RequestMethod.GET)
	public ModelAndView getallresourceDetails() {
		List<ProjectResourceDTO> list=service.getallresourceService();
		return new ModelAndView("viewResource.jsp","list",list);
	}
	@RequestMapping(value="editbasedId.do",method=RequestMethod.GET)
	public ModelAndView getresourceById(HttpServletRequest request) {
		System.out.println("getresourceById is started");
		int id=Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		ProjectResourceDTO dto=	 service.getResourceUpdateById(id);
		System.out.println("deaties of project resource dto based on id"+dto);
		List<ProjectDTO> list =service.fetchProjectService();
		System.out.println("list of project name "+list);
		System.out.println("getresourceById is ended");
		return new ModelAndView("eaditResource.jsp").addObject("prolist",list ).addObject("rdto",dto);
	}
	@RequestMapping(value="updaterecord.do",method=RequestMethod.GET)
	public ModelAndView updateDetailsController(ProjectResourceDTO dto) {
		System.out.println("updateDetailsController started");
		service.updateDetailsService(dto);
		System.out.println("updateDetailsController ended");
		return new ModelAndView("getView.do");
	}
	@RequestMapping(value="/resourcelogin.do",method=RequestMethod.GET)
	public ModelAndView resourceLoginController(HttpServletRequest request) {
		System.out.println("resourceLoginController Started  ");
		String emil=request.getParameter("email");
		String pwd=request.getParameter("password");
		if(service.resourceLoginService(emil, pwd)) {
			System.out.println("sucesfully resource login");
			return new ModelAndView("resourcehome.jsp");
			
		}
		System.out.println("resourceLoginController ended  ");
		return new ModelAndView("resourcelogin.jsp","msg","email id or password mismatch");
	}
	@RequestMapping(value="getallproject.do",method=RequestMethod.GET)
	public ModelAndView getallprojectdetails() {
		List<ProjectDTO> list=service.fetchProjectService();
		List<ProjectResourceDTO> rlist=service.fetchProjectResource();
		
		return new ModelAndView("createissue.jsp","prolist",list).addObject("rlist",rlist);
	}
	

}
