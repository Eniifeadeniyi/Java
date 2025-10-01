import java.util.Scanner;

public class NokiaPhoneMenuAppTwo {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

String option = "100";
while(!option.equals("14")) {
String main = """
		WELCOME TO THE NOKIA 3310 MENU
Below are the features offered:
	1. Phone book
	2. Messages
	3. Chat
	4. Call register
	5. Tones
	6. Settings
	7. Call divert
	8. Games
	9. Calculator
	10. Reminders
	11. Clock
	12. Profiles
	13. SIM services
    	14. exit
Enter a number: 
""";
System.out.print(main);
option = input.next();
switch(option) {

case "11" -> {
	String clock = "56";
	while(!clock.equals("7")) {
	String time = """
			Clock
		1. Alarm clock
		2. Clock settings
		3. Date setting
		4. Stopwatch
		5. Countdown timer
		6. Auto update of date and time
		7. previous
	Enter a number:
	""";
	System.out.print(time);
	clock = input.next();
	switch(clock) {
			default -> System.out.println("Unsupported number!");
			case "7" -> System.out.println("Bye!");
			case "1" -> {
String alarm = "5";
while(!alarm.equals("0")) {
String arm = """
Alarm clock
0. back
Enter a number:
""";
System.out.print(arm);
alarm = input.next();
switch(alarm) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}
				case "2" -> {
String lock = "5";
while(!lock.equals("0")) {
String locks = """
Clock settings
0. back
Enter a number:
""";
System.out.print(locks);
lock = input.next();
switch(lock) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "3" -> {
String date = "5";
while(!date.equals("0")) {
String data = """
Date setting
0. back
Enter a number:
""";
System.out.print(data);
date = input.next();
switch(date) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "4" -> {
String stop = "5";
while(!stop.equals("0")) {
String watch = """
Stopwatch
0. back
Enter a number:
""";
System.out.print(watch);
stop = input.next();
switch(stop) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "5" -> {
String down = "5";
while(!down.equals("0")) {
String timer = """
Countdown timer
0. back
Enter a number:
""";
System.out.print(timer);
down = input.next();
switch(down) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "6" -> {
String up = "5";
while(!up.equals("0")) {
String update = """
Auto update of date and time
0. back
Enter a number:
""";
System.out.print(update);
up = input.next();
switch(up) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

}
}
}	

case "6" -> {
	String tings = "22";
	while(!tings.equals("5")) {
	String display = """
			Settings
		1. Call settings
		2. Phone settings
		3. Security settings
		4. Restore factory settings
		5. previous
	Enter a number: 
        """;
	System.out.print(display);
	tings = input.next();
	switch(tings) {
		default -> System.out.println("Unsupported number!");
		case "5" -> System.out.println("Bye!");
		case "4" -> {
String rest = "5";
while(!rest.equals("0")) {
String restore = """
Restore factory settings
0. back
Enter a number:
""";
System.out.print(restore);
rest = input.next();
switch(rest) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}
		case "1" -> {
			String mate = "100";
			while(!mate.equals("7")) {
			String own = """
					Call settings
				1. Automatic redial
				2. Speed dialling
				3. Call waiting options
				4. Own number sending
				5. Phone line in use
				6. Automatic answer
				7. previous
			""";
			System.out.print(own);
			mate = input.next();
			switch(mate) {
				default -> System.out.println("Unsupported number!");
				case "7" -> System.out.println("Bye!");
				case "1" -> {
String automatic = "5";
while(!automatic.equals("0")) {
String auto = """
Automatic redial
0. back
Enter a number:
""";
System.out.print(auto);
automatic = input.next();
switch(automatic) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "2" -> {
String speed = "5";
while(!speed.equals("0")) {
String speedo = """
Speed dialling
0. back
Enter a number:
""";
System.out.print(speedo);
speed = input.next();
switch(speed) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "3" -> {
String wait = "5";
while(!wait.equals("0")) {
String waiting = """
Call waiting options
0. back
Enter a number:
""";
System.out.print(waiting);
wait = input.next();
switch(wait) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "4" -> {
String num = "5";
while(!num.equals("0")) {
String numb = """
Own number sending
0. back
Enter a number:
""";
System.out.print(numb);
num = input.next();
switch(num) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "5" -> {
String use = "5";
while(!use.equals("0")) {
String user = """
Phone line in use
0. back
Enter a number:
""";
System.out.print(user);
use = input.next();
switch(use) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "6" -> {
String ans = "5";
while(!ans.equals("0")) {
String answer = """
Automatic answer
0. back
Enter a number:
""";
System.out.print(answer);
ans = input.next();
switch(ans) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

}
}
}
		case "2" -> {
			String two = "8";
			while(!two.equals("7")) {
			String phone = """
					Phone settings
				1. Language
				2. Cell info display
				3. Welcome note
				4. Network selection
				5. Lights
				6. Confirm SIM service actions
				7. previous
			Enter a number:
			""";
			System.out.print(phone);
			two = input.next();
			switch(two) {
				default -> System.out.println("Unsupported number!");
				case "7" -> System.out.println("Bye!");
				case "1" -> {
String lang = "5";
while(!lang.equals("0")) {
String language = """
Language
0. back
Enter a number:
""";
System.out.print(language);
lang = input.next();
switch(lang) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "2" -> {
String cell = "5";
while(!cell.equals("0")) {
String cells = """
Cell info display
0. back
Enter a number:
""";
System.out.print(cells);
cell = input.next();
switch(cell) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "3" -> {
String welcome = "5";
while(!welcome.equals("0")) {
String come = """
Welcome note
0. back
Enter a number:
""";
System.out.print(come);
welcome = input.next();
switch(welcome) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "4" -> {
String network = "5";
while(!network.equals("0")) {
String select = """
Network selection
0. back
Enter a number:
""";
System.out.print(select);
network = input.next();
switch(network) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "5" -> {
String light = "5";
while(!light.equals("0")) {
String lights = """
Lights
0. back
Enter a number:
""";
System.out.print(lights);
light = input.next();
switch(light) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "6" -> {
String firm = "5";
while(!firm.equals("0")) {
String confirm = """
Confirm SIM service actions
0. back
Enter a number:
""";
System.out.print(confirm);
firm = input.next();
switch(firm) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}				
}
}
}
		case "3" -> {
			String secure = "25";
			while(!secure.equals("7")) {
			String secures = """
					Security settings
				1. PIN code request
				2. Call barring service
				3. Fixed dialling
				4. Closed user group
				5. Phone security
				6. Change access codes
				7. previous
			Enter a number:
			""";
			System.out.print(secures);
			secure = input.next();
			switch(secure) {
				default -> System.out.println("Unsupported number!");
				case "7" -> System.out.println("Bye!");
				case "1" -> {
String req = "5";
while(!req.equals("0")) {
String request = """
PIN code request
0. back
Enter a number:
""";
System.out.print(request);
req = input.next();
switch(req) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}
				case "2" -> {
String bar = "5";
while(!bar.equals("0")) {
String barring = """
Call barring service
0. back
Enter a number:
""";
System.out.print(barring);
bar = input.next();
switch(bar) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "3" -> {
String fix = "5";
while(!fix.equals("0")) {
String fixed = """
Fixed dialling
0. back
Enter a number:
""";
System.out.print(fixed);
fix = input.next();
switch(fix) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "4" -> {
String close = "5";
while(!close.equals("0")) {
String closed = """
Closed user group
0. back
Enter a number:
""";
System.out.print(closed);
close = input.next();
switch(close) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "5" -> {
String phones = "5";
while(!phones.equals("0")) {
String phon = """
Phone security
0. back
Enter a number:
""";
System.out.print(phon);
phones = input.next();
switch(phones) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "6" -> {
String change = "5";
while(!change.equals("0")) {
String changes = """
Missed calls
0. back
Enter a number:
""";
System.out.print(changes);
change = input.next();
switch(change) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

}
}
}	

}
}
}

case "4" -> {
	String call = "25";
	while(!call.equals("9")) {
	String register = """
			Call register
		1. Missed calls
		2. Received calls
		3. Dialled numbers
		4. Erase recent call lists
		5. Show call duration
		6. Show call costs
		7. Call cost settings
		8. Prepaid credit
		9. previous
	Enter a number: 
	""";
	System.out.print(register);
	call = input.next();
	switch(call) {
		default -> System.out.println("Unsupported number!");
		case "9" -> System.out.println("Bye!");
		case "1" -> {
String miss = "5";
while(!miss.equals("0")) {
String missed = """
Missed calls
0. back
Enter a number:
""";
System.out.print(missed);
miss = input.next();
switch(miss) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

		case "2" -> {
String receive = "5";
while(!receive.equals("0")) {
String received = """
Received calls
0. back
Enter a number:
""";
System.out.print(received);
receive = input.next();
switch(receive) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
} 

		case "3" -> {
String dial = "5";
while(!dial.equals("0")) {
String dialled = """
Dialled numbers
0. back
Enter a number:
""";
System.out.print(dialled);
dial = input.next();
switch(dial) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
} 

		case "4" -> {
String recent = "5";
while(!recent.equals("0")) {
String list = """
Erase recent call lists
0. back
Enter a number:
""";
System.out.print(list);
recent = input.next();
switch(recent) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
} 
 
		case "8" -> {
String paid = "5";
while(!paid.equals("0")) {
String prepaid = """
Prepaid credit
0. back
Enter a number:
""";
System.out.print(prepaid);
paid = input.next();
switch(paid) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
} 
		case "5" -> {
			String show = "19";
			while(!show.equals("6")) {
			String duration = """
					Show call duration
				1. Last call duration
				2. All calls' duration
				3. Received calls' duration
				4. Dialled calls' duration
				5. Clear timers
				6. previous
			Enter a number:
			""";
			System.out.print(duration);
			show = input.next();
			switch(show) {
				default -> System.out.println("Unsupported number!");
				case "6" -> System.out.println("Bye!");
				case "1" -> {
String last = "5";
while(!last.equals("0")) {
String lasts = """
Last call duration
0. back
Enter a number:
""";
System.out.print(lasts);
last = input.next();
switch(last) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}
				case "2" -> {
String all = "5";
while(!all.equals("0")) {
String shows = """
All calls' duration
0. back
Enter a number:
""";
System.out.print(shows);
all = input.next();
switch(all) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "3" -> {
String rate = "5";
while(!rate.equals("0")) {
String rated = """
Received calls' duration
0. back
Enter a number:
""";
System.out.print(rated);
rate = input.next();
switch(rate) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "4" -> {
String dial = "5";
while(!dial.equals("0")) {
String dialled = """
Dialled calls' duration
0. back
Enter a number:
""";
System.out.print(dialled);
dial = input.next();
switch(dial) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "5" -> {
String clear = "5";
while(!clear.equals("0")) {
String clears = """
Clear timers
0. back
Enter a number:
""";
System.out.print(clears);
clear = input.next();
switch(clear) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}


}
}
}

			case "6" -> {
			String costs = "12";
			while(!costs.equals("4")) {
			String costed = """
					Show call costs
				1. Last call cost
				2. All calls' cost
				3. Clear counters
				4. previous
			Enter a number:
				""";
			System.out.print(costed);
			costs = input.next();
			switch(costs) {
				default -> System.out.println("Unsupported number!");
				case "4" -> System.out.println("Bye!");
				case "1" -> {
String lasted = "5";
while(!lasted.equals("0")) {
String las = """
Last call cost
0. back
Enter a number:
""";
System.out.print(las);
lasted = input.next();
switch(lasted) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "2" -> {
String chose = "5";
while(!chose.equals("0")) {
String chosen = """
All calls' cost
0. back
Enter a number:
""";
System.out.print(chosen);
chose = input.next();
switch(chose) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

				case "3" -> {
String count = "5";
while(!count.equals("0")) {
String counter = """
Clear counters
0. back
Enter a number:
""";
System.out.print(counter);
count = input.next();
switch(count) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

}
}
}

			case "7" -> {
				String setting = "25";
				while(!setting.equals("3")) {
				String settings = """
						Call cost settings
					1. Call cost limit
					2. Show costs in
					3. previous
				Enter a number:
				""";
				System.out.print(settings);
				setting = input.next();
				switch(setting) {
					default -> System.out.println("Unsupported number!");
					case "3" -> System.out.println("Bye!");
					case "1" -> {
String mit = "5";
while(!mit.equals("0")) {
String mits = """
Call cost limit
0. back
Enter a number:
""";
System.out.print(mits);
mit = input.next();
switch(mit) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

					case "2" -> {
String in = "5";
while(!in.equals("0")) {
String inn = """
Show costs in
0. back
Enter a number:
""";
System.out.print(inn);
in = input.next();
switch(in) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}
				
}	
}
}

}
}
}

case "2" -> {
String message = "0";
while(!message.equals("11")) {
	String messages = """
			Messages
		1. Write messages
		2. Inbox
		3. Outbox
		4. Picture messages
		5. Templates
		6. Smileys
		7. Message settings
		8. Info service
		9. Voice mailbox number
		10. Service command editor
		11. previous
	Enter a number:
		""";
	System.out.print(messages);
	message = input.next();
	switch(message) {
		default -> System.out.println("Unsupported number!");
		case "11" -> System.out.println("Bye!");
		case "7" -> {
			String sets = "12";
			while(!sets.equals("3")) {
			String set = """
				Message settings
			1. Set 1
			2. Common
			3. previous
			""";
			System.out.print(set);
			sets = input.next();
			switch(sets) {
				default -> System.out.println("Unsupported number!");
				case "3" -> System.out.println("Bye!");
				case "1" -> {
					String sett = "100";
					while(!sett.equals("4")) {
					String set1 = """
							Set 1
						1. Message centre number
						2. Messages sent as
						3. Message validity
						4. previous
					Enter a number:
					""";
					System.out.print(set1);
					sett = input.next();
						switch(sett) {
							case "4" -> System.out.println("Bye!");
							default -> System.out.println("Unsupported number!");
							case "1" -> {
String centre = "5";
while(!centre.equals("0")) {
String cent = """
Message centre number
0. back
Enter a number:
""";
System.out.print(cent);
centre = input.next();
switch(centre) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}
							case "2" -> {
String sent = "5";
while(!sent.equals("0")) {
String send = """
Messages sent as
0. back
Enter a number:
""";
System.out.print(send);
sent = input.next();
switch(sent) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}
							case "3" -> {
String valid = "5";
while(!valid.equals("0")) {
String validity = """
Message validity
0. back
Enter a number:
""";
System.out.print(validity);
valid = input.next();
switch(valid) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}
}
}
}
					case "2" -> {
						String deliver = "19";
						while(!deliver.equals("4")) {
						String commons = """
								Common
							1. Delivery reports
							2. Reply via same centre
							3. Character support
							4. previous
						Enter a number:
						""";
						System.out.print(commons);
						deliver = input.next();
						switch(deliver) {
							default -> System.out.println("Unsupported number!");
							case "4" -> System.out.println("Bye!"); 
							case "1" -> {
String delivery = "5";
while(!delivery.equals("0")) {
String live = """
Delivery reports
0. back
Enter a number:
""";
System.out.print(live);
delivery = input.next();
switch(delivery) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}
							case "2" -> {
String reply = "5";
while(!reply.equals("0")) {
String via = """
Reply via same centre
0. back
Enter a number:
""";
System.out.print(via);
reply = input.next();
switch(reply) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}
							case "3" -> {
String character = "5";
while(!character.equals("0")) {
String support = """
Character support
0. back
Enter a number:
""";
System.out.print(support);
support = input.next();
switch(support) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}
}
}
}
}
}
}

		case "1" -> {
String write = "5";
while(!write.equals("0")) {
String mess = """
Write messages
0. back
Enter a number:
""";
System.out.print(mess);
write = input.next();
switch(write) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}
		case "2" -> {
String inbox = "5";
while(!inbox.equals("0")) {
String box = """
Inbox
0. back
Enter a number:
""";
System.out.print(box);
inbox = input.next();
switch(inbox) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

		case "3" -> {
String out = "5";
while(!out.equals("0")) {
String box = """
Outbox
0. back
Enter a number:
""";
System.out.print(box);
out = input.next();
switch(out) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

	case "4" -> {
String pic = "5";
while(!pic.equals("0")) {
String pics = """
Picture messages
0. back
Enter a number:
""";
System.out.print(pics);
pic = input.next();
switch(pic) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

	case "5" -> {
String temp = "5";
while(!temp.equals("0")) {
String template = """
Templates
0. back
Enter a number:
""";
System.out.print(template);
temp = input.next();
switch(temp) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

	case "6" -> {
String smile = "5";
while(!smile.equals("0")) {
String smiles = """
Smileys
0. back
Enter a number:
""";
System.out.print(smiles);
smile = input.next();
switch(smile) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

	case "8" -> {
String info = "5";
while(!info.equals("0")) {
String service = """
Info services
0. back
Enter a number:
""";
System.out.print(service);
info = input.next();
switch(info) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

	case "9" -> {
String mail = "5";
while(!mail.equals("0")) {
String voice = """
Voice mailbox number
0. back
Enter a number:
""";
System.out.print(voice);
mail = input.next();
switch(mail) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}
	case "10" -> {
String command = "5";
while(!command.equals("0")) {
String edit = """
Service command editor
0. back
Enter a number:
""";
System.out.print(edit);
command = input.next();
switch(command) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}
}
}
}


case "1" -> {
	String choice = "0";
	while(!choice.equals("11")){
		String phonebook = """
		Phone book
		1. Search
		2. Service Nos.
		3. Add name
		4. Erase
		5. Edit
		6. Assign tone
		7. Send b'card
		8. Options
		9. Speed dials
		10. Voice tags
	    	11. previous
	Enter a number: 
		""";
		System.out.print(phonebook);
		choice = input.next();
		switch(choice) {
		default -> System.out.println("Unsupported number!"); 
		case  "9" -> {
String speed = "5";
while(!speed.equals("0")) {
String dial = """
Speed dials
0. back
Enter a number: 
""";
System.out.print(dial);
speed = input.next();
switch(speed) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}
		case  "10" -> {
String voice = "5";
while(!voice.equals("0")) {
String tag = """
Voice tags
0. back
Enter a number: 
""";
System.out.print(tag);
voice = input.next();
switch(voice) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}
case  "11" -> System.out.println("Bye!");				

			case  "1" -> {
String sea = "5";
while(!sea.equals("0")) {
String search = """
Search
0. back 
Enter a number: 
""";
System.out.print(search);
sea = input.next();
switch(sea) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

			case  "2" -> {
String serve = "5";
while(!serve.equals("0")) {
String service = """
Service Nos.
0. back
Enter a number: 
""";
System.out.print(service);
serve = input.next();
switch(serve) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}
			case  "3" -> {
String add = "5";
while(!add.equals("0")) {
String name = """
Add name
0. back
Enter a number: 
""";
System.out.print(name);
add = input.next();
switch(add) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

			case  "4" -> {
String erases = "5";
while(!erases.equals("0")) {
String eraser = """
Erase
0. back
Enter a number: 
""";
System.out.print(eraser);
erases = input.next();
switch(erases) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

			case  "5" -> {
String edits = "5";
while(!edits.equals("0")) {
String edit = """
Edit
0. back
Enter a number: 
""";
System.out.print(edit);
edits = input.next();
switch(edits) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

			case  "6" -> {
String assign = "5";
while(!assign.equals("14")) {
String assigns = """
Assign tone
0. back
Enter a number: 
""";
System.out.print(assigns);
assign = input.next();
switch(assign) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

			case  "7" -> {
String send = "5";
while(!send.equals("0")) {
String sends = """
Send b'card
0. back
Enter a number: 
""";
System.out.print(sends);
send = input.next();
switch(send) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

			case "8" -> {
				String opti = "4";
				while(!opti.equals("3")) {
				String opt = """
				Options 
				1. Type of view
				2. Memory status
				3. back
				Enter a number: 
					""";
				System.out.print(opt);
				opti = input.next();
				switch(opti) {
					case "1" -> {
						String type = "5";
						while(!type.equals("0")) {
						String types = """
							Type of view
							0. back
							Enter a number: 
							""";
						System.out.print(types);
						type = input.next();
						switch(type) {
						default -> System.out.println("Unsupported number!");
						case "0" -> System.out.println("Bye!");

}						
}
}

					case "2" ->  {
						String mem = "5";
						while(!mem.equals("0")) {
						String memory = """
							Memory status
							0. back
							Enter a number: 
							""";
						System.out.print(memory);
						mem = input.next();
						switch(mem) {
						default -> System.out.println("Unsupported number!");
						case "0" -> System.out.println("Bye!");
}
}						
}

}
}
}
}
}
}

case "3" -> {
String chats = "5";
while(!chats.equals("0")) {
String chat = """
Chat
0. back
Enter a number: 
""";
System.out.print(chat);
chats = input.next();
switch(chats) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

case "7" -> {
String divert = "5";
while(!divert.equals("0")) {
String diverts = """
Call divert
0. back
Enter a number:
""";
System.out.print(diverts);
divert = input.next();
switch(divert) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

case "8" -> {
String game = "5";
while(!game.equals("0")) {
String games = """
Games
0. back
Enter a number:
""";
System.out.print(games);
game = input.next();
switch(game) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

case "9" -> {
String calc = "5";
while(!calc.equals("0")) {
String calcs = """
Calculator
0. back
Enter a number:
""";
System.out.print(calcs);
calc = input.next();
switch(calc) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

case "10" ->{
String rem = "5";
while(!rem.equals("0")) {
String reminder = """
Reminder
0. back
Enter a number:
""";
System.out.print(reminder);
rem = input.next();
switch(rem) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

case "12" -> {
String profile = "5";
while(!profile.equals("0")) {
String profiles = """
Profiles
0. back
Enter a number:
""";
System.out.print(profiles);
profile = input.next();
switch(profile) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

case "13" -> {
String sim = "5";
while(!sim.equals("0")) {
String sims = """
SIM services
0. back
Enter a number:
""";
System.out.print(sims);
sim = input.next();
switch(sim) {
default -> System.out.println("Unsupported number!");
case "0" -> System.out.println("Bye!");
}
}
}

case "14" -> System.out.print("Goodbye!");
default -> System.out.println("Number not supported!");
}
}
}
}
