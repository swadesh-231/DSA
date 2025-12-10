package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> skills = new ArrayList<>();
        skills.add("Java");
        skills.add("Java");
        skills.add("Python");
        skills.add("Python");
        skills.add("Javascript");
        skills.add("Javascript");

        Set<String> skillSet = new HashSet<>(skills);
        System.out.println(skillSet);
        System.out.println(countDuplicate(skills));

    }
    public static int countDuplicate(List<String> skills) {
        Set<String> set = new HashSet<>();
        int count = 0;
        for (String skill : skills) {
           if (!set.add(skill)) {
               count++;
           }
        }
        return count;
    }
}
