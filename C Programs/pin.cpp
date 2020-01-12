#include<stdio.h>
main()
{
	int pin;
	char user;
	printf("enter username ");
	scanf("%s",&user);
	printf("enter your pin");
	scanf("%d",&pin);
	if(user="sachin" && pin==1234)
	{
		printf("You are successfuly logged in");
		
	}
	else
	{
		printf("login credientials is not correct");
	}
}

