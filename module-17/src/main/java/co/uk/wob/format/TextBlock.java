package co.uk.wob.format;

@SuppressWarnings("java:S2479")
// https://community.sonarsource.com/t/false-positive-for-rule-java-s2479-whitespace-and-control-characters-in-literals-should-be-explicit/44004
public class TextBlock {
	
	public static void main(String[] args) {
		
		String json = """
				    {
				    "glossary": {
				        "title": "example glossary",
						"GlossDiv": {
				            "title": "S",
							"GlossList": {
				                "GlossEntry": {
				                    "ID": "SGML",
									"SortAs": "SGML",
									"GlossTerm": "Standard Generalized Markup Language",
									"Acronym": "SGML",
									"Abbrev": "ISO 8879:1986",
									"GlossDef": {
				                        "para": "A meta-markup language, used to create markup languages such as DocBook.",
										"GlossSeeAlso": ["GML", "XML"]
				                    },
									"GlossSee": "markup"
				                }
				            }
				        }
				    }
				}
				""";
		System.out.println(json);
		
	}
}
