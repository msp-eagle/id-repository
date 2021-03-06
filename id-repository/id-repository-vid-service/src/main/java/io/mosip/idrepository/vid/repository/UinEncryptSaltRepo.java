package io.mosip.idrepository.vid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import io.mosip.idrepository.vid.entity.UinEncryptSalt;

/**
 * The Repository for UinEncryptSalt table.
 * 
 * @author Prem Kumar
 *
 */
public interface UinEncryptSaltRepo extends JpaRepository<UinEncryptSalt, Integer> {
	
	/**
	 * The Query to retrieve salt by passing id as parameter.
	 *
	 * @param id the id
	 * @return String salt
	 */
	@Query("select salt from UinEncryptSalt where id = :id")
	public String retrieveSaltById(@Param("id") int id);
}
