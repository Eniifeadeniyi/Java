public class CountVowels {
public static void main(String[] args) {

String[] word = {"E","n","i","i","f","e","o","l","u","w","a"};

int count_a = 0;
int count_e = 0;
int count_i = 0;
int count_o = 0;
int count_u = 0;

int count = 0;
while(count < word.length) {
	

	if (word[count].equalsIgnoreCase("a")) count_a += 1;
	if (word[count].equalsIgnoreCase("e")) count_e += 1;
	if (word[count].equalsIgnoreCase("i")) count_i += 1;
	if (word[count].equalsIgnoreCase("o")) count_o += 1;
	if (word[count].equalsIgnoreCase("u")) count_u += 1;
	count += 1;

}
int total = count_a + count_e + count_i + count_o + count_u;
System.out.print(total);
}
}