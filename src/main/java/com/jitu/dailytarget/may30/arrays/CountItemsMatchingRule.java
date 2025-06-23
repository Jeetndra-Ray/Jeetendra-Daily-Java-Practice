package com.jitu.dailytarget.may30.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingRule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cont=0;
        for (int i=0;i<items.size()-1;i++){
            for (int j = 0;j<items.get(i).size()-1;j++){
                if (items.get(i).get(j).contains(ruleValue) || items.get(i).get(j).contains(ruleKey)){
                    cont=i;
                }
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        String ruleKey="color";
        String ruleValue = "silver";

//        ((ArrayList<List<String>>) items).add("phone","blue","pixel");
       // ((List<List<String>>) items).addAll("phone","blue","pixel");
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));

        System.out.println(countMatches(items,ruleKey,ruleValue));
        //        for (List<String> item : items) {
//            System.out.println(item);
//        }
   }
}
