class span
{
	public static void main(String[] args) {


		impl obj=new impl();
		obj.disp();
	}
}
class impl
{
	public void disp(){
		int[] x={50,45,40,42,33,44};
		Integer[] s1=new Integer[x.length];
		for(int j=0;j<x.length;j++)
		{
			int counter=0;
			for(int i=j;i>=0;i--)
			{
				if (x[i]<=x[j])
				{
					counter++;
				}

			}
			s1[j]=counter;
		}
		for(int temp:s1)
		{
			System.out.println(temp);
		}

	}
}