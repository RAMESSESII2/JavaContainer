interface Lambda{
	public void demo();
}
public class LambdaExpression1{
	public static void main(String[] args){
		Lambda lambda = ()->{
			System.out.println("statement 1");
			System.out.println("statement 2");
		};
		lambda.demo();
	}
}
