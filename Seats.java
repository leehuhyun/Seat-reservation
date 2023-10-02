package booktheseat;

public class Seats {
	private int seatNo; // �¼� ��ȣ
	private int bookedCustNo; // ���� ��ȣ
	private boolean booked; // ���� ����

	public Seats(int seatNo, int bookedCustNo) {
		this.seatNo = seatNo;
		this.bookedCustNo = bookedCustNo;
		this.booked = false;
	}
	
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public void setBookedCustNo(int bookedCustNo) {
		this.bookedCustNo = bookedCustNo;
	}

	public void setBooked(boolean booked) {
		this.booked = booked;
	}
	
	public void initSample(int seatNo, int bookedCustNo) {
		this.seatNo = seatNo;
		this.bookedCustNo = bookedCustNo;
		this.booked = true;
	}


	public int getSeatNo() {
		return seatNo;
	}

	public int getBookedCustNo() {
		return bookedCustNo;
	}

	public boolean isBooked() {
		return booked;
	}

}