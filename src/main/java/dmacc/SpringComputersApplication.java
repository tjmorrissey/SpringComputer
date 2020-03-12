package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Computer;
import dmacc.controller.ComputerConfiguration;
import dmacc.repository.ComputerRepository;

@SpringBootApplication
public class SpringComputersApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringComputersApplication.class, args);
	}

	@Autowired
	ComputerRepository repo;
	

	@Override
	public void run(String... args) throws Exception {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(ComputerConfiguration.class);
		
		//using existing bean
		Computer comp1 = appContext.getBean("computer", Computer.class);
		
		comp1.setAsset(39800);
		repo.save(comp1);
		
		//Creating a bean to use - not managed by Spring
		Computer comp2 = new Computer(36000, "Dell", "Laptop");

		repo.save(comp2);
		
		List<Computer> allComputers = repo.findAll();
		for(Computer people: allComputers) {
			System.out.println(people.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}
	
}
