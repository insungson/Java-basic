package day01; //p50

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 3;
		int days = 0;
		switch (month) {
		case 2:
			days = 28;
			break;
		case 4:
			days = 30;
		case 6:
			days = 30;
		case 9:
			days = 30;
		case 11:
			days = 30;
			break;
		default:
			days = 31;
			break;
		}

		System.out.println(month + "월은" + days + "날로구성되어 있습니다.");

		if (month == 2) {
			days = 28;
		} else if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
			days = 30;
		} else {
			days = 31;
		}

		System.out.println(month + "월은" + days + "날로구성되어 있습니다.");
	}

}
