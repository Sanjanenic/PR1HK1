package at.campus02.iwi.vaccines;

public class VaccinationAppointment {

    public int calculateRiskClass(int age, boolean majorIllness, boolean
            contactOfPregnantPerson, boolean workingInHealthSector, boolean
                                               workingInEducationSector, boolean baseRiskFactor){
        int risikoFactor=0;

        // prvi slucaj dekata godina 15 => 1, 23 => 2, ...
        // djelimo godine sa 10 da bi dobili dekadu, i sabra li je u faktor rizika
        risikoFactor=risikoFactor+(age/10);

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

   public String[] calculateMonthAndVaccine (int age, int riskClass) {
        String imfMonat = "";
        String impfstopf = "";
        String[] impfMonatArray = {"January", "February", "March", "April", "Mai", "June", "July"};


        if (riskClass >= 10) {
            imfMonat = impfMonatArray[0];
        } else if (riskClass == 9) {
            imfMonat = impfMonatArray[1];
        } else if (riskClass >= 7 && riskClass <= 8) {
            imfMonat = impfMonatArray[2];
        } else if (riskClass == 6) {
            imfMonat = impfMonatArray[3];
        } else if (riskClass >= 4 && riskClass <= 5) {
            imfMonat = impfMonatArray[4];
        } else if (riskClass >= 2 && riskClass <= 3) {
            imfMonat = impfMonatArray[5];
        } else {
            imfMonat = impfMonatArray[6];
        }

        if (age >= 65) {
            impfstopf = "Pfizer";
        }
        if (age >= 50 && age < 65) {
            impfstopf = "Moderna";
        }
        if (age >= 18 && age < 40) {
            impfstopf = "ArtraZenaeca";
        } else if (age < 18) {
            impfstopf = "Pfizer";
        }

        String[] resulat = {imfMonat, impfstopf};

        return resulat;
    }
}
