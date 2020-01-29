package com.Biswajit.Miscellaneous;

public class SwitchDemo {

	public static void main(String[] args) {

		String InputDay=args[0];
	//java is case sensitive	
		System.out.println("tHE ENTERED DAY:"+InputDay);
		Days convertedInput = mappingDaysToEnums(InputDay);
		//Days enteredday= Days.SUNDAY;
		System.out.println(convertedInput);
		switch(convertedInput)
		{
			case MONDAY: System.out.println("Working day");
					break;
			case TUESDAY: System.out.println("Working day");
					break;
					
			case WEDNESDAY: System.out.println("Working day");
			        break;
			case THURSDAY: System.out.println("Working day");
			        break;
			case FRIDAY: System.out.println("Working day");
			        break ;
			case SATURDAY: System.out.println("Not Working day");
			break;
			case SUNDAY: System.out.println(" Not Working day");
			break;
		    default: System.out.println("Correct value not input\n");
		
		}
	}

	private static Days mappingDaysToEnums(String day) {
		Days days= Days.MONDAY;
		String dayAgain= day.toLowerCase();
		switch (dayAgain)
		{  case "mon":
			days=Days.MONDAY;
			break;
		   case "tue":
			days=Days.TUESDAY;
			break;
		   case "sun":
			days=Days.SUNDAY;
			break;
		   case "sat":
			days=Days.SATURDAY;
			break;
			
			
		 default: days=null;
			 break;
		}
      return days;
	}

}

//enums remove the ambiguity of the input by user
enum Days{
	
	MONDAY, TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}