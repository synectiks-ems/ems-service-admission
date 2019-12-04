package com.synectiks.admission.service;

import com.synectiks.admission.service.dto.StudentExamReportDTO;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing StudentExamReport.
 */
public interface StudentExamReportService {

    /**
     * Save a studentExamReport.
     *
     * @param studentExamReportDTO the entity to save
     * @return the persisted entity
     */
    StudentExamReportDTO save(StudentExamReportDTO studentExamReportDTO);

    /**
     * Get all the studentExamReports.
     *
     * @return the list of entities
     */
    List<StudentExamReportDTO> findAll();


    /**
     * Get the "id" studentExamReport.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<StudentExamReportDTO> findOne(Long id);

    /**
     * Delete the "id" studentExamReport.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

    /**
     * Search for the studentExamReport corresponding to the query.
     *
     * @param query the query of the search
     * 
     * @return the list of entities
     */
    List<StudentExamReportDTO> search(String query);
}
