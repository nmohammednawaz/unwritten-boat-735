package com.inventoryxpert.entities;

import java.time.LocalDateTime;

import com.inventoryxpert.enumholder.PaymentMode;
import com.inventoryxpert.enumholder.TransactionStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order orderDetails;

    private LocalDateTime transactionDateAndTime;

    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;

    @Enumerated(EnumType.STRING)
    private TransactionStatus transactionStatus;

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(Order orderDetails, LocalDateTime transactionDateAndTime, PaymentMode paymentMode,
			TransactionStatus transactionStatus) {
		super();
		this.orderDetails = orderDetails;
		this.transactionDateAndTime = transactionDateAndTime;
		this.paymentMode = paymentMode;
		this.transactionStatus = transactionStatus;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public Order getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(Order orderDetails) {
		this.orderDetails = orderDetails;
	}

	public LocalDateTime getTransactionDateAndTime() {
		return transactionDateAndTime;
	}

	public void setTransactionDateAndTime(LocalDateTime transactionDateAndTime) {
		this.transactionDateAndTime = transactionDateAndTime;
	}

	public PaymentMode getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}

	public TransactionStatus getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(TransactionStatus transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
    
    
}
