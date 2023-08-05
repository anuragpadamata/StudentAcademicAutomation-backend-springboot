package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class MarksController {
	@Autowired
	MarksRepo repo;
	@PostMapping("/marks/upload")
	public String uploadMarks(@RequestBody Marks marks) {
		Marks result = new Marks();
		result=repo.save(marks);
		
		return (result.getRollnumber()+"Successfully uploaded");
		
	}
	@GetMapping("/marks/rollnumber")
	public Marks getMarks(@RequestParam String rollnumber) {
		Marks result= new Marks();
		try {
			
			result=repo.findById(rollnumber).get();
		}
		catch(Exception e) {}
		return result;
	}

}
