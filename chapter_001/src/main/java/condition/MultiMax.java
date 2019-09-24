package condition;

public class MultiMax {
    public  int max( int first, int second, int third) {
        int result = first;
        result = (first < second) ?  second : first;
        result = ( result < third ) ? third  : result;
        return  result;
    }
}
