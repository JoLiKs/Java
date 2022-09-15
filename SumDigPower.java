//CodeWars 6 kui Done!
import java.util.ArrayList; 
import java.util.List; 
class SumDigPower {
    
  public static List<Long> sumDigPow(long a, long b) {
	    ArrayList res = new ArrayList<Long>();
	    
	    long num = 0;
	    for (;a<b;a++) {
	        String str = String.valueOf(a);
	 for(int i = 0; i<str.length(); i++) { 
	 num += Math.pow(new Long(str.substring(i, i+1)),i+1);
	 }
	    if (num == a) {
	        res.add(a);
	    } 
	    num = 0;
	        }
	    return res;
       
    }
}
