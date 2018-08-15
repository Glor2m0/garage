package ru.anotherTestCodeForEnnducation;

public class SomeHashF {

    //this hash function doesn't have variable "a"
    public int gornersHash (String s, int m){
        int hash = 0;
        for(int i = 0; i < s.length(); i++)
            hash = (hash   + s.charAt(i)) % m;
        return hash;
    }
}
