package thirtyeight;
/*
 * The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string.

Example 1:

Input: 1
Output: "1"
Example 2:

Input: 4
Output: "1211"
 * */
public class Solution {
	public static  String countAndSay(int n){
		String ret = ""+1;
		
		while(--n > 0){  //当数字减少到0
			ret = organ(ret);  //函数的本质是统计同一类连续字符出现的次数
		}
		return ret;
	}

	private static String organ(String ret) {
		System.out.println("os");
		StringBuilder sb = new StringBuilder();
		for(int i = 0, count = 0; i < ret.length();){ //取出第一个不相等字符
			while(i+count < ret.length()&& ret.charAt(i) == ret.charAt(i+count))
				count++;  //统计字符出现的频率，刚开始和自己比较
			sb.append(count).append(ret.charAt(i)); //将频率和字符放在一起
			i = i+count; //i指向第一个'新的'字符串
			count = 0; //此时重复字符的个数是0
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String s = null;
		s = countAndSay(4);
		System.out.println(s);
	}
	
};
/*
 * 总结：实质就是知道字符1后，推算出其他字符串连续字符出现的个数。
 * 统计字符串中连续字符出现的个数：
 * 		i指向要每一次的第一个字符，count指向第一个直到和i指向的字符串不同。
 *      i和count指向不同的数字是，这个count就是这个字符出现的频率，拼接。
 * */
 