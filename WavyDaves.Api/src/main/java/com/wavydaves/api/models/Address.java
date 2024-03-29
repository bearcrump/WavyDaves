package com.wavydaves.api.models;

import jakarta.persistence.*;
import org.springframework.lang.Nullable;

@Entity
@Table(name="addresses")
public class Address {
    private Integer id;
    private String country;
    private String state;
    private String city;
    private String line1;
    @Nullable
    private String line2;
    private Integer zip;

    public Address() {

    }
    public Address(Integer id, String country, String state, String city, String line1, @Nullable String line2, Integer zip) {
        this.id = id;
        this.country = country;
        this.state = state;
        this.city = city;
        this.line1 = line1;
        this.line2 = line2;
        this.zip = zip;
    }

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "line1")
    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    @Column(name = "line2", nullable = true)
    public String getLine2() {
        return line2;
    }

    public void setLine2(@Nullable String line2) {
        this.line2 = line2;
    }

    @Column(name = "zip")
    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }
}
