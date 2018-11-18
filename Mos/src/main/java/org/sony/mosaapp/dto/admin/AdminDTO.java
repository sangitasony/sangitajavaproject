package org.sony.mosaapp.dto.admin;

public class AdminDTO {
	 private String user;
	 private String password;
	 public AdminDTO() {
		System.out.println(this.getClass().getSimpleName()+"object is created");
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AdminDTO [user=" + user + ", password=" + password + "]";
	}
	

}
