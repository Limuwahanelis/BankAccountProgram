package com.example.bankaccountprogram

class BankAccount(var accountHolder:String, var balance:Double)
{

    private val _transactionHistory= mutableListOf<String>();
    fun deposit(amount:Double)
    {
        balance+=amount;
        _transactionHistory.add("$accountHolder deposited $$amount");
    }
    fun withdraw(amount:Double)
    {
        if(amount<=balance)
        {
            balance -= amount;
            _transactionHistory.add("$accountHolder withdrawn $$amount");
        }
        else println("Not enough money to withdraw $amount");
    }
    fun displayTransactionHistory()
    {
        println("Transaction history for $accountHolder");
        for (transaction in _transactionHistory)
        {
            println(transaction);
        }
    }
}