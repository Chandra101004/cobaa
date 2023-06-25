package UTS;

public class NomorLima {
    public static void main(String[] args) {
        
        int a[][]={{1,0,0,0},{5,2,0,0},{8,6,3,0},{1,9,7,4}};
        int b[][]={{1,5,8,1},{0,2,6,9},{0,0,3,7},{0,0,0,4}};
        int c[][]=new int[4][4];

        if(a.length == b.length&& a[0].length == b[0].length){
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.println(c[i][j]+ " ");
            
        }
    }
}
    }
        }   
