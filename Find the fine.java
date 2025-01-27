class Solution {

    public long totalFine(int date, int car[], int fine[]) {
        // Initialize the total fine to 0
        long totalFine = 0;

        // Check if the date is even or odd
        boolean isDateEven = (date % 2 == 0);

        // Iterate through the car numbers and their respective fines
        for (int i = 0; i < car.length; i++) {
            int carNumber = car[i];
            int carFine = fine[i];

            // Condition to check fines based on the date
            if ((isDateEven && carNumber % 2 != 0) || (!isDateEven && carNumber % 2 == 0)) {
                totalFine += carFine;
            }
        }

        // Return the total fine
        return totalFine;
    }
}
