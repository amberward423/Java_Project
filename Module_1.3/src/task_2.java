public class task_2 {
    public static void main(String[] args) {
        double[][] ageDistribution = {
                {19,20,21,22,23,24,25},
                {3,4,5,8,9,10,14},
                new double[7],
                new double[7]
        };
         int totalFreq;
         totalFreq = 0;
         for( int i = 0; i < ageDistribution[1].length; i++){
             totalFreq += ageDistribution[1][i];
         }
         System.out.println("The total frequency is: " + totalFreq);

         for(int i = 0; i < ageDistribution[1].length; i++){
             ageDistribution[2][i] = (double) ageDistribution[1][i] / totalFreq;
             System.out.println("The individual probability is: " + ageDistribution[2][i]);
         }
        for(int i = 0; i < ageDistribution[0].length; i++){
            if(i == 0){
                ageDistribution[3][0] = ageDistribution[2][0];
            }
            else{
                ageDistribution[3][i] = ageDistribution[2][i] + ageDistribution[3][i-1];
            }
            System.out.println("The cumulative probability is: " + ageDistribution[3][i]);
        }
        int age=19;
        int [] ages = new int[1000];
        for(int j = 0 ; j < ages.length; j++) {
            double random = (double)(Math.random());
            for (int i = 0; i < ageDistribution[3].length; i++) {
                if (random <= ageDistribution[3][i]) {
                    age = (int) ageDistribution[0][i];
                    break;
                }
            }
            ages[j] = age;
        }
        int [] ageCounts = new int[7];
        for (int i = 0; i < ageDistribution[0].length; i++){
            for (int j = 0; j < ages.length; j++){
                if(ageDistribution[0][i] == ages[j]){
                    ageCounts[i]++;
                }

            }
            System.out.println("Age: "+ ageDistribution[0][i]+ " appears " + ageCounts[i] + " times.");
        }
    }
}
