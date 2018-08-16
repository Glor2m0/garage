package ru.anotherTestCodeForEnnducation;

import java.util.Arrays;

public class WhichAreIn {


        //I wrote this code when I was in India
        public static String[] inArray(String[] array1, String[] array2) {
            int l = 0;
            String[] res = new String[array1.length];
            for (String a1 : array1){
                System.out.println(a1);
                for (String a2 : array2){
                    int a = 0;
                    boolean isbreak = false;
                    for (int i = a1.length(); i <= a2.length() ; i++){
                        if(a2.substring(a,a1.length()+a).equals(a1)){
                            //System.out.println (a2.substring(a, a1.length() + a));
                            if (l == 0) res[l++] = a1;
                            if (l > 0 && !a1.equals(res[l-1])){ res[l] = a1;
                                l++;}
                            isbreak = true;
                            break;
                        }
                        a++;
                    }
                    if (isbreak) break;
                }
            }
            String[] r = new String[l];
            for (int j = 0; j < l; j++)r[j] = res[j];
            Arrays.sort(r);
            return r;
        }


   /* public static String[] inArray(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                .filter(str ->
                        Arrays.stream(array2).anyMatch(s -> s.contains(str)))
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }*/


}
