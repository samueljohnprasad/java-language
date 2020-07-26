package interfaceabstract;

 class Main {
     public static void main(String aa []){
         ITelephone samphone;
         samphone=new DeskPhone(1235);
         samphone.powerOn();
         samphone.callPhone(12345);
         samphone.answer();



     }
    }

    interface ITelephone{
        void powerOn();
        void dail(int phoneNumber);
        void answer();
        boolean callPhone(int phoneNumber);
        boolean isRinging();
    }

    class DeskPhone implements ITelephone{
        private int myNumber;
        private boolean isRinging;

        public DeskPhone(int myNumber){
            this.myNumber=myNumber;

        }

        @Override
        public void powerOn() {
            System.out.println("no action needed.desktop phone doesnt have power button");
           
        }

        @Override
        public void dail(int phoneNumber) {
            System.out.println("now ringing "+myNumber+" on deskphone");

          
        }

        @Override
        public void answer() {
            if(isRinging){
                System.out.println("answering the phone");
                isRinging=false;

            }
         
        }

        @Override
        public boolean callPhone(int phoneNumber) {
            if(phoneNumber==myNumber){
                isRinging=true;
                System.out.println("Ring ring");

            }else{
                isRinging=false;
            }
          
            return isRinging;
        }

        @Override
        public boolean isRinging() {
           
            return isRinging;
        }
        
    }