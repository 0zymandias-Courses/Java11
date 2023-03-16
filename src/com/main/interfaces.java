package com.main;

interface Player{
    final String name = "Warlock";
    void display();
}
// A class that implements the interface.
class interfaces implements Player {
   
    // Implementing the capabilities of "Player" interface.
    public void display(){
      System.out.println(name);
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        interfaces t = new interfaces();
        t.display();
        //name = "Ozymandias"; not allowed cause the name was declared as final
        System.out.println(name);
    }
}