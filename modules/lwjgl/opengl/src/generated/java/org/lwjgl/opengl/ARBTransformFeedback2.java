/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_transform_feedback2.txt">ARB_transform_feedback2</a> extension.
 * 
 * <p>The {@link EXTTransformFeedback EXT_transform_feedback} extension allows applications to capture primitives to one or more buffer objects when transformed by the GL. This
 * extension provides a few additional capabilities to these extensions, making transform feedback mode more useful.</p>
 * 
 * <p>First, it provides transform feedback objects which encapsulate transform feedback-related state, allowing applications to replace the entire transform
 * feedback configuration in a single bind call. Second, it provides the ability to pause and resume transform feedback operations. When transform feedback
 * is paused, applications may render without transform feedback or may use transform feedback with different state and a different transform feedback
 * object. When transform feedback is resumed, additional primitives are captured and appended to previously captured primitives for the object.</p>
 * 
 * <p>Additionally, this extension provides the ability to draw primitives captured in transform feedback mode without querying the captured primitive count.
 * The command {@link #glDrawTransformFeedback DrawTransformFeedback} is equivalent to {@code glDrawArrays(<mode>, 0, <count>)}, where {@code count} is the number of
 * vertices captured to buffer objects during the last transform feedback capture operation on the transform feedback object used. This draw operation
 * only provides a vertex count -- it does not automatically set up vertex array state or vertex buffer object bindings, which must be done separately by
 * the application.</p>
 * 
 * <p>Requires {@link GL20 GL20} or {@link ARBShaderObjects ARB_shader_objects} and {@link NVTransformFeedback NV_transform_feedback} or {@link EXTTransformFeedback EXT_transform_feedback}.
 * Promoted to core in {@link GL40 OpenGL 4.0}.</p>
 */
public class ARBTransformFeedback2 {

    /** Accepted by the {@code target} parameter of BindTransformFeedback. */
    public static final int GL_TRANSFORM_FEEDBACK = 0x8E22;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
    public static final int
        GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED = 0x8E23,
        GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 0x8E24,
        GL_TRANSFORM_FEEDBACK_BINDING       = 0x8E25;

    static { GL.initialize(); }

    protected ARBTransformFeedback2() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(GLCapabilities caps) {
        return checkFunctions(
            caps.glBindTransformFeedback, caps.glDeleteTransformFeedbacks, caps.glGenTransformFeedbacks, caps.glIsTransformFeedback, 
            caps.glPauseTransformFeedback, caps.glResumeTransformFeedback, caps.glDrawTransformFeedback
        );
    }

    // --- [ glBindTransformFeedback ] ---

    /**
     * Binds a transform feedback object.
     *
     * @param target the target to which to bind the transform feedback object {@code id}. Must be:<br><table><tr><td>{@link GL40#GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}</td></tr></table>
     * @param id     the name of a transform feedback object
     */
    public static native void glBindTransformFeedback(@NativeType("GLenum") int target, @NativeType("GLuint") int id);

    // --- [ glDeleteTransformFeedbacks ] ---

    /**
     * Unsafe version of: {@link #glDeleteTransformFeedbacks DeleteTransformFeedbacks}
     *
     * @param n the number of transform feedback objects to delete
     */
    public static native void nglDeleteTransformFeedbacks(int n, long ids);

    /**
     * Deletes transform feedback objects.
     *
     * @param ids an array of names of transform feedback objects to delete
     */
    public static void glDeleteTransformFeedbacks(@NativeType("GLuint const *") IntBuffer ids) {
        nglDeleteTransformFeedbacks(ids.remaining(), memAddress(ids));
    }

    /** Deletes transform feedback objects. */
    public static void glDeleteTransformFeedbacks(@NativeType("GLuint const *") int id) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.ints(id);
            nglDeleteTransformFeedbacks(1, memAddress(ids));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenTransformFeedbacks ] ---

    /**
     * Unsafe version of: {@link #glGenTransformFeedbacks GenTransformFeedbacks}
     *
     * @param n the number of transform feedback object names to reserve
     */
    public static native void nglGenTransformFeedbacks(int n, long ids);

    /**
     * Reserves transform feedback object names.
     *
     * @param ids an array of into which the reserved names will be written
     */
    public static void glGenTransformFeedbacks(@NativeType("GLuint *") IntBuffer ids) {
        nglGenTransformFeedbacks(ids.remaining(), memAddress(ids));
    }

    /** Reserves transform feedback object names. */
    @NativeType("void")
    public static int glGenTransformFeedbacks() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.callocInt(1);
            nglGenTransformFeedbacks(1, memAddress(ids));
            return ids.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsTransformFeedback ] ---

    /**
     * Determines if a name corresponds to a transform feedback object.
     *
     * @param id a value that may be the name of a transform feedback object
     */
    @NativeType("GLboolean")
    public static native boolean glIsTransformFeedback(@NativeType("GLuint") int id);

    // --- [ glPauseTransformFeedback ] ---

    /**
     * Pauses transform feedback operations for the currently bound transform feedback object.
     * 
     * <p>When transform feedback operations are paused, transform feedback is still considered active and changing most transform feedback state related to the
     * object results in an error. However, a new transform feedback object may be bound while transform feedback is paused. The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION}
     * is generated by PauseTransformFeedback if the currently bound transform feedback is not active or is paused.</p>
     * 
     * <p>When transform feedback is active and not paused, all geometric primitives generated must be compatible with the value of {@code primitiveMode} passed
     * to {@link GL30#glBeginTransformFeedback BeginTransformFeedback}. The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated by {@link GL11#glBegin Begin} or any operation that implicitly calls {@link GL11#glBegin Begin}
     * (such as {@link GL11#glDrawElements DrawElements}) if {@code mode} is not one of the allowed modes. If a geometry shader is active, its output primitive type is used instead
     * of the {@code mode} parameter passed to {@link GL11#glBegin Begin} for the purposes of this error check. Any primitive type may be used while transform feedback is
     * paused.</p>
     */
    public static native void glPauseTransformFeedback();

    // --- [ glResumeTransformFeedback ] ---

    /**
     * Resumes transform feedback operations for the currently bound transform feedback object.
     * 
     * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated by {@link #glResumeTransformFeedback ResumeTransformFeedback} if the currently bound transform feedback is not active or is not paused.</p>
     */
    public static native void glResumeTransformFeedback();

    // --- [ glDrawTransformFeedback ] ---

    /**
     * Render primitives using a count derived from a transform feedback object.
     *
     * @param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td><td>{@link GL11#GL_QUADS QUADS}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td></tr><tr><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
     * @param id   the name of a transform feedback object from which to retrieve a primitive count
     */
    public static native void glDrawTransformFeedback(@NativeType("GLenum") int mode, @NativeType("GLuint") int id);

    /** Array version of: {@link #glDeleteTransformFeedbacks DeleteTransformFeedbacks} */
    public static void glDeleteTransformFeedbacks(@NativeType("GLuint const *") int[] ids) {
        long __functionAddress = GL.getICD().glDeleteTransformFeedbacks;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, ids.length, ids);
    }

    /** Array version of: {@link #glGenTransformFeedbacks GenTransformFeedbacks} */
    public static void glGenTransformFeedbacks(@NativeType("GLuint *") int[] ids) {
        long __functionAddress = GL.getICD().glGenTransformFeedbacks;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, ids.length, ids);
    }

}