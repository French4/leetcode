package SeventyOne;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Solution {
	public String simplifyPath(String path) {
	    Deque<String> stack = new LinkedList<>();  //一个队列
	    Set<String> skip = new HashSet<>(Arrays.asList("..",".",""));
	    for (String dir : path.split("/")) {
	        if (dir.equals("..") && !stack.isEmpty()) stack.pop(); //".."时候弹出栈
	        else if (!skip.contains(dir)) stack.push(dir);//普通字符入栈
	    }
	    String res = "";
	    for (String dir : stack) res = "/" + dir + res;//将字符依次累加组合成绝对路径
	    return res.isEmpty() ? "/" : res;
	}
}
