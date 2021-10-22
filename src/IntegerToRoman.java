class Solution {
    public static void main(String[] args){
        System.out.println(intToRoman(1994));
    }
    public static String intToRoman(int num) {
        String finalResult = "";
        int numOfM = num/1000;
        for(int msToAdd =0;msToAdd<numOfM;msToAdd++){
            finalResult+="M";
        }
        num-=numOfM*1000;
        if(num/100 == 9){
            finalResult+="CM";
            num-=900;
        }
        if(num/100 == 4){
            finalResult+="CD";
            num-=400;
        }
        if(num>=500){
            finalResult+="D";
            num-=500;
        }
        int numOfHundreds = num/100;
        for(int x=0;x<numOfHundreds;x++){
            finalResult+="C";
            num-=100;
        }


        if(num/10 == 9){
            finalResult+="XC";
            num-=90;
        }
        if(num/10 == 4){
            finalResult+="XL";
            num-=40;
        }
        if(num>=50){
            finalResult+="L";
            num-=50;
        }
        int numOfTens = num/10;
        for(int x=0;x<numOfTens;x++){
            finalResult+="X";
            num-=10;
        }


        if(num == 9){
            finalResult+="IX";
            num-=9;
        }
        if(num == 4){
            finalResult+="IV";
            num-=4;
        }
        if(num>=5){
            finalResult+="V";
            num-=5;
        }
        while(num>0){
            finalResult+="I";
            num-=1;
        }
        return finalResult;
    }
}