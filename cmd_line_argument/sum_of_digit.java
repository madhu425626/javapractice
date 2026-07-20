void main(String []args){
	String arr = args[0];
	int num = Integer.parseInt(arr);
	
	int sum = 0;
	
	while(num!=0){
		int digit = num%10;
		sum = sum + digit;
		num = num/10;
	}
	
	IO.println(sum);
	

	
	

}
