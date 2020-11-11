package com.services.databaseservice.state;

import com.services.databaseservice.enums.OrderStatus;

public final class StateFactoryImpl implements IStateFactory {
	private static volatile IStateFactory factory = new StateFactoryImpl();
	private StateFactoryImpl(){
		
	}

	public static IStateFactory getInstance() {
		return factory;
	}

	@Override
	public IState getState(OrderStatus status, WorkflowContext context) {
		IState returnState = null;
		
		switch(status){
		case PENDING : returnState = new PendingState(context);
		case APPROVED : returnState = new ApprovedState(context);
		case OVERDUE : returnState = new OverdueState(context);
		case RETURNED : returnState = new ReturnedState(context);
		default: returnState = new InputState(context);
		}
		
		return returnState;
	}

}
