package com.demo.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import com.demo.model.Address;
@Entity
@Table(name="person12")
public class Person {
	@Id
	private int pid;
	private String pname;
	private String mobile;
	@ManyToMany      //(fetch=FetchType.EAGER)
	@JoinTable(name="per_addr",joinColumns= {@JoinColumn(referencedColumnName="pid")},inverseJoinColumns= {@JoinColumn(referencedColumnName="aid")})
	private Set<Address> addrset;
	public Person() {
		super();
	}
	public Person(int pid, String pname, String mobile, Set<Address> addrset) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.mobile = mobile;
		this.addrset = addrset;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Set<Address> getAddrset() {
		return addrset;
	}
	public void setAddrset(Set<Address> addrset) {
		this.addrset = addrset;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", mobile=" + mobile + ", addrset=" + addrset + "]";
	}
	

}
