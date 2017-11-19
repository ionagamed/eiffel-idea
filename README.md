# eiffel-idea
IntelliJ IDEA plugin for [Eiffel](http://eiffel.org) language support

### Current status
Still under somewhat-active development (see last commit to see if it's still maintaned)

### How to install
* Download latest plugin release from [releases page](https://github.com/ionagamed/eiffel-idea/releases)
* Download [Eiffel GOBO](https://github.com/gobo-eiffel/gobo#platforms) (we currently support only this one)
    * (Windows) Download [Microsoft Visual Studio C++](https://www.visualstudio.com/vs/cplusplus/)
    * (\*nix) Download any C compiler that you like (chances are, you need to write `apt install g++` or `brew install g++` if you don't know what that means)
* Build GOBO using your C compiler (refer to [GOBO website](https://github.com/gobo-eiffel/gobo#platforms) for further instructions)
* Install plugin using IDEA standard menu (IDEA -> Preferences -> Plugins -> Install from disk -> Select zip file)
* Create new Eiffel project in IDEA (you won't miss its menu option)
* Press Plus (Add new SDK) and select Eiffel GOBO SDK
    * (Windows) Customize the full path to Microsoft VS home
* When creating procedure is done, go Run -> Edit configurations... and add **Eiffel GOBO** configuration using plus button
* Enjoy! (Windows building may still be sometimes incorrect as a result of lack of Windows testers)


### What is done
* Kinda-full EBNF syntax (as of 2006 [ECMA-367](http://www.ecma-international.org/publications/files/ECMA-ST/ECMA-367.pdf) with some additions) with parser by [Grammar-Kit](http://github.com/JetBrains/Grammar-Kit)
* Lexer for keywords and symbols
* Syntax highlighting for keywords, literals, builtin types
* Building support through GEC
* Feature name completion with client visibility support (still under testing, but seems to work fine)
* Project-wide and library-wide class name completion

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
* Analysis
