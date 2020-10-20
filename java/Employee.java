package com.shravani;
public  class Employee{
    private int id;
    private String name;
    private String place;
    

    public Employee(){
        super();
    }
    public Employee(int id,String name,String place){
        this.id=id;
        this.name=name;
        this.place=place;

     }
   public int getId(){

    return id;
   }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPlace(){
        return place;
    }
    public void setPlace(String place){
        this.place=place;
    }
    public String toString() {
        return "Employee[id="+id+",name="+name+",city="+place];
        
    }
} 