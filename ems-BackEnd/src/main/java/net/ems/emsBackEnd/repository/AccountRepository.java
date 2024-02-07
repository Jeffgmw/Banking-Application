package net.ems.emsBackEnd.repository;

import net.ems.emsBackEnd.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
