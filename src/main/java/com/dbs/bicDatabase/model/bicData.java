package com.dbs.bicDatabase.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class bicData {

	
	@Id
	String bic;
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getInstitutionName() {
		return institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	public bicData(String bic, String institutionName) {
		super();
		this.bic = bic;
		this.institutionName = institutionName;
	}
	public bicData() {
		super();
		// TODO Auto-generated constructor stub
	}
	String institutionName;

}
