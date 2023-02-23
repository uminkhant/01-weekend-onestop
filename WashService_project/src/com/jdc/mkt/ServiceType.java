package com.jdc.mkt;

public enum ServiceType {

	WASH {
		@Override
		public int getCharges() {
			return 1000;
		}
	},SOAP {
		@Override
		public int getCharges() {
			return 500;
		}
	},KIT {
		@Override
		public int getCharges() {
			return 500;
		}
	};
	
	
	public abstract int getCharges();
	
	
}
