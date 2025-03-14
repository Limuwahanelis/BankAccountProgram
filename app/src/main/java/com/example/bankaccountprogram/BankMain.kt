package com.example.bankaccountprogram

fun main()
{
    val denisBankAccount = BankAccount("Denis gds", 1294.00);

    println(denisBankAccount.accountHolder);

    denisBankAccount.deposit(41.89);
    denisBankAccount.withdraw(150.55);
    denisBankAccount.displayTransactionHistory();
}