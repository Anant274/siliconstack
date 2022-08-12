package in.javahome.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Hello world!
 *
 */
public class WelcomeLambda implements RequestHandler<Object, Object> 
{
   

	@Override
	public Object handleRequest(Object input, Context context) {
		// TODO Auto-generated method stub
		System.out.println("Hello Ans.Euph(Anastasia,Euphoria)");
		return null;
	}
}
