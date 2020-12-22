package com.appdeveloperblog.ws.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.appdeveloperblog.ws.io.entity.AddressEntity;
import com.appdeveloperblog.ws.io.entity.UserEntity;
import com.appdeveloperblog.ws.repository.UserRepository;
import com.appdeveloperblog.ws.service.AddressService;
import com.appdeveloperblog.ws.shared.dto.AddressDTO;
import com.appdeveloperblog.ws.ui.model.response.AddressesRest;

public class AddressServiceImpl implements AddressService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	AddressRepository addressRepository;

	@Override
	public List<AddressDTO> getAddresses(String userId) {
		List<AddressDTO> returnValue = new ArrayList<>();
		ModelMapper modelMapper = new ModelMapper();
		
		UserEntity userEntity = userRepository.findByUserId(userId);
		if(userEntity == null) return returnValue;
		
		Iterable<AddressEntity> addresses = addressRepository.findAllByUserDetails(userEntity);
		for(AddressEntity addressEntity : addresses) {
			returnValue.add(modelMapper.map(addressEntity, AddressDTO.class));
		}
		
		
		return returnValue;
	}

}
