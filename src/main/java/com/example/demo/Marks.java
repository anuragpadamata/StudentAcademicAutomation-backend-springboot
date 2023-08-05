package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Marks {
	
	@Id
	private String rollnumber;
	private int oops;
	private int os;
	private int se;
	private int mfcs;	
	private int oopslab;
	private int oslab;
	private int selab;
	private int numpy;
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Marks(String rollnumber, int oops, int os, int se, int mfcs, int oopslab, int oslab, int selab, int numpy) {
		super();
		this.rollnumber = rollnumber;
		this.oops = oops;
		this.os = os;
		this.se = se;
		this.mfcs = mfcs;
		this.oopslab = oopslab;
		this.oslab = oslab;
		this.selab = selab;
		this.numpy = numpy;
	}
	public String getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}
	public int getOops() {
		return oops;
	}
	public void setOops(int oops) {
		this.oops = oops;
	}
	public int getOs() {
		return os;
	}
	public void setOs(int os) {
		this.os = os;
	}
	public int getSe() {
		return se;
	}
	public void setSe(int se) {
		this.se = se;
	}
	public int getMfcs() {
		return mfcs;
	}
	public void setMfcs(int mfcs) {
		this.mfcs = mfcs;
	}
	public int getOopslab() {
		return oopslab;
	}
	public void setOopslab(int oopslab) {
		this.oopslab = oopslab;
	}
	public int getOslab() {
		return oslab;
	}
	public void setOslab(int oslab) {
		this.oslab = oslab;
	}
	public int getSelab() {
		return selab;
	}
	public void setSelab(int selab) {
		this.selab = selab;
	}
	public int getNumpy() {
		return numpy;
	}
	public void setNumpy(int numpy) {
		this.numpy = numpy;
	}
	
	
	

	
	
		

}
