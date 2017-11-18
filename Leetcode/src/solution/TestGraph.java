package solution;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;

public class TestGraph extends ApplicationFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestGraph(final String title, final int[][] points) {
	
	   super(title);
	   final XYSeries series = new XYSeries("Big O");
	   for (int i = 0; i < points.length; i++) {
		   series.add(points[i][0], points[i][1]);
	   }
	   final XYSeriesCollection data = new XYSeriesCollection(series);
	   final JFreeChart chart = ChartFactory.createXYLineChart(
	       "Big O",
	       "X", 
	       "Y", 
	       data,
	       PlotOrientation.VERTICAL,
	       true,
	       true,
	       false
	   );
	
	   final ChartPanel chartPanel = new ChartPanel(chart);
	   chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
	   setContentPane(chartPanel);
	
	}

}