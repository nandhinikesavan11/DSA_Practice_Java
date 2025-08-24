import java.util.HashSet;

public class CrossingPaths {
    public static void main(String[] args) {
        String path = "ENNNNNNNNNNNEEEEEEEEEESSSSSSSSSS";
        System.out.println(isPathCrossing(path));
    }
    static boolean isPathCrossing(String path) {
        if(path.length()==1){
            return false;
        }
        int x=0;
        int y=0;
        HashSet<String> set = new HashSet<>();
        set.add(0+","+0);
        for (int i=0;i<path.length();i++){
            char ch = path.charAt(i);

            if(ch == 'N') y++;
            else if(ch == 'S') y--;
            else if(ch == 'E') x++;
            else x--;

            String p = x+","+y;
            if(set.contains(p)){
                return true;
            }
            set.add(p);
        }
        return false;
    }
}
