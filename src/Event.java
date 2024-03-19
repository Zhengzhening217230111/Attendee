import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Event {
private String eventID;
private String eventName;
private String eventVenue;
private LocalDate eventDate;
ArrayList<Attendee> eventAttendees=new ArrayList<>();

public Event(String eventID,String eventName,String eventVenun,LocalDate eventDate){
this.eventID=eventID;
this.eventName=eventName;
this.eventVenue=eventVenun;
this.eventDate=eventDate;

this.eventAttendees = new ArrayList<>();
}

public Event() {
    //TODO Auto-generated constructor stub
}

public String getEventID() {
return eventID;
}

public void setEventID(String eventID) {
this.eventID = eventID;
}

public String getEventName() {
return eventName;
}

public void setEventName(String eventName) {
this.eventName = eventName;
}

public String getEventVenue() {
return eventVenue;
}

public void setEventVenue(String eventVenue) {
this.eventVenue = eventVenue;
}

public LocalDate getEventDate() {
return eventDate;
}

public void setEventDate(LocalDate eventDate) {
this.eventDate = eventDate;
}

public void organizeEvent(int choice) {
Scanner reader=new Scanner(System.in);

switch (choice) {
case 1:
System.out.println("Enter the the Event ID:");
String id=reader.nextLine();
setEventID(id);

System.out.println("Enter the name of the Event:");
String eventName=reader.nextLine();
setEventName(eventName);

System.out.println("Enter the Event date(YY-MM-DD):");
LocalDate date=LocalDate.parse(reader.nextLine());
setEventDate(date);

System.out.println("Enter the venue of the Event:");

}
}
}
