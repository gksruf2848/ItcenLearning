package Itcen_19_ex;
import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	private static int cnt = 0;

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("============================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("============================================");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		System.out.println("프로그램 종료");
	}
	
	//계좌생성하기
	private static void createAccount() {
		accountArray[cnt] = new Account();
		
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		System.out.print("계좌번호 : ");
		accountArray[cnt].setAno(sc.next());
		System.out.print("계좌주 : ");
		accountArray[cnt].setOwner(sc.next());
		System.out.print("초기입금액 : ");
		accountArray[cnt].setBalance(sc.nextInt());
		System.out.println("결과 : 계좌가 생성되었습니다.");
		cnt++;	
	}
	
	//계좌목록보기
	private static void accountList() {
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");
		for(int i=0; i<cnt; i++) {
			System.out.println(accountArray[i].getAno()+"\t"+accountArray[i].getOwner()+"\t"+accountArray[i].getBalance());
		}
	}
	
	//예금하기
	private static void deposit() {
		String ano;
		
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");
		System.out.print("계좌번호 : ");
		ano = sc.next();
		if(findAccount(ano)==null) {
			System.out.println("잘못된 계좌번호입니다.");
		} else {
			System.out.print("예금액 : ");
			findAccount(ano).setBalance(findAccount(ano).getBalance()+sc.nextInt());

			System.out.println("결과 : 예금이 성공되었습니다.");
		}
	}
	
	//출금하기
	private static void withdraw() {
		String ano;
		
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");
		System.out.print("계좌번호 : ");
		ano = sc.next();
		if(findAccount(ano)==null) {
			System.out.println("잘못된 계좌번호입니다.");
		} else {
			System.out.print("출금액 : ");
			findAccount(ano).setBalance(findAccount(ano).getBalance()-sc.nextInt());

			System.out.println("결과 : 출금이 성공되었습니다.");
		}
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		for(int i=0; i<cnt; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
	}

}
