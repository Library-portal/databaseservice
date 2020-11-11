package com.services.databaseservice.state;

import com.services.databaseservice.enums.OrderStatus;

public interface IStateFactory {
	public IState getState(OrderStatus status, WorkflowContext context);
}
