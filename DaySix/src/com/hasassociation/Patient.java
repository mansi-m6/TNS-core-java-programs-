package com.hasassociation;

public class Patient {
	private String patient_name;
	
	private Hospital hospital;
	
	public Patient(String patient_name,  Hospital hospital) {
		super();
		this.patient_name = patient_name;
		
		this.hospital = hospital;
	}

	public Patient() {
		super();
	}

	

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	
	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public void display() {
		System.out.println("\n name of patient : "+patient_name);
		System.out.println("Hospital Details \nName:"+hospital.getHospital_name()+"\n Bed no:"+hospital.getBedNo()+"\n Patient Id:"+hospital.getPatient_id());
	}
	
	

}
