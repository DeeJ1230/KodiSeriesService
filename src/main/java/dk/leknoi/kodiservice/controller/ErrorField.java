package dk.leknoi.kodiservice.controller;

import lombok.Data;

@Data
public class ErrorField {
    private String returnCode;
    private String reasonCode;
    private String field;
    private String message;

}
