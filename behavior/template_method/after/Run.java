package behavior.template_method.after;

public class Run {
    
    Gateway gateway = new Gateway();

    CreditPayment credit = new CreditPayment(100.00f, gateway);
    boolean creditCharge = credit.charge();

    DebitPayment debit = new DebitPayment(100.00f, gateway);
    boolean debitCharge = debit.charge();

    CashPayment cash = new CashPayment(100.00f, gateway);
    boolean cashCharge = cash.charge();

}
