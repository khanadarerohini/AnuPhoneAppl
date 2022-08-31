package com.PhoneBook.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;



@Table(name="contact_Details")
@Entity
public class contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="CONTACT_ID")
	private Integer contactId;
	@Column(name ="CONTACT_NAME")
	private String contactName;
	@Column(name ="CONTACT_NUMBER")
	private String contactNumber;
	@Column(name ="CONTACT_EMAIL")
	private String contactEmail;
	@Column(name ="ACTIVE_SWITCH")
	private Character activeSwitch;
	@Column(name ="CREATED_DATE",updatable = false)
	@CreationTimestamp
	private LocalDate createdDate;
	@Column(name ="UPDATED_DATE",insertable = false)
	@UpdateTimestamp
	private LocalDate updateDate;
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public Character getActiveSwitch() {
		return activeSwitch;
	}
	public void setActiveSwitch(Character activeSwitch) {
		this.activeSwitch = activeSwitch;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "contact [contactId=" + contactId + ", contactName=" + contactName + ", contactNumber=" + contactNumber
				+ ", contactEmail=" + contactEmail + ", activeSwitch=" + activeSwitch + ", createdDate=" + createdDate
				+ ", updateDate=" + updateDate + "]";
	}

	

	
	
	


	
	
}
