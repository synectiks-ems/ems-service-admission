package com.synectiks.admission.service;

import com.synectiks.admission.service.dto.InsuranceDTO;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing Insurance.
 */
public interface InsuranceService {

    /**
     * Save a insurance.
     *
     * @param insuranceDTO the entity to save
     * @return the persisted entity
     */
    InsuranceDTO save(InsuranceDTO insuranceDTO);

    /**
     * Get all the insurances.
     *
     * @return the list of entities
     */
    List<InsuranceDTO> findAll();
    /**
     * Get all the InsuranceDTO where Vehicle is null.
     *
     * @return the list of entities
     */
    List<InsuranceDTO> findAllWhereVehicleIsNull();


    /**
     * Get the "id" insurance.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<InsuranceDTO> findOne(Long id);

    /**
     * Delete the "id" insurance.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

    /**
     * Search for the insurance corresponding to the query.
     *
     * @param query the query of the search
     * 
     * @return the list of entities
     */
    List<InsuranceDTO> search(String query);
}
