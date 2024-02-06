package com.hasassociation;

public class Hospital {
	private String hospital_name;
	private int bedNo;
	private int patient_id;
	
	public String getHospital_name() {
		return hospital_name;
	}
	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}
	public int getBedNo() {
		return bedNo;
	}
	public void setBedNo(int bedNo) {
		this.bedNo = bedNo;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public Hospital() {
		super();
	}
	public Hospital(String hospital_name, int bedNo, int patient_id, String disease) {
		super();
		this.hospital_name = hospital_name;
		this.bedNo = bedNo;
		this.patient_id = patient_id;
		
	}
	public Hospital(String string, int i, int j) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Hospital [hospital_name=" + hospital_name + ", bedNo=" + bedNo + ", patient_id=" + patient_id
				+ ", disease=" + "]";
	}
	
	
	
	
	
}
