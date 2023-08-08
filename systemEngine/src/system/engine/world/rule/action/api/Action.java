package system.engine.world.rule.action.api;


import system.engine.world.definition.entity.api.EntityDefinition;
import system.engine.world.execution.instance.enitty.api.EntityInstance;
import system.engine.world.execution.instance.environment.api.EnvVariablesInstanceManager;
import system.engine.world.rule.context.Context;

public interface Action {
    void executeAction(Context context);
    ActionType getActionType();
    EntityDefinition getContextEntity();
}
