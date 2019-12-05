package com.synectiks.admission.repository.search;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;

/**
 * Configure a Mock version of {@link AdmissionApplicationSearchRepository} to test the
 * application without starting Elasticsearch.
 */
@Configuration
public class AdmissionApplicationSearchRepositoryMockConfiguration {

    @MockBean
    private AdmissionApplicationSearchRepository mockAdmissionApplicationSearchRepository;

}
