package com.services.databaseservice.state;

import com.services.databaseservice.entity.Order;

public class WorkflowContext implements IState {

	private IState state;
	private Order order;
	
	public WorkflowContext(Order order) {
		super();
		this.order = order;
	}

	public IState getState() {
		return state;
	}

	public void setState(IState state) {
		this.state = state;
	}

	@Override
	public void submit() {
		this.state.submit();
		
	}

	@Override
	public void moveToNext() {
		// TODO Auto-generated method stub
		
	}

}
