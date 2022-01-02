package com.mycompany.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository repo;

    public List<Account> listAll() {
        return (List<Account>) repo.findAll();
    }

    public void save(Account user) {
        repo.save(user);
    }

    public Account get(Integer id) throws AccountNotFoundException {
        Optional<Account> result = repo.findById(id);
        if (result.isPresent()) {
            return result.get();
        }
        throw new AccountNotFoundException("Could not find any users with ID" + id);
    }

    /*
    Implement for the delete handling
     */

    public void delete(Integer id) throws AccountNotFoundException {
        Long count = repo.countById(id);
        if (count == null || count == 0) {
            throw new AccountNotFoundException("Could not find any users with ID" + id);
        }
        repo.deleteById(id);
    }
}


