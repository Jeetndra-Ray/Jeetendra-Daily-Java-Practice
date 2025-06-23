package com.jitu.dailytarget.may2.innerclass;

public class Student {
    // Static inner class Exam
        public static class Exam {
            private int[] marks = new int[5];

            // Constructor to initialize marks
            public Exam(int m1, int m2, int m3, int m4, int m5) {
                marks[0] = m1;
                marks[1] = m2;
                marks[2] = m3;
                marks[3] = m4;
                marks[4] = m5;
            }
            public double calculatePercentage() {
                int total = 0;
                for (int mark : marks) {
                    total += mark;
                }
                return (total / 5.0);
            }
        }

        // Main method
        public static void main(String[] args) {
            Student.Exam exam = new Student.Exam(85, 90, 78, 88, 92);

            double percentage = exam.calculatePercentage();
            System.out.println("Percentage: " + percentage + "%");

            Student.Exam exam1=new Student.Exam(65,67,88,88,78);
            System.out.println(exam1.calculatePercentage());

        }

}

