import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public ArrayList<Integer> getEven(ArrayList<Integer> Nums){		for (int i = 0; i < Nums.size(); i++) {
			Integer yay = Nums.get(i);
			if (yay.intValue()%2 != 0) {
				Nums.remove(i);
				i--;
			}
		}
		return Nums;
		
	}
}
