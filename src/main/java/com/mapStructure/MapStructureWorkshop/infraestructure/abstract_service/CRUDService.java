package com.mapStructure.MapStructureWorkshop.infraestructure.abstract_service;

import org.springframework.data.domain.Page;

public interface CRUDService <RS, RQ, ID> {

    public RS create(RQ request);

    public RS getById(ID id);

    public RS update(RQ request, ID id);

    public void delete(ID id);

    public Page<RS> getAll(int page, int size);

}
