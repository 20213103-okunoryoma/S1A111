package test;

import java.text.DecimalFormat;

public class FormatTest {
	public static void main(String[] args) {
		int intValue = 1234567;
		double doubleValue = 2345.678;
		
		DecimalFormat format = new DecimalFormat();
		
		// ①3桁カンマ区切り、小数点無し
		format.applyPattern("#,###");
		System.out.println("指定した書式：" + format.toPattern());
		System.out.println("整数値：" + format.format(intValue));
		System.out.println("実数値：" + format.format(doubleValue));
		
		// ②3桁カンマ区切り、小数点あり
		format.applyPattern("#,###.###");
		System.out.println("指定した書式：" + format.toPattern());
		System.out.println("整数値：" + format.format(intValue));
		System.out.println("実数値：" + format.format(doubleValue));
		
		// ③3桁カンマ区切り、小数点あり、0埋め
		format.applyPattern("0,000,000.0000");
		System.out.println("指定した書式：" + format.toPattern());
		System.out.println("整数値：" + format.format(intValue));
		System.out.println("実数値：" + format.format(doubleValue));
		
		// ④先頭に\マーク、後方に好きな文字
		format.applyPattern("\\#,###円");
		System.out.println("指定した書式：" + format.toPattern());
		System.out.println("整数値：" + format.format(intValue));
		
		// ⑤先頭に特殊文字
		format.applyPattern("'#'#,###");
		System.out.println("指定した書式：" + format.toPattern());
		System.out.println("整数値：" + format.format(intValue));
		
		// ⑥正の書式と負の書式
		double minusValue = -345.678;
		format.applyPattern("###.00;(-###.00)");
		System.out.println("指定した書式：" + format.toPattern());
		System.out.println("正の値：" + format.format(doubleValue));
		System.out.println("負の値：" + format.format(minusValue));
		
	}
}
