public class HoldData <T>{

    private int arraySize = 0;
    private T array [];
    private T tempArray [];
    private int capacity;
    public HoldData(){
        this.capacity = 10;
        this.array=(T[]) new Object[this.capacity];
        this.tempArray =(T[]) new Object[this.capacity];
    }

    public HoldData(int capacity){
        this.capacity = capacity;
        this.array=(T[]) new Object[this.capacity];
        this.tempArray =(T[]) new Object[this.capacity];
    }

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int size(){
        int count=0;
        for (T gez : array){
           if(gez != null){
               count++;
           }
        }
        return count;
    }

    public void add(T data){
        arraySize++;
        checkCapacity();
        array[arraySize-1] = data;
    }

    public void checkCapacity(){
        if(arraySize>=capacity){
            this.capacity = capacity+10;
        }
    }

    public T get(int index){
        if(index > arraySize){
            System.out.print("Geçersiz bir değer :");
            return null;
        }
        return array[index];
    }

    public void remove(int index){
        if(index > arraySize){
            System.out.print("Geçersiz bir değer :");

        }
        else{
            array[index]=null;
        }
        for(int i=index;i<arraySize;i++){
            array[i]=array[i+1];
        }
        array[arraySize]=null;
        this.arraySize =arraySize-1;
    }

    public void set(int index,T data){
        if(index>arraySize){
            System.out.print("Geçersiz bir değer :");
        }
        else{
            array[index]=data;
        }
    }

    public void print (){
        for(int i=0;i<arraySize;i++){
            System.out.println(array[i]);
        }
    }

    public int indexOf(T data){
        for(int i=0;i<=arraySize;i++){
            if(array[i] == data){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data){
        int temp =-1;
        for(int i=0;i<=arraySize;i++){
            if(array[i] == data){
                temp =i;
            }
        }
        return temp;
    }
    public boolean isEmpty(){
        for(T i : array){
            if(i != null){
                return false;
            }
        }
        return true;
    }

    public T[] toArray(){
        for(int i=0;i<=arraySize;i++){
            tempArray[i]=array[i];
        }
        return tempArray;
    }

    public void clear(){
        for(int i=0;i<=arraySize;i++){
            array[i]=null;
        }
    }
    public boolean contains(T data){
        for(int i=0;i<=arraySize;i++){
            if(array[i]==data){
                return true;
            }
        }
        return false;
    }

    public HoldData<T> sublist(int firstIndex,int secondIndex){
        HoldData<T> list = new HoldData<>();
        for(int i=firstIndex;i<=secondIndex;i++){
            list.add((T) this.get(i));
        }
        return list;
    }

}
