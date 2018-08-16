package ru.anotherTestCodeForEnnducation;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        int l = 0;

        String[] res = new String[array1.length];
        for (String a1 : array1){
            for (String a2 : array2){
                int a = 0;
                for (int i = a1.length(); i <= a2.length() ; i++){
                    System.out.println (a2.substring(a, a1.length() + a));

                    if(a2.substring(a,a1.length()+a).equals(a1)){
                        res[l] = a1;

                        break;
                    }
                    a++;
                }


            }
            l++;
        }
        return res;
    }

}
