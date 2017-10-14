
import java.util.stream.IntStream;

public final class DifferenceOfSquaresCalculator {

    public int computeSquareOfSumTo(int n) {
//        int temp = n * (n + 1) / 2;
//        return temp * temp;
        return (int) Math.pow(IntStream.rangeClosed(1, n).sum(), 2);
    }
    
    public int computeSumOfSquaresTo(int n) {
//        int out = 0;
//        out = n * (n + 1) * (2 * n + 1) / 6;
//        return out;
    	return (int) IntStream.rangeClosed(1, n).map(i -> i * i).sum();
    }
    
    public int computeDifferenceOfSquares(int n) {
        return computeSquareOfSumTo(n) - computeSumOfSquaresTo(n);
    }

}
