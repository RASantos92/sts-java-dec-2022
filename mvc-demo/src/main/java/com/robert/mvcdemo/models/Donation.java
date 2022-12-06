package com.robert.mvcdemo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="donations")
public class Donation {
	// attributes, quantity ,donor, donationName
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @NotNull
    @Size(min = 1, max = 20, message="donor name needs to be more than 1 character")
    private String donor;
    
    @NotNull
    @Size(min = 3, max = 255, message="donation name needs to be more than 3 character less than 255")
    private String donationName;
    
    @Min(value=0, message="quantity needs to be more than 0")
    @NotNull
    private Integer quantity;
    
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	
	
    // constructors
	public Donation() {}


	public Donation(
			@NotNull @Size(min = 1, max = 20, message = "donor name needs to be more than 1 character") String donor,
			@NotNull @Size(min = 3, max = 255, message = "donation name needs to be more than 3 character less than 255") String donationName,
			@Min(value = 0, message = "quantity needs to be more than 0") @NotNull Integer quantity) {
		this.donor = donor;
		this.donationName = donationName;
		this.quantity = quantity;
	}
	// other methods


	//getters and setters
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDonor() {
		return donor;
	}


	public void setDonor(String donor) {
		this.donor = donor;
	}


	public String getDonationName() {
		return donationName;
	}


	public void setDonationName(String donationName) {
		this.donationName = donationName;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	// other methods
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
	
	

}
