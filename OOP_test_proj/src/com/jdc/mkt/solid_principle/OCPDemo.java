package com.jdc.mkt.solid_principle;

public class OCPDemo {

	public static void main(String[] args) {

		Room h = new FamilyRoom();
		System.out.println(h.getCharges());
	}
}

class Room {

	double getCharges() {
		return 23.0;
	}
}

class Hotel {

//	public double getCharges(Room room) {
//
//		if (room instanceof DoubleRoom) {
//			return room.getCharges() * 2;
//
//		} else if (room instanceof SingleRoom) {
//			return room.getCharges();
//		} else {
//			return 0;
//		}
//	}
}

class DoubleRoom extends Room {
	
	@Override
	double getCharges() {
		return super.getCharges()*2;
	}

}

class SingleRoom extends Room {

	@Override
	double getCharges() {
		return super.getCharges();
	}
}

class FamilyRoom extends Room{
	@Override
	double getCharges() {
		return super.getCharges()*3;
	}
}
