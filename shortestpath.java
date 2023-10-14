public class shortestpath {
    public static float path(String way) {
        int x=0, y=0;
        for(int i=0;i<way.length();i++) {
            char dir=way.charAt(i);
            if(dir=='S') {
                y--;
            }
            else if(dir=='N') {
                y++;
            }
            else if(dir=='W') {
                x--;
            }
            else {
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String args[]) {
        String way="WNEENESENNN";
        System.out.println(path(way));
    }
    
}
