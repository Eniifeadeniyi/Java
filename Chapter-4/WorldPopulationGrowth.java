public class PopulationGrowth {
public static void main(String[] args) {
long population = 8231613070L;
double growthRate = 0.0085;
long twicePopulation = population * 2;
int year = 1;

System.out.println("Year\tPopulation\t\tIncrease");
while (year <= 75) {
double newPopulation = population * Math.pow(1 + growthRate, year);
double increase = newPopulation - population;

System.out.println(year + "\t" + newPopulation + "\t" + increase);

if (newPopulation >= twicePopulation) {
System.out.println("By year " + year + ", the population will be twice the current population");
}
year++;
}
}
}
