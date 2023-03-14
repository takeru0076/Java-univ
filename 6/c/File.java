public class File extends Entity{
    private int size;

    public File(String name, int size){
        super(name);
        this.size = size;
    }

    @Override
    public String getName(){
        return super.getName();
    }

    @Override
    public void rename(String name){super.rename(name);}

    @Override
    public int getSize(){
        return size;
    }
   }