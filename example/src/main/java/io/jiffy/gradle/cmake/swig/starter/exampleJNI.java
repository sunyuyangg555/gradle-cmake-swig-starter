/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.jiffy.gradle.cmake.swig.starter;

import org.scijava.nativelib.NativeLoader;

public class exampleJNI {

  static {
    try {
        NativeLoader.loadLibrary("example");
    } catch (Exception e) {
      throw new LinkageError("Look for your architecture binary instructions failed", e);
    }
  }

  public final static native void delete_Callback(long jarg1);
  public final static native void Callback_run(long jarg1, Callback jarg1_);
  public final static native void Callback_runSwigExplicitCallback(long jarg1, Callback jarg1_);
  public final static native long new_Callback();
  public final static native void Callback_director_connect(Callback obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void Callback_change_ownership(Callback obj, long cptr, boolean take_or_release);
  public final static native long new_Caller();
  public final static native void delete_Caller(long jarg1);
  public final static native void Caller_delCallback(long jarg1, Caller jarg1_);
  public final static native void Caller_setCallback(long jarg1, Caller jarg1_, long jarg2, Callback jarg2_);
  public final static native void Caller_call(long jarg1, Caller jarg1_);

  public static void SwigDirector_Callback_run(Callback jself) {
    jself.run();
  }

  private final static native void swig_module_init();
  static {
    swig_module_init();
  }
}
