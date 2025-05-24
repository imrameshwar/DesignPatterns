package org.example.pattern.chainOfResponsibility.expenseApprovalSystem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ExpenseApprovalSystem {
    public static void main(String[] args) {
        // Set up the chain of approvers
        Approver teamLead = new TeamLeadApprover();
        Approver manager = new ManagerApprover();
        Approver director = new DirectorApprover();
        Approver ceo = new CEOApprover();

        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        // Create some expense requests
        ExpenseRequest request1 = new ExpenseRequest("Alice", 3000, "Travel expenses for project meeting");
        ExpenseRequest request2 = new ExpenseRequest("Bob", 40000, "Conference registration and travel");
        ExpenseRequest request3 = new ExpenseRequest("Charlie", 150000, "Office renovation expenses");
        ExpenseRequest request4 = new ExpenseRequest("David", 250000, "New office equipment purchase");
        // Process the expense requests
        teamLead.approve(request1);
        teamLead.approve(request2);
        teamLead.approve(request3);
        teamLead.approve(request4);
    }
}