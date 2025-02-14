// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


/**
 * ImgDetections message. Carries normalized detection results
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class ImgDetections extends Buffer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ImgDetections(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ImgDetections(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ImgDetections position(long position) {
        return (ImgDetections)super.position(position);
    }
    @Override public ImgDetections getPointer(long i) {
        return new ImgDetections((Pointer)this).offsetAddress(i);
    }

    /** Construct ImgDetections message */
    public ImgDetections() { super((Pointer)null); allocate(); }
    private native void allocate();
    public ImgDetections(@SharedPtr RawImgDetections ptr) { super((Pointer)null); allocate(ptr); }
    private native void allocate(@SharedPtr RawImgDetections ptr);

    /** Detections */
    public native @StdVector ImgDetection detections(); public native ImgDetections detections(ImgDetection setter);
}
