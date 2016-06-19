package us.aphong.thingchooser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@SpringBootApplication
public class ThingChooserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThingChooserApplication.class, args);

		//SpringApplication.run(AlbumChooserApplication.class, args);
		List AlbumList = new ArrayList();
		Scanner input = new Scanner(System.in);
		Random RandomNumber = new Random();
        int randomNumberPicked;

		//	Begin querying the user
		System.out.println("Hello, pick your number of albums to choose from: ");
        while(input.hasNext())
        {
		    int numberChosen = input.nextInt();
            randomNumberPicked = RandomNumber.nextInt(numberChosen);
            if (randomNumberPicked < 1)
                randomNumberPicked = 1;
            System.out.printf("%s %d\n\n","Here is the number that you have picked:",randomNumberPicked);

            System.out.println("Hello, pick your number of albums to choose from: ");
        }

	}
}
