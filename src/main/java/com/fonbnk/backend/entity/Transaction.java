package com.fonbnk.backend.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transaction")
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "date_initiated")
    @CreationTimestamp
    private Date dateInitiated;

    @Column(name = "sender_number")
    private String senderNumber;

    @Column(name = "amount")
    private int amount;

    @Column(name = "recipient_number")
    private String recipientNumber;

    @Column(name = "transaction_type")
    private String transactionType;

    @Column(name = "status")
    private String status;

    @Column(name = "date_received")
    @UpdateTimestamp
    private Date dateReceived;

}
