package OEU.press;

public class Press{
	public void bitToRange(int[] bits) {
			
	}
	
	public static void main(String[] argv) throws CloneNotSupportedException {
		String input= "1011010100010100101010111111010100010100101001010010100101010010101001010100100000000000101111111101010";
		System.out.println(input);
		System.out.println("");
		Node node= new Node();
		node.value= 1;
		System.out.print("1");
		Node head= node.AOP_MVE_CSI_DUQ();
		for(int i= 1; i< input.length(); i++) {
			if('1'== input.charAt(i)) {
				if(null== node.right) {
					node.right= new Node();
					node= node.right;
					node.value= 1;
					System.out.print("1");
				}else {
					node= node.right;
					node.value= 1;
					System.out.print("1");
				}
			}else {
				if(null== node.left) {
					node.left= new Node();
					node= node.left;
					node.value= 0;
					System.out.print("0");
				}else {
					node= node.left;
					node.value= 0;
					System.out.print("0");
				}
			}
		}
		System.out.println("");
		for(int i= 0; i< 1; i++) {
			String output= print(head.AOP_MVE_CSI_DUQ(), new String());	
			System.out.println(output);
			System.out.println(i);
			System.out.println("");
			input= output;
			
			Node temp= new Node();
			temp.value= input.charAt(0)== '0'? 0: 1;
			System.out.print(temp.value);
			head= temp.AOP_MVE_CSI_DUQ();
			for(int j= 1; j< input.length(); j++) {
				if('1'== input.charAt(j)) {
					if(null== temp.right) {
						temp.right= new Node();
						temp= temp.right;
						temp.value= 1;
						System.out.print("1");
					}else {
						temp= temp.right;
						temp.value= 1;
						System.out.print("1");
					}
				}else {
					if(null== temp.left) {
						temp.left= new Node();
						temp= temp.left;
						temp.value= 0;
						System.out.print("0");
					}else {
						temp= temp.left;
						temp.value= 0;
						System.out.print("0");
					}
				}
			}
		}
		//print
//		printPrefix(head.AOP_MVE_CSI_DUQ());
//		System.out.println("");
//		printInfix(head.AOP_MVE_CSI_DUQ());
//		System.out.println("");
//		printBackfix(head.AOP_MVE_CSI_DUQ());
	}

	private static String print(Node head, String input) throws CloneNotSupportedException {
		System.out.println("");
		input= printInfix(head.AOP_MVE_CSI_DUQ(), input);
		System.out.println("");
		return input;
	}

	@SuppressWarnings("unused")
	private static void printBackfix(Node node) throws CloneNotSupportedException {
		if(node.left!= null) {
			printBackfix(node.left.AOP_MVE_CSI_DUQ());
		}
		if(node.right!= null) {
			printBackfix(node.right.AOP_MVE_CSI_DUQ());
		}
		System.out.print(node.value);
	}

	private static String printInfix(Node node, String input) throws CloneNotSupportedException {
		if(node.left!= null) {
			input= printInfix(node.left.AOP_MVE_CSI_DUQ(), input);
		}
		input+= node.value;
		if(node.right!= null) {
			input=printInfix(node.right.AOP_MVE_CSI_DUQ(), input);
		}
		return input;
	}

	@SuppressWarnings("unused")
	private static void printPrefix(Node node) throws CloneNotSupportedException {
		System.out.print(node.value);
		if(node.left!= null){
			printPrefix(node.left.AOP_MVE_CSI_DUQ());
		}
		if(node.right!= null) {
			printPrefix(node.right.AOP_MVE_CSI_DUQ());
		}
	}
}