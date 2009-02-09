package org.broadleafcommerce.order.domain;

import java.io.Serializable;

import org.broadleafcommerce.profile.domain.Address;

//@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="TYPE")
//@Table(name = "SC_ORDER_SHIPPING")
public class OrderShipping implements Serializable {

	
	private static final long serialVersionUID = 1L;

//	@Id
//	@GeneratedValue
//	@Column(name = "SHIPPING_ID")
	private Long id;
	
//	@ManyToOne
//	@JoinColumn(name = "ORDER_ID")
	private BroadleafOrder order;
	
//	@ManyToOne
//	@JoinColumn(name = "ADDRESS_ID")
	private Address address;
	
//	@Column(name="COST")
	private double cost;
	
//	@Column(name="REFERENCE_NUMBER")
	private String referenceNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BroadleafOrder getOrder() {
		return order;
	}

	public void setOrder(BroadleafOrder salesOrder) {
		this.order = salesOrder;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
