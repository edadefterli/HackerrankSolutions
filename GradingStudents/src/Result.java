import java.util.ArrayList;
import java.util.List;

public class Result {
    public static List<Integer> gradingStudents(List<Integer> grades){
        int lowerLimit = 0;
        int upperLimit = 0;

        for(int i = 0; i < grades.size(); i++){
            if(grades.get(i) < 38){
                continue;
            }
            else if(grades.get(i) % 5 == 0){
                continue;
            }
            else {
                if((grades.get(i)%10) < 5 && (grades.get(i)%10)!=0){
                    lowerLimit = grades.get(i) - (grades.get(i) % 10);
                    upperLimit = lowerLimit + 5;

                    if((upperLimit-grades.get(i)) < 3 ){
                        grades.set(i,upperLimit);
                    }
                }
                else{
                    lowerLimit = (grades.get(i) - (grades.get(i) % 10)) + 5;
                    upperLimit = lowerLimit + 5;
                    if((upperLimit-grades.get(i) < 3)){
                        grades.set(i,upperLimit);
                    }
                }
            }

        }


        return grades;
    }
}
