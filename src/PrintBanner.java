public class PrintBanner extends Banner implements Print {
    public PrintBanner(String str){
        super(str);
    }
        @Override
        public void printWeek(){
            showWithParen();
        }

        @Override
        public void printStrong(){
            showWithAster();
        }
    
    
}
