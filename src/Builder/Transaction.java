package Builder;

public class Transaction {

    // Transaction fields
    private final double amount;
    private final String currency;
    private final String description;
    private final String referenceNumber;
    private final String notes;

    // Private constructor
    private Transaction(Builder builder) {
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.description = builder.description;
        this.referenceNumber = builder.referenceNumber;
        this.notes = builder.notes;
    }

    // Getters
    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getDescription() {
        return description;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public String getNotes() {
        return notes;
    }

    // Builder class INSIDE Transaction
    public static class Builder {

        // Required fields
        private final double amount;
        private final String currency;

        // Optional fields
        private String description;
        private String referenceNumber;
        private String notes;

        // Constructor for required fields
        public Builder(double amount, String currency) {

            if (amount <= 0) {
                throw new IllegalArgumentException(
                        "Amount must be positive"
                );
            }

            if (currency == null || currency.isBlank()) {
                throw new IllegalArgumentException(
                        "Currency is required"
                );
            }

            this.amount = amount;
            this.currency = currency;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder referenceNumber(String referenceNumber) {
            this.referenceNumber = referenceNumber;
            return this;
        }

        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        // Creates the final Transaction object
        public Transaction build() {
            return new Transaction(this);
        }
    }
}