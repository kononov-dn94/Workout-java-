class MyFile
{
    private String filename = null;
    public void initialize(String name)
    {
        this.filename = name;
    }

    public void initialize(String folder, String name)
    {
        this.filename = folder + name;
    }
}

