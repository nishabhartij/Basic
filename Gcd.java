class Gcd{
public static void main(String []args){
int n=216;
int m=594;
int num=n>m?n:m;
while(n!=m){
if(n>m){
n=n-m;
}
else{
m=m-n;
}
System.out.println("Gcd="+n);
}

}
}