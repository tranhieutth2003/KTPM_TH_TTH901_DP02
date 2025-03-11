package com.journaldev.design.state;

public class TVContext implements State{

	private State tvstate;
	
	
	
	public State getTvstate() {
		return tvstate;
	}



	public void setTvstate(State tvstate) {
		this.tvstate = tvstate;
	}



	@Override
	public void doAction() {
		this.tvstate.doAction();
		
	}

}
