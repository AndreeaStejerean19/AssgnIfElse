package main;

public class LogicalOp {
//3
    public int checkBiggerNumber(int a, int b) {
        if (a > b) return a;
        else return b;
    }
//4
    public String compare4(String s) {
        int x;
        String m = "Learning text comparison";
        String n = "Got to try some more";
        if (s.equals("Evozon")) return m;
        else return n;
    }

//5
    public String compare5(String s, int a)
    {
        if(s.equals("Evozon") && a<=3)
            return s + a;
        else  if(s.equals("Evozon") && a<=3)
            return s + a;
        return null;
    }
//6
    public String compare6(int a)
    {
     if(a>8 || a==6)
         return "The amount of snow this winter was(cm): " + a ;
     else return "The forecast snow is(cm):" + a ;
    }

//7
    public String compare7(int nr) {
        String s1 = "The number is greater than 3 and not equal to 4";
        String s2 = "The number is equal to 4";
        String s3 = "The number is lower than 3";
        if (nr > 3 && nr != 4)
            return s1;
        else if (nr == 4)
            return s2;
        else if(nr < 3)
            return s3;
        else return null;
    }

//8
    public void nrPimit(int number) {
        switch (number) {
            case 0:
                System.out.println("Nr. 0");
                break;
            case 1:
                System.out.println("Nr. 1");
                break;
            case 2:
                System.out.println("Nr. 2");
                break;
            case 3:
                System.out.println("Nr. 3");
                break;
            case 4:
                System.out.println("Nr. 4");
                break;
            case 5:
                System.out.println("Nr. 5");
                break;
            case 6:
                System.out.println("Nr. 6");
                break;
            case 7:
                System.out.println("Nr. 7");
                break;
            case 8:
                System.out.println("Nr. 8");
                break;
            case 9:
                System.out.println("Nr. 9");
                break;
        }
    }
//9
    public static boolean isNumberEven(int nr){
        return (nr % 2 == 0);
    }

//10

    public boolean isEligibleToVote(int varsta) {
        return (varsta>=18) ;
    }
//11
    public int compare11(int x, int y, int z)
    {
        int max;
        max=x;
        if(y>max) max=y;
        if(z>max) max=z;
        return max;

    }
}

