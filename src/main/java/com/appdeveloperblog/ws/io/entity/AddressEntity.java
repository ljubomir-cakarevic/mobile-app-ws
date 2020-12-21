package com.appdeveloperblog.ws.io.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import com.appdeveloperblog.ws.shared.dto.UserDto;

@Entity(name="addresses")
public class AddressEntity implements Serializable {

	private static final long serialVersionUID = -7077945669102049344L;
	private long id;
	private String city;
	private String country;
	private String streetName;
	private String postalCode;
	private String type;
	private UserDto userDetails;

}
