package day4;
enum TrafficLightSimulation
{
	RED,YELLOW,GREEN;
}
public class Question3 {

	public static void main(String[] args) {
		TrafficLightSimulation TrafficLight=TrafficLightSimulation.GREEN;
		switch(TrafficLight)
		{
		case RED:
		{
			System.out.println("Please stop");
			break;
		}
		case YELLOW:
		{
			System.out.println("Get ready");
			break;
		}
		default:
		{
			System.out.println("Goooo......");
			break;
		}
		}
		
	}

}
