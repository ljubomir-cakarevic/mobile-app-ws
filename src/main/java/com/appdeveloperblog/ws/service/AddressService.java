package com.appdeveloperblog.ws.service;

import java.util.List;

import com.appdeveloperblog.ws.shared.dto.AddressDTO;

public interface AddressService {

	List<AddressDTO> getAddresses(String userId);

}
