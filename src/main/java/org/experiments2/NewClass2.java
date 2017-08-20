package org.experiments2;

public class NewClass2
{
    public static void main(String[] args)
    {
        String values[] = {"Adam", "Bob", "Mary"};

        for (String value : values)
        {
            System.out.println(value);
        }
        values[1] = null;

        for (String value : values)
        {
            if (value != null)
            System.out.println(value.toUpperCase());
        }
    }
}
