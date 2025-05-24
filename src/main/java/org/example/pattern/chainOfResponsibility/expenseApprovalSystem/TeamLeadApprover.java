package org.example.pattern.chainOfResponsibility.expenseApprovalSystem;

public class TeamLeadApprover extends Approver{
    @Override
    public void approve(ExpenseRequest request) {
        if (request.getAmount() <= 10000) {
            System.out.println("Team Lead approved expense request for " + request.getEmployeeName() + " of amount: " + request.getAmount());
        } else if (nextApprover != null) {
            nextApprover.approve(request);
        } else {
            System.out.println("Expense request for " + request.getEmployeeName() + " of amount: " + request.getAmount() + " cannot be approved.");
        }
    }
}
