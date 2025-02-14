// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tritonserver.tritonserver;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;
import org.bytedeco.tensorrt.nvinfer.*;
import static org.bytedeco.tensorrt.global.nvinfer.*;
import org.bytedeco.tensorrt.nvinfer_plugin.*;
import static org.bytedeco.tensorrt.global.nvinfer_plugin.*;
import org.bytedeco.tensorrt.nvonnxparser.*;
import static org.bytedeco.tensorrt.global.nvonnxparser.*;
import org.bytedeco.tensorrt.nvparsers.*;
import static org.bytedeco.tensorrt.global.nvparsers.*;

import static org.bytedeco.tritonserver.global.tritonserver.*;


/** Type for trace activity callback function. This callback function
 *  is used to report activity occurring for a trace. This function
 *  does not take ownership of 'trace' and so any information needed
 *  from that object must be copied before returning. The 'userp' data
 *  is the same as what is supplied in the call to
 *  TRITONSERVER_InferenceTraceNew. */
@Properties(inherit = org.bytedeco.tritonserver.presets.tritonserver.class)
public class TRITONSERVER_InferenceTraceActivityFn_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    TRITONSERVER_InferenceTraceActivityFn_t(Pointer p) { super(p); }
    protected TRITONSERVER_InferenceTraceActivityFn_t() { allocate(); }
    private native void allocate();
    public native void call(
    TRITONSERVER_InferenceTrace trace,
    @Cast("TRITONSERVER_InferenceTraceActivity") int activity, @Cast("uint64_t") long timestamp_ns,
    Pointer userp);
}
