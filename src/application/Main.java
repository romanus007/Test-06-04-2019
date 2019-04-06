package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	   public void start(Stage primaryStage) throws Exception {
	 
	       PieChart pieChart = new PieChart();
	 double a= 1275;
	 double b= 1017;
	 double c= 172;
	 double d= 59;
	 double e= 285;
	       PieChart.Data slice1 = new PieChart.Data("China", a);
	       PieChart.Data slice2 = new PieChart.Data("India", b);
	       PieChart.Data slice3 = new PieChart.Data("Brazil", c);
	       PieChart.Data slice4 = new PieChart.Data("UK", d);
	       PieChart.Data slice5 = new PieChart.Data("USA", e);
	 
	       pieChart.getData().add(slice1);
	       pieChart.getData().add(slice2);
	       pieChart.getData().add(slice3);
	       pieChart.getData().add(slice4);
	       pieChart.getData().add(slice5);
 
	       StackPane root = new StackPane(pieChart);
	 
	       Scene scene = new Scene(root, 600, 600);
	 
	       primaryStage.setScene(scene);
	 
	       primaryStage.show();                                                                                                                        
	}                                                                                                                             
	public static void main(String[] args) {                                                                                      
		launch(args);                                                                                                             
	}                                                                                                                             
}                                                                                                                                 
                                                                                                                                  