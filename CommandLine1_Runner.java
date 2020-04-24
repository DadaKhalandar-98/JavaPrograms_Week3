class CommandLine1_Runner
{
    public static void main(String[] args) {
    CommandLine1 cd = new CommandLine1();
    cd.setData(args);
    cd.calData();
    int temp[]=cd.arrayReplica();
    System.out.println(cd.sum(temp));
    System.out.println(cd.average(cd.sum(temp), temp.length));
    System.out.println(cd.smallest(temp));
    System.out.println(cd.largest(temp));
    }
}