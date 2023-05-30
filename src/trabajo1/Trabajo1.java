/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo1;

import java.util.Random;


/**
 *
 * @author Breiner
 */
public class Trabajo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


    Float A [][][] = new Float [4][3][3];
    int Alumnos,Materia,Corte;
    Random ran = new Random();

    for (Corte=0; Corte < A[0][0].length; Corte++)
    {
        System.out.println("Corte"+Corte);
        for (Materia=0; Materia < A[0].length; Materia++)         
        {
            for (Alumnos=0; Alumnos < A.length; Alumnos++)
            {
                A[Alumnos][Materia][Corte] = ran.nextFloat(5);
                System.out.print("["+A[Alumnos][Materia][Corte]+"]");
                
  }
            System.out.println("");
}
        System.out.println("");

}
    }
}
   
