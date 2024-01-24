public class GoogleBillboard{
public void setup()  
{  
 public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";   
boolean check = false;
  //String digits = e.substring(2,12);
  double dNum = 0;
  //System.out.println(dNum);  //displays 7.182818284E9
  //.System.out.println(isPrime(dNum));
  for(int i = 2;check==false;i++){
    dNum = Double.parseDouble(e.substring(i,i+10));
    if(isPrime(dNum)){
      System.out.println(dNum);
      
      check = true;
    }
  }
}  



 public boolean isPrime(double num){
  if(num<2){
    return false;
  }else{
    for(int i =2;i<=Math.sqrt(num);i++){
      if(num%i==0){
        return false;
      }
    }
  }
  return true;
}
}

