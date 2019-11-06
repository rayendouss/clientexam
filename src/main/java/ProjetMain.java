import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entites.Project;
import entites.Role;
import entites.User;
import interf.ProjetServiceRemote;
import interf.UserServiceRemote;

public class ProjetMain {

	public static void main(String[] args) throws NamingException {
		String jndiName = "test-ear/test-ejb/ProjetService!interf.ProjetServiceRemote";
		Context context = new InitialContext();
		ProjetServiceRemote pr = (ProjetServiceRemote) context.lookup(jndiName);
		Project p = new Project("MAP", "getaaaaa");
		Project t = new Project("OTDAV", "getaaaaa");
		int l = pr.ajouterprojet(p);
		
		int s = pr.ajouterprojet(t);
		
		System.out.println(l);
		System.out.println(s);
		
		int q=pr.assignProjectToUser(1, 1);
		int w =pr.assignProjectToUser(1, 2);
		System.out.println("aaaa");
		System.out.println(w);
		System.out.println(q);
		System.out.println(pr.GetUserbyid(1).getProjects().size());
		Date d= new Date();
		String desc = "aaaaa";
		pr.addSprintAndAssignToProject(desc, d, 1);
		
		

	}

}
