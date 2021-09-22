package com.laptrinhspringboot.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="t_persmission")
@Getter
@Setter
public class PermissionEntity {
	private String permissionName;
	private String permissionKey;
}
