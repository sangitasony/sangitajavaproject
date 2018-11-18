package org.sony.mosaapp.dto.project;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "createproj_table")
public class ProjectDTO implements Serializable {
	@Id
	@GenericGenerator(name = "m_id", strategy = "increment")
	@GeneratedValue(generator = "m_id")
	@Column(name = "p_id")
	private int id;
	@Column(name = "p_name")
	private String projectname;
	@Column(name = "p_domain")
	private String domain;
	@Column(name = "p_code")
	private String projectcode;
	@Column(name = "p_start")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date stDate;
	@Column(name = "p_estimate")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date estimateDate;
	@Column(name = "p_desc")
	private String desc;
	@Column(name = "p_status")
	private boolean status;

	public ProjectDTO() {
		System.out.println(this.getClass().getSimpleName() + "create project ");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getProjectcode() {
		return projectcode;
	}

	public void setProjectcode(String projectcode) {
		this.projectcode = projectcode;
	}

	public Date getStDate() {
		return stDate;
	}

	public void setStDate(Date stDate) {
		this.stDate = stDate;
	}

	
	public Date getEstimateDate() {
		return estimateDate;
	}

	public void setEstimateDate(Date estimateDate) {
		this.estimateDate = estimateDate;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ProjectDTO [id=" + id + ", projectname=" + projectname + ", domain=" + domain + ", projectcode="
				+ projectcode + ", stDate=" + stDate + ", estDate=" + estimateDate + ", desc=" + desc + ", status="
				+ status + "]";
	}

}