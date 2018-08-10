package com.monkeyk.sos.domain.user;

import java.util.List;

import com.monkeyk.sos.domain.shared.Repository;

/**
 * @author Tim
 */

public interface UserRepository extends Repository {

	User findByGuid(String guid);

	void saveUser(User user);

	void updateUser(User user);

	User findByUsername(String username);

	List<User> findUsersByUsername(String username);
}