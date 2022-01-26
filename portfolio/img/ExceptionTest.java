package test;

public class ExceptionTest {
	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		String st = null;
		
		try {
			
			st = args[0];
			i = Integer.parseInt(st);
			j = 10 / i;
		} catch (NumberFormatException e) {
			System.out.println("データの指定に誤りがあります：" + st);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("実行時に値が指定されていません");
		} catch (ArithmeticException e) {
			System.out.println("ゼロ除算が発生しました：" + i);			
		} catch (Exception e) {
			System.out.println("例外が発生しました：" + e);
		} finally {
			System.out.println("整数値：" + j);
		}
	}
}
