
for(int i=0;i<=100;i++){
        for(int j=2;j<=i;j++){
        if(i%j==0)
        break;
        }
        if(i==j){
        System.out.println(i);
        }
        }