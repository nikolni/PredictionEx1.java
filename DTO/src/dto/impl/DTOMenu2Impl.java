package dto.impl;

import dto.api.DTOMenu2;
import dto.definition.entity.api.EntityDefinitionDTO;
import dto.definition.rule.api.RuleDTO;
import dto.definition.termination.condition.manager.api.TerminationConditionsDTOManager;

import java.util.List;

public class DTOMenu2Impl implements DTOMenu2 {

        private final List<EntityDefinitionDTO> entitiesDTO;
        private final List<RuleDTO> rulesDTO;
        private final TerminationConditionsDTOManager terminationConditionsDTOManager;


        public DTOMenu2Impl(List<EntityDefinitionDTO> entitiesDTO, List<RuleDTO> rulesDTO,
                            TerminationConditionsDTOManager terminationConditionsDTOManager){
                this.entitiesDTO =entitiesDTO;
                this.rulesDTO =rulesDTO;
                this.terminationConditionsDTOManager = terminationConditionsDTOManager;
        }


        @Override
        public List<EntityDefinitionDTO> getEntitiesDTO() {
                return entitiesDTO;
        }

        @Override
        public List<RuleDTO> getRulesDTO() {
                return rulesDTO;
        }

        @Override
        public TerminationConditionsDTOManager getTerminationConditionsDTOManager() {
                return terminationConditionsDTOManager;
        }

}
