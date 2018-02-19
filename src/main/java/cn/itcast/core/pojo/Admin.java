package cn.itcast.core.pojo;

import java.util.Date;
/**
 * 后台账户表
 * @author niu
 *
 */
public class Admin {
	private Integer admin_id;// 主键ID
	private String username;// 登录名
	private String password;// 密码',
	private String name;// varchar(10) comment'真实姓名',
	private String is_sys;// tinyint default 0 comment'是否超级用户,默认0，0:否 1:是',
	private String telephone; // varchar(20) comment'固定电话',
	private String mobile;// varchar(20) comment'手机',
	private String description;// varchar(50) comment'描述',
	private String email;// varchar(30) comment'邮件',
	private Integer department_id;// tinyint comment'所属部门 部门ID',
	private String position;// varchar(20) comment'职位',
	private Date login_time;// datetime comment'最后登录时间',
	private Date add_time;// datetime comment'添加时间',
	private Integer is_enable;// tinyint default 1 comment'是否启用 1 1:启用 0：禁用'
	
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
