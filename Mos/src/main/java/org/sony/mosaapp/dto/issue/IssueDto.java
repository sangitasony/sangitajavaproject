 package org.sony.mosaapp.dto.issue;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="issue_table")
public class IssueDto implements Serializable {
	
	@Id
	@GenericGenerator(name = "m_id", strategy = "increment")
	@GeneratedValue(generator = "m_id")
	@Column(name="i_id")
	private int id;
	@Column(name="i_num")
	private String issueNo;
	@Column(name="i_pname")
	private String project
	;
	@Column(name="i_type")
	private String type;
	@Column(name="i_priority")
	private int priority;
	@Column(name="i_desc")
	private String description;
	@Column(name="i_rname")
	private String rname;
	@Column(name="i_status")
	private String status;
	public IssueDto() {
		System.out.println(this.getClass().getSimpleName()+"created..");
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIssueNo() {
		return issueNo;
	}
	public void setIssueNo(String issueNo) {
		this.issueNo = issueNo;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "IssueDto [id=" + id + ", issueNo=" + issueNo + ", project=" + project + ", type=" + type + ", priority="
				+ priority + ", description=" + description + ", rname=" + rname + ", status=" + status + "]";
	}
	
	
}
