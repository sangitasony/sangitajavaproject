package org.sony.mosaapp.controller.project;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.sony.mosaapp.dto.project.ProjectDTO;
import org.sony.mosaapp.service.project.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class ProjectController {
	@Autowired
	private ProjectService service;

	public ProjectController() {
		System.out.println(this.getClass().getSimpleName() + "controller is created");
	}

	@InitBinder
	public void InitBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@RequestMapping(value = "/create.do", method = RequestMethod.POST)
	public ModelAndView createprojectControllersave(ProjectDTO dto) {
		System.out.println("controller is created");
		System.out.println(dto);
		service.saveProjectService(dto);

		System.out.println("controller is ended");
		return new ModelAndView("createProject.jsp", "msg", "project is created");

	}
	@RequestMapping(value="viewproject.do",method=RequestMethod.GET)
public ModelAndView viewProjectController() {
	List<ProjectDTO> list=service.viewProjectService();
	return new ModelAndView("viewProject.jsp","list",list);
}
	@RequestMapping(value="updatestatus.do",method=RequestMethod.GET)
	public ModelAndView UpdateProjectStatusController(HttpServletRequest request) {
		System.out.println("UpdateProjectStatusController Started");
		int id=Integer.parseInt(request.getParameter("id"));
		String Status=request.getParameter("st");
		System.out.println(id+"---->"+Status);
		boolean b=false;
		if(Status.equals("true"))
			b=true;
		else b=false;
		service.UpdateProjectStatusService(id, b);
		System.out.println("UpdateProjectStatusController ended");
		return new ModelAndView("viewproject.do");
		
	}

}
