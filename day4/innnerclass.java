    package day4;

    class innnerclass {
        public static void main(String[] args){
            motherboard.USB uu = new motherboard.USB();
            uu.setNum(2, 3);
            System.out.println("Total number of USB ports is : "+uu.getTotal());

        }
    }

    class motherboard{
        static class USB {
            int USB1;
            int USB2;
            public void setNum(int USB1,int USB2){
            this.USB1 = USB1;
            this.USB2 = USB2;
        }
        public int getTotal(){
            return USB1 + USB2;
        }
        }
        
    }
