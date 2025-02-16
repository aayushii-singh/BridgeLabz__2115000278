public class CompareStringConcat {
    public static void main(String[] args) {
        int iterations = 1000000;
        long start, end;
        
        StringBuffer sbBuffer = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbBuffer.append("hello");
        }
        end = System.nanoTime();
        long timeBuffer = end - start;
        
        StringBuilder sbBuilder = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbBuilder.append("hello");
        }
        end = System.nanoTime();
        long timeBuilder = end - start;
        
        System.out.println("Time taken by StringBuffer: " + timeBuffer + " ns");
        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ns");
    }
}

