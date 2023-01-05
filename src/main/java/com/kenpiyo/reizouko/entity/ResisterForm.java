package com.kenpiyo.reizouko.entity;

import java.sql.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ResisterForm {
    @Size(max = 256)
    @NotBlank
    private String syokuzaiName;

    @NotBlank
    @Size(max = 11)
    private int amount;

    private Date expDate;
}
