package Math;

public class KickStart {

    public static void arrayFunc(int[] arr)
    {
        arr[0]=-1;


    }
	public static void main(String[] args)
	{
		//Calculate is a Class with the compute function, which is called without an instance.
		
		//The argument doesn't do anything yet.
		//It will later accept some expression like "5*(1+2)".

		// /Calculate.compute("1");
		Postfix myfix= new Postfix();


		int[] myarr ={1,2,3};
        arrayFunc(myarr);
		System.out.println(myarr[0]);


		System.out.println(myfix.compute("1+7*3-10"));
		
	}

}


//I solemnly swear to always start the comments with a capital letter and end it with a comma.