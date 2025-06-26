package com.jitu.dailytarget.june26.pattern;
/*      *****
        *****
        *****
        ******

 */
public class PatternQuestions1 {

    //PatternQuestions1 patternQuestions1 = new PatternQuestions1();
 /* will lead to infinite recursion during object construction, resulting in a StackOverflowError at runtime.
    When a new PatternQuestions1 object is created, its constructor implicitly tries to create another
    PatternQuestions1 object because of this line:
    That new object again tries to create another, and so on, indefinitely.
    This creates an infinite chain of constructor calls, which exhausts the stack memory.
 */
    public static void main(String[] args) {
        for (int i =1;i<=4;i++){
            for (int j =1;j<=4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
