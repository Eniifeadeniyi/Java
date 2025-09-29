import java.util.Scanner;

public class NokiaPhoneMenuAppTwo {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int option =100;

 while(option != 14) { 
String main = """
Enter a number:
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
  14. previous
""";

System.out.print(main);
option = input.nextInt();

switch(option) {
case 1 -> {
  int choice = 100;
  while(choice != 11) {
String phonebook = """
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
""";
System.out.print(phonebook);
choice = input.nextInt();

switch(choice) {
case  1 -> System.out.print("Search");
case  2 -> System.out.print("Service Nos.");
case  3 -> System.out.print("Add name");
case  4 -> System.out.print("Erase");
case  5 -> System.out.print("Edit");
case  6 -> System.out.print("Assign tone");
case  7 -> System.out.print("Send b'card");
case  8 -> {
int pick = 100;
while(pick != 3) {
String choose = """
	1. Type of view
	2. Memory status
  3. previous
""";
System.out.print(choose);
pick = input.nextInt();
    
switch(pick) {
case 1 -> System.out.print("Type of view.");
case 2 -> System.out.print("Memory status");
}
}
}
case  9 -> {
System.out.print("Speed dials");}
case  10 -> {
System.out.print("Voice tags");}
}
}
}
case 2 -> {
int pick = 100;
while(pick != 11) {
String messages = """
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
""";
System.out.print(messages);
pick = input.nextInt();

switch(pick) {
case 1 -> System.out.print("Write messages");
case 2 -> System.out.print("Inbox");
case 3 -> System.out.print("Outbox");
case 4 -> System.out.print("Picture messages");
case 5 -> System.out.print("Templates");
case 6 -> System.out.print("Smileys");
case 7 -> { 
int set = 100;
while(set != 3) {
String message = """
	1. Set 1
	2. Common
  3. previous
""";
System.out.print(message);
set = input.nextInt();

switch(set) {
case 1 -> {
int common =100;
while(common != 4) {
String set1 = """
	1. Message centre number
	2. Messages sent as
	3. Message validity
  4. previous
""";
System.out.print(set1);
common = input.nextInt();
switch(common) {
case 1 -> System.out.print("Message centre number");
case 2 -> System.out.print("Message sent as");
case 3 -> System.out.print("Message validity"); 
}
}
}
case 2 -> {
int common2 = 100;
while(common2 != 4) {
String common1 = """
	1. Delivery reports
	2. Reply via same centre
	3. Character support
  4. previous
""";
System.out.print(common1);
common2 = input.nextInt();
switch(common2) {
case 1 -> System.out.print("Delivery reports");
case 2 -> System.out.print("Reply via same centre");
case 3 -> System.out.print("Character support");
}
}
}
}
}
}
case 8 -> System.out.print("Info service");
case 9 -> System.out.print("Voice mailbox number");
case 10 -> System.out.print("Service command editor");
}
}
}
case 3 -> System.out.print("Chat");

case 4 -> { 
int register = 100;
while(register != 9) {
String call = """
	1. Missed calls
	2. Received calls
	3. Dialled numbers
	4. Erase recent call lists
	5. Show call duration
	6. Show call costs
	7. Call cost settings
	8. Prepaid credit
  9. previous
""";
System.out.print(call);
register = input.nextInt();

switch(register) {
case 1 -> System.out.print("Missed calls");
case 2 -> System.out.print("Received calls");
case 3 -> System.out.print("Dialled numbers");
case 4 -> System.out.print("Erase recent call lists");
case 5 -> {
int duration = 100;
while(duration != 6) {
String show = """
	1. Last call duration
	2. All calls'duration
	3. Received calls'duration
	4. Dialled calls'duration
	5. Clear timers
  6. previous
""";
System.out.print(show);
duration = input.nextInt();

switch(duration) {
case 1 -> System.out.print("Last call duration");
case 2 -> System.out.print("All calls'duration");
case 3 -> System.out.print("Received calls'duration");
case 4 -> System.out.print("Dialled calls'duration");
case 5 -> System.out.print("Clear timers");
}
}
}
case 6 -> {
int cost = 100;
while(cost != 4) {
String costs = """
	1. Last call cost
	2. All calls'cost
	3. Clear counters
  4. previous
""";
System.out.print(costs);
cost = input.nextInt();

switch(cost) {
case 1 -> System.out.print("Last call cost");
case 2 -> System.out.print("All calls'cost");
case 3 -> System.out.print("Clear counters");
}
}
}
case 7 -> {
int limit = 100;
while(limit != 3) {
String settings = """
	1. Call cost limit
	2. Show costs in
  3. previous
""";
System.out.print(settings);
limit = input.nextInt();

switch(limit) {
case 1 -> System.out.print("Call cost limit");
case 2 -> System.out.print("Show costs in");
}
}
}

case 8 -> System.out.print("Prepaid credit");
}
}
}
    
case 5 -> {
int tone =100;
while(tone != 10) {
String tones = """
	1. Ringing tone
	2. Ringing volume
	3. Incoming call alert
	4. Composer
	5. Message alert tone
	6. Keypad tones
	7. Warning and game tones
	8. Vibrating alert
	9. Screen saver
  10. previous
""";
System.out.print(tones);
tone = input.nextInt();

switch(tone) {
case 1 -> System.out.print("Ringing tone");
case 2 -> System.out.print("Ringing volume");
case 3 -> System.out.print("Incoming call alert");
case 4 -> System.out.print("Composer");
case 5 -> System.out.print("Message alert tone");
case 6 -> System.out.print("Keypad tones");
case 7 -> System.out.print("Warning and game tones");
case 8 -> System.out.print("Vibrating alert");
case 9 -> System.out.print("Screen saver");
}
}
}
    
case 6 -> {
int set = 100;
while(set != 5) {
String setting = """
	1. Call settings
	2. Phone settings
	3. Security settings
	4. Restore factory settings
  5. previous
""";
System.out.print(setting);
set = input.nextInt();

switch(set) {
case 1 -> {
int auto = 100;
while(auto != 7) {
String automatic = """
	1. Automatic redial
	2. Speed dialling
	3. Call waiting options
	4. Own number sending
	5. Phone line in use
	6. Automatic answer
  7. previous
""";
System.out.print(automatic);
auto = input.nextInt();

switch(auto) {
case 1 -> System.out.print("Automatic redial");
case 2 -> System.out.print("Speed dialling");
case 3 -> System.out.print("Call waiting options");
case 4 -> System.out.print("Own number sending");
case 5 -> System.out.print("Phone line in use");
case 6 -> System.out.print("Automatic answer");
}
}
}
    
case 2 -> {
int language = 100;
while(language != 7) {
String phone = """
	1. Language
	2. Cell info display
	3. Welcome note
	4. Network selection
	5. Lights
	6. Confirm SIM service actions
  7. previous
""";
System.out.print(phone);
language = input.nextInt();

switch(language) {
case 1 -> System.out.print("Language");
case 2 -> System.out.print("Cell info display");
case 3 -> System.out.print("Welcome note");
case 4 -> System.out.print("Network selection");
case 5 -> System.out.print("Lights");
case 6 -> System.out.print("Confirm SIM service actions");
}
}
}
    
case 3 -> {
int secure = 100;
while(secure != 7) {
String security = """
	1. PIN code request
	2. Call barring service
	3. Fixed dialling
	4. Closed user group
	5. Phone security
	6. Change access codes
  7. previous
""";
System.out.print(security);
secure = input.nextInt();

switch(secure){
case 1 -> System.out.print("PIN code request");
case 2 -> System.out.print("Call barring service");
case 3 -> System.out.print("Fixed dialling");
case 4 -> System.out.print("Closed user group");
case 5 -> System.out.print("Phone security");
case 6 -> System.out.print("Change access codes");
}
}
}
case 4 -> System.out.print("Restore factory settings");
}
}
}
    
case 7 -> System.out.print("Call divert");
case 8 -> System.out.print("Games");
case 9 -> System.out.print("Calculator");
case 10 -> System.out.print("Reminders");
case 11 -> {
int alarm = 100;
while(alarm != 7) { 
String clock = """
	1. Alarm clock
	2. Clock settings
	3. Date setting
	4. Stopwatch
	5. Countdown timer
	6. Auto update of date and time
  7. previous
""";
System.out.print(clock);
alarm = input.nextInt();

switch(alarm) {
case 1 -> System.out.print("Alarm clock");
case 2 -> System.out.print("Clock settings");
case 3 -> System.out.print("Date setting");
case 4 -> System.out.print("Stopwatch");
case 5 -> System.out.print("Countdown timer");
case 6 -> System.out.print("Auto update of date and time");
}
}
}
case 12 -> System.out.print("Profiles");
case 13 -> System.out.print("SIM services");
}
}
}
}
