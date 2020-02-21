#!/usr/bin/env groovy
package org.qclab

class GlobalVars {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import org.qclab.GlobalVars
   // println GlobalVars.foo
}
