# eiffel-idea
IntelliJ IDEA plugin for [Eiffel](http://eiffel.org) language support

### Current status
Still under somewhat-active development (see last commit to see if it's still maintaned)

### What is done
* Kinda-full EBNF syntax (as of 2006 [ECMA-367](http://www.ecma-international.org/publications/files/ECMA-ST/ECMA-367.pdf) with some additions) with parser by [Grammar-Kit](http://github.com/JetBrains/Grammar-Kit)
* Lexer for keywords and symbols
* Syntax highlighting for keywords, literals, builtin types
* Building support through GEC

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
    
* Array literal expressions

Example:

    local
        a: ARRAY [INTEGER]
    do
        a := << 1, 2, 3, 4, 5 >>
    end
        

### What is currently being done or WIP (but may be for the time being)
* Project Wizard
* Formatting (kinda done, but still some minor issues)

### What is not done (needs to be done)
* Context-aware highlighting
* Completion
* Analysis
