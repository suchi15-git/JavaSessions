package WrapperClasses;

public class DataConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//used for data coversion
		
		//System s = new System();
		
		String x = "100";
		System.out.println(x+20);
		
		//string to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//number format exception - cannot convert alphanumeric to int
		String y ="100A";
		int j = Integer.parseInt(y);
		System.out.println(j+20);
		
		//string to double
		String t="12.33";
		double s = Double.parseDouble(t);
		System.out.println(s+20);

		//int to string
		int p= 100;
		String p1= String.valueOf(p);
		System.out.println(p1+30);
		
		//string to boolean
		String flag = "true";
		boolean b = Boolean.parseBoolean(flag);
		System.out.println(b);
	}

}
