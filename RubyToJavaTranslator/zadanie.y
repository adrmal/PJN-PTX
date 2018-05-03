%{
	#include <stdio.h>
	int yylex();
	int yyerror(char* c);
	
	char* clipboard;
%}

%union {
	char *str;
}

%token CLASS
%token FIELD
%token DEF
%token PUTS
%token FOR
%token IN
%token RANGE_NUMBER
%token RANGE_DOTS
%token WHILE
%token DO
%token IF
%token THEN
%token ELSE
%token ELSIF
%token END
%token VARIABLE_TYPE
%token INT_NUMBER
%token FLOAT_NUMBER
%token STRING
%token CHAR
%token BOOL
%token IDENTIFIER_NAME
%token ASSIGNMENT_SIGN
%token CONDITION
%token BRACKET_OPEN
%token BRACKET_CLOSE
%token COMMA

%type <str> IDENTIFIER_NAME
%type <str> INT_NUMBER
%type <str> FLOAT_NUMBER
%type <str> STRING
%type <str> BOOL
%type <str> RANGE_DOTS
%type <str> FOR

%%

instructions : 
			 | instruction instructions;

instruction : variable_declaration { printf(";\n"); } 
			| for
			| while
			| if
			| class
			| function
			| puts;

variable_declaration : IDENTIFIER_NAME ASSIGNMENT_SIGN variable_value { printf("%s = %s", $1, yylval); };

variable_value : INT_NUMBER { printf("int "); } 
			   | FLOAT_NUMBER { printf("float "); } 
			   | STRING { printf("String "); } 
			   | BOOL { printf("boolean "); };

range : INT_NUMBER RANGE_DOTS INT_NUMBER { printf("%s; %s<%s; %s++) {\n", $1, clipboard, $3, clipboard); };

for : FOR { printf("for"); } IDENTIFIER_NAME { printf("(int %s=", $3); clipboard=$3; } IN range instructions end;

while : WHILE { printf("while"); } condition do instructions end;

if : IF { printf("if"); } condition then instructions end_or_else_or_elsif;

condition : variable_or_value { printf("(%s", yylval); } CONDITION { printf(" %s ", yylval); } variable_or_value { printf("%s) ", yylval); };

variable_or_value : IDENTIFIER_NAME
				  | INT_NUMBER
				  | FLOAT_NUMBER
				  | STRING
				  | BOOL;

do : DO { printf("{\n"); };

else : ELSE { printf("else {\n"); } instructions end;

elsif : ELSIF { printf("else if"); } condition then instructions end_or_else_or_elsif;

then : THEN { printf("{\n"); };

end_or_else_or_elsif : end 
					 | { printf("}\n%s", yylval); } elsif 
					 | { printf("}\n%s", yylval); } else;

end : END { printf("}\n"); };

class : CLASS IDENTIFIER_NAME { printf("public class %s {\n", yylval); } class_body end;

class_body : 
		   | FIELD { printf("private Object %s;\n", yylval); } class_body 
		   | function class_body;

puts : PUTS variable_or_value { printf("System.out.println(%s);\n", yylval); };

function : DEF IDENTIFIER_NAME { printf("public %s", yylval); } BRACKET_OPEN { printf("("); } parameters BRACKET_CLOSE { printf(") {\n"); } instructions end;

parameters : 
		   | parameter parameters 
		   | COMMA { printf(", "); } parameter parameters;

parameter : IDENTIFIER_NAME { printf("Object %s", yylval); };

%%

#include <stdio.h>

int yyerror(char* c) {
	printf("%s\n", c);
	return 1;
}

int main() {
	yyparse();
}

int yywrap() {
	return 1;
} 
