package com.mycompany.user;

import org.springframework.data.repository.CrudRepository;


public interface AccountRepository extends CrudRepository<Account, Integer> {
    public Long countById(Integer id);
}
