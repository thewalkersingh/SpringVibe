package com.horizon.springvibe.entity.embedded;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_details")
public class Order {
	
	@EmbeddedId
	private OrderId id;
	private String orderNumber;
	private String customerName;
	
	@Embedded
	private Address address;
	
}