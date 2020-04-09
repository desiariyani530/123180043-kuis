
package pckg123180043_kuis;

public class Hitung {
    
    public float rata(int nilai)
    {
        return(nilai/2);
    }
     public String nilaihuruf(int nilai) 
            {
               
               if ((nilai/2)>=80 && (nilai/2) <=100) return "A";
               else if ((nilai/2)>=75 && (nilai/2) < 80) return "B+";
               else if ((nilai/2)>=65 && (nilai/2)< 75) return "B";
               else if ((nilai/2)>=60 && (nilai/2)< 65) return "C+";
               else if ((nilai/2)>=50 && (nilai/2) < 60) return "C";
               else if ((nilai/2) >=20 && (nilai/2) < 50) return "D";
               else if ((nilai/2) >=0 && (nilai/2)< 20) return "E";
               else return "Error";
            }
    }


