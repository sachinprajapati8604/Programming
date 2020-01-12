#include<stdio.h>
main()
{
	int str1,str2;
	printf("Enter Password");
	scanf("%d",&str1);
	printf("Confirm Password");
	scanf("%d",&str2);
	if(str1==str2)
	{
			printf("You are succesfully logged in");
	}
	else
	{
		printf("Password is mis match correct ");
	}
}
