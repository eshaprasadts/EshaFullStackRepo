package io.github.esha.fullsapp.repository;

import io.github.esha.fullsapp.domain.Authority;

/**
 * Spring Data Couchbase repository for the Authority entity.
 */
public interface AuthorityRepository extends N1qlCouchbaseRepository<Authority, String> {
}
