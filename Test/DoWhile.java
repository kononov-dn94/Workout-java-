//накопительный счет с учетом процентов

public class DoWhile {
	public static void main(String[] args) {
		int finalBalance = 4000000; //сумма, которую необходимо накопить 
		double currentBalance = 0; //текущий баланс по счету
		int deposit = 70000; //сумма, которую вносим раз в месяц
		int month = 0; //месяца, за которые будет внесена вся сумма
		int years = 0; //кол-во лет, за которые будет внесена вся сумма
		double interestRate = 0.1; //проценты, которые будут начисленны за год

		 while(currentBalance < finalBalance) {
			currentBalance = currentBalance + deposit; //высчитываем текущий баланс на счете
			month++;
			System.out.println("Month" + month + " - " +currentBalance);

			if(month == 12) {
				years++;
				System.out.println("Years = " +years);
				if(years == 1) {
					currentBalance = currentBalance + currentBalance * interestRate;
				}
			} else if (month == 24) {
				years++;
				System.out.println("Years = " +years);
				if(years == 2) {
					currentBalance = currentBalance + currentBalance * interestRate;
				}
			} else if (month == 36) {
				years++;
				System.out.println("Years = " +years);
				if(years == 3) {
					currentBalance = currentBalance + currentBalance * interestRate;
				}
			} else if (month == 48) {
				years++;
				System.out.println("Years = " +years);
				if(years == 4) {
					currentBalance = currentBalance + currentBalance * interestRate;
				}
                        } else if (month == 60) {
				years++;
				System.out.println("Years = " +years);
				if(years == 5) {
					currentBalance = currentBalance + currentBalance * interestRate;
				}
			} else if (month == 72) {
				years++;
				System.out.println("Years = " +years);
				if(years == 6) {
					currentBalance = currentBalance + currentBalance * interestRate;
				}
			} //не выполняет условие проверки на общую сумму после сробатывания 4 года
		}
	}
}

