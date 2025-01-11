package com.lld.sysdesign.bms.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import lombok.*;

@EqualsAndHashCode(callSuper = false)
@Table(name = "CUSTOMERS")
@Entity
@Builder(toBuilder = true)
@AllArgsConstructor
public class Customer extends Auditable {
    private String fullName;
    private String phone;
    private String city;
    private String email;

    public Customer(Builder builder) {
        this.fullName = builder.fullName;
        this.phone = builder.phone;
        this.city = builder.city;
        this.email = builder.email;
        this.bookings = builder.bookings;
        this.user = builder.user;
    }

    @OneToMany(mappedBy = "customer")
    private List<Booking> bookings = new ArrayList<>();

    @OneToOne
    private User user;

    public Customer() {
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

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String fullName;
        private String phone;
        private String city;
        private String email;
        private List<Booking> bookings;
        private User user;

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

        public Builder bookings(List<Booking> bookings) {
            this.bookings = bookings;
            return this;
        }

        public Builder user(User user) {
            this.user = user;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

}