package com.jdc.mkt;

public abstract class Vehicle {

	public ServiceType type;
	


	public Vehicle(ServiceType type) {
		this.type = type;
		
	}

	abstract ServiceType getType();
	
	public static ServiceType getServiceName(int sName) {
		return switch (sName) {
		case 1 -> ServiceType.WASH;
		case 2 -> ServiceType.SOAP;
		case 3 -> ServiceType.KIT;
		default -> null;
		};
	}

	
}
