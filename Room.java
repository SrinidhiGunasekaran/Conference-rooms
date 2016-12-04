import java.io.*;
class Room
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
int i,n;
float st,et;
System.out.println("No.of Rooms:");
n=Integer.parseInt(in.readLine());
float[] s=new float[n];
float[] e=new float[n];
for(i=0;i<n;i++)
{
System.out.println("Room "+(i+1)+ " starting time:");
s[i]=Float.valueOf(in.readLine()).floatValue();
System.out.println("Room "+(i+1)+ " ending time:");
e[i]=Float.valueOf(in.readLine()).floatValue();
}
System.out.println("Start time of your meeting:");
st=Float.valueOf(in.readLine()).floatValue();
System.out.println("End time of your meeting:");
et=Float.valueOf(in.readLine()).floatValue();
for(i=0;i<n;i++)
{
if((st<s[i])&&(et<e[i]))
{
System.out.println("Room "+(i+1)+" is available");
}
else if((st>s[i])&&(et>e[i]))
{
System.out.println("Room "+(i+1)+" is available");
}
}
}
catch(Exception e)
{
}
}
}
