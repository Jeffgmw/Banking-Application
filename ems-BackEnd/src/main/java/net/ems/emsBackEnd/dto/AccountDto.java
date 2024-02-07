package net.ems.emsBackEnd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountDto {

    private long Id;
    private String Name;
    private double balance;
}
