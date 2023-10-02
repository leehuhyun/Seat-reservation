package booktheseat;

import java.util.Scanner;

//Main Ŭ����
public class SeatMain {
	static String[][] seatCells = new String[16][5];
//   8��, 4ĭ�� �¼��� ���� ������ �¼�ǥ, �¼���ȣ�� ���࿩�θ� ��Ÿ���� ��ȣ�� ���� ����ϱ� ����
//   16��, �׸��� ����ĭ�� ��ĭ ����ΰ� 5���� ���ڿ� �迭�� ������.
	static Seats seat[] = new Seats[33];
//   �� 32���� �¼� ��ü ����, �¼��迭�� �ε����� ���� �¼���ȣ�� ��ġ���� �������� ���̱� ����
//   0��° �ε��� �迭�� ������ 33���� �迭 ������.
	static Scanner sc = new Scanner(System.in);
	static void printSeat() {
		int seatIndexNo = 1;
		int seatNoVar = 1;
//	   Ȧ�������� ������ 1�� �����Ͽ� �¼���ȣ�� ��� ���� ������
//	   ¦�������� �¼���ü �ϳ��ϳ��� �����ϱ� ���� �ε��� ������ �� ���� ����
		for (int i = 0; i < seatCells.length; i++) {
			for (int j = 0; j < seatCells[i].length; j++) {
				if (j == 2) {
					System.out.print("   ");
//             ��� ���� ����
				} else if (i == 0 || i % 2 == 0) {
					System.out.printf("%3d", seatNoVar);
					seatNoVar++;
//             Ȧ�������� �¼���ȣ ���
				} else if (i == 1 || i % 2 == 1 || j != 2) {
					if (seat[seatIndexNo].isBooked()) {
						System.out.print(" ���");
					} else {
						System.out.print(" ���");
					}
					seatIndexNo++;
//             ¦�������� �� seat��ü�� booked boolean �� ���� ���Ͽ� ����� �¼��� ��ĥ�� �׸�
//             �����Ͽ� ����� �¼� ǥ��.
				}
			}
			System.out.println();
		}
		System.out.println("|�� �¼� : ��� | \n"
				+ "|���� �¼� : ��� |");
		System.out.println();
	}

	static void initSampleSeats() {
		//�����¼���. seatsŬ������ �����ڸ� �����ʱ�ȭ��
		seat[5].initSample(5,1001);
		seat[8].initSample(8,1002);
		seat[12].initSample(12,1003);
		seat[19].initSample(19,1004);
		seat[20].initSample(20,1005);
		seat[30].initSample(30,1006);
	}

	
	
	static void printMenuTitle(String title) {
		if (title.equals("�����մϴ�.")) {
			System.out.println("-----------");
			System.out.println("�����մϴ�.");
			System.out.println("-----------");
		} else {
			System.out.println("-----------");
			System.out.println(title);
			System.out.println("-----------");
		}
	}
	

	public static void main(String[] args) {

		String menuNav;
		

		for (int i = 1; i < seat.length; i++) {
			seat[i] = new Seats(i,0000); // Ex2 Ŭ������ �ν��Ͻ��� �����Ͽ� �迭 ��ҿ� �Ҵ�
		}
		initSampleSeats();
		System.out.println("--------------------------------");
		System.out.println("|      �׸����� ����ý���         |");
		System.out.println("|         ȯ���մϴ�             |");
		
		app: while (true) {

			System.out.println("-------------�޴�-----------------");
			System.out.println("| 1. �¼���Ȳ | 2. ���� | 3. ��� |");
			System.out.println("| 4. ���� |");
			System.out.println("���Ͻô� �޴��� ��ȣ�� �Է� �ٶ��ϴ�.");
			System.out.print(">");
			menuNav = sc.nextLine();
			int flag = Integer.parseInt(menuNav);
			switch (flag) {
			case 1:
				printMenuTitle("�¼���Ȳ");
				printSeat();
				break;
			case 2:
				printMenuTitle("����");
				//bookSeat();
				break;
			case 3:
				printMenuTitle("���");
				//cancel();
				break;
			case 4:
				printMenuTitle("�����մϴ�.");
				break app;

			default:
				System.out.println("1~5 ������ ���ڸ� �Է��Ͻʽÿ�.");
			}

		}
	}
}