package com.Netsoc.place.placeUser;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface UserRepo {
    Optional<appUser> findByEmail(String email);
}
