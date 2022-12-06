package com.techical.SpringMail.model.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
public class ResponseAPI implements Serializable {

    private LocalDate date;

    private Object data;


}
