package tech.savchenko.payroll;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

record VacationLeave(@JsonProperty("startDate") LocalDate startDate, @JsonProperty("endDate") LocalDate endDate,
                     @JsonProperty("employeeName") String employeeName) {

}
