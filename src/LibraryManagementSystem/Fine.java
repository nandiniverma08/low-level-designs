package LibraryManagementSystem;

public class Fine {

    private String fineId;
    private Loan loan;
    private double amount;
    private boolean paid;

    public Fine(String fineId, Loan loan, double amount) {
        this.fineId = fineId;
        this.loan = loan;
        this.amount = amount;
        this.paid = false;
    }

    public String getFineId() {
        return fineId;
    }

    public Loan getLoan() {
        return loan;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isPaid() {
        return paid;
    }

    public void markAsPaid() {
        this.paid = true;
    }
}
