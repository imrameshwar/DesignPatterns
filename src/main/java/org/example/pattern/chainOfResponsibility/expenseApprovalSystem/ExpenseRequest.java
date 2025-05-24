package org.example.pattern.chainOfResponsibility.expenseApprovalSystem;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExpenseRequest {
    private String employeeName;
    private double amount;
    private String purpose;
}
