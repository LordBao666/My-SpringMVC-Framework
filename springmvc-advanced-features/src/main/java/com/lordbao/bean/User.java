package com.lordbao.bean;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

/**
 * @Author Lord_Bao
 * @Date 2024/8/14 9:59
 * @Version 1.0
 */
@Data
public class User {
    @NotBlank
    private String name;

    @Length(min=6)
    private String password;

    @Min(1)
    private Integer age;

    @Email
    private String email;

    @Past
    private Date birthday;
}
