package org.sony.mosaapp.service.project;

import java.util.List;

import org.sony.mosaapp.dao.project.ProjectDAO;
import org.sony.mosaapp.dto.project.ProjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProjectService {
	@Autowired
	private ProjectDAO dao;
	public ProjectService() {
		System.out.println(this.getClass().getSimpleName()+"controller is created");
	}
	public void saveProjectService(ProjectDTO dto) {
		System.out.println("service is created");
		dao.saveCreateproject(dto);
		System.out.println("service is ended");

	}
	public List<ProjectDTO> viewProjectService() {
		List<ProjectDTO> dt=dao.viewProjectDao();
				return dt;
	}
	public void UpdateProjectStatusService(int id,boolean status) {
		System.out.println("UpdateProjectStatusService started");
		dao.UpdateProjectStatus(id, status);
		System.out.println("UpdateProjectStatusService ended");
	}
		
	}

 
