package main;

import java.util.List;

import io.javalin.Javalin;
import pojo.ExpensePojo;
import service.EmployeeService;
import service.EmployeeServiceImpl;
import pojo.EmployeePojo;
public class ReimbursementsMain {

	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		
        Javalin myServer = Javalin.create((config)-> config.enableCorsForAllOrigins()).start(4040);
		
		System.out.println("Server listening at port 4040...");
		
		
		// endpoint to fetch all books from DB
				myServer.get("/api/pending", (ctx)->{
					List<ExpensePojo> allPending = employeeService.viewPending(Integer.parseInt(null));
					ctx.json(allPending); // collection of BookPojo is converted to an array of JSON objects
				});
				

	}

}
