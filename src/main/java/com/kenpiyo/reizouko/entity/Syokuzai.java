package com.kenpiyo.reizouko.entity;

import java.time.LocalDate;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Syokuzai{
    private long id;
    private String syokuzaiName;
    private int amount;
    private LocalDate expDate;

}