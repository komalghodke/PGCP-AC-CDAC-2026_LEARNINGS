public class Calculate {

	public static void main(String[] args) {
		System.out.println("Length of cmd line args is: " + args.length);
		int len = args.length;
		if(len==3) {
			int num1 = Integer.parseInt(args[1]);
			int num2 = Integer.parseInt(args[2]);
			
			switch(args[0]) {
				case "+" :
					System.out.println("Addition is:" + (num1+num2));
					break;
				case "-" :
					System.out.println("Substraction is:" + (num1-num2));
					break;
				case "x" :
					System.out.println("Addition is:" + (num1*num2));
					break;
				case "/":
					System.out.println("Division is:" + (num1/num2));
					break;
				default:
					System.out.println("Enter Valid Operation");
			}
			
		}
		else {
			System.out.println("Invalid! Enter 3 args input for Calculator (Operation, Num1, Num2)");
		}
	}
}