class Timer{
    int second=0,mintute=0,hour=0;

    public void start(int  h,int m,int s) throws InterruptedException{
        System.out.println("Timer Start..");
        for(int i=0;i<=60;i++){
            second=i;
            if(second==60){
                mintute++;
                second=0;
                i=0;
            }
            if(mintute==60){
                hour++;
                mintute=0;
                second=0;
                i=0;
            }

            System.out.println("Timer :" + hour+ ":"+ mintute+":"+second);
            Thread.sleep(1000);
            if(hour==h&&mintute==m&&second==s){
                System.out.println("Timer Stop..!!!");
                break;
            }

        }
    }
    public static void main(String[] args) {
        Timer t=new Timer();
        try {
            t.start(0,1,5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}