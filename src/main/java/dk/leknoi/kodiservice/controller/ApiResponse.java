package dk.leknoi.kodiservice.controller;

import lombok.Data;
import org.springframework.hateoas.Link;

import java.util.List;

@Data
public class ApiResponse<T> {
    private T result;
    private String message;
    private List<ErrorField> errors;
    private Integer reasonCode;
    private List<Link> links;

    public ApiResponse(T result) {
        this.result = result;
    }
}
