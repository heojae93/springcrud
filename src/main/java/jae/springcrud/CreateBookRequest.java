package jae.springcrud;

import jakarta.validation.constraints.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import javax.validation.constraints.*;
import javax.validation.constraints.Max;

//DTO

public record CreateBookRequest(
         @Size(min = 2, max = 50) String title,
         @Size(min = 2, max = 30) String author,
         @Size(min = 13, max = 13) String isbn,
         @Positive Integer price,
         @Min(1900)@Max(2024) Integer publishedYear
) {



}