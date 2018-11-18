package org.sony.mosaapp.controller.admin;

import javax.servlet.http.HttpSession;

import org.sony.mosaapp.dto.admin.AdminDTO;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class AdminController {
	@Value("${userid}")
	private String userid;
	@Value("${pwd}")
	private String password;
	public AdminController() {
		System.out.println(this.getClass().getSimpleName()+"object is created");
	}
	
@RequestMapping(value="adminlogin.do",method=RequestMethod.POST)
public ModelAndView loginAdminController( HttpSession session ,AdminDTO dto ) {
	System.out.println(dto);
	System.out.println(userid+"\t"+password);
	if(dto.getUser().equals(userid) && dto.getPassword().equals(password)) {
		System.out.println("admin login success");
		session.setAttribute("username", userid);
		return new ModelAndView("adminhome.jsp","username",userid);
	}
	
	System.out.println("login admin controller ended");
	return new ModelAndView("adminlogin.jsp","msg","userid or password is mismatch");
}
@RequestMapping(value="/logout.do")
 public ModelAndView logout(HttpSession session) {
	session.invalidate();
	return new ModelAndView("landing.jsp");
	
}
}
