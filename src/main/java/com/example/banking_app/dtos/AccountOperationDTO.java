package com.example.banking_app.dtos;

import com.example.banking_app.enums.OperationType;
import lombok.AllArgsConstructor;
import lombok.Data;



import java.util.Date;

@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}
