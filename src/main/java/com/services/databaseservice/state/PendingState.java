package com.services.databaseservice.state;

public class PendingState implements IState {

	WorkflowContext context;
	
	public PendingState(WorkflowContext context) {
		super();
		this.context = context;
	}

	@Override
	public void submit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveToNext() {
		// TODO Auto-generated method stub
		
	}

}
