package com.jitu.dailytarget.june23.stirngleetcode;

public class GoalParserInterpretation {
    public static String interpret(String command) {
       command=command.replace("()","o");
       command= command.replace("(al)","al");
        return command;
    }
    public static String interpretApproch2UsingStringBuilder(String command) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(command.replace("()","o").replace("(al)","al"));
        return stringBuilder.toString();
    }

    public static String interpretApproch3UsingStringBuilder(String command) {
        /// fast and best then other 2 Approach
        StringBuilder stringBuilder = new StringBuilder(command.length());
        for (int i = 0;i<command.length();i++){
            if(command.charAt(i)=='G') stringBuilder.append('G');
            if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')') {stringBuilder.append('o'); i++;}
                else{stringBuilder.append("al"); i = i + 3;}
            }
        }

        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        String com="G()(al)";
        System.out.println( interpret(com));
        System.out.println(interpretApproch3UsingStringBuilder(com));
        System.out.println(interpretApproch2UsingStringBuilder(com));

    }
}
