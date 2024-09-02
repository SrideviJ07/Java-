class Stack3

{
 int arr[],size,top=-1;
 Stack3(int size)
 {
   this.size=size;
   this.arr=new int[size];
 }
 Boolean IsFull()
 {
    return(top==size-1);

 }
 Boolean IsEmpty()
 {
    return(top==-1);

 }
 void push(int n)
 {
    if(IsFull())
    {
        System.out.println("Stack Overflow");
    }
     arr[++top]=n;
 }
 int pop(){
    if (IsEmpty()) {
        System.out.println("Stack underflow");
    }
    return arr[top--];
 }
 int peek()
 {
    return arr[top];
 }
 int getsize()
 {
    return size-1;
 }
 int search(int a)
 {
    int x=top;
    while(x>=0)
    {
        if(arr[x]==a)
        {
            return top-x+1;
        }
        x--;
    }
    return -1;
 }
 void display()
 {
    for(int i=0;i<=top;i++)
    {
        System.out.println("");
        System.out.println(+arr[i]+" ");
    }
    System.out.println(" ");
 }
}
    public class StackUser {
    public static void main(String[] args) {
        Stack3 s3=new Stack3(5);
        s3.push(5);
        s3.push(8);
        s3.push(1);
        s3.push(4);
        s3.push(3);
        s3.display();
        System.out.println("pop:"+s3.pop());
        System.out.println("pop:"+s3.pop());
        System.out.println("pop:"+s3.pop());
        s3.display();
        System.out.println("peek:"+s3.peek());
        System.out.println("size:"+s3.getsize());
        System.out.println("search "+s3.search(8));
       


        
    }
}
