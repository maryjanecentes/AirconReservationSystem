package ph.com.alliance.model;

import java.util.Date;

public class UserModel {
	
	private int id;
	private String username;
	private String password;
	private String family_name;
	private String first_name;
	private Date birthdate;
	private String address;
	private int admin_flag;
	private int deleted_flag;
	private Date last_login_date;
	private Date created_date;
	private int created_by;
	private Date modified_date;
	private int modified_by;
	
	
	
	@Override
    public String toString() {
        return "User {" + "id=" + id + ", username=" + username + ", password=" + password + ", family_name=" + family_name + ",first_name=" + first_name 
        		+  ", birthdate=" + birthdate+ ", address=" +address + ", admin_flag=" + admin_flag+ ", deleted_flag=" + deleted_flag+ ", last_login_date=" + last_login_date+ ", created_date=" + created_date+
        		 ", created_by=" + created_by+ ", modified_date=" + modified_date+ ", modified_by=" + modified_by+"}";

    }
	
	public int getID() {
		return id;
	}
	
	public void setID(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFamily_name() {
		return family_name;
	}

	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAdmin_flag() {
		return admin_flag;
	}

	public void setAdmin_flag(int admin_flag) {
		this.admin_flag = admin_flag;
	}

	public int getDeleted_flag() {
		return deleted_flag;
	}

	public void setDeleted_flag(int deleted_flag) {
		this.deleted_flag = deleted_flag;
	}

	public Date getLast_login_date() {
		return last_login_date;
	}

	public void setLast_login_date(Date last_login_date) {
		this.last_login_date = last_login_date;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public int getCreated_by() {
		return created_by;
	}

	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	public Date getModified_date() {
		return modified_date;
	}

	public void setModified_date(Date modified_date) {
		this.modified_date = modified_date;
	}

	public int getModified_by() {
		return modified_by;
	}

	public void setModified_by(int modified_by) {
		this.modified_by = modified_by;
	}
}
