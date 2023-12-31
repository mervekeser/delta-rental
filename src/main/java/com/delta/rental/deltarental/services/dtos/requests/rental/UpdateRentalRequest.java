package com.delta.rental.deltarental.services.dtos.requests.rental;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateRentalRequest {
    @NotNull(message = "Id boş geçilemez")
    @Positive(message = "Id 0'dan küçük olamaz")
    private int id;


    private LocalDate startDate;


    private LocalDate endDate;


    private LocalDate returnDate;

    //private double startKilometer;

    private double endKilometer;

    private double discount;

    private int carId;

    private int customerId;

    private int employeeId;
}
