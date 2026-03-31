/*class A{
	public static void main(String ar[]){
		System.out.println("Hello From A");
		//print Hello Form A(main)
		//type test print error
	}
}*/


/*class A{
	static void printHi(){
		System.out.println("Hi form printHi");//second print
	}
	public static void main(String ar[]){
		System.out.println("Hello From A");
		//print Hello Form A(main)
		//type test print error
		printHi();//first print
	}
}*/

class A{
	static void printHi(){
		System.out.println("Hi form printHi");//second print
	}
	static void add(int x,int y){
		System.out.println(x+"+"+y+"="+(x+y));
	}
	public static void main(String ar[]){
		System.out.println("Hello From A");//first print
		//print Hello Form A(main)
		//type test print error
		printHi();//
		add(5,3);
		int a=2,b=7;
		add(a,b);
	}
}