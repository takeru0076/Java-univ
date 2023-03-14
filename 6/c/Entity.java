abstract class Entity {
    String name;
    int numberOfFile = 0;
    int numberOfDirectory = 0;
    File[] fileList = new File[100];
    Directory[] directoryList = new Directory[100];


    Entity(String a){
        this.name = a;
    }
    
    public String getName(){ return name; }

    public void rename(String str){ this.name = str;} 

    public int getSize(){
        int total = 0;
        for ( int i = 0; i < numberOfFile; i++ ){
            total += fileList[i].getSize();
        }
        for ( int i = 0; i < numberOfDirectory; i++ ){
            total += directoryList[i].getSize();
        }
        return total;
    };

    public void add(File file){
        fileList[numberOfFile++] = file;
    }

    public void add(Directory directory){
        directoryList[numberOfDirectory++] = directory;
    }

    public void display(){
        for ( int i = 0; i < numberOfFile; i++ ){
            System.out.print(fileList[i].getName() + " ");
        }
        for ( int i = 0; i < numberOfDirectory; i++ ){
            System.out.print(directoryList[i].getName() + " ");
        }
        System.out.println();
        System.out.println(this.getSize() + " bytes");
    }

}