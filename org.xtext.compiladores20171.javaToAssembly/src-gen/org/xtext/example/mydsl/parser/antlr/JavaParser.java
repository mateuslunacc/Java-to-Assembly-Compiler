/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalJavaParser;
import org.xtext.example.mydsl.services.JavaGrammarAccess;

public class JavaParser extends AbstractAntlrParser {

	@Inject
	private JavaGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalJavaParser createParser(XtextTokenStream stream) {
		return new InternalJavaParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public JavaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(JavaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}