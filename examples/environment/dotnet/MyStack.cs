using Pulumi;
using Pulumi.ConfluentCloud;
using Pulumi.Random;

class MyStack : Stack
{
    public MyStack()
    {
        var petName = new RandomPet("dotnet-environment");

        var environment = new Pulumi.ConfluentCloud.Environment("dotnet-environment", new Pulumi.ConfluentCloud.EnvironmentArgs
        {
            DisplayName = petName.Id,
        });
    }
}
