
public class Program3 {

	public static void main(String[] args) {
		int [] a = {10,20,30,40,50,60,70};
		int key=30;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(key == a[i])
			{
				System.out.println("key value is found");
				flag=true;
				break;
			}
		}
			if(flag==false)
				System.out.println("key value is not found");
		}
		
		

	}


