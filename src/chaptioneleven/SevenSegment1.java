package chaptioneleven;

public class SevenSegment1 {
        String[][] seven = new String[5][4];
        public  void setA(){
            for (int i = 0; i <= 0; i++){
                for(int j = 0; j <= 3; j++){
                    seven[i][j] = "* ";
                }
            }
        }
        public void setB(){
            for(int i = 0; i <= 2; i++){
                for(int j = 3; j <= 3; j++){
                    seven[i][j] = "* ";
                }
            }
        }
        public void setC(){
            for(int i = 2; i <=4; i++ ){
                for(int j = 3; j <= 3; j++){
                    seven[i][j] = "* ";
                }
            }
        }
        public void setD(){
            for(int i = 4; i <=4;i++){
                for(int j = 0; j <=3;j++){
                    seven[i][j] = "* ";
                }
            }
        }
        public void setE(){
            for(int i = 2; i <= 4; i++){
                for(int j = 0; j <=0;j++){
                    seven[i][j] = "* ";
                }
            }
        }
        public void setF(){
            for(int i = 0; i <= 2; i++){
                for(int j = 0; j <= 0; j++){
                    seven[i][j] = "* ";
                }
            }
        }
        public void setG(){
            for (int i = 2; i <= 2; i++){
                for(int j = 0; j <= 3; j++){
                    seven[i][j] = "* ";
                }
            }
        }
        public void setScreen(){
            for(int i = 0; i <= 4;i++){
                for(int j = 0; j <= 3; j++){
                    seven[i][j] = "  ";
                }
            }
        }
        public void settingShow (String insert){
            setScreen();
            if(insert.charAt(7) == '1'){
                if(insert.charAt(0) == '1'){setA();}
                if(insert.charAt(1) == '1'){setB();}
                if(insert.charAt(2) == '1'){setC();}
                if(insert.charAt(3) == '1'){setD();}
                if(insert.charAt(4) == '1'){setE();}
                if(insert.charAt(5) == '1'){setF();}
                if(insert.charAt(6) == '1'){setG();}
            }
        }
        public void show (){
            for(int i = 0; i <= 4; i++){
                for(int j = 0; j <= 3; j++){
                    System.out.print(seven[i][j] + " ");
                }
                System.out.println();
            }
        }
}
