
public class Latihan3 {
        public static void main(String[] args) {
            String[]sd={"12345","67845"};

            int count=0;

            String message="";
            for(int i =0;i < sd[0].length();i++) {
                if(sd[0].charAt(i) != sd[1].charAt(i)){
                    count++;
                    message +=  +i+ ", ";
                }

            }
            if(count>0){
                message="Total karakter tidak sama adalah " +count+ " yaitu "+message.substring(0,message.length())+" ";
            }else{
                message="semua karakter sama";
            }
            System.out.println(message);
        }
    }
