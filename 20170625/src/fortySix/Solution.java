package fortySix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
 * ˼·����дһ���������������Ԫ�أ���������ָ��prev��inter,�ֱ�ָ���������β�ͽڵ�;������ͷ���
 * �Ƚ����ǵ�ֵ���޸�ֵ��
 * */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval obj0, Interval obj1) {
                return obj0.start - obj1.start;
            }
        });

        List<Interval> ret = new ArrayList<>();//���¶���һ������
        Interval prev = null;
        for (Interval inter : intervals) { //ȡ��ÿһ���ڵ�
            if (  prev==null || inter.start>prev.end ) {
                ret.add(inter); //��ӵ�һ���ڵ�����Ǻ����������ǰ�������
                prev = inter;//ָ�����ӵĽڵ�
            } else if (inter.end>prev.end) {//��һ���ڵ��start���ݴ���ǰһ���ڵ��end���ݲ��Һ�һ���ڵ�end���ݴ���ǰһ���ڵ��end����
            								//���¸���ӵĽڵ�
                prev.end = inter.end;
            }
        }
        return ret;
    }
}