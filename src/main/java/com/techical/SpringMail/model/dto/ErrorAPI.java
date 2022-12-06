package com.techical.SpringMail.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Getter
@Setter
public class ErrorAPI implements Serializable {

    private LocalDate localDate;

    private Object data;

}
