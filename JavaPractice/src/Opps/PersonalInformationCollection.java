package Opps;

public class PersonalInformationCollection {
private String name;
private String surname;
private int identity;


public PersonalInformationCollection(String firstName, String lastName, int id)
{
	this.name = firstName;
	this.surname = lastName;
	this.identity = id;
}

public String toString()
{
	return this.name+" " + this.surname;
}
}
