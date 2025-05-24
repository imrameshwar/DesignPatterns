package org.example.pattern.chainOfResponsibility.expenseApprovalSystem;

public abstract class Approver {
    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void approve(ExpenseRequest request);
}
