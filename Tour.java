class Tour {
    public static int findStartingPump(int[] petrol, int[] distance) {
        int totalSurplus = 0, currentSurplus = 0, start = 0;

        for (int i = 0; i < petrol.length; i++) {
            int gain = petrol[i] - distance[i];
            totalSurplus += gain;
            currentSurplus += gain;

            if (currentSurplus < 0) {
                start = i + 1;
                currentSurplus = 0;
            }
        }

        return totalSurplus >= 0 ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int startIndex = findStartingPump(petrol, distance);
        System.out.println(startIndex == -1 ? "No possible tour" : "Start at pump: " + startIndex);
    }
}
