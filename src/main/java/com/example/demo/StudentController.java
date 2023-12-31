package com.example.demo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins="*")
public class StudentController {
	
	@Autowired
	StudentRepo repo;
	@RequestMapping("/student/register")
	public String register(
			@RequestParam ("studentimage") MultipartFile file,
			String rollnumber,
			String name,
			String dob,
			String year,
			String branch,
			String phonenumber,
			String emailid) {
		Student res = new Student();
		try {
			
			Student student = new Student(rollnumber,name,dob,year,branch,phonenumber,emailid,compressBytes(file.getBytes()));
			res = repo.save(student);
						
					
		}
		catch(Exception e) {}
		return (res.getRollnumber()+": "+res.getName() +" Registered Successfully ");
		
	}
	
	@GetMapping("/findbyrollnumber")
	public String findByRollNumber(@RequestParam String rollnumber) {	
		Student student1= new Student();
		//String name="";
		student1= repo.findById(rollnumber).get();		
		//name=student1.getName();
		return student1.getName();		
	}
	
	
	
	
	
	
	
	
	
	// compress the image bytes before storing it in the database
	public static byte[] compressBytes(byte[] data) {
	Deflater deflater = new Deflater();
	deflater.setInput(data);
	deflater.finish();

	ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
	byte[] buffer = new byte[1024];
	while (!deflater.finished()) {
	int count = deflater.deflate(buffer);
	outputStream.write(buffer, 0, count);
	}
	try {
	outputStream.close();
	} catch (IOException e) {
	}
	System.out.println("Compressed Image Byte Size - " + outputStream.toByteArray().length);

	return outputStream.toByteArray();
	}
	
	// uncompress the image bytes before returning it to the angular application
	public static byte[] decompressBytes(byte[] data) {
	Inflater inflater = new Inflater();
	inflater.setInput(data);
	ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
	byte[] buffer = new byte[1024];
	try {
	while (!inflater.finished()) {
	int count = inflater.inflate(buffer);
	outputStream.write(buffer, 0, count);
	}
	outputStream.close();
	} catch (IOException ioe) {
	} catch (DataFormatException e) {
	}
	return outputStream.toByteArray();
	}
	
	

}
