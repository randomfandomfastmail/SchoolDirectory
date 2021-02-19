I have some code and I have to add classes to it. 
First I will give an explanation of what the code does then I will post the code that I have so far. Please take the code that I have so far and add methods to it.



****THESE ARE THE INSTRUCTIONS FOR THE CODE I HAVE DONE SO FAR. PLEASE READ SO YOU UNDERSTAND MY CODE*************************************

You will build a university directory of student information and their penalties. 
At this university if students are caught plagiarising or cheating they are fined.
For every student you will need to keep track of personal information as well as the backpack they have. At this university backpacks have special ID numbers.



Build a class named "Student" that has the following attributes

studentID: a string that represents the students id number for example "h6547-74848-jui5"

name: a string that represents the students name for example " Alex Jones"

address: a string that represents the address of the student for example "55 maple rd."

town: a string that represents the town the student lives in for example "London"

state: a string that represents the state the student lives in for example "Texas"



Add the following methods to the "Student" class

1) build a constructor method that has 5 parameters for the all the attributes. The parameters must be in same order as attributes. so it must be in order ( studentID, name, address, town, state)

2) build a constructor that has 0 parameters that calls the previous constructor with the appropriate values

3) build a toString() method that returns a string in the following way:

"#h6547-7gy48-jui5, Alex Jones resides at 55 Maple Rd. London, TX"



Build a class named "backpack"

brand: a string that represents the brand for example "jansport, nike, adidas"

type: a string that represents the type of backpack for example " big, small, one strap, rolling"

release: an int that represents the year the backpack was released for sale for example "2021, 2009, 1995"

colour : a string that represents colour of the backpack for example "yellow, pink, grey"

backpackID: a string that represents the custom ID of the backpack for example "7346yye7, dhf78, fhdeeys, 4663"

wearer: a Student object that represents the wearer of the backpak for example "Alex Jones" from the student class

was_stolen: a boolean representing if the backpack was reported for being stolen



Add the following methods to the "backpack" class

1) build a constructor method that has 5 parameters for the all the attributes. The parameters must be in same order as attributes. so it must be in order ( brand, type, release, colour, backpackID, wearer, was_stolen)

you must assume to start the backpacks are not stolen and there is no wearer yet.

2) build a constructor that has 0 parameters that calls the previous constructor with the appropriate values

3) build a toString() method that returns a string in the following way:

"yellow, 2021 nike one strap with ID: 7346yye7"



Build a class named "Penalty"

fine: a float that represents the monetary fine in $dollars of the penalty "5.5, 100, 33.33"

info: a string that represents the information of the penalty " cheating on exam, talking during class, skipping class"

date: a date that represents when the penalty happened import java.util.Date to do this.

paid: a boolean representing if the fine has been paid or is still pending

student: a Student object that represents the student who got the penalty for example "Alex Jones" from the student class



Add the following methods to the "Penalty" class

1) build a constructor method that has 3 parameters for the first 3 attributes. The parameters must be in same order as attributes. so it must be in order ( fine, info, date)

2) build a constructor that has 0 parameters that calls the previous constructor with the appropriate values

3) build a toString() method that returns a string in the following way:

"$5.5 penalty on Mon Jul 11 23:11:34 EDT 2020 [paid]"

Use String.format() so the fine shows 2 decimal places and to put the time. To format the string to display date use "%tc". If the penalty is paid it should display [paid] if it is not paid it should display [pending payment]

4) a method calling "paying_penalty" that pays the penalty. HINT: use outstanding attribute



Build a class named "SchoolDirectory"

backpacks: an array that stores all the backpacks in the directory

number_of_backpacks: an int that represents the number of backpacks in the directory

students: an array that stores all the students in the directory

number_of_students: an int that represents the number of students in the directory

penalties: an array that stores all the penalties that have been given to students

number_of_penalties: an int that represents the number of penalties in the directory



Add the following to the SchoolDirectory class

1) add three static constants that represent the maximum capacity of the schooldirectory. The maximum capacity values are: 2000 students, 1000 backpacks, 800 penalties. After that amount no more is added to the school directory

2) build a constructor that has 0 parameters that initializes all the arrays (backpacks, students, penalties)

3)build a method called studentRegistration(Student xStudent). This method takes xStudent object as a parameter and then registers (meaning: must remember for later) the student on the school directory

4)build a method called backpackRegistration(Backpack xBackpack, String studentID) which takes a xBackpack object as parameter and the studentID of the student who wears the backpack (REMEMBER: this is not the backpackID this is studentID) and then registers the backpack in the directory. Must also appropriately store the student who wears the backpack as well.

5)build a method called backpackUnregistration (String backpackID) which takes the backpack id as parameter and then removes the backpack from the school directory without changing the order of the rest of the backpacks in the directory and without leaving a gap in the array. Make an error check so if the backpack is not in the array nothing happens

6)build a method called wasStolen(String backpackID) which takes backpackID as parameter and records that the backpack with the given ID was stolen. Make an error check so if the backpack is not in the directory nothing happens

7)build a method called backpackTransfer(String backpackID, String studentID) that changes the student information of the given backpackID to the new wearer of the backpack given by the studentID. Make an error check so if the backpackID or studentID is not in the directory nothing happens

**********END OF INSTRUCTIONS OF CODE I HAVE ALREADY DONE THE CODE FOR THE ABOVE INSTRUCTIONS.*********************

**************HERE IS THE CODE THAT I DID FOR THE ABOVE INSTRUCTIONS***************

Student.java

public class Student {

             

              String studentID, name, address, town, state;



              public Student(String studentID, String name, String address, String town, String state) {

                             super();

                             this.studentID = studentID;

                             this.name = name;

                             this.address = address;

                             this.town = town;

                             this.state = state;

              }

             

              public Student() {

                             this("<ID>","Name","<Address>","<Town>","<State>"); 

              }



              @Override

              public String toString() {

                             return String.format("#%s, %s resides at %s, %s, %s", studentID, name, address,

                                                          town, state);

              }

                            

}

Backpack.java

public class Backpack {

             

              String brand, type;

             

              int release;

             

              String colour, backpackID;

             

              Student wearer;

             

              boolean was_stolen;



              /**

               * @param brand

               * @param type

               * @param release

               * @param colour

               * @param backpackID

               */

              public Backpack(String brand, String type, int release, String colour, String backpackID) {

                             this.brand = brand;

                             this.type = type;

                             this.release = release;

                             this.colour = colour;

                             this.backpackID = backpackID;

              }

             

              public Backpack() {

                             this("<Brand>","<Type>",0,"<Colour>","<BackpackID>");

              }



              @Override

              public String toString() {

                             return String.format(

                                                          "%s, %d %s %s with ID: %s",

                                                          colour,release, brand, type, backpackID);

              }

             

             



}

Penalty.java

import java.util.Date;



public class Penalty {

             

              float fine;

             

              String info;

             

              Date date;

             

              boolean paid;

             

              Student student;



              /**

               * @param fine

               * @param info

               * @param date

               */

              public Penalty(float fine, String info, Date date) {

                             this.fine = fine;

                             this.info = info;

                             this.date = date;

              }



              public Penalty() {

                             this(0.0f,"<Info>",new Date());

              }



              @Override

              public String toString() {

                             return String.format("$%.2f penalty on %tc [%s]",

                                                          fine, date, paid?"pending payment":"paid"

                                           );

              }

             

              public boolean paying_penalty() {

                             return paid = true;

              }

             

             

}

SchoolDirectory.java

public class SchoolDirectory {



              Backpack[] backpacks;



              int number_of_backpacks;



              Student[] students;



              int number_of_students;



              Penalty[] penalties;



              int number_of_penalties;



              static final int MAX_STUDENT = 2000;

              static final int MAX_BACKPACK = 1000;

              static final int MAX_PENALTY = 800;



              /**

               *

               */

              public SchoolDirectory() {

                             backpacks = new Backpack[MAX_BACKPACK];

                             students = new Student[MAX_STUDENT];

                             penalties = new Penalty[MAX_PENALTY];

              }



              public Student studentRegistration(Student xStudent) {

                             return students[number_of_students++] = xStudent;

              }



              public Backpack backpackRegistration(Backpack xBackpack, String studentID) {



                             Student student = null;



                             for (int i = 0; i < number_of_students; i++) {

                                           if (students[i].studentID.equals(studentID)) {

                                                          student = students[i];

                                                          break;

                                           }

                             }



                             xBackpack.wearer = student;



                             return backpacks[number_of_backpacks++] = xBackpack;



              }



              public boolean backpackUnregistration(String backpackID) {



                             boolean isFound = false;



                             for (int i = 0; i < number_of_backpacks; i++) {

                                           if (!isFound && backpacks[i].backpackID.equals(backpackID)) {

                                                          isFound = true;

                                           }

                                           if (isFound) {

                                                          backpacks[i] = backpacks[i + 1];

                                           }

                             }



                             if (isFound)

                                           number_of_backpacks--;



                             return isFound;



              }



              public boolean wasStolen(String backpackID) {



                             for (int i = 0; i < number_of_backpacks; i++) {

                                           if (backpacks[i].backpackID.equals(backpackID)) {

                                                          return backpacks[i].was_stolen = true;

                                           }

                             }



                             return false;

              }



              public boolean backpackTransfer(String backpackID, String studentID) {



                             Student student = null;



                             for (int i = 0; i < number_of_students; i++) {

                                           if (students[i].studentID.equals(studentID)) {

                                                          student = students[i];

                                                          break;

                                           }

                             }



                             if (student == null)

                                           return false;



                             Backpack backpack = null;



                             for (int i = 0; i < number_of_backpacks; i++) {

                                           if (backpacks[i].backpackID.equals(backpackID)) {

                                                          backpack = backpacks[i];

                                                          break;

                                           }

                             }



                             if (backpack == null)

                                           return false;



                             backpack.wearer = student;



                             return true;

              }



              public static SchoolDirectory example() { // Register all students and their backpacks



                             SchoolDirectory sd = new SchoolDirectory();



                             sd.studentRegistration(new Student("h6547-74848-jui5", "Alex Jones",



                                                          "55 maple rd.", "London", "TX"));



                             sd.studentRegistration(new Student("b9547-1244re8-ud5", "Tom Jackson",



                                                          "3 main st.", "Hamburg", "FT"));



                             sd.backpackRegistration(new Backpack("nike", "one strap", 2021, "yellow", "7346yye7"), "h6547-74848-jui5");



                             sd.backpackRegistration(new Backpack("adidas", "big", 2008, "pink", "363727"), "b9547-1244re8-ud5");



                             return sd;



              }



}

THIS IS USED TO TEST THE CODE:

SchoolDirectoryTestProgram.java

import java.util.GregorianCalendar;



public class SchoolDirectoryTestProgram {



              public static void main(String args[]) {



                             SchoolDirectory sd = SchoolDirectory.example();



                             for (int i = 0; i < sd.number_of_students; i++)



                                           System.out.println(sd.students[i]);



                             for (int i = 0; i < sd.number_of_backpacks; i++)



                                           System.out.println(sd.backpacks[i]);



                             sd.backpackUnregistration("363727");



                             for (int i = 0; i < sd.number_of_backpacks; i++)



                                           System.out.println(sd.backpacks[i]);



                             System.out.println(sd.backpacks[0].wearer);



                             System.out.println("\nNew penalties:");



                             Penalty i = new Penalty(75, "Cheating during test",



                                                          new GregorianCalendar(2010, 9, 4, 2, 1).getTime());



                             i.paying_penalty();



                             System.out.println(i);



              }



}

Output

#h6547-74848-jui5, Alex Jones resides at 55 maple rd., London, TX

#b9547-1244re8-ud5, Tom Jackson resides at 3 main st., Hamburg, FT

yellow, 2021 nike one strap with ID: 7346yye7

pink, 2008 adidas big with ID: 363727

yellow, 2021 nike one strap with ID: 7346yye7

#h6547-74848-jui5, Alex Jones resides at 55 maple rd., London, TX



New penalties:

$75.00 penalty on Mon Oct 04 02:01:00 IST 2010 [paid]



NOW THAT YOU HAVE ALL THE CODE. Please help me add methods to this code.
