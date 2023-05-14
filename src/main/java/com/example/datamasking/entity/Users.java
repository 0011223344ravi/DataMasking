package com.example.datamasking.entity;

import com.example.datamasking.encryption.MaskData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Users {

    private String username;
    private String password;
    @MaskData
    private String mobileNo;

    private Integer age ;
}
