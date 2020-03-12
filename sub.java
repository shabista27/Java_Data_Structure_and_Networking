//Author: Shabista Shaikh


import java.io.*;

class sub
{
public static void main(String[] args) throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Ip address");
String ipAddr=br.readLine();
String[] ipAddrParts=ipAddr.split("\\.");                                  // int firstoctet = Interger.parseInt(ipAddrParts[0]);
String mask="";

 int firstOctact = Integer.parseInt(ipAddrParts[0]);

if(firstOctact<=127)
{
mask="255.0.0.0";
System.out.println("IP Address is in Class A");
System.out.println("The Subnet Mask is: "+mask);
}

else if(firstOctact>=128 && firstOctact<=191)
{
mask="255.255.0.0";
System.out.println("IP Address is in Class B");
System.out.println("The Subnet Mask is: "+mask);
}

else if(firstOctact>=192 && firstOctact<=223)
{
mask="255.255.225.0";
System.out.println("IP Address is in Class C");
System.out.println("The Subnet Mask is: "+mask);
}

String[] maskParts=mask.split("\\.");
String firstAddr="";
String lastAddr="";

for(int i=0;i<4;i++)
{
int x=Integer.parseInt(ipAddrParts[i]);
int y=Integer.parseInt(maskParts[i]);
int z=x&y;
int w=z|(y^255);
firstAddr+=z+".";
lastAddr+=w+".";
}

System.out.println("The first Address is: "+firstAddr);
System.out.println("The Second Address is: "+lastAddr);
}

}


