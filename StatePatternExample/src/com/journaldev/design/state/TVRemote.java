package com.journaldev.design.state;

public class TVRemote {
	public static void main(String[] args) {
		TVContext context = new TVContext();
		State tvStartState = new TVStartState();
		State tvStopState = new TVStopState();
		
		context.setTvstate(tvStartState);
		context.doAction();
		
		context.setTvstate(tvStopState);
		context.doAction();
	}
}
