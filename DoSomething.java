import java.util.ArrayList;
import java.util.List;



public class DoSomething {

	public ToTest doService;

	public DoSomething(ToTest doService) {
		this.doService = doService;
	}
	
	public List<String> getTodosforSomething(String user) {
		
		List<String> hibernatelist = new ArrayList<String>();
		List<String> Combinedlist = doService.getTodos(user);
		
		for(String todo: Combinedlist) {
			if(todo.contains("something")) {
				hibernatelist.add(todo);
			}
		}
		
		return hibernatelist;
		}
 }
