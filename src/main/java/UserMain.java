import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entites.Role;
import entites.User;
import interf.UserServiceRemote;

public class UserMain {

	public static void main(String[] args) throws NamingException {
		String jndiName = "test-ear/test-ejb/UserService!interf.UserServiceRemote";
		Context context = new InitialContext();
		UserServiceRemote userServiceremote = (UserServiceRemote) context.lookup(jndiName);
		User u = new User("ab@esprit.tn", "dev", "mohamed", "bouhlel", Role.DEVELOPER);
		User p = new User("ka@neoxam.tn", "cli", "kais", "allani", Role.CLIENT);
		int i = userServiceremote.ajouteruser(u);
		int a = userServiceremote.ajouteruser(p);
	
		System.out.println(i);
		System.out.println(a);
	
	


	}

}
