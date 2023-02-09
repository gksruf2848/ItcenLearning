package Itcen_34_ex;

public class Test {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		try {
			System.out.println(arr[5]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("오류");
		} finally {
			System.out.println("여기는 무조건 실행");
		}
	}

}
