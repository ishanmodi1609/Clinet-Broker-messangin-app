import java.util.*;
import java.io.*;
class admin
{static Scanner in=new Scanner(System.in);
    static String pass;
	static void create(int id)
	{
	
		try
	{
	   File my_file=new File("user "+id+".txt"); 
		FileWriter my_writer = new FileWriter(my_file);
		//my_writer.write("create\n");
	    my_writer.write("ID"+"\n");
	    my_writer.write(id+"\n");
	
	    my_writer.write("PASSWORD\n");
	    System.out.println("ENTER THE PASSWORD GIVEN BY USER\n");
		String s=in.nextLine();
	    pass = in.nextLine();
	    my_writer.write(pass+"\n");
	
	System.out.println("ENTER THE NAME OF USER\n");
    pass = in.nextLine();
	my_writer.write("NAME"+"\n");
	my_writer.write(pass+"\n");
	//in.nextLine();
   // System.out.println("YOU CAN CHECK OUT AT THIS LOCATION\t"+my_file.getAbsolutePath());
	my_writer.close();
	}

	 catch(IOException e)
	 {
		 System.out.println(e);
     }
		
		
	}
	
	static void message(int ch)
	{
		try
		{
		File message=new File("messages "+ch+".txt");
		FileWriter m_write=new FileWriter(message);
		System.out.println("WRITE YOUR MESSAGE FOR "+ch+" USER");
		System.out.println("ENTER \"END\" for terminatinng your message");
		String inp;
		do{
			inp=in.nextLine();
			if(!inp.equals("END"))
				m_write.write(inp+"\n");
			
		}while(!inp.equals("END"));
		m_write.close();
		System.out.println("Your message is sent");
		}
		catch(IOException e)
		{
			System.out.println(e);
			System.out.println("NO SUCH USER EXIST");
		}
	}
	
	static void login()
	{
		File admin_file=new File("admin.txt");
		try{
			Scanner my_read = new Scanner(admin_file);
			System.out.println("First time password is \"ADMIN\"");
			
			//System.out.println("ENTER YOUR PASSWORD");
			
			String s;
			//in.nextLine();
			//s=in.nextLine();
			
			int choice;
			System.out.println("ENTER YOUR PASSWORD");
			s=in.nextLine();
			if(!s.equals(my_read.nextLine()))
			{
				System.out.println("WRONG PASSWORD");
				return;
			}
			System.out.println("YOU ARE GOING ON RYT WAY");
			my_read = new Scanner(admin_file);
			
		        //s=in.nextLine();		
				
					System.out.println("Do you want to change password. We recommand you to change if youare login first time\n1 for YES \t for NO\n");
					choice=in.nextInt();
					String a = in.nextLine();
					if(choice==1)
					{
					    File admin_file1=new File("admin.txt");
						try{
						FileWriter my_write1=new FileWriter(admin_file1);
						//BufferedWriter my_write=new BufferedWriter(my_write1);
						System.out.println(my_write1);
							System.out.println("ENTER YOUR PASSWORD");
							s=in.nextLine();
						//  my_write1.write("pwd\n");
						  my_write1.write(s+"\n");
						  my_write1.close();
						  
						}
						
						 catch(NoSuchElementException e)
						{
							System.out.println(e);
							return;
						}
					}
					else
					{
                          try{
							  File req=new File("request.txt");
							  Scanner req_read=new Scanner(req);
							  
							  while(req_read.hasNextLine())
							  {
								  System.out.println(req_read.nextLine());
							  }
						  }
						  catch(IOException e)
						  {
							  System.out.println("NO REQUEST YET");
							  //System.out.println(e);
							  
						  }
						  int ch;
						  do{
							  System.out.println("ENTER ID FOR OR OPENING IT'S MESSAGE OR 0 FOR RETURN TTO MAIN MENU");
							   ch=in.nextInt();
							  try{
								  File read = new File("messages "+ch+".txt");
								  Scanner read_r= new Scanner(read);
								    while(read_r.hasNextLine())
							  {
								  System.out.println(read_r.nextLine());
							  }
							  read_r.close();
							  int cho;
							  do{
							  System.out.println("1 FOR CREATION 2 FOR REPLY 3 FOR MAIN MENU\t");
							   cho=in.nextInt();
							  switch(cho)
							  {
								  case 1:create(ch);break;
								  case 2:message(ch);break;
								  case 3:break;
								  default:System.out.println("ENTER VALID INPUT\n");
							  }
							  }while(cho!=3);
							  }
							  catch(NoSuchElementException e)
							  {
								System.out.println("NO SUCH USER HAS REQUESTED PLEASE ENTER VALID ID");  
							  }
							  
						  }while(ch!=0);
						//my_write1.close();
						return;
					}
				

			
			
		}
		catch(IOException e)
		{
			System.out.println(e);
			System.out.println("NO SUCH USER HAS REQUESTED PLEASE LOGIN AGAIN");  
	          return;		
		}
	}
}
class login
{
   static Scanner in=new Scanner(System.in);
   static void USER_LOGIN(int id)
   {
	   		
			File	my_file = new File("user "+id+".txt");
			if(id==0||!my_file.exists())
			{
				System.out.println("YOU ARE NEW USER. DO YOU WANT TO SIGN UP \n1 for yes\t 2 for no\n");
				int c=in.nextInt();
				if(c==1)
				{
						
						user.USER_CREATION(id);
						System.out.println("\nYOUR REQUEST FOR CREATION OF NEW ID WITH THESE DETAIL IS SENT..WE'LL SEND YOUR CONFIRMATION WHEN OUR ADMIN WILL ADD INFORMATION\nHAVE ANICE DAY!!");
						//System.out.println("YOUR ID IS "+id+"you can login with the help of id and password");
						//file.total_id++;
						return;
				}
				else
				{
					System.out.println("OKEY THEN WE ARE DIRECTING YOUT O OUR MAIN MENU");
					return;
				}
				
			}
			
	 
      try{
		  
		  my_file = new File("user "+id+".txt");
		
			String s= "";
		  
		  Scanner my_reader = new Scanner(my_file);
		  
		  while(my_reader.hasNextLine())
		  {
			  if(s.equals("ID"))
			  {
				 // String str = in.nextLine();
				  //System.out.println(my_reader.nextLine());
				  String id_is=new String(id+"");
				  if(true||my_reader.nextLine().equals(id_is))
				  {
					    //System.out.println(s+"\tYOU CAN CHECK OUT AT THIS LOCATION\t"+my_file.getAbsolutePath());
					  if(s.equals("NAME"))
				  System.out.println(my_reader.nextLine());
			   // System.out.println(s+"\t"+my_reader.nextLine());
				  }
			  }
			  if(s.equals("PASSWORD"))
			  {
				  System.out.println("ENTER YOUR PASSWORD TO READ THIS FILE AHEAD");
				  String str = in.nextLine();
				  if(!str.equals(my_reader.nextLine()))
				  {
						System.out.println("ALERT YOU HAVE ENTERED A WRONG PASSWROD\n WE ARE CLOSING THIS FILE FOR SECURITY PURPOSE");
				        break;
				  }
				   
				   
				  System.out.println("WELCOME SIR/MADAM");
				    try{
								  File read = new File("messages "+id+".txt");
								  Scanner read_r= new Scanner(read);
								  System.out.println("THIS IS YOUR MESSAGES\n");
								    while(read_r.hasNextLine())
							  {
								  System.out.println(read_r.nextLine());
							  }
							  read_r.close();
					}
					catch(IOException e)
					{
						System.out.println(e);
						System.out.println("Somehow your file is not found ..PLEASE CONTACT OUR PROGRAMMER");

						return;
					}
				  
				  System.out.println("DO YOU WANT TO REQUEST YOUR HANDLER 1 FOR YES ANYOTHER FOR NO");
				  int ch=in.nextInt();
				  in.nextLine();
				  switch(ch)
				  {
					  case 1:System.out.println("MESSAGE WILL BE WRITTEN");
					

					  
						File messages_file=new File("messages "+id+".txt");
						try{
						FileWriter my_write1=new FileWriter(messages_file);
						BufferedWriter my_write=new BufferedWriter(my_write1);
						  my_write.append("ID\n");
						  my_write.append(id+"\n");
						  
						  System.out.println("ENTER TO \"END\"");
						  String inp;
						    do{
							
							   inp=in.nextLine();
								if(inp.equals("END"))
								{
									System.out.println("YOUR MESSAGE HAS BEEN RECORDED");
									my_write.close();
									break;
								}
							  my_write.append(inp+"\n");
							  //System.out.println("YOU CAN CHECK OUT AT THIS LOCATION\t"+messages_file.getAbsolutePath());
						 }while(!inp.equals("END"));
						}
						
						 catch(NoSuchElementException e)
						{
							break;
						}
						System.out.println("OKEY");
						
						try{
							File request = new File("request.txt");
						FileWriter req_write=new FileWriter(request);
						BufferedWriter req_writer=new BufferedWriter(req_write);
						
						req_writer.write(id+"\n");
						req_write.close();
						}
						catch(NoSuchElementException e)
						{
							System.out.println("SOMETHING IS WRONG PLEASE CONTACT YOUR PROGRAMMER");
							return;
						}
				  }
				  return;
			  }
				  
			  
			  
			  try
			  {
			  s = my_reader.nextLine();
			  }
			  catch(NoSuchElementException e)
			  {
				  break;
			  }
			  
		  }
		 
		  my_reader.close();
	  }	  
	  catch(IOException e)
	  {
		  System.out.println(e);
	  }
	}
   
}
class user
{
	static Scanner in=new Scanner(System.in);
	static void USER_CREATION(int id)
	{
		
        String pass;
//		File my_file = new File("user "+id+".txt");
	try
	{
		File my_file=new File("messages "+id+".txt"); 
		FileWriter my_writer = new FileWriter(my_file);
		my_writer.write("create\n");
	    my_writer.write("ID"+"\n");
	    my_writer.write(id+"\n");
	
	    my_writer.write("PASSWORD\n");
	    System.out.println("ENTER THE PASSWORD YOU WANT TO SET\n");
	    pass = in.nextLine();
	    my_writer.write(pass+"\n");
	
	System.out.println("ENTER THE NAME YOU WANT TO SET\n");
    pass = in.nextLine();
	my_writer.write("NAME"+"\n");
	my_writer.write(pass+"\n");
	//in.nextLine();
   // System.out.println("YOU CAN CHECK OUT AT THIS LOCATION\t"+my_file.getAbsolutePath());
	my_writer.close();
		System.out.println("OKEY");
						
						try{
							File request = new File("request.txt");
							FileWriter req_write=new FileWriter(request,true);
							BufferedWriter req_writer=new BufferedWriter(req_write);
							req_writer.append(id+"\n");
							req_writer.close();
							req_write.close();
						}
						catch(IOException e)
						{
							System.out.println("SOMETHING IS WRONG PLEASE CONTACT YOUR PROGRAMMER");
							return;
						}
	}

	 catch(IOException e)
	 {
		 System.out.println(e);
     }
	 					
	//System.out.println();
//	System.out.println();
	
  }
	
	
	
	
}




class file
{
	static void print(String a){System.out.println(a);}
	static Scanner in=new Scanner(System.in);	
	public static void main(String args[])
    {
	   
		int total_id=0;
		int id=0;
		int choice=1;
		do
		{
			try{
				print("LOGIN AS USER 1\nLOGIN AS Admin 2\n");
				choice = in.nextInt();
			}catch(Exception e){
				print("Please enter valid i/p");
				choice=in.nextInt();
			}
			switch(choice)
			{
				case 1:
                     do{
						try{
						   System.out.println("ENTER YOUR ID OR ELSE IF YOU DONN'T HAVE ANY THEN ENTER ANY NUMBER EXCEPT 0");
						   id=in.nextInt();
						   String s=in.nextLine();
						}catch(Exception e){
							System.out.println("Exceptio:"+e);
							System.out.println("This is input is not valid.");
							continue;
						}
					   if(id==0)
						   System.out.println("NOT VALID");
					 }while(id==0);
				     login.USER_LOGIN(id);
				     break;
				case 2: admin.login();
				     break;
			}
		}while(choice==1||choice==2);
		System.out.println("TAHNK YOU FOR USING OUR APPLICATION");
		
	}
	
	
}