
void main(String []args){
	int num = Integer.parseInt(args[0]);
	
	boolean res = isArmstrong(num);
	if(res)
	{
		IO.println(num+" Is Armstrong ");
	}else{
		IO.println(num+" Is not an Armstrong ");
	}
	
}

boolean isArmstrong (int num){
	int temp = num;
	int totalDigits = countOfDigits(num);
	double sum = 0;
	
	while(num != 0){
		int digit = num%10;
		sum = sum + Math.pow(digit,totalDigits);
		num = num/10;	
	}
	return sum==temp;
}

int countOfDigits (int num){
	int count = 0;
	while(num != 0){
	num = num/10;
	count ++;
	}
	return count;
	
}
