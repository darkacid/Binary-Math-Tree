package Math;

public class Calculate
{

	public static node constructTree(String str)
	{
		String command = "3 4 +";
		for (int i=0;i<command.length();i++)
		{
			//if(command[i]==)
			
		}
		node myNode = new node('*');
		return myNode;
	}
	public static double compute(String commands)
	{
		//
		//!The algorithm for generating the tree will be added later.!
		//	
		
		
		//The tree is made by hand		
		node root=new node('+');
		root.left=new node('*');
		root.left.left=new node(7);
		root.left.right=new node(2);
		root.right=new node('/');
		root.right.left=new node(25);
		root.right.right=new node(5);
		
		System.out.println(exploreNode(root));
		
		return 0;
	}
	public static int exploreNode(node rootNode) //See the contents of the node.
	{
		
		if(rootNode.isOp)
		{
			// The values for the numbers are gathered recursively.
			int firstNum=exploreNode(rootNode.left);
			int secondNum=exploreNode(rootNode.right);
			
			switch(rootNode.op)
			{
				case '+': return firstNum+secondNum;
				case '-': return firstNum-secondNum;
				case '*': return firstNum*secondNum;
				case '/': return firstNum/secondNum;
			}
			
		}
		else
			if(rootNode.number!=0)			
				return rootNode.number;
		
		return -1;
		
	}
	
}
class node
{
	//Each "node" gets either a number or an operator(+,-,* or /).
	//The node will then contain an empty link to its left, and right "children" (it's called that way, I swear...).	
	
	int number; //This is zero by default, don't get confused.
	char op;	//No clue what the default value is, too lazy to check.
	boolean isOp=false;
	node left;
	node right;
	
	node(int number)
	{
		this.number=number;		
	}
	node(char op)
	{
		if(op=='+'||op=='-'||op=='*'||op=='/')
		{
			this.op=op;
			this.isOp=true;			
		}
		else
			System.out.println("Wrong Char");			
	}
}

































//haha anarchy
