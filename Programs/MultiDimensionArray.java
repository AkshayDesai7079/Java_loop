public class MultiDimensionArray {
    public static void main(String[] args) {
        /*
        int [] arr={1,2,3,4,5};

        for(int i:arr){
            System.out.println(i);
        }
        */


        int [][] a;
        a=new int[2][3];

        a[0][0]=101;
        a[0][1]=102;
        a[0][2]=103;
        a[1][0]=104;
        a[1][1]=105;
        a[1][2]=106;
        


        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
