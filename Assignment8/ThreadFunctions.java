package Assignment8;

public class ThreadFunctions {
	
	private  int counter = 100;
    private boolean command =  false;

    public int changeNumber(boolean command){
        this.command = command;
        
            if(command){
               // counter=(counter*(counter+10)/100);;
            	counter++;
            }else{
            	counter--;
                //counter=(counter*(counter-7)/100);
            }
        
		return counter;
    }

    public int getCounter(){
        return this.counter;
    }
}
