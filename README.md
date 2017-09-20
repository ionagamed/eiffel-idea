# eiffel-idea
IntelliJ IDEA plugin for [Eiffel](eiffel.org) language support

### Current status
Still under somewhat-active development (see last commit to see if it's still maintaned)

### What is done
* Kinda-full EBNF syntax (as of 2006 [ECMA-367](http://www.ecma-international.org/publications/files/ECMA-ST/ECMA-367.pdf) with some additions) with parser by [Grammar-Kit](github.com/JetBrains/Grammar-Kit)
* Lexer for keywords and symbols
* Syntax highlighting for keywords, literals, builtin types

##### Extensions of ECMA-367
* Integer ranges using `|..|` binary operation.
* Across-type boolean iteration in assertion clauses.

Both of the above can be shown on this example

    ...
    ensure
        across 
            1 |..| n
        as
            it
        all
            it.item <= n
        end
    end

### What is not done (needs to be done)
* Formatting
* Project wizard
* Building support (still not sure if we can do it in IDEA)
* Context-aware highlighting
* Completion
* Analysis

### Contribution guidelines
* Commit message must be of format '\<subsystem\>: \<action\>', e.g. 'bnf: add support for |..| operation'
  Subsystems are:
    * bnf
    * lexer
    * wizard
    * config
    * run (for run configuration)
    * formatting