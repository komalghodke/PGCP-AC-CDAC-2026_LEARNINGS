package com.demo.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Person{
	  @Id
       private int pid;
       private String pname;
       private String mob;
       @OneToMany(mappedBy="per")
       private Set<Address> addrset;
       
	   public Person() {
		super();
	   }
	   public Person(int pid, String pname, String mob, Set<Address> addrset) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.mob = mob;
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
	   public String getMob() {
		   return mob;
	   }
	   public void setMob(String mob) {
		   this.mob = mob;
	   }
	   public Set<Address> getAddrset() {
		   return addrset;
	   }
	   public void setAddrset(Set<Address> addrset) {
		   this.addrset = addrset;
	   }
	   @Override
	   public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", mob=" + mob + ", addrset=" + addrset + "]";
	   }
       
       
}
