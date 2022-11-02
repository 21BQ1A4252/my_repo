import java.util.Scanner;
class Merge{
    void mergepass(int a[],int lb,int ub){
        int mid;
        if(lb!=ub){
            mid=(lb+ub)/2;
            mergepass(a,lb,mid);
            mergepass(a,mid+1,ub);
            mergesort(a,lb,mid,ub);
        }
    }
    void mergesort(int a[],int lb,int mid,int ub){
        int i=lb,j=mid+1,k=lb;
        int[] temp=new int[100];
        while((i<=mid)&&(j<=ub)){
            if(a[i]<a[j])
                temp[k++]=a[i++];
            else
                temp[k++]=a[j++];
        }
        while(i<=mid)
            temp[k++]=a[i++];
        while(j<=ub)
            temp[k++]=a[j++];
        for(i=lb;i<=ub;i++)
            a[i]=temp[i];
    }
}
public class Lab6{
	public static void main(String[] args) {
		int i,n;
		int[] a=new int[100];
		Merge m=new Merge();
		System.out.println("enter total number of elements:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("enter the elements:");
		for(i=0;i<n;i++)
		    a[i]=sc.nextInt();
	    System.out.println("before sorting:");
	    for(i=0;i<n;i++)
	        System.out.println(a[i]);
	    m.mergepass(a,0,n-1);
	    System.out.println("after sorting:");
	    for(i=0;i<n;i++)
	        System.out.println(a[i]);
	}
}
