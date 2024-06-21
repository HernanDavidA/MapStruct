package com.mapStructure.MapStructureWorkshop.infraestructure.abstract_service;

import com.mapStructure.MapStructureWorkshop.api.dto.request.UserRequest;
import com.mapStructure.MapStructureWorkshop.api.dto.response.UserResponse;

public interface IUserService extends CRUDService<UserResponse, UserRequest, String>{

}
