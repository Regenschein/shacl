package org.topbraid.shacl.rules;

import org.apache.jena.rdf.model.Resource;

public class JSRuleLanguage implements RuleLanguage {

	@Override
	public Rule createRule(Resource resource, RuleEngine ruleEngine) {
		return new JSRule(resource);
	}
}