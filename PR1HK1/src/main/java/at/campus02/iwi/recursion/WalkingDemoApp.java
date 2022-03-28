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

/*public class VaccinationAppointment {

    int age;
    boolean majorIllness;
    boolean contactOfPregnetPerson;
    boolean workingInHealthSector;
    boolean workingInEducationSector;
    boolean baseRiskFactor;

    public int testcalculateRiskClass9(int age, boolean majorIllness, boolean
            contactOfPregnantPerson, boolean workingInHealthSector, boolean
                                                workingInEducationSector, boolean baseRiskFactor){
        int risikoFactor=0;

        if(age>=67){
            risikoFactor=risikoFactor+6;
        }
        if(majorIllness==true){
            risikoFactor=risikoFactor+3;
        }
        if(contactOfPregnantPerson== true){
            risikoFactor=risikoFactor+2;
        }
        if(workingInHealthSector==true){
            risikoFactor=risikoFactor+2;
        }
        if(workingInEducationSector==true ){
            risikoFactor=risikoFactor+1;
        }
        if(baseRiskFactor==true){
            risikoFactor=risikoFactor+1;
        }
       return risikoFactor;
    }

    String[] calculateMonthAndVaccine (int age, int riskClass){
        String imfMonat=" ";
        String impfstopf=" ";
        String [] impfMonatArray={"January","February","March","April", "Mai", "June", "July"};

        String [][] impfstoffArray= {{"Pfizer","Pfizer","Pfizer","Moderna","AstraZeneca","AstraZeneca", "Pfizer"},
                      {"Pfizer","Pfizer","Pfizer","Moderna","AstraZeneca","AstraZeneca", "Pfizer"},
                      {"Pfizer","Pfizer","Pfizer","Moderna","AstraZeneca","AstraZeneca", "Pfizer"},
                      {"Pfizer","Pfizer","Pfizer","Moderna","AstraZeneca","AstraZeneca", "Pfizer"},
                      {"Pfizer","Pfizer","Pfizer","Moderna","AstraZeneca","AstraZeneca", "Pfizer"},
                      {"Pfizer","Pfizer","Pfizer","Moderna","AstraZeneca","AstraZeneca", "Pfizer"},
                      {"Pfizer","Pfizer","Pfizer","Moderna","AstraZeneca","AstraZeneca", "Pfizer"}};


         //String [][] impfMonatUndStopf = new String[Integer.parseInt(imfMonat)][Integer.parseInt(impfstopf)];
//ovdje mor doci for petlja koja ce ici kroz array

         for(int i=0; i<imfMonat.length(); i++){
          if(riskClass>=10){
              imfMonat=impfMonatArray[0];
          }
          else if(riskClass==9){
              imfMonat=impfMonatArray[1];
          }
          else if(riskClass>=7 && riskClass<=8){
              imfMonat=impfMonatArray[2];
          }
          else if(riskClass==6){
              imfMonat=impfMonatArray[3];
          }
          else if(riskClass>=4 && riskClass<=5){
              imfMonat=impfMonatArray[4];
          }
          else if(riskClass>=2 && riskClass<=3){
              imfMonat=impfMonatArray[5];
          }
          else {
              imfMonat=impfMonatArray[6];
          }
          for(int j=0; j< impfstoffArray.length; j++){
              if(age>=65 ) {
                  impfstopf="Pfizer";
              }
              if(age>=50 && age<65){
                  impfstopf="Moderna";
              }
              if(age>=18 && age <40){
                  impfstopf="ArtraZenaeca";
              }
              else if(age <18){
                  impfstopf="Pfizer";
              }

             }

         }




       // String [imfMonat][impfstopf]impfMonatUndStopf;


return
    }


}
