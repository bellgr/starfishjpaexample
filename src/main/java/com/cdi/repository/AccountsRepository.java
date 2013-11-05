package com.cdi.repository;

import com.cdi.models.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by gregbell on 11/5/13.
 */
public interface AccountsRepository extends JpaRepository<Accounts,Integer> {
}
