package com.laptrinhspringboot.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
	private static final long serialVersionID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String deleted;
	
	@CreatedDate
	private Date createdDate;
	
	@LastModifiedDate
	private Date updatedDate;
	
	private Long createdBy;
	
	private Long updatedBy;
}
