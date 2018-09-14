import java.util.*;

public class ModulusClock
{
	public static void main(String[] args)
	{
		Scanner userinput = new Scanner (System.in);

		int currentminute, currenthour, minuteslater, hourslater, futurehour, futureminute, totalminutes, totalhours;
		futurehour = 0;
		totalhours = 0;
		totalminutes = 0;

		System.out.println("Hour of current time? ");
		currenthour = userinput.nextInt();
		System.out.println("Minute of current time? ");
		currentminute = userinput.nextInt();

		System.out.println("How many hours later? ");
		hourslater = userinput.nextInt();
		System.out.println("How many minutes later? ");
		minuteslater = userinput.nextInt();

		futureminute = (totalminutes + minuteslater);
		totalminutes = (currentminute % 60);
		totalhours = (totalminutes / 60);
		futurehour = (currenthour + (hourslater + totalhours));
		futurehour = (futurehour % 12);

		if (futurehour == 0){
			futurehour = 12;
		}

		System.out.print("The new time is : " + futurehour + ":");
		System.out.printf("%02d", futureminute);


	}
}


