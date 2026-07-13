
void main(){
	int number = Integer.parseInt(IO.readln("Enter a number : "));
	IO.println("The sum of a number is : "+palindromeOfNum(number));
	
}

/*int sumOfNum(int num){
	
	int sum;
	
	while(num!=0){
	int digit = num%10;
	
	sum = sum + digit;
	
	num = num/10;
	
	}
	return sum;
}*/

/*
int countOfNum(int num){
	int count = 0;
	while(num!=0){
	count++;
	num = num/10;
	
	}
	return count;
}
*/

/*
int productOfNum(int num){
	int product = 1;
	
	while(num!=0){
		int digit = num%10;
		num = num/10;
		product  = product*digit;
}return product;


}
*/

/*
int maxOfNum(int num){
	int max = 0;
	while(num!=0){
		int digit = num%10;
		if(max<digit){
			max=digit;
		  }
		  num = num/10;
	} 
	return max;
}
*/

/*
int smallOfNum(int num){
	int small = 9;
	while(num!=0){
	int digit = num%10;
	if(digit < small){
		small = digit;
	}
	num = num/10;
	}
	return small;
}
*/

/*
int factorialOfNum(int num){
	int factorial = 1;
	for(int i = 1; i<=num; i++){
		factorial = factorial*i;
	}
	return factorial;
}
*/

/*
int factorialOfNum(int num){
	int factorial = 1;
	int temp = num;
	int i = 1;
	while(i < num){
		
		factorial = num*(num-i);
			i++;
	}
	return factorial;
}
*/

/*
int reverseOfNum(int num){
	int reverse = 0;
	while(num != 0){
		int digit = num%10;
		reverse = (reverse*10)+digit;
		num = num/10;
	}
	return reverse;
}
*/

/*
boolean palindromeOfNum(int num){
	int temp = num;
	int palindrome = 0;
	while(num!=0){
		int digit = num%10;
		palindrome = palindrome*10+digit;
		num = num/10;
	}
	return palindrome==temp;
}
*/
