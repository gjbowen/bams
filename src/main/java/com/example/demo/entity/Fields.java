package com.example.demo.entity;

import lombok.Data;

@Data
public class Fields {

    private Integer pgmCode = 10460;
    private Integer zip = 90001;
    private Integer mileage;
    private Integer modelYear;
    private String effectiveDate = new java.sql.Date(System.currentTimeMillis()).toString();
    private boolean fullCoverage;
    private boolean singleVehicle;
    private Integer expectedMileage;

}
