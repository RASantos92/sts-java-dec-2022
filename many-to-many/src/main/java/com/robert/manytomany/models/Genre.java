package com.robert.manytomany.models;

import java.util.Date;
import java.util.List;
import java.util.Locale.Category;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="genres")
public class Genre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // generates an auto incrementing 
	private Long id;
	
	@NotEmpty(message = "Title is required!") // validation for strings
	private String name;
	
	
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "games_genres", 
        joinColumns = @JoinColumn(name = "genre_id"), 
        inverseJoinColumns = @JoinColumn(name = "game_id")
    )
    private List<Game> games;
	
    @Column(updatable = false)
	private Date createdAt;
    @Column(updatable = false)
	private Date updatedAt;

	public Genre() {}
	
	
    public Long getId() {
		return id;
	}


	public List<Game> getGames() {
		return games;
	}


	public void setGames(List<Game> games) {
		this.games = games;
	}


	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getCreatedAt() {
		return createdAt;
	}





	public Date getUpdatedAt() {
		return updatedAt;
	}





	@PrePersist // adds the created at date and time to sql on creation 
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate // add the updated at date and time when being updated
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

}
