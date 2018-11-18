package org.sony.mosaapp.dto.resource;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="resource_table")
public class ProjectResourceDTO implements Serializable {
	@Id
	@GenericGenerator(name="e_id",strategy="increment")
	@GeneratedValue(generator="e_id")
	@Column(name="r_id")
	
	private int id;
	@Column(name="r_name")
	private String rname;
	@Column(name="r_degination")
	private String degination;
	@Column(name="r_empno")
	private String empno;
	@Column(name="r_project")
	private String project;
	@Column(name="r_email")
	private String email;
	@Column(name="r_managermail")
	private String mangeremail;
	@Column(name="r_pwd")
	private String password;
	public ProjectResourceDTO() {
		System.out.println(this.getClass().getSimpleName()+"object is created");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getDegination() {
		return degination;
	}
	public void setDegination(String degination) {
		this.degination = degination;
	}
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMangeremail() {
		return mangeremail;
	}
	public void setMangeremail(String mangeremail) {
		this.mangeremail = mangeremail;
	}
	public String getPasswod() {
		return password;
	}
	public void setPasswod(String passwod) {
		this.password = passwod;
	}
	@Override
	public String toString() {
		return "ProjectResourceDTO [id=" + id + ", rname=" + rname + ", degination=" + degination + ", empno=" + empno
				+ ", project=" + project + ", email=" + email + ", mangeremail=" + mangeremail + ", passwod=" + password
				+ "]";
	}
	

}
