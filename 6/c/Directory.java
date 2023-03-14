public class Directory extends Entity{
    /*private File[] fileList = new File[100];
    private Directory[] directoryList = new Directory[100];
    private int numberOfFile = 0;
    private int numberOfDirectory = 0;*/

    public Directory(String name){
        super(name);
    }
    //public String getName(){ return name; }
    //public void rename(String name){this.name = name;}

    @Override
    public String getName(){
       return  super.getName();
    }

    @Override
    public void rename(String name){
        super.rename(name);
    }

    @Override
    public int getSize(){
        return super.getSize();
    }

    @Override
    public void add(File file){
        super.add(file);
    }

    @Override
    public void add(Directory directory){
        super.add(directory);
    }

    @Override
    public void display(){
        super.display();
    }
}