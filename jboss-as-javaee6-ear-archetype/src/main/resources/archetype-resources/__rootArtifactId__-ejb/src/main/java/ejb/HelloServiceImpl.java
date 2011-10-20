#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;

import java.util.logging.Logger;

/**
 * Session Bean implementation class HelloServiceImpl
 */
@Stateless(mappedName = "helloService")
public class HelloServiceImpl implements HelloService {

	@Inject
	Logger log;

	private static String DEFAULT_NAME = "World"; 
	
	public String greet(String name) {
		String finalName = (name == null) || name.isEmpty() ? DEFAULT_NAME : name;
		String greeting =  "Hello "+finalName;
		log.fine(greeting);
		return greeting;
	}
}
