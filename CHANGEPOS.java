import java.util.Scanner;
class Solution{
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		int t= cin.nextInt();
		
		while(t>0){
			int sx= cin.nextInt();
			int sy= cin.nextInt();
			int ex= cin.nextInt();
			int ey=cin.nextInt();
			
			if(sx!=ex && sy!=ey){
				System.out.println(1);
			}else if(sx==ex && sy==ey){
				System.out.println(0);
			}else{
				System.out.println(2);
			}
			t--;
		}
		cin.close();
	}
}