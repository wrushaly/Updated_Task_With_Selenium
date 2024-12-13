package abc;


	


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class task {

		public static void main(String[] args) throws InterruptedException {

	// *********{QA1}	
			
			
			
			// TODO Auto-generated method stub
			WebDriver driver0=new ChromeDriver();
			
			driver0.manage().window().maximize();
			
	//**login provided credentials**//	
			driver0.get("https://kanban.jagadishk.dev/");
			WebElement usernameField0 = driver0.findElement(By.xpath("//label[text()='Username']/following-sibling::input"));
	        usernameField0.sendKeys("testadmin");

	        // Fill in the password
	        WebElement passwordField0 = driver0.findElement(By.xpath("//label[text()='Password']/following-sibling::input"));
	        passwordField0.click();  // click before sending keys if necessary
	        passwordField0.sendKeys("password");

	        // Click the Sign in button
	        WebElement signInButton0 = driver0.findElement(By.xpath("//button[text()='Sign in']"));
	        signInButton0.click();
			
			driver0.quit();
			
			
			
			
			// Fill in the username
			
	WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
	//**login provided credentials**//	
			driver.get("https://kanban.jagadishk.dev/");
			WebElement usernameField = driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input"));
	        usernameField.sendKeys("testadmin");

	        // Fill in the password
	        WebElement passwordField = driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input"));
	        passwordField.click();  // click before sending keys if necessary
	        passwordField.sendKeys("password");

	        // Click the Sign in button
	        WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
	        signInButton.click();

	        Thread.sleep(2000);
	        // Click on 'Test Admin '
	        WebElement testAdminLink = driver.findElement(By.xpath("//*[@class='avatar avatar-20 avatar-inline']"));
	        testAdminLink.click();

	        Thread.sleep(2000);
	        // Click on 'My profile'
	        WebElement myProfileLink = driver.findElement(By.xpath("(//a[contains(text(), 'My profile')])[2]"));
	        myProfileLink.click();

	        Thread.sleep(2000);
	        // Click on 'Change password'
	        WebElement changePasswordLink = driver.findElement(By.xpath("//a[text()='Change password']"));
	        changePasswordLink.click();
	        
	        Thread.sleep(2000);

	        // Fill in the current password
	        WebElement currentPasswordField = driver.findElement(By.xpath("//*[@name='current_password']"));
	        currentPasswordField.click();  // click before sending keys if necessary
	        currentPasswordField.sendKeys("password");

	        
	        Thread.sleep(2000);
	        // Fill in the new password
	        WebElement newPasswordField = driver.findElement(By.xpath("//*[@name='password']"));
	        newPasswordField.click();
	        newPasswordField.sendKeys("password");

	        
	        Thread.sleep(2000);
	        // Fill in the confirmation password
	        WebElement confirmPasswordField = driver.findElement(By.xpath("//*[@name='confirmation']"));
	        confirmPasswordField.click();
	        confirmPasswordField.sendKeys("password");

	        // Click the 'Save' button
	        Thread.sleep(2000);
	        WebElement saveButton = driver.findElement(By.xpath("//*[@type='submit']"));
	        saveButton.click();

	  
	        // LOG OUT 
	        
	     //   
	        
	        // Add any necessary assertions or waits here if needed
	//** create new user**//
	       
	        // Click on 'New user'

	        Thread.sleep(2000);
	        WebElement newUserLink = driver.findElement(By.xpath("(//*[@class='js-modal-medium'])[4]"));
	        newUserLink.click();

	       
	        

	        
	        Thread.sleep(2000);
	        WebElement usernameField1 = driver.findElement(By.xpath("//*[@id='form-username']"));
	        usernameField1.click();
	        usernameField1.sendKeys("testmanager");
	        Thread.sleep(2000);
	        
	        WebElement role = driver.findElement(By.xpath("//*[@name='role']"));
	        Select s= new Select(role);
	        s.selectByVisibleText("Manager");
	        Thread.sleep(2000);

	        WebElement passwordField1 = driver.findElement(By.xpath("//*[@name='password']"));
	        passwordField1.click();
	        passwordField1.sendKeys("testmanager");

	        Thread.sleep(2000);
	        WebElement confirmPasswordField1 = driver.findElement(By.xpath("//*[@name='confirmation']"));
	        confirmPasswordField1.click();
	        confirmPasswordField1.sendKeys("testmanager");
	        
	        Thread.sleep(2000);
	        WebElement saveButton1 = driver.findElement(By.xpath("//*[@type='submit']"));
	        saveButton1.click();

	    
	        Thread.sleep(2000);
	        WebElement newUserLink2 = driver.findElement(By.xpath("(//*[@class='js-modal-medium'])[4]"));
	        newUserLink2.click();
	        
	        Thread.sleep(2000);
	       WebElement usernameField2 = driver.findElement(By.xpath("//*[@id='form-username']"));
	        usernameField2.click();
	         usernameField2.sendKeys("testuser");
	         
	         Thread.sleep(2000);
	         WebElement role2 = driver.findElement(By.xpath("//*[@name='role']"));
	         Select s2= new Select(role2);
	         s2.selectByVisibleText("User");
	         
	         Thread.sleep(2000);

	         WebElement passwordField2 = driver.findElement(By.xpath("//*[@name='password']"));
	         passwordField2.click();
	         passwordField2.sendKeys("testuser");

	         Thread.sleep(2000);
	         WebElement confirmPasswordField2 = driver.findElement(By.xpath("//*[@name='confirmation']"));
	         confirmPasswordField2.click();
	         confirmPasswordField2.sendKeys("testuser");

	         WebElement saveButton2 = driver.findElement(By.xpath("//*[@type='submit']"));
	         saveButton2.click();
	       
	        
	        
	         Thread.sleep(2000);
	         WebElement newUserLink3 = driver.findElement(By.xpath("(//*[@class='js-modal-medium'])[4]"));
	         newUserLink3.click();
	         
	         Thread.sleep(2000);
	        WebElement usernameField3 = driver.findElement(By.xpath("//*[@id='form-username']"));
	         usernameField3.click();
	          usernameField3.sendKeys("testviewer");
	          
	         
	          
	         Thread.sleep(2000);
	         WebElement passwordField3 = driver.findElement(By.xpath("//*[@name='password']"));
	      
	          passwordField3.click();
	          passwordField3.sendKeys("testviewer");

	          Thread.sleep(2000);
	          WebElement confirmPasswordField3 = driver.findElement(By.xpath("//*[@name='confirmation']"));
	          confirmPasswordField3.click();
	          confirmPasswordField3.sendKeys("testviewer");
	          
	       
	          WebElement role3 = driver.findElement(By.xpath("//*[@id='form-role']"));
	          Thread.sleep(2000);
	          Select s3= new Select(role3);
	          s3.selectByVisibleText("User");
	          

	          Thread.sleep(2000);
	          WebElement saveButton3 = driver.findElement(By.xpath("//*[@type='submit']"));
	          saveButton3.click();
	       
	          
	  //***************create new project****//
	   
	          Thread.sleep(2000);
	          WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
	          WebElement testAdminLink1 = wait3.until(ExpectedConditions.elementToBeClickable(
	                  By.xpath("//*[@class='avatar-letter']")));
	          testAdminLink1.click();

	          
	      //    WebElement testAdminLink1 = driver.findElement(By.xpath("//strong[text()='testadmin']"));
	      //   testAdminLink1.click();
	       //strong[text()='testadmin']"
	         ////*[@class='avatar avatar-20 avatar-inline']
	       //   WebElement dashbord = driver.findElement(By.xpath("//*[@title='Dashboard']"));
	         // dashbord.click();
	          
	  
			                
	          Thread.sleep(2000);
	        WebElement projectsManagementLink = driver.findElement(By.xpath("(//*[@href='/projects'])[2]"));
	        projectsManagementLink.click();

	          // Click on 'New project'
	        Thread.sleep(2000);
	        WebElement newProjectLink = driver.findElement(By.xpath("(//*[text()='New project'])[2]"));
	        newProjectLink.click();
	       //   WebElement newProjectLink = driver.findElement(By.xpath("(//*[text()='New project'])[1]"));
	     //     newProjectLink.click();

	          // Fill out the project details
	        Thread.sleep(2000);
	        WebElement nameField = driver.findElement(By.xpath("//*[@name='name']"));
	        nameField.sendKeys("Tests Project");
	        
	        Thread.sleep(2000);
	        WebElement identifierField = driver.findElement(By.xpath("//*[@name='identifier']"));
	        identifierField.click();
	          identifierField.sendKeys("TP");

	          // Click the 'Save' button
	          Thread.sleep(2000);
	          WebElement saveButton6 = driver.findElement(By.xpath("//*[@type='submit']"));
		        saveButton6.click();
	        

	          
	//**************************{QA2}
	          
	          
	          /* ***** adding permission********* */  
	          
	          Thread.sleep(4000);
	          WebElement permission = driver.findElement(By.xpath("//*[text()='Permissions']"));
	          permission.click();

	          
	  //for TESTMANAGER      // Click on the input field
	          
	       // Locate the input field
	          Thread.sleep(2000);
	          WebElement permissionUname = driver.findElement(By.xpath("(//*[@name='name'])[1]"));


	          
	          permissionUname.click();

	          
	          permissionUname.sendKeys("tes"); // Example of sending partial text
	         
	          Thread.sleep(2000);
	          // Wait for the dropdown to appear
	          
	          WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	          WebElement testMAN = wait1.until(ExpectedConditions.elementToBeClickable(
	                  By.xpath("(//*[@class='ui-menu-item'])[1]")));
	          testMAN.click();

	          //role
	          
	          Thread.sleep(2000);
	          WebElement selRole = driver.findElement(By.xpath("//*[@name='role']"));
	          Select sel= new Select(selRole);
	          sel.selectByIndex(0);
	          
	          Thread.sleep(2000);
	          WebElement  add= driver.findElement(By.xpath("(//*[@class='btn btn-blue'])[1]"));
	          add.click();
	          
	          
	    //TEST USER  
	          WebElement permissionUname2 = driver.findElement(By.xpath("(//*[@name='name'])[1]"));
	          permissionUname2.click();
	          permissionUname2.sendKeys("tes"); // Example of sending partial text
	          
	          Thread.sleep(2000);
	          // Wait for the dropdown to appear
	          
	          WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	          WebElement testUs = wait2.until(ExpectedConditions.elementToBeClickable(
	                  By.xpath("(//*[@class='ui-menu-item'])[2]")));
	          testUs.click();

	          //role
	          
	          Thread.sleep(2000);
	          WebElement selRole2 = driver.findElement(By.xpath("//*[@name='role']"));
	          Select sel2= new Select(selRole2);
	          sel2.selectByIndex(1);
	          
	          Thread.sleep(2000);
	         WebElement  add2= driver.findElement(By.xpath("(//*[@class='btn btn-blue'])[1]"));
	          add2.click();
	          
	          
	   //test viewer       
	          WebElement permissionUname3 = driver.findElement(By.xpath("(//*[@name='name'])[1]"));
	            permissionUname3.sendKeys("tes"); // Example of sending partial text
	          
	          Thread.sleep(2000);
	          // Wait for the dropdown to appear
	          
	          WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(10));
	          WebElement testVie = wait13.until(ExpectedConditions.elementToBeClickable(
	                  By.xpath("(//*[@class='ui-menu-item'])[3]")));
	          testVie.click();

	          //role
	          
	          Thread.sleep(2000);
	          WebElement selRole3 = driver.findElement(By.xpath("//*[@name='role']"));
	          Select sel3= new Select(selRole3);
	          sel3.selectByIndex(2);
	          
	          Thread.sleep(2000);
	          WebElement  add3= driver.findElement(By.xpath("(//*[@class='btn btn-blue'])[1]"));
	          add3.click();
	          
	   //LOG OUT
	          
	          WebElement testadmin4 = driver.findElement(By.xpath("(//*[@class='fa fa-caret-down'])[2]"));
	          testadmin4.click();
	          
	          Thread.sleep(2000);
	          WebElement logOut = driver.findElement(By.xpath("(//*[text()='Logout'])[2]"));
	          logOut.click();
	          
	   
	//***********{QA3}  
	          
	      	WebElement usernameField31 = driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input"));
	        usernameField31.sendKeys("testmanager");

	        // Fill in the password
	        Thread.sleep(2000);
	        WebElement passwordField31 = driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input"));
	        passwordField31.click();  // click before sending keys if necessary
	        passwordField31.sendKeys("testmanager");

	        // Click the Sign in button
	        Thread.sleep(2000);
	        WebDriverWait wait32 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement signInButton31 = wait32.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//*[text()='Sign in']")));
	        signInButton31.click();
	        
	       // Thread.sleep(2000);
	      //  WebElement signInButton31 = driver.findElement(By.xpath("//*[text()='Sign in']"));
	   //     signInButton.click();
	      //*[@class='btn btn-blue']
	      //button[text()='Sign in']


//		 WebElement testAdminLink1 = driver.findElement(By.xpath("//*[@class='avatar avatar-20 avatar-inline']"));//*[@class='avatar avatar-20 avatar-inline']
	//   testAdminLink1.click();

	//creating new task
	        Thread.sleep(2000);
	WebElement testProject = driver.findElement(By.xpath("//*[text()='Tests Project']"));
	 testProject.click();
	 
	 //dropdown menu
	 Thread.sleep(2000);
	 WebElement dropMenu = driver.findElement(By.xpath("//*[@class='fa fa-cog']"));
	 dropMenu.click();
	 

	// Wait for addNewTask element to be visible and interactable
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 WebElement addNewTask = wait.until(ExpectedConditions.visibilityOfElementLocated(
	     By.xpath("(//*[text()='Add a new task'])[2]")));
	 addNewTask.click();
	 
	 Thread.sleep(1000);
	 WebElement title = driver.findElement(By.xpath("//*[@name='title']"));
	 title.sendKeys("bcDF");
	 
	 Thread.sleep(1000);
	 WebElement assigning = driver.findElement(By.xpath("//*[@id='form-owner_id']"));
	 Select sle = new Select(assigning);
	 sle.selectByVisibleText("testuser");
	 
	 Thread.sleep(1000);
	 WebElement column = driver.findElement(By.xpath("//*[@id='form-column_id']"));
	 Select slle = new Select(column);
	 slle.selectByVisibleText("Backlog");

	 Thread.sleep(2000);
	 WebElement save = driver.findElement(By.xpath("//*[@type='submit']"));
	 save.click();
	 
	 Thread.sleep(2000);
	 WebDriverWait wait31 = new WebDriverWait(driver, Duration.ofSeconds(10));
	 WebElement testAdminLink2 = wait31.until(ExpectedConditions.elementToBeClickable(
	     By.xpath("//*[@aria-label='testmanager']")));
	 testAdminLink2.click();
	 
	 WebElement logout3= driver.findElement(By.xpath("(//*[text()='Logout'])[2]"));
	 logout3.click();
	 
	 
	 //***********{Q4}
	 
		WebElement usernameField41 = driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input"));
	    usernameField41.sendKeys("testuser");

	    // Fill in the password
	    Thread.sleep(2000);
	    WebElement passwordField41 = driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input"));
	    passwordField41.click();  // click before sending keys if necessary
	    passwordField41.sendKeys("testuser");

	    // Click the Sign in button
	    Thread.sleep(2000);
	    WebElement signInButton41 = driver.findElement(By.xpath("//button[text()='Sign in']"));
	    signInButton41.click();
	    
	    Thread.sleep(2000);
	    WebElement testProject4= driver.findElement(By.xpath("(//*[text()='Tests Project'])[1]"));
	    testProject4.click();
	    
	    
	    WebElement drag = driver.findElement(By.xpath("(//*[@class='task-board-expanded'])[1]"));
	    
	  
	    WebElement drop = driver.findElement(By.xpath("(//*[@class=\"board-task-list board-column-expanded sortable-column ui-sortable\"])[2]"));
	    
	   
	    Actions act =new Actions(driver);
	    
	   
	    act.dragAndDrop(drag, drop);
	    
	    WebElement  configTaskWind = driver.findElement(By.xpath("//*[@title='Configure this project']"));
	    
	    configTaskWind.click();
	    
	    Thread.sleep(2000);
	       driver.findElement(By.xpath("(//*[text()='Add a new task'])[2]")).click();
	    
	       Thread.sleep(2000);
	     driver.findElement(By.xpath("//*[@name='title']")).sendKeys("taskToUser");
	     
	     Thread.sleep(2000);
	    		  WebElement  taskToSelf = driver.findElement(By.xpath("//*[@id='form-owner_id']"));
	    		  Select selec4= new Select(taskToSelf);
	    		  selec4.selectByVisibleText("testuser");
	    		  
	    		  Thread.sleep(2000);
	    		 driver.findElement(By.xpath("//*[@type='submit']")).click();
	    		 
	    		 Thread.sleep(2000);
	             WebDriverWait wait41 = new WebDriverWait(driver, Duration.ofSeconds(10));
	             WebElement testAdminLink41 = wait41.until(ExpectedConditions.elementToBeClickable(
	                 By.xpath("(//*[@aria-label='testuser'])[1]")));
	             testAdminLink41.click();
	             
	             Thread.sleep(2000);
	             WebDriverWait wait42 = new WebDriverWait(driver, Duration.ofSeconds(10));
	             WebElement testAdminLink42 = wait42.until(ExpectedConditions.elementToBeClickable(
	                 By.xpath("(//*[text()='Logout'])[2]")));
	             testAdminLink42.click();
	             
	          
	    		  
	//**********{Q5}  
	             
	             WebElement usernameField51 = driver.findElement(By.xpath("//*[@name='username']"));
			        usernameField51.sendKeys("testviewer");

			        // Fill in the password
			        Thread.sleep(2000);
			        WebElement passwordField51 = driver.findElement(By.xpath("//*[@name='password']"));
			        passwordField51.click();  // click before sending keys if necessary
			        passwordField51.sendKeys("testviewer");

			        // Click the Sign in button
			        WebElement signInButton51 = driver.findElement(By.xpath("//button[text()='Sign in']"));
			        signInButton51.click();
			        
			        Thread.sleep(2000);
			        WebElement visibilityOfTestProj = driver.findElement(By.xpath("//*[text()='Tests Project']"));
			        visibilityOfTestProj.click();
			        
			        Thread.sleep(2000);
	             WebDriverWait wait51 = new WebDriverWait(driver, Duration.ofSeconds(10));
	             WebElement testAdminLink51 = wait51.until(ExpectedConditions.elementToBeClickable(
	                 By.xpath("//*[@aria-label='testviewer']")));
	             testAdminLink51.click();
	             
	             Thread.sleep(2000);
	             WebDriverWait wait52 = new WebDriverWait(driver, Duration.ofSeconds(10));
	             WebElement logout52 = wait52.until(ExpectedConditions.elementToBeClickable(
	                 By.xpath("(//*[text()='Logout'])[2]")));
	             logout52.click();
	             
	           //  WebElement logout3= driver.findElement(By.xpath("(//*[text()='Logout'])[2]"));
	           //  logout3.click();
	             
	//************* {QA6}             
			        
	             WebElement usernameField61 = driver.findElement(By.xpath("//*[@name='username']"));
			        usernameField61.sendKeys("testadmin");

			        // Fill in the password
			        WebElement passwordField61 = driver.findElement(By.xpath("//*[@name='password']"));
			        passwordField61.click();  // click before sending keys if necessary
			        passwordField61.sendKeys("password");

			        // Click the Sign in button
			        WebElement signInButton61 = driver.findElement(By.xpath("//button[text()='Sign in']"));
			        signInButton61.click();
			        
			        WebElement testadmin6  = driver.findElement(By.xpath("//*[@aria-label='testadmin']"));
			        testadmin6.click();
			      //*[@aria-label='testadmin']
			        
			        Thread.sleep(2000);    
			driver.findElement(By.xpath("(//*[text()='Users management'])[2]")).click();
			 
			//remove test viewer
			 Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@href='#'])[7]")).click();
			        
			 Thread.sleep(2000);
			      driver.findElement(By.xpath("(//*[text()='Remove'])[4]")).click();
			       
			      Thread.sleep(2000);
			      driver.findElement(By.xpath("//*[@class='btn btn-red']")).click();
			      
			//      driver.findElement(By.xpath("(//*[@title='testadmin'])[2]")).click();
			      
			  //    driver.findElement(By.xpath("(//*[text()='Logout'])[2]")).click();
			      
			 //     Thread.sleep(2000);
			//   driver.findElement(By.xpath("(//*[@title='testadmin'])[1]")).click();
			   
			   Thread.sleep(2000);
	        WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement testAdminLink6 = wait6.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("(//*[@aria-label='testadmin'])[1]")));
	        testAdminLink6.click();
			   
	      
	        Thread.sleep(2000);
	        WebDriverWait wait62 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement testAdminLink62 = wait62.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("(//*[text()='Logout'])[2]")));
	        testAdminLink62.click();
		
			//   Thread.sleep(2000);
			  // WebElement logOut = driver.findElement(By.xpath("(//*[text()='Logout'])[2]"));
		       // logOut.click();
		        
	        Thread.sleep(2000);
		        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("testviewer");
		        
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("testviewer");
		        
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		        
		        Thread.sleep(2000);
		        WebDriverWait wait63 = new WebDriverWait(driver, Duration.ofSeconds(10));
		        WebElement testAdminLink63 = wait63.until(ExpectedConditions.elementToBeClickable(
		            By.xpath("//button[text()='Sign in']")));
		        testAdminLink63.click();


	//********{QA7}	  
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//*[@name='username']")).clear();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//*[@name='password']")).clear();
		        
		        Thread.sleep(2000);
				WebElement usernameField71 = driver.findElement(By.xpath("//*[@name='username']"));
		        usernameField71.sendKeys("testadmin");

		        
		        
		        // Fill in the password
		        Thread.sleep(2000);
		        WebElement passwordField71 = driver.findElement(By.xpath("//*[@name='password']"));
		        passwordField71.click();  // click before sending keys if necessary
		        passwordField71.sendKeys("password");

		        // Click the Sign in button
		        Thread.sleep(2000);
		        WebDriverWait wait73 = new WebDriverWait(driver, Duration.ofSeconds(10));
		         WebElement signInButton73 = wait73.until(ExpectedConditions.elementToBeClickable(
		             By.xpath("//*[@class='btn btn-blue']")));
		         signInButton73.click();
		      
		        
		        //WebElement signInButton7 = driver.findElement(By.xpath("//button[text()='Sign in']"));
		        //signInButton.click();
		        
		     //   WebElement testadmin6  = driver.findElement(By.xpath("//*[@aria-label='testadmin']"));
		   //     testadmin6.click();
		        Thread.sleep(2000);
		        WebDriverWait wait71 = new WebDriverWait(driver, Duration.ofSeconds(10));
		         WebElement testAdminLink71 = wait71.until(ExpectedConditions.elementToBeClickable(
		             By.xpath("//*[@aria-label='testadmin']")));
		         testAdminLink71.click();
		        
		         Thread.sleep(2000);
		        driver.findElement(By.xpath("(//*[text()='Users management'])[2]")).click();
		      //*[@aria-label='testadmin']
		        
		    //to remove test manager
		       
		        Thread.sleep(2000);
		 WebElement testmanager=driver.findElement(By.xpath("(//*[@class='dropdown'])[4]"));
		 testmanager.click();
		 
		 Thread.sleep(2000);
		 WebElement	mRemove=driver.findElement(By.xpath("(//*[text()='Remove'])[3]"));
				 mRemove.click();
				 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btn btn-red']")).click();
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//*[@href='#'])[6]")).click();
		
		//testuser
		 WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(10));
	     WebElement testAdminLink7 = wait7.until(ExpectedConditions.elementToBeClickable(
	         By.xpath("(//*[@href='#'])[5]")));
	     testAdminLink7.click();
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//*[text()='Remove'])[2]")).click();
		WebDriverWait wait9= new WebDriverWait(driver, Duration.ofSeconds(14));
	    WebElement testAdminLink9 = wait9.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("(//*[@class='js-modal-confirm'])[4]")));
	    testAdminLink9.click();
		
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@class='btn btn-red']")).click();
		 WebDriverWait wait8= new WebDriverWait(driver, Duration.ofSeconds(10));
	     WebElement testAdminLink8 = wait8.until(ExpectedConditions.elementToBeClickable(
	         By.xpath("//*[@class='btn btn-red']")));
	     testAdminLink8.click();
		
		 Thread.sleep(2000);
	     WebDriverWait wait72 = new WebDriverWait(driver, Duration.ofSeconds(10));
	     WebElement testAdminLink72 = wait72.until(ExpectedConditions.elementToBeClickable(
	         By.xpath("(//*[@title='testadmin'])[1]")));
	     testAdminLink72.click();
		   
	     
	     Thread.sleep(2000);
	     WebDriverWait wait74 = new WebDriverWait(driver, Duration.ofSeconds(10));
	     WebElement logout74 = wait74.until(ExpectedConditions.elementToBeClickable(
	         By.xpath("(//*[text()='Logout'])[2]")));
	     logout74.click();
	     

	        
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("testmanager");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("testmanager");
	        Thread.sleep(2000);
	        
	        Thread.sleep(2000);
	        WebDriverWait wait75 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement signin74 = wait75.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//button[text()='Sign in']")));
	       signin74.click();
	        
	        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	        
	        driver.findElement(By.xpath("//*[@name='username']")).clear();
	        
	        driver.findElement(By.xpath("//*[@name='password']")).clear();
	        
	        Thread.sleep(4000);
	       driver.findElement(By.xpath("//*[@name='username']")).sendKeys("testuser");
	       Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("testuser");
	        Thread.sleep(2000);
	        
	        Thread.sleep(2000);
	        WebDriverWait wait76 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement signin75 = wait76.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//button[text()='Sign in']")));
	       signin75.click();
	        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
	}
	}
	 
	 

	
	
	
	

