package com.lld.sysdesign.bms.dto;

import lombok.Builder;
import lombok.Data;

public class CreateCustomerDTO {
    private String username;
    private String password;
    private String fullName;
    private String phone;
    private String city;
    private String email;

    private com.lld.sysdesign.bms.dto.CreateCustomerDTO.Builder CreateCustomerDTO() {
        return new Builder();
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String username;
        private String password;
        private String fullName;
        private String phone;
        private String city;
        private String email;

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public CreateCustomerDTO build() {
            CreateCustomerDTO customerDTO = new CreateCustomerDTO();
            customerDTO.username = this.username;
            customerDTO.password = this.password;
            customerDTO.fullName = this.fullName;
            customerDTO.phone = this.phone;
            customerDTO.city = this.city;
            customerDTO.email = this.email;
            return customerDTO;
        }
    }

}
