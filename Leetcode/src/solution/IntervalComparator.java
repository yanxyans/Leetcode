package solution;

import java.util.Comparator;

public class IntervalComparator implements Comparator<Interval> {
	@Override
	public int compare(Interval a, Interval b) {
		return a.start - b.start;
	}
}
