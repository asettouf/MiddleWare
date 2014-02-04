package com.middle.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Rel")
public class Release {
	
	
	private int releaseId;
	private int releaseNumber;


	public Release() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public int getReleaseId() {
		return releaseId;
	}

	public void setReleaseId(int releaseId) {
		this.releaseId = releaseId;
	}
	
	@Column(name = "relNum")
	public int getReleaseNumber() {
		return releaseNumber;
	}

	public void setReleaseNumber(int releaseNumber) {
		this.releaseNumber = releaseNumber;
	}

}
