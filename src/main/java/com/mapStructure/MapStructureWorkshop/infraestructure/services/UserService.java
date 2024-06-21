package com.mapStructure.MapStructureWorkshop.infraestructure.services;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.mapStructure.MapStructureWorkshop.api.dto.request.UserRequest;
import com.mapStructure.MapStructureWorkshop.api.dto.response.UserResponse;
import com.mapStructure.MapStructureWorkshop.infraestructure.abstract_service.IUserService;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Service
@AllArgsConstructor
public class UserService implements IUserService{@Override
    public UserResponse create(UserRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public UserResponse getById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public UserResponse update(UserRequest request, String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Page<UserResponse> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

}
