// Varun Batra 110256128
public class PrimeNumbers {

	public static void main(String[] args) {
		for( int i =2, count =1; i<1001;  i++, count++){
			isPrime(i);
		 if ((isPrime(i)==true)&& (count%10!=0)){
				System.out.print(i + " ");
		}
		 else if( (count%10==0)&&(isPrime(i)==true)){
				System.out.println(i);
		}	
		}
		}
	public static boolean isPrime(int num){
		boolean result=true;
		for (int i=2; i<num; i++){
			if(!(num/i==1)&&( num%i==0)){
			result= false;}
			}
		return result;
			
	}
	
	
		
	}


