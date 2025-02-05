// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.libdc1394;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libdc1394.global.dc1394.*;


/**
 * Camera structure
 *
 * This structure represents the camera in libdc1394. It contains a number of useful static information, such as model/vendor names,
 * a few capabilities, some ROM offsets, a unique identifier, etc... 
 */
@Properties(inherit = org.bytedeco.libdc1394.presets.dc1394.class)
public class dc1394camera_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dc1394camera_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dc1394camera_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dc1394camera_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public dc1394camera_t position(long position) {
        return (dc1394camera_t)super.position(position);
    }
    @Override public dc1394camera_t getPointer(long i) {
        return new dc1394camera_t((Pointer)this).offsetAddress(i);
    }

    /* system/firmware information */
    public native @Cast("uint64_t") long guid(); public native dc1394camera_t guid(long setter);
    public native int unit(); public native dc1394camera_t unit(int setter);
    public native @Cast("uint32_t") int unit_spec_ID(); public native dc1394camera_t unit_spec_ID(int setter);
    public native @Cast("uint32_t") int unit_sw_version(); public native dc1394camera_t unit_sw_version(int setter);
    public native @Cast("uint32_t") int unit_sub_sw_version(); public native dc1394camera_t unit_sub_sw_version(int setter);
    public native @Cast("uint32_t") int command_registers_base(); public native dc1394camera_t command_registers_base(int setter);
    public native @Cast("uint32_t") int unit_directory(); public native dc1394camera_t unit_directory(int setter);
    public native @Cast("uint32_t") int unit_dependent_directory(); public native dc1394camera_t unit_dependent_directory(int setter);
    public native @Cast("uint64_t") long advanced_features_csr(); public native dc1394camera_t advanced_features_csr(long setter);
    public native @Cast("uint64_t") long PIO_control_csr(); public native dc1394camera_t PIO_control_csr(long setter);
    public native @Cast("uint64_t") long SIO_control_csr(); public native dc1394camera_t SIO_control_csr(long setter);
    public native @Cast("uint64_t") long strobe_control_csr(); public native dc1394camera_t strobe_control_csr(long setter);
    public native @Cast("uint64_t") long format7_csr(int i); public native dc1394camera_t format7_csr(int i, long setter);
    @MemberGetter public native @Cast("uint64_t*") LongPointer format7_csr();
    public native @Cast("dc1394iidc_version_t") int iidc_version(); public native dc1394camera_t iidc_version(int setter);
    public native @Cast("char*") BytePointer vendor(); public native dc1394camera_t vendor(BytePointer setter);
    public native @Cast("char*") BytePointer model(); public native dc1394camera_t model(BytePointer setter);
    public native @Cast("uint32_t") int vendor_id(); public native dc1394camera_t vendor_id(int setter);
    public native @Cast("uint32_t") int model_id(); public native dc1394camera_t model_id(int setter);
    public native @Cast("dc1394bool_t") int bmode_capable(); public native dc1394camera_t bmode_capable(int setter);
    public native @Cast("dc1394bool_t") int one_shot_capable(); public native dc1394camera_t one_shot_capable(int setter);
    public native @Cast("dc1394bool_t") int multi_shot_capable(); public native dc1394camera_t multi_shot_capable(int setter);
    public native @Cast("dc1394bool_t") int can_switch_on_off(); public native dc1394camera_t can_switch_on_off(int setter);
    public native @Cast("dc1394bool_t") int has_vmode_error_status(); public native dc1394camera_t has_vmode_error_status(int setter);
    public native @Cast("dc1394bool_t") int has_feature_error_status(); public native dc1394camera_t has_feature_error_status(int setter);
    public native int max_mem_channel(); public native dc1394camera_t max_mem_channel(int setter);

    /* not used, for future use: */
    public native @Cast("uint32_t") int flags(); public native dc1394camera_t flags(int setter);

}
