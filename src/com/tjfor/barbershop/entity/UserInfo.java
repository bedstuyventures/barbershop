package com.tjfor.barbershop.entity;



/**
 * 
 * @author tangjie
 *
 */
public class UserInfo {
	private String clientUserId;
	private String clientName;
	private String userno;
	private String username;
	private String password;
	private String clientId;
	private String positionId;
	private int sex;
	private String tel;
	
	
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientUserId() {
		return clientUserId;
	}
	public void setClientUserId(String clientUserId) {
		this.clientUserId = clientUserId;
	}
	public String getUserno() {
		return userno;
	}
	public void setUserno(String userno) {
		this.userno = userno;
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
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getPositionId() {
		return positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "UserInfo [clientUserId=" + clientUserId + ", userno=" + userno
				+ ", username=" + username + ", password=" + password
				+ ", clientId=" + clientId + ", positionId=" + positionId
				+ ", sex=" + sex + ", tel=" + tel + "]";
	}
}
