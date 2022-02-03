package Exception;
import java.io.*;
class  throwExample{
        void myMethod(int num)throws Exception{
            if(num==1)
                throw new IOException("IOException Occurred");
            else
                throw new ClassNotFoundException("ClassNotFoundException");
        }
    }

    public class ExceptionSample2{
        public static void main(String args[]){
            try{
                throwExample obj=new throwExample();
                obj.myMethod(1);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

