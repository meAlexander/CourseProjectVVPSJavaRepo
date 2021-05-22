import java.util.*;

public class Test {

    public static void main(String[] args) {
        List<String> allSubstrings = new ArrayList<>();
        String s = "banana";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                allSubstrings.add(s.substring(i,j));
                System.out.println(s.substring(i,j));
            }
        }
        String max = "";
        for (String substrings : allSubstrings) {
            if (max.compareTo(substrings) <= 0) {
                max = substrings;
            }
        }
        System.out.println(max);
        System.out.println(sockMerchant(new int[]{10, 20, 20, 30, 20, 40, 50, 40, 50}));

        reverseEachWordOfString("Java Concept Of The Day");

        reverseEachWordOfString("Java J2EE JSP Servlets Hibernate Struts");

        reverseEachWordOfString("I am string not reversed");

        reverseEachWordOfString("Reverse Me");

        Student student = new Student("Pesho");
        Person student1 = new Person(10_555_555_555L,"Pesho");
        System.out.println((student.getName()));

    }

    static void reverseEachWordOfString(String inputString)
    {
        String[] words = inputString.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();

        for (String word : words) {
            StringBuilder builder = new StringBuilder();

            for (int j = word.length() - 1; j >= 0; j--) {
                builder.append(word.charAt(j));
            }
            stringBuilder.append(builder).append(" ");
            stringBuilder1.append(word).append(" ");
        }

        System.out.println(inputString);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder1.reverse());
        System.out.println("-------------------------");
    }

    static int sockMerchant(int[] ar) {
        int socks = 0;
        Integer[] wrappedInts = Arrays.stream(ar)
                .boxed()
                .toArray(Integer[]::new);
        Set<Integer> set = new HashSet<>(Arrays.asList(wrappedInts));
        for(Integer i : set){
            int total = Collections.frequency(Arrays.asList(wrappedInts), i);
            socks += total/2;
        }
        return socks;
    }
}