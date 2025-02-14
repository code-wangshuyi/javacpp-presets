// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Transforms a Tensor into a serialized TensorProto proto.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * tensor: A Tensor of type {@code T}.
 * 
 *  Returns:
 *  * {@code Output}: A serialized TensorProto proto of the input tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SerializeTensor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SerializeTensor(Pointer p) { super(p); }

  public SerializeTensor(@Const @ByRef Scope scope, @ByVal Input tensor) { super((Pointer)null); allocate(scope, tensor); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input tensor);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native SerializeTensor operation(Operation setter);
  public native @ByRef Output serialized(); public native SerializeTensor serialized(Output setter);
}
