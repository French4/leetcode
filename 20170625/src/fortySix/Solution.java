package fortySix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
 * 思路：重写一个链表，向其中添加元素，定义两个指针prev和inter,分别指向新链表的尾巴节点和就链表的头结点
 * 比较他们的值，修改值标
 * */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval obj0, Interval obj1) {
                return obj0.start - obj1.start;
            }
        });

        List<Interval> ret = new ArrayList<>();//重新定义一个集合
        Interval prev = null;
        for (Interval inter : intervals) { //取出每一个节点
            if (  prev==null || inter.start>prev.end ) {
                ret.add(inter); //添加第一个节点或者是后面的数大于前面的数字
                prev = inter;//指向刚添加的节点
            } else if (inter.end>prev.end) {//后一个节点的start数据大于前一个节点的end数据并且后一个节点end数据大于前一个节点的end数据
            								//更新刚添加的节点
                prev.end = inter.end;
            }
        }
        return ret;
    }
}