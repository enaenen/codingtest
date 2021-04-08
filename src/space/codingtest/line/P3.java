package space.codingtest.line;

import java.util.*;

public class P3 {
    public static void main(String[] args){
        String[] recipes = new String[] {"A 3","B 2"};
        String[] orders = new String[] {"A 1","A 2","B 3","B 4"};

        int solution = solution(2, recipes, orders);
        System.out.println("solution = " + solution);
    }
    public static int solution(int n, String[] recipes, String[] orders) {
        int cooking=0;
        int answer = 0;
        int time=0;


        ProcessCook processCook=null;
        ArrayList<ProcessCook> cooks = new ArrayList<>();
        Map<String,Integer> recipeMap = new HashMap<>();

        for(int i=0;i<recipes.length;i++){
            String[] recipe = recipes[i].split(" ");
            recipeMap.put(recipe[0],Integer.parseInt(recipe[1]));
        }

        Queue<String> orderQueue= new LinkedList<String>();
        for (String order : orders) {
            orderQueue.offer(order);
        }



        while(true){
            if(orderQueue.isEmpty()) break;

            if(processCook!=null&& processCook.getProcessTime()==0) {
                cooking--;
            }

            if(cooking<n) {
                if(processCook==null) {
                    String[] order = orderQueue.poll().split(" ");
                    processCook = new ProcessCook(order,recipeMap);
                }
                cooking++;
            }
            else{
                processCook.proccess();
            }
            time++;

        }

        return time;
    }

   static class ProcessCook{
        protected String menu;
        protected int amount;
        protected int processTime;

        public ProcessCook(String[] order,Map<String,Integer> recipeMap){
            menu=order[0];
            amount=Integer.parseInt(order[1]);
            processTime=recipeMap.get(menu)*amount;
        }

        public String getMenu() {
            return menu;
        }

        public int getAmount() {
            return amount;
        }

        public void setMenu(String menu) {
            this.menu = menu;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public int getProcessTime() {
            return processTime;
        }
        public int proccess(){
            this.processTime-=1;
            return processTime;
        }
    }
}
