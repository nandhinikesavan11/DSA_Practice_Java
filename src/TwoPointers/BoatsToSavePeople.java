package TwoPointers;

import java.util.Arrays;

public class BoatsToSavePeople {
    public static void main(String[] args) {
        int[] people = {3,2,2,1};
        int lim = 3;
        System.out.println(numRescueBoats(people,lim));
    }
    static int numRescueBoats(int[] people,int limit){
        Arrays.sort(people);
        int b=0;
        int l=0;
        int r = people.length-1;
        while(l<=r){
            if(people[r] == limit){
                r--;
                b++;
            }
            if(people[r]<limit && people[l]+people[r]<=limit){
                l++;
                b++;
                r--;
            }else{
                r--;
                b++;
            }
        }
        return b;
    }
}
