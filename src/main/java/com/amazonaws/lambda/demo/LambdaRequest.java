package com.amazonaws.lambda.demo;

public class LambdaRequest {
	
	 String name;
	 
	    public String getName() {
	        return name;
	    }
	 
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    	 
	    @Override
	    public String toString() {
	        return "LambdaRequest [name=" + name + "]";
	    }

}
