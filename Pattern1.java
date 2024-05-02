/*
* 
* *
* * *
* * * *
* * * * *

* * * * *
*       *
*       *
*       *
* * * * *

        *
      * * 
    * * * 
  * * * *
* * * * * 

       *
      * *
     * * *
    * * * *
   * * * * *

       *
      * *
     * * *
    * * * *
   * * * * *
  * * * * * *
   * * * * *
    * * * *
     * * *
      * *
       *
 */
public class Pattern1 {
    public static void main(String[] args) {

//-------------------------- right triangle  pattern------------------------------------------------
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
//---------------------square------------------------------------------------------------
        System.err.println();
        for(int i=0;i<5;i++){
            if(i==0||i==4){
                System.out.println("* * * * *");
            }else{
                System.out.println("*       *");
            }
            
        }
//-------------------reverse right triangle ------------------------------------------------
    System.err.println();
    for(int i=0;i<5;i++){
        for(int j=0;j<4-i;j++){
            System.out.print("  ");
        }
        for(int j=0;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
//------------------- triangle ------------------------------------------------
    System.err.println();
    for(int i=0;i<5;i++){
        for(int j=0;j<5-i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }

    //------------------- Diamond ------------------------------------------------
    System.err.println();
    for(int i=0;i<5;i++){
        for(int j=0;j<=5-i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++){
            System.out.print(" *");
        }
        System.out.println();
    }
    for(int i=5;i>=0;i--){
        for(int j=0;j<=5-i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++){
            System.out.print(" *");
        }
        System.out.println();
    }

    }     
    
}
