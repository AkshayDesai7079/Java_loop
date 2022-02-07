public class Pyramid {
    public static void main(String [] args){

        /*
        *
        * *
        * * *
        * * * *
        * * * * *
        */
        int n=5;

        for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }


        /*

          *
        * *
      * * *
    * * * *
  * * * * *

    int i,j,n=5;

    for(i=1;i<=n;i++){
        for(j=i;j<=n;j++){
            System.out.print("  ");
        }
        for(j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }

*/



    /*

    * * * * *
    * * * *
    * * *
    * *
    *

        int i,j,n=5;

        for (i=1;i<=n;i++){
            for(j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        */




        /*

        * * * * *
          * * * *
            * * *
              * *
                *

        int i,j,n=5;

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        */




        /*

      * * * * *
        * * * *
          * * *
            * *
              *
              *
            * *
          * * *
        * * * *
      * * * * *


        int i,j,n=5;

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("  ");
            }

            for(j=i;j<=n;j++){
                System.out.print("* ");
            }

            System.out.println();

        }
        for(i=1;i<=n;i++){
            for(j=i;j<=n;j++){
                System.out.print("  ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        */




        /*

      * * * * * * * * *
        * * * * * * *
          * * * * *
            * * *
              *


        int i,j,n=5;

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("  ");
            }
            // use < in this for loop because they print the 1 to 4
            for(j=i;j<n;j++){
                System.out.print("* ");
            }
            //  use <= in this for loop because they print the 1 to 5
            for(j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        */


        /*



          *
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *
    * * * * * * *
      * * * * *
        * * *
          *


        int i,j,n=5;

        for(i=1;i<n;i++){
            for(j=i;j<=n;j++){
                System.out.print("  ");
            }
            for(j=1;j<i;j++){
                System.out.print("* ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print("  ");
            }

            for(j=i;j<n;j++){
                System.out.print("* ");
            }
            for(j=i;j<=n;j++){
                System.out.print("* ");
            }

            System.out.println();

        }


        */





        /*



  * * * * * * * * *
    * * * * * * *
      * * * * *
        * * *
          *
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *

        int i,j,n=5;

        for (i=1;i<n;i++){
            for(j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(j=i;j<n;j++){
                System.out.print("* ");
            }
            for(j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    for(i=1;i<=n;i++){
        for(j=i;j<=n;j++){
            System.out.print("  ");
        }
        for(j=1;j<i;j++){
            System.out.print("* ");
        }
        for(j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
*/


/*

          * * * * * *
        * * * * * *
      * * * * * *
    * * * * * *
  * * * * * *

int i,j,n=5;


for(i=1;i<=n;i++){
    for(j=i;j<=n;j++){
        System.out.print("  ");
    }
    for(j=1;j<=i;j++){
        System.out.print("* ");
    }
    for(j=i;j<=n;j++){
        System.out.print("* ");
    }
    System.out.println();
    }


*/



/*



* * * * * *
  * * * * * *
    * * * * * *
      * * * * * *
        * * * * * *

int i,j,n=5;

for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
        System.out.print("  ");
    }
    for(j=i;j<=n;j++){
        System.out.print("* ");
    }
    for(j=1;j<=i;j++){
        System.out.print("* ");
    }
    System.out.println();
}

*/



/*
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*


int i,j,n=5;

for(i=1;i<n;i++){
    for(j=1;j<=i;j++){
        System.out.print("* ");
    }
    for(j=i;j<=n;j++){
        System.out.print("  ");
    }
    System.out.println();
}

for(i=1;i<=n;i++){
    for(j=i;j<=n;j++){
        System.out.print("* ");
    }
    for(j=1;j<=i;j++){
        System.out.print("  ");
    }
    System.out.println();
}



/*

          *
        * *
      * * *
    * * * *
  * * * * *
    * * * *
      * * *
        * *
          *

int i,j,n=5;

for(i=1;i<n;i++){
    for(j=i;j<=n;j++){
        System.out.print("  ");
    }
    for(j=1;j<=i;j++){
        System.out.print("* ");
    }

    System.out.println();
}
for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
        System.out.print("  ");
    }
    for(j=i;j<=n;j++){
        System.out.print("* ");
    }

    System.out.println();
}
*/



    }

}
