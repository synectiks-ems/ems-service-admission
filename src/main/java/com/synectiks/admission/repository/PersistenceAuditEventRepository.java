package com.synectiks.admission.repository;

import java.time.Instant;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.synectiks.admission.domain.PersistentAuditEvent;
import com.synectiks.admission.utils.JPASearchRepository;

/**
 * Spring Data JPA repository for the PersistentAuditEvent entity.
 */
public interface PersistenceAuditEventRepository
		extends JPASearchRepository<PersistentAuditEvent, Long> {

	List<PersistentAuditEvent> findByPrincipal(String principal);

	List<PersistentAuditEvent> findByAuditEventDateAfter(Instant after);

	List<PersistentAuditEvent> findByPrincipalAndAuditEventDateAfter(String principal,
			Instant after);

	List<PersistentAuditEvent> findByPrincipalAndAuditEventDateAfterAndAuditEventType(
			String principle, Instant after, String type);

	Page<PersistentAuditEvent> findAllByAuditEventDateBetween(Instant fromDate,
			Instant toDate, Pageable pageable);
}
