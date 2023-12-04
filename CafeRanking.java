/**
 * @author: Mehdi Fanou
 * 
 * Problem Two Simplifying Cafe Scores
 **/
import java.util.Scanner;
public class CafeRanking{

public static void main(String [] args)
{
Scanner input=new Scanner(System.in);
int cafeScore=0;
int ranking[]=new int[11];
while(cafeScore != -1)
{
System.out.printf("Please enter your score for the Cafe:");

cafeScore=input.nextInt();

if (cafeScore== -1)
{
for(int i=1; i<11; i++)

System.out.printf("Ranking %d received %d timesn",i,ranking[i]);

break;
}

else
{

System.out.println("Your score is:"+cafeScore);

switch( cafeScore )

{

case 1:
ranking[1]++;

break;

case 2:
ranking[2]++;

break;

case 3:
ranking[3]++;

break;

case 4:
ranking[4]++;

break;

case 5:
ranking[5]++;

break;

case 6:
ranking[6]++;

break;

case 7:
ranking[7]++;

break;

case 8:

ranking[8]++;

break;

case 9:

ranking[9]++;

break;

case 10:

ranking[10]++;

break;

default:

System.out.println("Incorrect score was entered");

}

} 

}

}

}