import java.lang.*;
class CommandLine1
{
    int array[];
    void setData(String []args)
    {
        array=new int[args.length];
        for(int i=0;i<args.length;i++)
        {
            array[i]=Integer.parseInt(args[i]);
        }
    }
    void calData()
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
    int [] arrayReplica ()
    {
        return array.clone();
    }
    int sum(int array[])
    {
        int res=0;
        for(int i=0;i<array.length;i++)
        {
            res=res+array[i];
        }
        return res;
    }
    double average(int sumOfArray,int sizeOfArray)
    {
         double d=sumOfArray;
         return d/sizeOfArray;
    }
    int smallest(int array[])
    {
        int small=array[0];
        for(int i=1;i<array.length;i++)
        {
            if(array[i]<small)
            {
                small=array[i];
            }
        }
        return small;
    }
    int largest(int array[])
    {
        int large=array[0];
        for(int i=1;i<array.length;i++)
        {
            if(array[i]>large)
            {
                large=array[i];
            }
        }
        return large;
    }
}