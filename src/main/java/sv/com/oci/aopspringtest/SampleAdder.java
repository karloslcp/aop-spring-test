package sv.com.oci.aopspringtest;

public class SampleAdder
{
    public int add(int a, int b) throws Exception
    {
        if (1 == 1)
            throw new Exception("No se pudieron sumar los numeros");
        return a + b;
    }
}
