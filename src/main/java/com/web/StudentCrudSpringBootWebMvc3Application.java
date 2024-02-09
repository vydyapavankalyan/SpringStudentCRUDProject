package com.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.Entity.Studentpk;
import com.web.repo.StudentRepo;

@SpringBootApplication
public class StudentCrudSpringBootWebMvc3Application implements CommandLineRunner {

	@Autowired
	private StudentRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(StudentCrudSpringBootWebMvc3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Studentpk s2=new Studentpk(102,"Arun","spring",1000.00);

		repo.save(s2);

		Studentpk s3=new Studentpk(103,"shashi","springboot",9000.00);

		repo.save(s3);
		
		Studentpk s4=new Studentpk(104,"Ajay","java",6000.00);

		repo.save(s4);
		
		Studentpk s5=new Studentpk(105,"sai","java fullstack",12000.00);
		
		repo.save(s5);
		

		System.out.println("New Student Record Inserted....");
		
		
	/*	System.out.println("----GET ONE STUDENT RECORD....");
		
		Studentpk getOne=repo.findById(102).get();
		System.out.println(getOne);
		*/
		
		/*System.out.println("----GET ALL STUDENT RECORD....");
		
		List<Studentpk> listofStudentpks=(List<Studentpk>) repo.findAll();
		System.out.println(listofStudentpks);*/
		
		/*System.out.println("----DELETE  STUDENT RECORD....");
		repo.deleteById(101);
		System.out.println("ONE Record Deleted");*/
		
		/*System.out.println("----Update STUDENT RECORD....");
		Studentpk oldRecord=repo.findById(102).get();
		
		Studentpk newData=new Studentpk();
		newData.setStdName("Naresh");
		newData.setCourse(".Net");
		newData.setFee(45000);
		
		oldRecord.setStdName(newData.getStdName());
		oldRecord.setCourse(newData.getCourse());
		oldRecord.setFee(newData.getFee());
		repo.save(oldRecord);
		System.out.println("Record Updata Succesfull....");*/
		

	}

}
