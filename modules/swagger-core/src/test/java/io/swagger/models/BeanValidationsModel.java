package io.swagger.models;

import java.util.List;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class BeanValidationsModel {
    @NotNull
    protected Long id;

    @Min(13)
    @Max(99)
    protected Integer age;

    protected String username;

    @Size(min = 6, max = 20)
    protected String password;

    protected String passwordHint;

    @Pattern(regexp = "(.+?)@(.+?)")
    protected String email;

    @DecimalMin(value = "0.1", inclusive = false)
    protected Double minBalance;

    @DecimalMax(value = "1000000", inclusive = false)
    protected Double maxBalance;

    protected Integer birthYear;

    @Size(min = 2, max = 10)
    private List<String> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(Double minBalance) {
        this.minBalance = minBalance;
    }

    public Double getMaxBalance() {
        return maxBalance;
    }

    public void setMaxBalance(Double maxBalance) {
        this.maxBalance = maxBalance;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}
