package at.campus02.iwi.recursion;

public class WalkingDemoApp {
    public static void main(String[] args) {

     walk(5,1); //poziv metode void,tacno ove moram proslijediti ako hocu do 5

    }

    public static void walk(int countSteps, int currentStep){
   if(currentStep==0){  //if sluzi da prekine vrtenje tj.stalno pozivanje metode.
    return;
      }
        if(currentStep<countSteps){  //if rekurzijom ispisuje do 5 koraka, tj.do count
            System.out.println("Step forward:" + currentStep);
            walk(countSteps,++currentStep);

        }
        else {
            countSteps=0;   //else vraca unazad do 0, do count.
            System.out.println("Step backward:" + currentStep);
            walk(countSteps,--currentStep);
        }


    }

}



   
