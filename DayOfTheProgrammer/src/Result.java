public class Result {
    public static String dayOfProgrammer(int year) {
        String newYear = "";
        if(year == 1918){
            return "26.09.1918";
        }else if(year < 1918){    //julian
            if(year % 4 == 0){  //leap year
                newYear = "12.09."+year;
                return newYear;
            }else{
                newYear = "13.09."+year;
                return newYear;
            }
        }else{      //gregoryen
            if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){    //leap year
                newYear = "12.09."+year;
                return newYear;
            }else{
                newYear = "13.09."+year;
                return newYear;
            }
        }

    }
}
