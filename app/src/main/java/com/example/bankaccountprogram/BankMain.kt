package com.example.bankaccountprogram

fun main()
{
    val denisBankAccount = BankAccount("Denis gds", 1294.00);

    println(denisBankAccount.accountHolder);

    denisBankAccount.deposit(41.89);
    denisBankAccount.withdraw(150.55);
    denisBankAccount.displayTransactionHistory();

    val sarahBankAccount = BankAccount("Sarah",0.0);
    sarahBankAccount.deposit(100.0);
    sarahBankAccount.withdraw(10.0);
    sarahBankAccount.deposit(300.0);
    sarahBankAccount.displayTransactionHistory();
    sarahBankAccount.accountBalance();
}