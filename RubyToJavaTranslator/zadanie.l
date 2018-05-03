%{
	#include "zadanie.tab.h"
	char* replace(char* s, char c1, char c2) {
		char* newString = strdup(s);
		int i;
		for(i = 0; newString[i] != '\0'; i++) {
			if(newString[i] == c1) {
				newString[i] = c2;
			}
		}
		return newString;
	}
	
	char* deleteFirstChar(char* s) {
		char* newString = strdup(s);
		int i;
		for(i = 1; s[i] != '\0'; i++) {
			newString[i-1] = s[i];
		}
		newString[i-1] = NULL;
		return newString;
	}
%}

%s INCOMMENT

%%

<INITIAL>class						return CLASS;
<INITIAL>@[A-Za-z_][A-Za-z0-9_]*	yylval.str=deleteFirstChar(yytext); return FIELD;
<INITIAL>def						return DEF;
<INITIAL>puts						return PUTS;
<INITIAL>for						return FOR;
<INITIAL>in							return IN;
<INITIAL>\.\.						return RANGE_DOTS;
<INITIAL>while						return WHILE;
<INITIAL>do							return DO;
<INITIAL>if							return IF;
<INITIAL>then						return THEN;
<INITIAL>else						return ELSE;
<INITIAL>elsif						return ELSIF;
<INITIAL>end						return END;
<INITIAL>int|long|short|float|double|string|bool	return VARIABLE_TYPE;
<INITIAL>-?[0-9]+					yylval.str=strdup(yytext); return INT_NUMBER;
<INITIAL>-?[0-9]+\.[0-9]+			yylval.str=strdup(yytext); return FLOAT_NUMBER;
<INITIAL>["'].+["']					yylval.str=replace(yytext, '\'', '\"'); return STRING;
<INITIAL>true|false					yylval.str=strdup(yytext); return BOOL;
<INITIAL>[A-Za-z_][A-Za-z0-9_]*		yylval.str=strdup(yytext); return IDENTIFIER_NAME;
<INITIAL>\=							return ASSIGNMENT_SIGN;
<INITIAL>==|\<|\>|\<=|\>=			yylval.str=strdup(yytext); return CONDITION;
<INITIAL>"=begin"					printf("/*"); BEGIN(INCOMMENT);
<INCOMMENT>(.|\n)					printf("%s", yytext);
<INCOMMENT>"=end"					printf("*/\n"); BEGIN(INITIAL);
<INITIAL>#.*						printf("//%s\n", deleteFirstChar(yytext));
<INITIAL>\(							return BRACKET_OPEN;
<INITIAL>\)							return BRACKET_CLOSE;
<INITIAL>,							return COMMA;
<INITIAL>[ \n]						;
<INITIAL>\t+						yylval.str=strdup(yytext); printf("%s", yytext);
