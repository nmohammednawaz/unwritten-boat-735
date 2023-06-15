package com.inventoryxpert.entities;

import java.time.LocalDateTime;

import com.inventoryxpert.enumholder.PaymentMode;
import com.inventoryxpert.enumholder.TransactionStatus;

public class Transaction {
	
	private int transactionId;
	
	private Order orderDetails;
	
	private LocalDateTime transactionDateAndTime;
	
	private PaymentMode paymentMode;
	
	private TransactionStatus transactionStatus;

}
