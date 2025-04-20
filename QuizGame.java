import java.util.Scanner;

public class QuizGame {
    public static void main (String[] args){
Scanner scanner = new Scanner (System.in);
int score = 0;
System.out.println("Welcome to the trivia game!!");
System.out.println("Choose a topic: ");
System.out.println("1. Sports");
System.out.println("2. Music");
System.out.println("3. History");
System.out.println("Enter the number of the topic you'd like to be quizzed on: ");
int choice = scanner.nextInt();
scanner.nextLine();

System.out.println("Great, let's start!!");

if (choice == 1) {
    System.out.println("Question 1: Which country won the 2022 FIFA World Cup?");
    System.out.println("A. France B. Argentina C. Brazil D. Germany");
    if (scanner.nextLine().equals("B")) {
        System.out.println("Correct!");
        score++;
} else {
        System.out.println("Wrong, the correct answer is B. Argentina!");
}
        

    System.out.println("Question 2: How many players are on a basketball team?");
    System.out.println("A. 5 B. 6 C. 7 D. 8");
    if (scanner.nextLine().equals("A")) { 
    System.out.println("Correct!"); 
    score++;
} else {
       System.out.println("Wrong, the correct answer is A. 5!");
}
        
 
    System.out.println("Question 3: What sport uses a puck?");
    System.out.println("A. Baseball B. Soccer C. Ice Hockey D. Table Tennis");
    if (scanner.nextLine().equals("C")){ 
    System.out.println("Correct!");
    score++; 
} else {
    System.out.println("Wrong, the correct answer is C. Ice Hockey!");
}
       

    System.out.println("Question 4: What does the term love mean in tennis?");
    System.out.println("A. Zero B. Two C. Three D. You won the game");
    if (scanner.nextLine().equals("A")) {
    System.out.println("Correct!");
    score++;
} else {
    System.out.println("Wrong, the correct answer is A. Zero!");
}

    System.out.println("Question 5: Who is the king of basketball?");
    System.out.println("A. Michael Jordan B. Stephen Curry C. Kobe Bryant D. LeBron James");
    if (scanner.nextLine().equals("D")) {
    System.out.println("Correct!");
    score++;
} else {
    System.out.println("Wrong, the correct answer is D. LeBron James!");
}

} else if (choice == 2) {

    System.out.println("Question 1: Who sang the song Espresso?");
    System.out.println("A. Justin Bieber B. Lady Gaga C. Sabrina Carpenter D. Central Cee");
    if (scanner.nextLine().equals("C")) {
    System.out.println("Correct!");
    score++;
} else {
    System.out.println("Wrong, the correct answer is C. Sabrina Carpenter!");
}

    System.out.println("Question 2: What band was John Lennon a part of?");
    System.out.println("A. The Beatles B. One Direction C. One Republic D. BTS");
    if (scanner.nextLine().equals("A")) {
    System.out.println("Correct!");
    score++;
} else {
    System.out.println("Wrong, the correct answer is A. The Beatles!");
}

    System.out.println("Question 3: What band sings the song Hotel Calafornia?");
    System.out.println("A. Coldplay B. The Beatles C. The Eagles D. Imagine Dragons ");
    if (scanner.nextLine().equals("C")) {
    System.out.println("Correct!");
    score++;
} else {
    System.out.println("Wrong, the correct answer is C. The Eagles!");
}

System.out.println("Question 4: What comes after 'Romeo, take me somewhere we can be alone...'? (finish the lyrics- Hint: lyrics are from the song Love Story by Taylor Swift)");
System.out.println("A.I'll be waiting all there's left to do is run  B. You're everything I need and more C. We'll dance under the stars till dawn D. My heart is yours forever and beyond ");
if (scanner.nextLine().equals("A")) {
System.out.println("Correct!");
score++;
} else {
System.out.println("Wrong, the correct answer is A. I'll be waiting all there's left to do is run!");
}

System.out.println("Question 5: Which Beach Boys song famousluy begins with the lyrics, 'Well East coast girls are hip...'?");
System.out.println("A. Surfin U.S.A  B. Good Vibrations  C. California Girls  D. Wouldn't It Be Nice");
if (scanner.nextLine().equals("C")) {
System.out.println("Correct!");
score++;
} else {
System.out.println("Wrong, the correct answer is C. California Girls");
}


} else if (choice == 3) {

System.out.println("Question 1:Which treaty ended the Thirty Years' War in 1648?");
System.out.println("A. Treaty of Tordesillas B. Treaty of Paris C. Peace of Augsburg D. Peace of Westphalia");
if (scanner.nextLine().equals("D")) {
System.out.println("Correct!");
score++;
} else {
System.out.println("Wrong, the correct answer is D. Peace of Westphalia!");
}

System.out.println("Question 2: Who was the longest reigning monarch in European history (as of 2024)?");
System.out.println("A. Queen Elixabeth II B. Louis XIV of France C. Franz Joseph I of Austria D. Catherine the Great");
if (scanner.nextLine().equals("B")) {
System.out.println("Correct!");
score++;
} else {
System.out.println("Wrong, the correct answer is B. Louis XIV of France!");
}

System.out.println("Question 3: What civilization is creidted with creating the fiorst known written legal code?");
System.out.println("A. Babylonians B. Egyptians C. Greeks D. Persians");
if (scanner.nextLine().equals("A")) {
System.out.println("Correct!");
score++;
} else {
System.out.println("Wrong, the correct answer is A. Babylonians (Code of Hammurabi)!");
}

System.out.println("Question 4: During the Cold War, what was the name of the failed 1961 invasion of Cuba by CIA-backed exiles?");
System.out.println("A. Operation Desert Storm B. Bay of Pigs Invasion C. Cuban Missile Crisis D. Operation Rolling Thunder");
if (scanner.nextLine().equals("B")) {
System.out.println("Correct!");
score++;
} else {
System.out.println("Wrong, the correct answer is B. Bay of Pigs Invasion!");
}

System.out.println("Question 5: What African Kingdom was famous for its wealth and the 14th century pilgrimage of its ruler, Mansa Musa?");
System.out.println("A. Ghana B. Axum C. Mali D. Songhai");
if (scanner.nextLine().equals("C")) {
System.out.println("Correct!");
score++;
} else {
System.out.println("Wrong, the correct answer is C. Mali!");
}
}

System.out.println("Your final score is: " + score + " out of 5!");
}

}






    
    
