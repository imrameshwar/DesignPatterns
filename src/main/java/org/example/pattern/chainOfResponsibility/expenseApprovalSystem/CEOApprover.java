package org.example.pattern.chainOfResponsibility.expenseApprovalSystem;

public class CEOApprover extends Approver{
    @Override
    public void approve(ExpenseRequest request) {
        if (request.getAmount() > 200000) {
            System.out.println("CEO approved expense request for " + request.getEmployeeName() + " of amount: " + request.getAmount());
        } else {
            System.out.println("Expense request for " + request.getEmployeeName() + " of amount: " + request.getAmount() + " is already approved or unhandled.");
        }
    }
}
