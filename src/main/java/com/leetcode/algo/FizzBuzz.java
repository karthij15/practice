/*
Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

Example:

n = 15,

Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]
*/

 FizzBuzz {
    public List<String> solution(int n) {
        
    List<String> toRet = new ArrayList<String>();

    for(int i = 1, fizz = 3, buzz = 5; i <= n; i++) {
    
       String result = "";
        
       if(i == fizz && i == buzz) {
        result = "FizzBuzz";
        fizz += 3;
        buzz += 5;
       }
       else if(i == fizz) {
        result = "Fizz";
        fizz += 3;
       }
       else if(i == buzz) {
           result = "Buzz";
           buzz += 5;
       }
        else
            //result += i; //this took 9ms hv to find out why?
            result = String.valueOf(i);
        
        toRet.add(result);
     }
        
     return toRet;
        
    }
}
