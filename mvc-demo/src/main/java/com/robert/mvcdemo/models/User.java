package com.robert.mvcdemo.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="User name is required")
	@Size(min = 5 , max = 15, message = "User name needs to be between 5-15 characters")
	private String userName;
	
	@NotEmpty(message="Email is required")
	@Email(message= "Invalid Email!")
	private String email;
	
    @OneToMany(mappedBy="donor", fetch = FetchType.LAZY)
    private List<Donation> donations;
	
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	
	public User() {}
	
	
    public User(
			@NotEmpty(message = "User name is required") @Size(min = 5, max = 15, message = "User name needs to be between 5-15 characters") String userName,
			@NotEmpty(message = "Email is required") @Email(message = "Invalid Email!") String email) {
		super();
		this.userName = userName;
		this.email = email;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreatedAt() {
		return createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}

	

	public List<Donation> getDonations() {
		return donations;
	}


	public void setDonations(List<Donation> donations) {
		this.donations = donations;
	}


	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

}
