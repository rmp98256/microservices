package com.mayur.ratting.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Rating_Table")
public class Rating {
	
	@Id
	private String ratingid;
	
	private String userid;
	
	private String hotelid;
	
	private int rating;
	
	private String remark;

}
