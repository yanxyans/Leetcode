package solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeIntervals {
	/**
	 * Definition for an interval.
	 * public class Interval {
	 *     int start;
	 *     int end;
	 *     Interval() { start = 0; end = 0; }
	 *     Interval(int s, int e) { start = s; end = e; }
	 * }
	 */
    public List<Interval> merge(List<Interval> intervals) {
		ArrayList<Interval> ret = new ArrayList<Interval>();
        intervals.sort((a,b) -> a.start-b.start);
		
		int size = intervals.size();
		for (int i = 0; i < size; i++) {
			Interval ma = intervals.get(i);
			while (i < size - 1 && intervals.get(i + 1).start <= ma.end) {
                ma.end = Math.max(ma.end, intervals.get(i + 1).end);
                i++;
            }
			ret.add(new Interval(ma.start, ma.end));
		}
		
		return ret;
	}
}
