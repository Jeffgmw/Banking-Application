package net.ems.emsBackEnd.service;

import net.ems.emsBackEnd.dto.AccountDto;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto AccountDto);
    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);
}
