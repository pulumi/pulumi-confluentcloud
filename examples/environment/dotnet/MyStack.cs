using Pulumi;
using Pulumi.ConfluentCloud;

class MyStack : Stack
{
    public MyStack()
    {
        var environment = new Pulumi.ConfluentCloud.Environment("dotnet-environment");
    }
}
