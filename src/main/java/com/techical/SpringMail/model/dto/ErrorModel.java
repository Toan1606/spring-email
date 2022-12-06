package com.techical.SpringMail.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
@Getter
@Setter
@Builder
public class ErrorModel implements Serializable {

    private String errorCode;

    private String errorMessage;

    private String fieldName;
}
