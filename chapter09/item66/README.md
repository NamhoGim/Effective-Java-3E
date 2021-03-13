# Item 66: Use native methods judiciously

The Java Native Interface(JNI) allows Java programs to calls _native methods_, which are methods written in _native 
programming languages_ such as C or C++.

It is rarely advisable to use native methods for improved performance.

Think twice before using native methods. It is rare that you need to use them for improved performance. If you must 
use native methods to access low-level resources or native libraries, use little native code as possible and test it 
thoroughly. A single bug in the native code can corrupt your entire application.
