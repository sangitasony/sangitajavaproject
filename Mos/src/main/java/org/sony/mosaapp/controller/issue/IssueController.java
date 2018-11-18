package org.sony.mosaapp.controller.issue;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.sony.mosaapp.dto.issue.IssueDto;
import org.sony.mosaapp.service.issue.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/")
public class IssueController {
	@Autowired
	IssueService service;
	
	public IssueController() {
		System.out.println(getClass().getSimpleName()+"created....");
		
		
	}
	@RequestMapping(value="createissue.do",method=RequestMethod.POST)
	public ModelAndView createIssueController(IssueDto dto) {
		
		
		String issue=service.getissueNo();
		dto.setIssueNo(issue);
		service.createIssueservice(dto);
		return new ModelAndView("createissue.jsp","msg","issue generated");
	}
	@RequestMapping(value="viewissue.do",method=RequestMethod.GET)
	public ModelAndView viewIssueController() {
		System.out.println("view issue started");
		List<IssueDto>list =service.viewIssueService();
		System.out.println("view issue ended");
		return new ModelAndView("viewissue.jsp").addObject("list",list);
	}
	@RequestMapping(value="edit.do",method=RequestMethod.GET)
	public ModelAndView editIssueController(HttpServletRequest request) {
		System.out.println("controller started");
		String issuenum=request.getParameter("issuenum");
		IssueDto dto=service.searchIssueService(issuenum);
		System.out.println(issuenum);
		System.out.println("issue controller is ended");
		return new ModelAndView("editissue.jsp").addObject("issue",dto);
	}
	@RequestMapping (value="update.do",method=RequestMethod.GET)
	public ModelAndView  updateStatusController(IssueDto dto,HttpServletRequest req) {
		String status=dto.getStatus();
		int id=Integer.parseInt(req.getParameter("id"));
		System.out.println(id);
		service. updateStatusservice(status,id);
		List<IssueDto>list=service.viewIssueService();
		return new ModelAndView("viewissue.do").addObject("viewdata",list);
	}
	
}
