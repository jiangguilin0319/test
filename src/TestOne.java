public class TestOne {

    public static void main(String[] args) {
        int rabbitNum = 1;
        for(int i = 1 ; i < 20 ; i++){
            rabbitNum = getMonthNum(i);
            System.out.println("兔子第   "+i+"  个月的总数为："+rabbitNum);
        }

    }

    public static int getMonthNum(int x){
        int initRabbit = 1;

        if(x == 1 || x == 2){
            return initRabbit;
        }

        initRabbit = getMonthNum(x-1) + getMonthNum(x-2);

        return initRabbit;
    }
} 