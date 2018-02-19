package cn.itcast.core.pojo;

import java.util.Date;
/**
 * ��̨�˻���
 * @author niu
 *
 */
public class Admin {
	private Integer admin_id;// ����ID
	private String username;// ��¼��
	private String password;// ����',
	private String name;// varchar(10) comment'��ʵ����',
	private String is_sys;// tinyint default 0 comment'�Ƿ񳬼��û�,Ĭ��0��0:�� 1:��',
	private String telephone; // varchar(20) comment'�̶��绰',
	private String mobile;// varchar(20) comment'�ֻ�',
	private String description;// varchar(50) comment'����',
	private String email;// varchar(30) comment'�ʼ�',
	private Integer department_id;// tinyint comment'�������� ����ID',
	private String position;// varchar(20) comment'ְλ',
	private Date login_time;// datetime comment'����¼ʱ��',
	private Date add_time;// datetime comment'���ʱ��',
	private Integer is_enable;// tinyint default 1 comment'�Ƿ����� 1 1:���� 0������'
	
	public Integer getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(Integer admin_id) {
		this.admin_id = admin_id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIs_sys() {
		return is_sys;
	}
	public void setIs_sys(String is_sys) {
		this.is_sys = is_sys;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Date getLogin_time() {
		return login_time;
	}
	public void setLogin_time(Date login_time) {
		this.login_time = login_time;
	}
	public Date getAdd_time() {
		return add_time;
	}
	public void setAdd_time(Date add_time) {
		this.add_time = add_time;
	}
	public Integer getIs_enable() {
		return is_enable;
	}
	public void setIs_enable(Integer is_enable) {
		this.is_enable = is_enable;
	}
	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", username=" + username
				+ ", password=" + password + ", name=" + name + ", is_sys="
				+ is_sys + ", telephone=" + telephone + ", mobile=" + mobile
				+ ", description=" + description + ", email=" + email
				+ ", department_id=" + department_id + ", position=" + position
				+ ", login_time=" + login_time + ", add_time=" + add_time
				+ ", is_enable=" + is_enable + "]";
	}
	
}
