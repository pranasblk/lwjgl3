/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

/** Native bindings to the C API of the <a target="_blank" href="https://github.com/bkaradzic/bgfx">bgfx</a> library. */
public class BGFX {

    /** API version */
    public static final int BGFX_API_VERSION = 66;

    /** Invalid handle */
    public static final short BGFX_INVALID_HANDLE = (short)0xFFFF;

    /** State */
    public static final long
        BGFX_STATE_WRITE_R                 = 0x1L,
        BGFX_STATE_WRITE_G                 = 0x2L,
        BGFX_STATE_WRITE_B                 = 0x4L,
        BGFX_STATE_WRITE_A                 = 0x8L,
        BGFX_STATE_WRITE_Z                 = 0x4000000000L,
        BGFX_STATE_WRITE_RGB               = BGFX_STATE_WRITE_R | BGFX_STATE_WRITE_G | BGFX_STATE_WRITE_B,
        BGFX_STATE_WRITE_MASK              = BGFX_STATE_WRITE_RGB | BGFX_STATE_WRITE_A | BGFX_STATE_WRITE_Z,
        BGFX_STATE_DEPTH_TEST_LESS         = 0x10L,
        BGFX_STATE_DEPTH_TEST_LEQUAL       = 0x20L,
        BGFX_STATE_DEPTH_TEST_EQUAL        = 0x30L,
        BGFX_STATE_DEPTH_TEST_GEQUAL       = 0x40L,
        BGFX_STATE_DEPTH_TEST_GREATER      = 0x50L,
        BGFX_STATE_DEPTH_TEST_NOTEQUAL     = 0x60L,
        BGFX_STATE_DEPTH_TEST_NEVER        = 0x70L,
        BGFX_STATE_DEPTH_TEST_ALWAYS       = 0x80L,
        BGFX_STATE_BLEND_ZERO              = 0x1000L,
        BGFX_STATE_BLEND_ONE               = 0x2000L,
        BGFX_STATE_BLEND_SRC_COLOR         = 0x3000L,
        BGFX_STATE_BLEND_INV_SRC_COLOR     = 0x4000L,
        BGFX_STATE_BLEND_SRC_ALPHA         = 0x5000L,
        BGFX_STATE_BLEND_INV_SRC_ALPHA     = 0x6000L,
        BGFX_STATE_BLEND_DST_ALPHA         = 0x7000L,
        BGFX_STATE_BLEND_INV_DST_ALPHA     = 0x8000L,
        BGFX_STATE_BLEND_DST_COLOR         = 0x9000L,
        BGFX_STATE_BLEND_INV_DST_COLOR     = 0xA000L,
        BGFX_STATE_BLEND_SRC_ALPHA_SAT     = 0xB000L,
        BGFX_STATE_BLEND_FACTOR            = 0xC000L,
        BGFX_STATE_BLEND_INV_FACTOR        = 0xD000L,
        BGFX_STATE_BLEND_EQUATION_ADD      = 0x0L,
        BGFX_STATE_BLEND_EQUATION_SUB      = 0x10000000L,
        BGFX_STATE_BLEND_EQUATION_REVSUB   = 0x20000000L,
        BGFX_STATE_BLEND_EQUATION_MIN      = 0x30000000L,
        BGFX_STATE_BLEND_EQUATION_MAX      = 0x40000000L,
        BGFX_STATE_BLEND_INDEPENDENT       = 0x400000000L,
        BGFX_STATE_BLEND_ALPHA_TO_COVERAGE = 0x800000000L,
        BGFX_STATE_CULL_CW                 = 0x1000000000L,
        BGFX_STATE_CULL_CCW                = 0x2000000000L,
        BGFX_STATE_PT_TRISTRIP             = 0x1000000000000L,
        BGFX_STATE_PT_LINES                = 0x2000000000000L,
        BGFX_STATE_PT_LINESTRIP            = 0x3000000000000L,
        BGFX_STATE_PT_POINTS               = 0x4000000000000L,
        BGFX_STATE_MSAA                    = 0x100000000000000L,
        BGFX_STATE_LINEAA                  = 0x200000000000000L,
        BGFX_STATE_CONSERVATIVE_RASTER     = 0x400000000000000L,
        BGFX_STATE_NONE                    = 0x0L,
        BGFX_STATE_DEFAULT                 = (0L
        | BGFX_STATE_WRITE_RGB
        | BGFX_STATE_WRITE_A
        | BGFX_STATE_WRITE_Z
        | BGFX_STATE_DEPTH_TEST_LESS
        | BGFX_STATE_CULL_CW
        | BGFX_STATE_MSAA)
        ;

    /** State */
    public static final long
        BGFX_STATE_DEPTH_TEST_MASK     = 0xF0L,
        BGFX_STATE_BLEND_MASK          = 0xFFFF000L,
        BGFX_STATE_BLEND_EQUATION_MASK = 0x3F0000000L,
        BGFX_STATE_CULL_MASK           = 0x3000000000L,
        BGFX_STATE_ALPHA_REF_MASK      = 0xFF0000000000L,
        BGFX_STATE_PT_MASK             = 0x7000000000000L,
        BGFX_STATE_POINT_SIZE_MASK     = 0xF0000000000000L,
        BGFX_STATE_RESERVED_MASK       = 0xe000000000000000L,
        BGFX_STATE_MASK                = 0xffffffffffffffffL;

    /** State */
    public static final int
        BGFX_STATE_DEPTH_TEST_SHIFT     = 4,
        BGFX_STATE_BLEND_SHIFT          = 12,
        BGFX_STATE_BLEND_EQUATION_SHIFT = 28,
        BGFX_STATE_CULL_SHIFT           = 36,
        BGFX_STATE_ALPHA_REF_SHIFT      = 40,
        BGFX_STATE_PT_SHIFT             = 48,
        BGFX_STATE_POINT_SIZE_SHIFT     = 52,
        BGFX_STATE_RESERVED_SHIFT       = 61;

    /** Stencil */
    public static final int
        BGFX_STENCIL_TEST_LESS         = 0x10000,
        BGFX_STENCIL_TEST_LEQUAL       = 0x20000,
        BGFX_STENCIL_TEST_EQUAL        = 0x30000,
        BGFX_STENCIL_TEST_GEQUAL       = 0x40000,
        BGFX_STENCIL_TEST_GREATER      = 0x50000,
        BGFX_STENCIL_TEST_NOTEQUAL     = 0x60000,
        BGFX_STENCIL_TEST_NEVER        = 0x70000,
        BGFX_STENCIL_TEST_ALWAYS       = 0x80000,
        BGFX_STENCIL_OP_FAIL_S_ZERO    = 0x0,
        BGFX_STENCIL_OP_FAIL_S_KEEP    = 0x100000,
        BGFX_STENCIL_OP_FAIL_S_REPLACE = 0x200000,
        BGFX_STENCIL_OP_FAIL_S_INCR    = 0x300000,
        BGFX_STENCIL_OP_FAIL_S_INCRSAT = 0x400000,
        BGFX_STENCIL_OP_FAIL_S_DECR    = 0x500000,
        BGFX_STENCIL_OP_FAIL_S_DECRSAT = 0x600000,
        BGFX_STENCIL_OP_FAIL_S_INVERT  = 0x700000,
        BGFX_STENCIL_OP_FAIL_Z_ZERO    = 0x0,
        BGFX_STENCIL_OP_FAIL_Z_KEEP    = 0x1000000,
        BGFX_STENCIL_OP_FAIL_Z_REPLACE = 0x2000000,
        BGFX_STENCIL_OP_FAIL_Z_INCR    = 0x3000000,
        BGFX_STENCIL_OP_FAIL_Z_INCRSAT = 0x4000000,
        BGFX_STENCIL_OP_FAIL_Z_DECR    = 0x5000000,
        BGFX_STENCIL_OP_FAIL_Z_DECRSAT = 0x6000000,
        BGFX_STENCIL_OP_FAIL_Z_INVERT  = 0x7000000,
        BGFX_STENCIL_OP_PASS_Z_ZERO    = 0x0,
        BGFX_STENCIL_OP_PASS_Z_KEEP    = 0x10000000,
        BGFX_STENCIL_OP_PASS_Z_REPLACE = 0x20000000,
        BGFX_STENCIL_OP_PASS_Z_INCR    = 0x30000000,
        BGFX_STENCIL_OP_PASS_Z_INCRSAT = 0x40000000,
        BGFX_STENCIL_OP_PASS_Z_DECR    = 0x50000000,
        BGFX_STENCIL_OP_PASS_Z_DECRSAT = 0x60000000,
        BGFX_STENCIL_OP_PASS_Z_INVERT  = 0x70000000,
        BGFX_STENCIL_NONE              = 0x0,
        BGFX_STENCIL_DEFAULT           = 0x0;

    /** Stencil */
    public static final int
        BGFX_STENCIL_FUNC_REF_SHIFT   = 0,
        BGFX_STENCIL_FUNC_REF_MASK    = 0xFF,
        BGFX_STENCIL_FUNC_RMASK_SHIFT = 8,
        BGFX_STENCIL_FUNC_RMASK_MASK  = 0xFF00,
        BGFX_STENCIL_TEST_SHIFT       = 16,
        BGFX_STENCIL_TEST_MASK        = 0xF0000,
        BGFX_STENCIL_OP_FAIL_S_SHIFT  = 20,
        BGFX_STENCIL_OP_FAIL_S_MASK   = 0xF00000,
        BGFX_STENCIL_OP_FAIL_Z_SHIFT  = 24,
        BGFX_STENCIL_OP_FAIL_Z_MASK   = 0xF000000,
        BGFX_STENCIL_OP_PASS_Z_SHIFT  = 28,
        BGFX_STENCIL_OP_PASS_Z_MASK   = 0xf0000000,
        BGFX_STENCIL_MASK             = 0xffffffff;

    /** Clear */
    public static final int
        BGFX_CLEAR_NONE               = 0x0,
        BGFX_CLEAR_COLOR              = 0x1,
        BGFX_CLEAR_DEPTH              = 0x2,
        BGFX_CLEAR_STENCIL            = 0x4,
        BGFX_CLEAR_DISCARD_COLOR_0    = 0x8,
        BGFX_CLEAR_DISCARD_COLOR_1    = 0x10,
        BGFX_CLEAR_DISCARD_COLOR_2    = 0x20,
        BGFX_CLEAR_DISCARD_COLOR_3    = 0x40,
        BGFX_CLEAR_DISCARD_COLOR_4    = 0x80,
        BGFX_CLEAR_DISCARD_COLOR_5    = 0x100,
        BGFX_CLEAR_DISCARD_COLOR_6    = 0x200,
        BGFX_CLEAR_DISCARD_COLOR_7    = 0x400,
        BGFX_CLEAR_DISCARD_DEPTH      = 0x800,
        BGFX_CLEAR_DISCARD_STENCIL    = 0x1000,
        BGFX_CLEAR_DISCARD_COLOR_MASK = (0
        | BGFX_CLEAR_DISCARD_COLOR_0
        | BGFX_CLEAR_DISCARD_COLOR_1
        | BGFX_CLEAR_DISCARD_COLOR_2
        | BGFX_CLEAR_DISCARD_COLOR_3
        | BGFX_CLEAR_DISCARD_COLOR_4
        | BGFX_CLEAR_DISCARD_COLOR_5
        | BGFX_CLEAR_DISCARD_COLOR_6
        | BGFX_CLEAR_DISCARD_COLOR_7)
        ,
        BGFX_CLEAR_DISCARD_MASK       = (0
        | BGFX_CLEAR_DISCARD_COLOR_MASK
        | BGFX_CLEAR_DISCARD_DEPTH
        | BGFX_CLEAR_DISCARD_STENCIL)
        ;

    /**
     * Debug
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #BGFX_DEBUG_NONE DEBUG_NONE}</li>
     * <li>{@link #BGFX_DEBUG_WIREFRAME DEBUG_WIREFRAME} - Wireframe rendering. All rendering primitives will be rendered as lines.</li>
     * <li>{@link #BGFX_DEBUG_IFH DEBUG_IFH} - 
     * Infinitely fast hardware. When this flag is set all rendering calls will be skipped. This is useful when profiling to quickly assess potential
     * bottlenecks between CPU and GPU.
     * </li>
     * <li>{@link #BGFX_DEBUG_STATS DEBUG_STATS} - Display internal statistics.</li>
     * <li>{@link #BGFX_DEBUG_TEXT DEBUG_TEXT} - Display debug text.</li>
     * <li>{@link #BGFX_DEBUG_PROFILER DEBUG_PROFILER} - Enable profiler.</li>
     * </ul>
     */
    public static final int
        BGFX_DEBUG_NONE      = 0x0,
        BGFX_DEBUG_WIREFRAME = 0x1,
        BGFX_DEBUG_IFH       = 0x2,
        BGFX_DEBUG_STATS     = 0x4,
        BGFX_DEBUG_TEXT      = 0x8,
        BGFX_DEBUG_PROFILER  = 0x10;

    /** Buffer creation flags */
    public static final int
        BGFX_BUFFER_NONE               = 0x0,
        BGFX_BUFFER_COMPUTE_READ       = 0x100,
        BGFX_BUFFER_COMPUTE_WRITE      = 0x200,
        BGFX_BUFFER_DRAW_INDIRECT      = 0x400,
        BGFX_BUFFER_ALLOW_RESIZE       = 0x800,
        BGFX_BUFFER_INDEX32            = 0x1000,
        BGFX_BUFFER_COMPUTE_READ_WRITE = (0
        | BGFX_BUFFER_COMPUTE_READ
        | BGFX_BUFFER_COMPUTE_WRITE)
        ;

    /** Buffer */
    public static final short
        BGFX_BUFFER_COMPUTE_FORMAT_8x1   = 0x1,
        BGFX_BUFFER_COMPUTE_FORMAT_8x2   = 0x2,
        BGFX_BUFFER_COMPUTE_FORMAT_8x4   = 0x3,
        BGFX_BUFFER_COMPUTE_FORMAT_16x1  = 0x4,
        BGFX_BUFFER_COMPUTE_FORMAT_16x2  = 0x5,
        BGFX_BUFFER_COMPUTE_FORMAT_16x4  = 0x6,
        BGFX_BUFFER_COMPUTE_FORMAT_32x1  = 0x7,
        BGFX_BUFFER_COMPUTE_FORMAT_32x2  = 0x8,
        BGFX_BUFFER_COMPUTE_FORMAT_32x4  = 0x9,
        BGFX_BUFFER_COMPUTE_FORMAT_SHIFT = 0,
        BGFX_BUFFER_COMPUTE_FORMAT_MASK  = 0xF,
        BGFX_BUFFER_COMPUTE_TYPE_INT     = 0x10,
        BGFX_BUFFER_COMPUTE_TYPE_UINT    = 0x20,
        BGFX_BUFFER_COMPUTE_TYPE_FLOAT   = 0x30,
        BGFX_BUFFER_COMPUTE_TYPE_SHIFT   = 4,
        BGFX_BUFFER_COMPUTE_TYPE_MASK    = 0x30;

    /** Texture */
    public static final int
        BGFX_TEXTURE_NONE             = 0x0,
        BGFX_TEXTURE_U_MIRROR         = 0x1,
        BGFX_TEXTURE_U_CLAMP          = 0x2,
        BGFX_TEXTURE_U_BORDER         = 0x3,
        BGFX_TEXTURE_V_MIRROR         = 0x4,
        BGFX_TEXTURE_V_CLAMP          = 0x8,
        BGFX_TEXTURE_V_BORDER         = 0xC,
        BGFX_TEXTURE_W_MIRROR         = 0x10,
        BGFX_TEXTURE_W_CLAMP          = 0x20,
        BGFX_TEXTURE_W_BORDER         = 0x30,
        BGFX_TEXTURE_MIN_POINT        = 0x40,
        BGFX_TEXTURE_MIN_ANISOTROPIC  = 0x80,
        BGFX_TEXTURE_MAG_POINT        = 0x100,
        BGFX_TEXTURE_MAG_ANISOTROPIC  = 0x200,
        BGFX_TEXTURE_MIP_POINT        = 0x400,
        BGFX_TEXTURE_MSAA_SAMPLE      = 0x800,
        BGFX_TEXTURE_RT               = 0x1000,
        BGFX_TEXTURE_RT_MSAA_X2       = 0x2000,
        BGFX_TEXTURE_RT_MSAA_X4       = 0x3000,
        BGFX_TEXTURE_RT_MSAA_X8       = 0x4000,
        BGFX_TEXTURE_RT_MSAA_X16      = 0x5000,
        BGFX_TEXTURE_RT_WRITE_ONLY    = 0x8000,
        BGFX_TEXTURE_COMPARE_LESS     = 0x10000,
        BGFX_TEXTURE_COMPARE_LEQUAL   = 0x20000,
        BGFX_TEXTURE_COMPARE_EQUAL    = 0x30000,
        BGFX_TEXTURE_COMPARE_GEQUAL   = 0x40000,
        BGFX_TEXTURE_COMPARE_GREATER  = 0x50000,
        BGFX_TEXTURE_COMPARE_NOTEQUAL = 0x60000,
        BGFX_TEXTURE_COMPARE_NEVER    = 0x70000,
        BGFX_TEXTURE_COMPARE_ALWAYS   = 0x80000,
        BGFX_TEXTURE_COMPUTE_WRITE    = 0x100000,
        BGFX_TEXTURE_SRGB             = 0x200000,
        BGFX_TEXTURE_BLIT_DST         = 0x400000,
        BGFX_TEXTURE_READ_BACK        = 0x800000;

    /** Texture shifts/masks */
    public static final int
        BGFX_TEXTURE_U_SHIFT            = 0,
        BGFX_TEXTURE_U_MASK             = 0x3,
        BGFX_TEXTURE_V_SHIFT            = 2,
        BGFX_TEXTURE_V_MASK             = 0xC,
        BGFX_TEXTURE_W_SHIFT            = 4,
        BGFX_TEXTURE_W_MASK             = 0x30,
        BGFX_TEXTURE_MIN_SHIFT          = 6,
        BGFX_TEXTURE_MIN_MASK           = 0xC0,
        BGFX_TEXTURE_MAG_SHIFT          = 8,
        BGFX_TEXTURE_MAG_MASK           = 0x300,
        BGFX_TEXTURE_MIP_SHIFT          = 10,
        BGFX_TEXTURE_MIP_MASK           = 0x400,
        BGFX_TEXTURE_RT_MSAA_SHIFT      = 12,
        BGFX_TEXTURE_RT_MSAA_MASK       = 0x7000,
        BGFX_TEXTURE_RT_MASK            = 0xF000,
        BGFX_TEXTURE_COMPARE_SHIFT      = 16,
        BGFX_TEXTURE_COMPARE_MASK       = 0xF0000,
        BGFX_TEXTURE_BORDER_COLOR_SHIFT = 24,
        BGFX_TEXTURE_BORDER_COLOR_MASK  = 0xF000000,
        BGFX_TEXTURE_RESERVED_SHIFT     = 28,
        BGFX_TEXTURE_RESERVED_MASK      = 0xf0000000,
        BGFX_TEXTURE_SAMPLER_BITS_MASK  = (0
        | BGFX_TEXTURE_U_MASK
        | BGFX_TEXTURE_V_MASK
        | BGFX_TEXTURE_W_MASK
        | BGFX_TEXTURE_MIN_MASK
        | BGFX_TEXTURE_MAG_MASK
        | BGFX_TEXTURE_MIP_MASK
        | BGFX_TEXTURE_COMPARE_MASK)
        ;

    /** Reset */
    public static final int
        BGFX_RESET_NONE               = 0x0,
        BGFX_RESET_FULLSCREEN         = 0x1,
        BGFX_RESET_FULLSCREEN_SHIFT   = 0,
        BGFX_RESET_FULLSCREEN_MASK    = 0x1,
        BGFX_RESET_MSAA_X2            = 0x10,
        BGFX_RESET_MSAA_X4            = 0x20,
        BGFX_RESET_MSAA_X8            = 0x30,
        BGFX_RESET_MSAA_X16           = 0x40,
        BGFX_RESET_MSAA_SHIFT         = 4,
        BGFX_RESET_MSAA_MASK          = 0x70,
        BGFX_RESET_VSYNC              = 0x80,
        BGFX_RESET_MAXANISOTROPY      = 0x100,
        BGFX_RESET_CAPTURE            = 0x200,
        BGFX_RESET_HMD                = 0x400,
        BGFX_RESET_HMD_DEBUG          = 0x800,
        BGFX_RESET_HMD_RECENTER       = 0x1000,
        BGFX_RESET_FLUSH_AFTER_RENDER = 0x2000,
        BGFX_RESET_FLIP_AFTER_RENDER  = 0x4000,
        BGFX_RESET_SRGB_BACKBUFFER    = 0x8000,
        BGFX_RESET_HIDPI              = 0x10000,
        BGFX_RESET_DEPTH_CLAMP        = 0x20000,
        BGFX_RESET_SUSPEND            = 0x40000;

    /** Reset */
    public static final int
        BGFX_RESET_RESERVED_SHIFT = 31,
        BGFX_RESET_RESERVED_MASK  = 0x80000000;

    /** Caps */
    public static final long
        BGFX_CAPS_ALPHA_TO_COVERAGE      = 0x1L,
        BGFX_CAPS_BLEND_INDEPENDENT      = 0x2L,
        BGFX_CAPS_COMPUTE                = 0x4L,
        BGFX_CAPS_CONSERVATIVE_RASTER    = 0x8L,
        BGFX_CAPS_DRAW_INDIRECT          = 0x10L,
        BGFX_CAPS_FRAGMENT_DEPTH         = 0x20L,
        BGFX_CAPS_FRAGMENT_ORDERING      = 0x40L,
        BGFX_CAPS_GRAPHICS_DEBUGGER      = 0x80L,
        BGFX_CAPS_HIDPI                  = 0x100L,
        BGFX_CAPS_HMD                    = 0x200L,
        BGFX_CAPS_INDEX32                = 0x400L,
        BGFX_CAPS_INSTANCING             = 0x800L,
        BGFX_CAPS_OCCLUSION_QUERY        = 0x1000L,
        BGFX_CAPS_RENDERER_MULTITHREADED = 0x2000L,
        BGFX_CAPS_SWAP_CHAIN             = 0x4000L,
        BGFX_CAPS_TEXTURE_2D_ARRAY       = 0x8000L,
        BGFX_CAPS_TEXTURE_3D             = 0x10000L,
        BGFX_CAPS_TEXTURE_BLIT           = 0x20000L,
        BGFX_CAPS_TEXTURE_COMPARE_ALL    = 0xC0000L,
        BGFX_CAPS_TEXTURE_COMPARE_LEQUAL = 0x80000L,
        BGFX_CAPS_TEXTURE_CUBE_ARRAY     = 0x100000L,
        BGFX_CAPS_TEXTURE_DIRECT_ACCESS  = 0x200000L,
        BGFX_CAPS_TEXTURE_READ_BACK      = 0x400000L,
        BGFX_CAPS_VERTEX_ATTRIB_HALF     = 0x800000L,
        BGFX_CAPS_VERTEX_ATTRIB_UINT10   = 0x800000L;

    /** Format caps */
    public static final short
        BGFX_CAPS_FORMAT_TEXTURE_NONE             = 0x0,
        BGFX_CAPS_FORMAT_TEXTURE_2D               = 0x1,
        BGFX_CAPS_FORMAT_TEXTURE_2D_SRGB          = 0x2,
        BGFX_CAPS_FORMAT_TEXTURE_2D_EMULATED      = 0x4,
        BGFX_CAPS_FORMAT_TEXTURE_3D               = 0x8,
        BGFX_CAPS_FORMAT_TEXTURE_3D_SRGB          = 0x10,
        BGFX_CAPS_FORMAT_TEXTURE_3D_EMULATED      = 0x20,
        BGFX_CAPS_FORMAT_TEXTURE_CUBE             = 0x40,
        BGFX_CAPS_FORMAT_TEXTURE_CUBE_SRGB        = 0x80,
        BGFX_CAPS_FORMAT_TEXTURE_CUBE_EMULATED    = 0x100,
        BGFX_CAPS_FORMAT_TEXTURE_VERTEX           = 0x200,
        BGFX_CAPS_FORMAT_TEXTURE_IMAGE            = 0x400,
        BGFX_CAPS_FORMAT_TEXTURE_FRAMEBUFFER      = 0x800,
        BGFX_CAPS_FORMAT_TEXTURE_FRAMEBUFFER_MSAA = 0x1000,
        BGFX_CAPS_FORMAT_TEXTURE_MSAA             = 0x2000,
        BGFX_CAPS_FORMAT_TEXTURE_MIP_AUTOGEN      = 0x4000;

    /** View */
    public static final byte
        BGFX_VIEW_NONE   = 0x0,
        BGFX_VIEW_STEREO = 0x1;

    /** Submit */
    public static final byte
        BGFX_SUBMIT_EYE_LEFT  = 0x1,
        BGFX_SUBMIT_EYE_RIGHT = 0x2,
        BGFX_SUBMIT_EYE_FIRST = BGFX_SUBMIT_EYE_LEFT;

    /** Submit */
    public static final byte
        BGFX_SUBMIT_EYE_MASK       = 0x3,
        BGFX_SUBMIT_RESERVED_SHIFT = 7,
        BGFX_SUBMIT_RESERVED_MASK  = (byte)0x80;

    /** PCI */
    public static final short
        BGFX_PCI_ID_NONE                = 0x0,
        BGFX_PCI_ID_SOFTWARE_RASTERIZER = 0x1,
        BGFX_PCI_ID_AMD                 = 0x1002,
        BGFX_PCI_ID_INTEL               = (short)0x8086,
        BGFX_PCI_ID_NVIDIA              = 0x10DE;

    /** HMD */
    public static final byte
        BGFX_HMD_NONE              = 0x0,
        BGFX_HMD_DEVICE_RESOLUTION = 0x1,
        BGFX_HMD_RENDERING         = 0x2;

    /** Cubemap */
    public static final byte
        BGFX_CUBE_MAP_POSITIVE_X = 0x0,
        BGFX_CUBE_MAP_NEGATIVE_X = 0x1,
        BGFX_CUBE_MAP_POSITIVE_Y = 0x2,
        BGFX_CUBE_MAP_NEGATIVE_Y = 0x3,
        BGFX_CUBE_MAP_POSITIVE_Z = 0x4,
        BGFX_CUBE_MAP_NEGATIVE_Z = 0x5;

    /**
     * Renderer backend type. ({@code bgfx_renderer_type_t})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #BGFX_RENDERER_TYPE_NOOP RENDERER_TYPE_NOOP} - No rendering.</li>
     * <li>{@link #BGFX_RENDERER_TYPE_DIRECT3D9 RENDERER_TYPE_DIRECT3D9} - Direct3D 9.0</li>
     * <li>{@link #BGFX_RENDERER_TYPE_DIRECT3D11 RENDERER_TYPE_DIRECT3D11} - Direct3D 11.0</li>
     * <li>{@link #BGFX_RENDERER_TYPE_DIRECT3D12 RENDERER_TYPE_DIRECT3D12} - Direct3D 12.0</li>
     * <li>{@link #BGFX_RENDERER_TYPE_GNM RENDERER_TYPE_GNM} - GNM</li>
     * <li>{@link #BGFX_RENDERER_TYPE_METAL RENDERER_TYPE_METAL} - Metal</li>
     * <li>{@link #BGFX_RENDERER_TYPE_OPENGLES RENDERER_TYPE_OPENGLES} - OpenGL ES 2.0+</li>
     * <li>{@link #BGFX_RENDERER_TYPE_OPENGL RENDERER_TYPE_OPENGL} - OpenGL 2.1+</li>
     * <li>{@link #BGFX_RENDERER_TYPE_VULKAN RENDERER_TYPE_VULKAN} - Vulkan</li>
     * <li>{@link #BGFX_RENDERER_TYPE_COUNT RENDERER_TYPE_COUNT}</li>
     * </ul>
     */
    public static final int
        BGFX_RENDERER_TYPE_NOOP       = 0,
        BGFX_RENDERER_TYPE_DIRECT3D9  = 1,
        BGFX_RENDERER_TYPE_DIRECT3D11 = 2,
        BGFX_RENDERER_TYPE_DIRECT3D12 = 3,
        BGFX_RENDERER_TYPE_GNM        = 4,
        BGFX_RENDERER_TYPE_METAL      = 5,
        BGFX_RENDERER_TYPE_OPENGLES   = 6,
        BGFX_RENDERER_TYPE_OPENGL     = 7,
        BGFX_RENDERER_TYPE_VULKAN     = 8,
        BGFX_RENDERER_TYPE_COUNT      = 9;

    /**
     * Access mode ({@code bgfx_access_t})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #BGFX_ACCESS_READ ACCESS_READ} - Read</li>
     * <li>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE} - Write</li>
     * <li>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE} - Read and write</li>
     * <li>{@link #BGFX_ACCESS_COUNT ACCESS_COUNT}</li>
     * </ul>
     */
    public static final int
        BGFX_ACCESS_READ      = 0,
        BGFX_ACCESS_WRITE     = 1,
        BGFX_ACCESS_READWRITE = 2,
        BGFX_ACCESS_COUNT     = 3;

    /**
     * Vertex attribute ({@code bgfx_attrib_t}).
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #BGFX_ATTRIB_POSITION ATTRIB_POSITION}</li>
     * <li>{@link #BGFX_ATTRIB_NORMAL ATTRIB_NORMAL}</li>
     * <li>{@link #BGFX_ATTRIB_TANGENT ATTRIB_TANGENT}</li>
     * <li>{@link #BGFX_ATTRIB_BITANGENT ATTRIB_BITANGENT}</li>
     * <li>{@link #BGFX_ATTRIB_COLOR0 ATTRIB_COLOR0}</li>
     * <li>{@link #BGFX_ATTRIB_COLOR1 ATTRIB_COLOR1}</li>
     * <li>{@link #BGFX_ATTRIB_COLOR2 ATTRIB_COLOR2}</li>
     * <li>{@link #BGFX_ATTRIB_COLOR3 ATTRIB_COLOR3}</li>
     * <li>{@link #BGFX_ATTRIB_INDICES ATTRIB_INDICES}</li>
     * <li>{@link #BGFX_ATTRIB_WEIGHT ATTRIB_WEIGHT}</li>
     * <li>{@link #BGFX_ATTRIB_TEXCOORD0 ATTRIB_TEXCOORD0}</li>
     * <li>{@link #BGFX_ATTRIB_TEXCOORD1 ATTRIB_TEXCOORD1}</li>
     * <li>{@link #BGFX_ATTRIB_TEXCOORD2 ATTRIB_TEXCOORD2}</li>
     * <li>{@link #BGFX_ATTRIB_TEXCOORD3 ATTRIB_TEXCOORD3}</li>
     * <li>{@link #BGFX_ATTRIB_TEXCOORD4 ATTRIB_TEXCOORD4}</li>
     * <li>{@link #BGFX_ATTRIB_TEXCOORD5 ATTRIB_TEXCOORD5}</li>
     * <li>{@link #BGFX_ATTRIB_TEXCOORD6 ATTRIB_TEXCOORD6}</li>
     * <li>{@link #BGFX_ATTRIB_TEXCOORD7 ATTRIB_TEXCOORD7}</li>
     * <li>{@link #BGFX_ATTRIB_COUNT ATTRIB_COUNT}</li>
     * </ul>
     */
    public static final int
        BGFX_ATTRIB_POSITION  = 0,
        BGFX_ATTRIB_NORMAL    = 1,
        BGFX_ATTRIB_TANGENT   = 2,
        BGFX_ATTRIB_BITANGENT = 3,
        BGFX_ATTRIB_COLOR0    = 4,
        BGFX_ATTRIB_COLOR1    = 5,
        BGFX_ATTRIB_COLOR2    = 6,
        BGFX_ATTRIB_COLOR3    = 7,
        BGFX_ATTRIB_INDICES   = 8,
        BGFX_ATTRIB_WEIGHT    = 9,
        BGFX_ATTRIB_TEXCOORD0 = 10,
        BGFX_ATTRIB_TEXCOORD1 = 11,
        BGFX_ATTRIB_TEXCOORD2 = 12,
        BGFX_ATTRIB_TEXCOORD3 = 13,
        BGFX_ATTRIB_TEXCOORD4 = 14,
        BGFX_ATTRIB_TEXCOORD5 = 15,
        BGFX_ATTRIB_TEXCOORD6 = 16,
        BGFX_ATTRIB_TEXCOORD7 = 17,
        BGFX_ATTRIB_COUNT     = BGFX_ATTRIB_TEXCOORD7 + 1;

    /**
     * Vertex attribute type ({@code bgfx_attrib_type_t}).
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #BGFX_ATTRIB_TYPE_UINT8 ATTRIB_TYPE_UINT8} - Uint8</li>
     * <li>{@link #BGFX_ATTRIB_TYPE_UINT10 ATTRIB_TYPE_UINT10} - Uint10, availability depends on: {@link #BGFX_CAPS_VERTEX_ATTRIB_UINT10 CAPS_VERTEX_ATTRIB_UINT10}.</li>
     * <li>{@link #BGFX_ATTRIB_TYPE_INT16 ATTRIB_TYPE_INT16} - Int16</li>
     * <li>{@link #BGFX_ATTRIB_TYPE_HALF ATTRIB_TYPE_HALF} - Half, availability depends on: {@link #BGFX_CAPS_VERTEX_ATTRIB_HALF CAPS_VERTEX_ATTRIB_HALF}`.</li>
     * <li>{@link #BGFX_ATTRIB_TYPE_FLOAT ATTRIB_TYPE_FLOAT} - Float</li>
     * <li>{@link #BGFX_ATTRIB_TYPE_COUNT ATTRIB_TYPE_COUNT}</li>
     * </ul>
     */
    public static final int
        BGFX_ATTRIB_TYPE_UINT8  = 0,
        BGFX_ATTRIB_TYPE_UINT10 = 1,
        BGFX_ATTRIB_TYPE_INT16  = 2,
        BGFX_ATTRIB_TYPE_HALF   = 3,
        BGFX_ATTRIB_TYPE_FLOAT  = 4,
        BGFX_ATTRIB_TYPE_COUNT  = BGFX_ATTRIB_TYPE_FLOAT + 1;

    /**
     * Texture format ({@code bgfx_texture_format_t}). Notation:
     * 
     * <code><pre>
     * RGBA16S
     * ^   ^ ^
     * |   | +-- [ ]Unorm
     * |   |     [F]loat
     * |   |     [S]norm
     * |   |     [I]nt
     * |   |     [U]int
     * |   +---- Number of bits per component
     * +-------- Components</pre></code>
     * 
     * <p>Availability depends on Caps.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1} - DXT1</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2} - DXT3</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3} - DXT5</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4} - LATC1/ATI1</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5} - LATC2/ATI2</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H} - BC6H</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7} - BC7</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1} - ETC1 RGB8</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2} - ETC2 RGB8</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A} - ETC2 RGBA8</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1} - ETC2 RGB8A1</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12} - PVRTC1 RGB 2BPP</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14} - PVRTC1 RGB 4BPP</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A} - PVRTC1 RGBA 2BPP</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A} - PVRTC1 RGBA 4BPP</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22} - PVRTC2 RGBA 2BPP</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24} - PVRTC2 RGBA 4BPP</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_RG11B10F TEXTURE_FORMAT_RG11B10F}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</li>
     * <li>{@link #BGFX_TEXTURE_FORMAT_COUNT TEXTURE_FORMAT_COUNT}</li>
     * </ul>
     */
    public static final int
        BGFX_TEXTURE_FORMAT_BC1           = 0,
        BGFX_TEXTURE_FORMAT_BC2           = 1,
        BGFX_TEXTURE_FORMAT_BC3           = 2,
        BGFX_TEXTURE_FORMAT_BC4           = 3,
        BGFX_TEXTURE_FORMAT_BC5           = 4,
        BGFX_TEXTURE_FORMAT_BC6H          = 5,
        BGFX_TEXTURE_FORMAT_BC7           = 6,
        BGFX_TEXTURE_FORMAT_ETC1          = 7,
        BGFX_TEXTURE_FORMAT_ETC2          = 8,
        BGFX_TEXTURE_FORMAT_ETC2A         = 9,
        BGFX_TEXTURE_FORMAT_ETC2A1        = 10,
        BGFX_TEXTURE_FORMAT_PTC12         = 11,
        BGFX_TEXTURE_FORMAT_PTC14         = 12,
        BGFX_TEXTURE_FORMAT_PTC12A        = 13,
        BGFX_TEXTURE_FORMAT_PTC14A        = 14,
        BGFX_TEXTURE_FORMAT_PTC22         = 15,
        BGFX_TEXTURE_FORMAT_PTC24         = 16,
        BGFX_TEXTURE_FORMAT_UNKNOWN       = 17,
        BGFX_TEXTURE_FORMAT_R1            = 18,
        BGFX_TEXTURE_FORMAT_A8            = 19,
        BGFX_TEXTURE_FORMAT_R8            = 20,
        BGFX_TEXTURE_FORMAT_R8I           = 21,
        BGFX_TEXTURE_FORMAT_R8U           = 22,
        BGFX_TEXTURE_FORMAT_R8S           = 23,
        BGFX_TEXTURE_FORMAT_R16           = 24,
        BGFX_TEXTURE_FORMAT_R16I          = 25,
        BGFX_TEXTURE_FORMAT_R16U          = 26,
        BGFX_TEXTURE_FORMAT_R16F          = 27,
        BGFX_TEXTURE_FORMAT_R16S          = 28,
        BGFX_TEXTURE_FORMAT_R32I          = 29,
        BGFX_TEXTURE_FORMAT_R32U          = 30,
        BGFX_TEXTURE_FORMAT_R32F          = 31,
        BGFX_TEXTURE_FORMAT_RG8           = 32,
        BGFX_TEXTURE_FORMAT_RG8I          = 33,
        BGFX_TEXTURE_FORMAT_RG8U          = 34,
        BGFX_TEXTURE_FORMAT_RG8S          = 35,
        BGFX_TEXTURE_FORMAT_RG16          = 36,
        BGFX_TEXTURE_FORMAT_RG16I         = 37,
        BGFX_TEXTURE_FORMAT_RG16U         = 38,
        BGFX_TEXTURE_FORMAT_RG16F         = 39,
        BGFX_TEXTURE_FORMAT_RG16S         = 40,
        BGFX_TEXTURE_FORMAT_RG32I         = 41,
        BGFX_TEXTURE_FORMAT_RG32U         = 42,
        BGFX_TEXTURE_FORMAT_RG32F         = 43,
        BGFX_TEXTURE_FORMAT_RGB8          = 44,
        BGFX_TEXTURE_FORMAT_RGB8I         = 45,
        BGFX_TEXTURE_FORMAT_RGB8U         = 46,
        BGFX_TEXTURE_FORMAT_RGB8S         = 47,
        BGFX_TEXTURE_FORMAT_RGB9E5F       = 48,
        BGFX_TEXTURE_FORMAT_BGRA8         = 49,
        BGFX_TEXTURE_FORMAT_RGBA8         = 50,
        BGFX_TEXTURE_FORMAT_RGBA8I        = 51,
        BGFX_TEXTURE_FORMAT_RGBA8U        = 52,
        BGFX_TEXTURE_FORMAT_RGBA8S        = 53,
        BGFX_TEXTURE_FORMAT_RGBA16        = 54,
        BGFX_TEXTURE_FORMAT_RGBA16I       = 55,
        BGFX_TEXTURE_FORMAT_RGBA16U       = 56,
        BGFX_TEXTURE_FORMAT_RGBA16F       = 57,
        BGFX_TEXTURE_FORMAT_RGBA16S       = 58,
        BGFX_TEXTURE_FORMAT_RGBA32I       = 59,
        BGFX_TEXTURE_FORMAT_RGBA32U       = 60,
        BGFX_TEXTURE_FORMAT_RGBA32F       = 61,
        BGFX_TEXTURE_FORMAT_R5G6B5        = 62,
        BGFX_TEXTURE_FORMAT_RGBA4         = 63,
        BGFX_TEXTURE_FORMAT_RGB5A1        = 64,
        BGFX_TEXTURE_FORMAT_RGB10A2       = 65,
        BGFX_TEXTURE_FORMAT_RG11B10F      = 66,
        BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH = 67,
        BGFX_TEXTURE_FORMAT_D16           = 68,
        BGFX_TEXTURE_FORMAT_D24           = 69,
        BGFX_TEXTURE_FORMAT_D24S8         = 70,
        BGFX_TEXTURE_FORMAT_D32           = 71,
        BGFX_TEXTURE_FORMAT_D16F          = 72,
        BGFX_TEXTURE_FORMAT_D24F          = 73,
        BGFX_TEXTURE_FORMAT_D32F          = 74,
        BGFX_TEXTURE_FORMAT_D0S8          = 75,
        BGFX_TEXTURE_FORMAT_COUNT         = BGFX_TEXTURE_FORMAT_D0S8 + 1;

    /**
     * Uniform type ({@code bgfx_uniform_type_t}).
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #BGFX_UNIFORM_TYPE_INT1 UNIFORM_TYPE_INT1} - Int, used for samplers only.</li>
     * <li>{@link #BGFX_UNIFORM_TYPE_END UNIFORM_TYPE_END} - Reserved, do not use.</li>
     * <li>{@link #BGFX_UNIFORM_TYPE_VEC4 UNIFORM_TYPE_VEC4} - 4 floats vector.</li>
     * <li>{@link #BGFX_UNIFORM_TYPE_MAT3 UNIFORM_TYPE_MAT3} - 3x3 matrix.</li>
     * <li>{@link #BGFX_UNIFORM_TYPE_MAT4 UNIFORM_TYPE_MAT4} - 4x4 matrix.</li>
     * <li>{@link #BGFX_UNIFORM_TYPE_COUNT UNIFORM_TYPE_COUNT}</li>
     * </ul>
     */
    public static final int
        BGFX_UNIFORM_TYPE_INT1  = 0,
        BGFX_UNIFORM_TYPE_END   = 1,
        BGFX_UNIFORM_TYPE_VEC4  = 2,
        BGFX_UNIFORM_TYPE_MAT3  = 3,
        BGFX_UNIFORM_TYPE_MAT4  = 4,
        BGFX_UNIFORM_TYPE_COUNT = 5;

    /**
     * Backbuffer ratio ({@code bgfx_backbuffer_ratio_t}).
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #BGFX_BACKBUFFER_RATIO_EQUAL BACKBUFFER_RATIO_EQUAL} - Equal to backbuffer.</li>
     * <li>{@link #BGFX_BACKBUFFER_RATIO_HALF BACKBUFFER_RATIO_HALF} - One half size of backbuffer.</li>
     * <li>{@link #BGFX_BACKBUFFER_RATIO_QUARTER BACKBUFFER_RATIO_QUARTER} - One quarter size of backbuffer.</li>
     * <li>{@link #BGFX_BACKBUFFER_RATIO_EIGHTH BACKBUFFER_RATIO_EIGHTH} - One eighth size of backbuffer.</li>
     * <li>{@link #BGFX_BACKBUFFER_RATIO_SIXTEENTH BACKBUFFER_RATIO_SIXTEENTH} - One sixteenth size of backbuffer.</li>
     * <li>{@link #BGFX_BACKBUFFER_RATIO_DOUBLE BACKBUFFER_RATIO_DOUBLE} - Double size of backbuffer.</li>
     * <li>{@link #BGFX_BACKBUFFER_RATIO_COUNT BACKBUFFER_RATIO_COUNT}</li>
     * </ul>
     */
    public static final int
        BGFX_BACKBUFFER_RATIO_EQUAL     = 0,
        BGFX_BACKBUFFER_RATIO_HALF      = 1,
        BGFX_BACKBUFFER_RATIO_QUARTER   = 2,
        BGFX_BACKBUFFER_RATIO_EIGHTH    = 3,
        BGFX_BACKBUFFER_RATIO_SIXTEENTH = 4,
        BGFX_BACKBUFFER_RATIO_DOUBLE    = 5,
        BGFX_BACKBUFFER_RATIO_COUNT     = 6;

    /**
     * Occlusion query result ({@code bgfx_occlusion_query_result_t}).
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #BGFX_OCCLUSION_QUERY_RESULT_INVISIBLE OCCLUSION_QUERY_RESULT_INVISIBLE} - Query failed test.</li>
     * <li>{@link #BGFX_OCCLUSION_QUERY_RESULT_VISIBLE OCCLUSION_QUERY_RESULT_VISIBLE} - Query passed test.</li>
     * <li>{@link #BGFX_OCCLUSION_QUERY_RESULT_NORESULT OCCLUSION_QUERY_RESULT_NORESULT} - Query result is not available yet.</li>
     * <li>{@link #BGFX_OCCLUSION_QUERY_RESULT_COUNT OCCLUSION_QUERY_RESULT_COUNT}</li>
     * </ul>
     */
    public static final int
        BGFX_OCCLUSION_QUERY_RESULT_INVISIBLE = 0,
        BGFX_OCCLUSION_QUERY_RESULT_VISIBLE   = 1,
        BGFX_OCCLUSION_QUERY_RESULT_NORESULT  = 2,
        BGFX_OCCLUSION_QUERY_RESULT_COUNT     = 3;

    /**
     * Topology conversion function ({@code bgfx_topology_convert_t}).
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #BGFX_TOPOLOGY_CONVERT_TRI_LIST_FLIP_WINDING TOPOLOGY_CONVERT_TRI_LIST_FLIP_WINDING} - Flip winding order of triangle list.</li>
     * <li>{@link #BGFX_TOPOLOGY_CONVERT_TRI_LIST_TO_LINE_LIST TOPOLOGY_CONVERT_TRI_LIST_TO_LINE_LIST} - Convert triangle list to line list.</li>
     * <li>{@link #BGFX_TOPOLOGY_CONVERT_TRI_STRIP_TO_TRI_LIST TOPOLOGY_CONVERT_TRI_STRIP_TO_TRI_LIST} - Convert triangle strip to triangle list.</li>
     * <li>{@link #BGFX_TOPOLOGY_CONVERT_LINE_STRIP_TO_LINE_LIST TOPOLOGY_CONVERT_LINE_STRIP_TO_LINE_LIST} - Convert line strip to line list.</li>
     * <li>{@link #BGFX_TOPOLOGY_CONVERT_COUNT TOPOLOGY_CONVERT_COUNT}</li>
     * </ul>
     */
    public static final int
        BGFX_TOPOLOGY_CONVERT_TRI_LIST_FLIP_WINDING   = 0,
        BGFX_TOPOLOGY_CONVERT_TRI_LIST_TO_LINE_LIST   = 1,
        BGFX_TOPOLOGY_CONVERT_TRI_STRIP_TO_TRI_LIST   = 2,
        BGFX_TOPOLOGY_CONVERT_LINE_STRIP_TO_LINE_LIST = 3,
        BGFX_TOPOLOGY_CONVERT_COUNT                   = 4;

    /**
     * Topology sort order ({@code bgfx_topology_sort_t}).
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MIN TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MIN}</li>
     * <li>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_AVG TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_AVG}</li>
     * <li>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MAX TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MAX}</li>
     * <li>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MIN TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MIN}</li>
     * <li>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_AVG TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_AVG}</li>
     * <li>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MAX TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MAX}</li>
     * <li>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MIN TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MIN}</li>
     * <li>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_AVG TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_AVG}</li>
     * <li>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MAX TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MAX}</li>
     * <li>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MIN TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MIN}</li>
     * <li>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_AVG TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_AVG}</li>
     * <li>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MAX TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MAX}</li>
     * <li>{@link #BGFX_TOPOLOGY_SORT_COUNT TOPOLOGY_SORT_COUNT}</li>
     * </ul>
     */
    public static final int
        BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MIN = 0,
        BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_AVG = 1,
        BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MAX = 2,
        BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MIN = 3,
        BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_AVG = 4,
        BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MAX = 5,
        BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MIN  = 6,
        BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_AVG  = 7,
        BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MAX  = 8,
        BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MIN  = 9,
        BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_AVG  = 10,
        BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MAX  = 11,
        BGFX_TOPOLOGY_SORT_COUNT                       = 12;

    /**
     * View mode sets draw call sort order ({@code bgfx_view_mode_t}).
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #BGFX_VIEW_MODE_DEFAULT VIEW_MODE_DEFAULT} - Default sort order.</li>
     * <li>{@link #BGFX_VIEW_MODE_SEQUENTIAL VIEW_MODE_SEQUENTIAL} - Sort in the same order in which submit calls were called.</li>
     * <li>{@link #BGFX_VIEW_MODE_DEPTH_ASCENDING VIEW_MODE_DEPTH_ASCENDING} - Sort draw call depth in ascending order.</li>
     * <li>{@link #BGFX_VIEW_MODE_DEPTH_DESCENDING VIEW_MODE_DEPTH_DESCENDING} - Sort draw call depth in descending order.</li>
     * <li>{@link #BGFX_VIEW_MODE_CCOUNT VIEW_MODE_CCOUNT}</li>
     * </ul>
     */
    public static final int
        BGFX_VIEW_MODE_DEFAULT          = 0,
        BGFX_VIEW_MODE_SEQUENTIAL       = 1,
        BGFX_VIEW_MODE_DEPTH_ASCENDING  = 2,
        BGFX_VIEW_MODE_DEPTH_DESCENDING = 3,
        BGFX_VIEW_MODE_CCOUNT           = 4;

    /**
     * Fatal errors ({@code bgfx_fatal_t}).
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #BGFX_FATAL_DEBUG_CHECK FATAL_DEBUG_CHECK}</li>
     * <li>{@link #BGFX_FATAL_INVALID_SHADER FATAL_INVALID_SHADER}</li>
     * <li>{@link #BGFX_FATAL_UNABLE_TO_INITIALIZE FATAL_UNABLE_TO_INITIALIZE}</li>
     * <li>{@link #BGFX_FATAL_UNABLE_TO_CREATE_TEXTURE FATAL_UNABLE_TO_CREATE_TEXTURE}</li>
     * <li>{@link #BGFX_FATAL_DEVICE_LOST FATAL_DEVICE_LOST}</li>
     * <li>{@link #BGFX_FATAL_COUNT FATAL_COUNT}</li>
     * </ul>
     */
    public static final int
        BGFX_FATAL_DEBUG_CHECK              = 0,
        BGFX_FATAL_INVALID_SHADER           = 1,
        BGFX_FATAL_UNABLE_TO_INITIALIZE     = 2,
        BGFX_FATAL_UNABLE_TO_CREATE_TEXTURE = 3,
        BGFX_FATAL_DEVICE_LOST              = 4,
        BGFX_FATAL_COUNT                    = 5;

    /** Blend state macros */
    public static final long
        BGFX_STATE_BLEND_ADD         = BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_ONE, BGFX_STATE_BLEND_ONE),
        BGFX_STATE_BLEND_ALPHA       = BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_SRC_ALPHA, BGFX_STATE_BLEND_INV_SRC_ALPHA),
        BGFX_STATE_BLEND_DARKEN      = BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_ONE, BGFX_STATE_BLEND_ONE) | BGFX_STATE_BLEND_EQUATION(BGFX_STATE_BLEND_EQUATION_MIN),
        BGFX_STATE_BLEND_LIGHTEN     = BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_ONE, BGFX_STATE_BLEND_ONE) | BGFX_STATE_BLEND_EQUATION(BGFX_STATE_BLEND_EQUATION_MAX),
        BGFX_STATE_BLEND_MULTIPLY    = BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_DST_COLOR, BGFX_STATE_BLEND_ZERO),
        BGFX_STATE_BLEND_NORMAL      = BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_ONE, BGFX_STATE_BLEND_INV_SRC_ALPHA),
        BGFX_STATE_BLEND_SCREEN      = BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_ONE, BGFX_STATE_BLEND_INV_SRC_COLOR),
        BGFX_STATE_BLEND_LINEAR_BURN = BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_DST_COLOR, BGFX_STATE_BLEND_INV_DST_COLOR) | BGFX_STATE_BLEND_EQUATION(BGFX_STATE_BLEND_EQUATION_SUB);

    protected BGFX() {
        throw new UnsupportedOperationException();
    }

    private static final SharedLibrary BGFX = Library.loadNative(BGFX.class, Configuration.BGFX_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("bgfx")), true);

    /** Contains the function pointers loaded from the bgfx {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            vertex_decl_begin                                    = apiGetFunctionAddress(BGFX, "bgfx_vertex_decl_begin"),
            vertex_decl_add                                      = apiGetFunctionAddress(BGFX, "bgfx_vertex_decl_add"),
            vertex_decl_skip                                     = apiGetFunctionAddress(BGFX, "bgfx_vertex_decl_skip"),
            vertex_decl_end                                      = apiGetFunctionAddress(BGFX, "bgfx_vertex_decl_end"),
            vertex_pack                                          = apiGetFunctionAddress(BGFX, "bgfx_vertex_pack"),
            vertex_unpack                                        = apiGetFunctionAddress(BGFX, "bgfx_vertex_unpack"),
            vertex_convert                                       = apiGetFunctionAddress(BGFX, "bgfx_vertex_convert"),
            weld_vertices                                        = apiGetFunctionAddress(BGFX, "bgfx_weld_vertices"),
            topology_convert                                     = apiGetFunctionAddress(BGFX, "bgfx_topology_convert"),
            topology_sort_tri_list                               = apiGetFunctionAddress(BGFX, "bgfx_topology_sort_tri_list"),
            get_supported_renderers                              = apiGetFunctionAddress(BGFX, "bgfx_get_supported_renderers"),
            get_renderer_name                                    = apiGetFunctionAddress(BGFX, "bgfx_get_renderer_name"),
            init_ctor                                            = apiGetFunctionAddress(BGFX, "bgfx_init_ctor"),
            init                                                 = apiGetFunctionAddress(BGFX, "bgfx_init"),
            shutdown                                             = apiGetFunctionAddress(BGFX, "bgfx_shutdown"),
            reset                                                = apiGetFunctionAddress(BGFX, "bgfx_reset"),
            begin                                                = apiGetFunctionAddress(BGFX, "bgfx_begin"),
            end                                                  = apiGetFunctionAddress(BGFX, "bgfx_end"),
            frame                                                = apiGetFunctionAddress(BGFX, "bgfx_frame"),
            get_renderer_type                                    = apiGetFunctionAddress(BGFX, "bgfx_get_renderer_type"),
            get_caps                                             = apiGetFunctionAddress(BGFX, "bgfx_get_caps"),
            get_hmd                                              = apiGetFunctionAddress(BGFX, "bgfx_get_hmd"),
            get_stats                                            = apiGetFunctionAddress(BGFX, "bgfx_get_stats"),
            alloc                                                = apiGetFunctionAddress(BGFX, "bgfx_alloc"),
            copy                                                 = apiGetFunctionAddress(BGFX, "bgfx_copy"),
            make_ref                                             = apiGetFunctionAddress(BGFX, "bgfx_make_ref"),
            make_ref_release                                     = apiGetFunctionAddress(BGFX, "bgfx_make_ref_release"),
            set_debug                                            = apiGetFunctionAddress(BGFX, "bgfx_set_debug"),
            dbg_text_clear                                       = apiGetFunctionAddress(BGFX, "bgfx_dbg_text_clear"),
            dbg_text_printf                                      = apiGetFunctionAddress(BGFX, "bgfx_dbg_text_printf"),
            dbg_text_vprintf                                     = apiGetFunctionAddress(BGFX, "bgfx_dbg_text_vprintf"),
            dbg_text_image                                       = apiGetFunctionAddress(BGFX, "bgfx_dbg_text_image"),
            create_index_buffer                                  = apiGetFunctionAddress(BGFX, "bgfx_create_index_buffer"),
            destroy_index_buffer                                 = apiGetFunctionAddress(BGFX, "bgfx_destroy_index_buffer"),
            create_vertex_buffer                                 = apiGetFunctionAddress(BGFX, "bgfx_create_vertex_buffer"),
            destroy_vertex_buffer                                = apiGetFunctionAddress(BGFX, "bgfx_destroy_vertex_buffer"),
            create_dynamic_index_buffer                          = apiGetFunctionAddress(BGFX, "bgfx_create_dynamic_index_buffer"),
            create_dynamic_index_buffer_mem                      = apiGetFunctionAddress(BGFX, "bgfx_create_dynamic_index_buffer_mem"),
            update_dynamic_index_buffer                          = apiGetFunctionAddress(BGFX, "bgfx_update_dynamic_index_buffer"),
            destroy_dynamic_index_buffer                         = apiGetFunctionAddress(BGFX, "bgfx_destroy_dynamic_index_buffer"),
            create_dynamic_vertex_buffer                         = apiGetFunctionAddress(BGFX, "bgfx_create_dynamic_vertex_buffer"),
            create_dynamic_vertex_buffer_mem                     = apiGetFunctionAddress(BGFX, "bgfx_create_dynamic_vertex_buffer_mem"),
            update_dynamic_vertex_buffer                         = apiGetFunctionAddress(BGFX, "bgfx_update_dynamic_vertex_buffer"),
            destroy_dynamic_vertex_buffer                        = apiGetFunctionAddress(BGFX, "bgfx_destroy_dynamic_vertex_buffer"),
            get_avail_transient_index_buffer                     = apiGetFunctionAddress(BGFX, "bgfx_get_avail_transient_index_buffer"),
            get_avail_transient_vertex_buffer                    = apiGetFunctionAddress(BGFX, "bgfx_get_avail_transient_vertex_buffer"),
            get_avail_instance_data_buffer                       = apiGetFunctionAddress(BGFX, "bgfx_get_avail_instance_data_buffer"),
            alloc_transient_index_buffer                         = apiGetFunctionAddress(BGFX, "bgfx_alloc_transient_index_buffer"),
            alloc_transient_vertex_buffer                        = apiGetFunctionAddress(BGFX, "bgfx_alloc_transient_vertex_buffer"),
            alloc_transient_buffers                              = apiGetFunctionAddress(BGFX, "bgfx_alloc_transient_buffers"),
            alloc_instance_data_buffer                           = apiGetFunctionAddress(BGFX, "bgfx_alloc_instance_data_buffer"),
            create_indirect_buffer                               = apiGetFunctionAddress(BGFX, "bgfx_create_indirect_buffer"),
            destroy_indirect_buffer                              = apiGetFunctionAddress(BGFX, "bgfx_destroy_indirect_buffer"),
            create_shader                                        = apiGetFunctionAddress(BGFX, "bgfx_create_shader"),
            get_shader_uniforms                                  = apiGetFunctionAddress(BGFX, "bgfx_get_shader_uniforms"),
            set_shader_name                                      = apiGetFunctionAddress(BGFX, "bgfx_set_shader_name"),
            destroy_shader                                       = apiGetFunctionAddress(BGFX, "bgfx_destroy_shader"),
            create_program                                       = apiGetFunctionAddress(BGFX, "bgfx_create_program"),
            create_compute_program                               = apiGetFunctionAddress(BGFX, "bgfx_create_compute_program"),
            destroy_program                                      = apiGetFunctionAddress(BGFX, "bgfx_destroy_program"),
            is_texture_valid                                     = apiGetFunctionAddress(BGFX, "bgfx_is_texture_valid"),
            calc_texture_size                                    = apiGetFunctionAddress(BGFX, "bgfx_calc_texture_size"),
            create_texture                                       = apiGetFunctionAddress(BGFX, "bgfx_create_texture"),
            create_texture_2d                                    = apiGetFunctionAddress(BGFX, "bgfx_create_texture_2d"),
            create_texture_2d_scaled                             = apiGetFunctionAddress(BGFX, "bgfx_create_texture_2d_scaled"),
            create_texture_3d                                    = apiGetFunctionAddress(BGFX, "bgfx_create_texture_3d"),
            create_texture_cube                                  = apiGetFunctionAddress(BGFX, "bgfx_create_texture_cube"),
            update_texture_2d                                    = apiGetFunctionAddress(BGFX, "bgfx_update_texture_2d"),
            update_texture_3d                                    = apiGetFunctionAddress(BGFX, "bgfx_update_texture_3d"),
            update_texture_cube                                  = apiGetFunctionAddress(BGFX, "bgfx_update_texture_cube"),
            read_texture                                         = apiGetFunctionAddress(BGFX, "bgfx_read_texture"),
            set_texture_name                                     = apiGetFunctionAddress(BGFX, "bgfx_set_texture_name"),
            get_direct_access_ptr                                = apiGetFunctionAddress(BGFX, "bgfx_get_direct_access_ptr"),
            destroy_texture                                      = apiGetFunctionAddress(BGFX, "bgfx_destroy_texture"),
            create_frame_buffer                                  = apiGetFunctionAddress(BGFX, "bgfx_create_frame_buffer"),
            create_frame_buffer_scaled                           = apiGetFunctionAddress(BGFX, "bgfx_create_frame_buffer_scaled"),
            create_frame_buffer_from_handles                     = apiGetFunctionAddress(BGFX, "bgfx_create_frame_buffer_from_handles"),
            create_frame_buffer_from_attachment                  = apiGetFunctionAddress(BGFX, "bgfx_create_frame_buffer_from_attachment"),
            create_frame_buffer_from_nwh                         = apiGetFunctionAddress(BGFX, "bgfx_create_frame_buffer_from_nwh"),
            get_texture                                          = apiGetFunctionAddress(BGFX, "bgfx_get_texture"),
            destroy_frame_buffer                                 = apiGetFunctionAddress(BGFX, "bgfx_destroy_frame_buffer"),
            create_uniform                                       = apiGetFunctionAddress(BGFX, "bgfx_create_uniform"),
            get_uniform_info                                     = apiGetFunctionAddress(BGFX, "bgfx_get_uniform_info"),
            destroy_uniform                                      = apiGetFunctionAddress(BGFX, "bgfx_destroy_uniform"),
            create_occlusion_query                               = apiGetFunctionAddress(BGFX, "bgfx_create_occlusion_query"),
            get_result                                           = apiGetFunctionAddress(BGFX, "bgfx_get_result"),
            destroy_occlusion_query                              = apiGetFunctionAddress(BGFX, "bgfx_destroy_occlusion_query"),
            set_palette_color                                    = apiGetFunctionAddress(BGFX, "bgfx_set_palette_color"),
            set_view_name                                        = apiGetFunctionAddress(BGFX, "bgfx_set_view_name"),
            set_view_rect                                        = apiGetFunctionAddress(BGFX, "bgfx_set_view_rect"),
            set_view_rect_auto                                   = apiGetFunctionAddress(BGFX, "bgfx_set_view_rect_auto"),
            set_view_scissor                                     = apiGetFunctionAddress(BGFX, "bgfx_set_view_scissor"),
            set_view_clear                                       = apiGetFunctionAddress(BGFX, "bgfx_set_view_clear"),
            set_view_clear_mrt                                   = apiGetFunctionAddress(BGFX, "bgfx_set_view_clear_mrt"),
            set_view_mode                                        = apiGetFunctionAddress(BGFX, "bgfx_set_view_mode"),
            set_view_frame_buffer                                = apiGetFunctionAddress(BGFX, "bgfx_set_view_frame_buffer"),
            set_view_transform                                   = apiGetFunctionAddress(BGFX, "bgfx_set_view_transform"),
            set_view_transform_stereo                            = apiGetFunctionAddress(BGFX, "bgfx_set_view_transform_stereo"),
            set_view_order                                       = apiGetFunctionAddress(BGFX, "bgfx_set_view_order"),
            reset_view                                           = apiGetFunctionAddress(BGFX, "bgfx_reset_view"),
            set_marker                                           = apiGetFunctionAddress(BGFX, "bgfx_set_marker"),
            set_state                                            = apiGetFunctionAddress(BGFX, "bgfx_set_state"),
            set_condition                                        = apiGetFunctionAddress(BGFX, "bgfx_set_condition"),
            set_stencil                                          = apiGetFunctionAddress(BGFX, "bgfx_set_stencil"),
            set_scissor                                          = apiGetFunctionAddress(BGFX, "bgfx_set_scissor"),
            set_scissor_cached                                   = apiGetFunctionAddress(BGFX, "bgfx_set_scissor_cached"),
            set_transform                                        = apiGetFunctionAddress(BGFX, "bgfx_set_transform"),
            alloc_transform                                      = apiGetFunctionAddress(BGFX, "bgfx_alloc_transform"),
            set_transform_cached                                 = apiGetFunctionAddress(BGFX, "bgfx_set_transform_cached"),
            set_uniform                                          = apiGetFunctionAddress(BGFX, "bgfx_set_uniform"),
            set_index_buffer                                     = apiGetFunctionAddress(BGFX, "bgfx_set_index_buffer"),
            set_dynamic_index_buffer                             = apiGetFunctionAddress(BGFX, "bgfx_set_dynamic_index_buffer"),
            set_transient_index_buffer                           = apiGetFunctionAddress(BGFX, "bgfx_set_transient_index_buffer"),
            set_vertex_buffer                                    = apiGetFunctionAddress(BGFX, "bgfx_set_vertex_buffer"),
            set_dynamic_vertex_buffer                            = apiGetFunctionAddress(BGFX, "bgfx_set_dynamic_vertex_buffer"),
            set_transient_vertex_buffer                          = apiGetFunctionAddress(BGFX, "bgfx_set_transient_vertex_buffer"),
            set_instance_data_buffer                             = apiGetFunctionAddress(BGFX, "bgfx_set_instance_data_buffer"),
            set_instance_data_from_vertex_buffer                 = apiGetFunctionAddress(BGFX, "bgfx_set_instance_data_from_vertex_buffer"),
            set_instance_data_from_dynamic_vertex_buffer         = apiGetFunctionAddress(BGFX, "bgfx_set_instance_data_from_dynamic_vertex_buffer"),
            set_texture                                          = apiGetFunctionAddress(BGFX, "bgfx_set_texture"),
            touch                                                = apiGetFunctionAddress(BGFX, "bgfx_touch"),
            submit                                               = apiGetFunctionAddress(BGFX, "bgfx_submit"),
            submit_occlusion_query                               = apiGetFunctionAddress(BGFX, "bgfx_submit_occlusion_query"),
            submit_indirect                                      = apiGetFunctionAddress(BGFX, "bgfx_submit_indirect"),
            set_image                                            = apiGetFunctionAddress(BGFX, "bgfx_set_image"),
            set_compute_index_buffer                             = apiGetFunctionAddress(BGFX, "bgfx_set_compute_index_buffer"),
            set_compute_vertex_buffer                            = apiGetFunctionAddress(BGFX, "bgfx_set_compute_vertex_buffer"),
            set_compute_dynamic_index_buffer                     = apiGetFunctionAddress(BGFX, "bgfx_set_compute_dynamic_index_buffer"),
            set_compute_dynamic_vertex_buffer                    = apiGetFunctionAddress(BGFX, "bgfx_set_compute_dynamic_vertex_buffer"),
            set_compute_indirect_buffer                          = apiGetFunctionAddress(BGFX, "bgfx_set_compute_indirect_buffer"),
            dispatch                                             = apiGetFunctionAddress(BGFX, "bgfx_dispatch"),
            dispatch_indirect                                    = apiGetFunctionAddress(BGFX, "bgfx_dispatch_indirect"),
            discard                                              = apiGetFunctionAddress(BGFX, "bgfx_discard"),
            blit                                                 = apiGetFunctionAddress(BGFX, "bgfx_blit"),
            encoder_set_marker                                   = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_marker"),
            encoder_set_state                                    = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_state"),
            encoder_set_condition                                = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_condition"),
            encoder_set_stencil                                  = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_stencil"),
            encoder_set_scissor                                  = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_scissor"),
            encoder_set_scissor_cached                           = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_scissor_cached"),
            encoder_set_transform                                = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_transform"),
            encoder_alloc_transform                              = apiGetFunctionAddress(BGFX, "bgfx_encoder_alloc_transform"),
            encoder_set_transform_cached                         = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_transform_cached"),
            encoder_set_uniform                                  = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_uniform"),
            encoder_set_index_buffer                             = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_index_buffer"),
            encoder_set_dynamic_index_buffer                     = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_dynamic_index_buffer"),
            encoder_set_transient_index_buffer                   = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_transient_index_buffer"),
            encoder_set_vertex_buffer                            = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_vertex_buffer"),
            encoder_set_dynamic_vertex_buffer                    = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_dynamic_vertex_buffer"),
            encoder_set_transient_vertex_buffer                  = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_transient_vertex_buffer"),
            encoder_set_instance_data_buffer                     = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_instance_data_buffer"),
            encoder_set_instance_data_from_vertex_buffer         = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_instance_data_from_vertex_buffer"),
            encoder_set_instance_data_from_dynamic_vertex_buffer = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_instance_data_from_dynamic_vertex_buffer"),
            encoder_set_texture                                  = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_texture"),
            encoder_touch                                        = apiGetFunctionAddress(BGFX, "bgfx_encoder_touch"),
            encoder_submit                                       = apiGetFunctionAddress(BGFX, "bgfx_encoder_submit"),
            encoder_submit_occlusion_query                       = apiGetFunctionAddress(BGFX, "bgfx_encoder_submit_occlusion_query"),
            encoder_submit_indirect                              = apiGetFunctionAddress(BGFX, "bgfx_encoder_submit_indirect"),
            encoder_set_image                                    = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_image"),
            encoder_set_compute_index_buffer                     = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_compute_index_buffer"),
            encoder_set_compute_vertex_buffer                    = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_compute_vertex_buffer"),
            encoder_set_compute_dynamic_index_buffer             = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_compute_dynamic_index_buffer"),
            encoder_set_compute_dynamic_vertex_buffer            = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_compute_dynamic_vertex_buffer"),
            encoder_set_compute_indirect_buffer                  = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_compute_indirect_buffer"),
            encoder_dispatch                                     = apiGetFunctionAddress(BGFX, "bgfx_encoder_dispatch"),
            encoder_dispatch_indirect                            = apiGetFunctionAddress(BGFX, "bgfx_encoder_dispatch_indirect"),
            encoder_discard                                      = apiGetFunctionAddress(BGFX, "bgfx_encoder_discard"),
            encoder_blit                                         = apiGetFunctionAddress(BGFX, "bgfx_encoder_blit"),
            request_screen_shot                                  = apiGetFunctionAddress(BGFX, "bgfx_request_screen_shot");

    }

    /** Returns the bgfx {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return BGFX;
    }

    // --- [ bgfx_vertex_decl_begin ] ---

    /** Unsafe version of: {@link #bgfx_vertex_decl_begin vertex_decl_begin} */
    public static void nbgfx_vertex_decl_begin(long _decl, int _renderer) {
        long __functionAddress = Functions.vertex_decl_begin;
        invokePV(__functionAddress, _decl, _renderer);
    }

    /**
     * Start a vertex declaration.
     *
     * @param _decl     the vertex declaration
     * @param _renderer the renderer type. One of:<br><table><tr><td>{@link #BGFX_RENDERER_TYPE_NOOP RENDERER_TYPE_NOOP}</td><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D9 RENDERER_TYPE_DIRECT3D9}</td><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D11 RENDERER_TYPE_DIRECT3D11}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D12 RENDERER_TYPE_DIRECT3D12}</td><td>{@link #BGFX_RENDERER_TYPE_GNM RENDERER_TYPE_GNM}</td><td>{@link #BGFX_RENDERER_TYPE_METAL RENDERER_TYPE_METAL}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_OPENGLES RENDERER_TYPE_OPENGLES}</td><td>{@link #BGFX_RENDERER_TYPE_OPENGL RENDERER_TYPE_OPENGL}</td><td>{@link #BGFX_RENDERER_TYPE_VULKAN RENDERER_TYPE_VULKAN}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_COUNT RENDERER_TYPE_COUNT}</td></tr></table>
     */
    public static void bgfx_vertex_decl_begin(@NativeType("bgfx_vertex_decl_t *") BGFXVertexDecl _decl, @NativeType("bgfx_renderer_type_t") int _renderer) {
        nbgfx_vertex_decl_begin(_decl.address(), _renderer);
    }

    // --- [ bgfx_vertex_decl_add ] ---

    /** Unsafe version of: {@link #bgfx_vertex_decl_add vertex_decl_add} */
    public static void nbgfx_vertex_decl_add(long _decl, int _attrib, byte _num, int _type, boolean _normalized, boolean _asInt) {
        long __functionAddress = Functions.vertex_decl_add;
        invokePV(__functionAddress, _decl, _attrib, _num, _type, _normalized, _asInt);
    }

    /**
     * Adds attribute to a vertex declaration.
     * 
     * <p>Must be called between {@link #bgfx_vertex_decl_begin vertex_decl_begin}/{@link #bgfx_vertex_decl_end vertex_decl_end}.</p>
     *
     * @param _decl       the vertex declaration
     * @param _attrib     attribute semantics. One of:<br><table><tr><td>{@link #BGFX_ATTRIB_POSITION ATTRIB_POSITION}</td><td>{@link #BGFX_ATTRIB_NORMAL ATTRIB_NORMAL}</td><td>{@link #BGFX_ATTRIB_TANGENT ATTRIB_TANGENT}</td><td>{@link #BGFX_ATTRIB_BITANGENT ATTRIB_BITANGENT}</td><td>{@link #BGFX_ATTRIB_COLOR0 ATTRIB_COLOR0}</td></tr><tr><td>{@link #BGFX_ATTRIB_COLOR1 ATTRIB_COLOR1}</td><td>{@link #BGFX_ATTRIB_COLOR2 ATTRIB_COLOR2}</td><td>{@link #BGFX_ATTRIB_COLOR3 ATTRIB_COLOR3}</td><td>{@link #BGFX_ATTRIB_INDICES ATTRIB_INDICES}</td><td>{@link #BGFX_ATTRIB_WEIGHT ATTRIB_WEIGHT}</td></tr><tr><td>{@link #BGFX_ATTRIB_TEXCOORD0 ATTRIB_TEXCOORD0}</td><td>{@link #BGFX_ATTRIB_TEXCOORD1 ATTRIB_TEXCOORD1}</td><td>{@link #BGFX_ATTRIB_TEXCOORD2 ATTRIB_TEXCOORD2}</td><td>{@link #BGFX_ATTRIB_TEXCOORD3 ATTRIB_TEXCOORD3}</td><td>{@link #BGFX_ATTRIB_TEXCOORD4 ATTRIB_TEXCOORD4}</td></tr><tr><td>{@link #BGFX_ATTRIB_TEXCOORD5 ATTRIB_TEXCOORD5}</td><td>{@link #BGFX_ATTRIB_TEXCOORD6 ATTRIB_TEXCOORD6}</td><td>{@link #BGFX_ATTRIB_TEXCOORD7 ATTRIB_TEXCOORD7}</td></tr></table>
     * @param _num        number of elements. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
     * @param _type       element type. One of:<br><table><tr><td>{@link #BGFX_ATTRIB_TYPE_UINT8 ATTRIB_TYPE_UINT8}</td><td>{@link #BGFX_ATTRIB_TYPE_UINT10 ATTRIB_TYPE_UINT10}</td><td>{@link #BGFX_ATTRIB_TYPE_INT16 ATTRIB_TYPE_INT16}</td><td>{@link #BGFX_ATTRIB_TYPE_HALF ATTRIB_TYPE_HALF}</td></tr><tr><td>{@link #BGFX_ATTRIB_TYPE_FLOAT ATTRIB_TYPE_FLOAT}</td><td>{@link #BGFX_ATTRIB_TYPE_COUNT ATTRIB_TYPE_COUNT}</td></tr></table>
     * @param _normalized when using fixed point attribute type (f.e. {@link #BGFX_ATTRIB_TYPE_UINT8 ATTRIB_TYPE_UINT8}) value will be normalized for vertex shader usage. When {@code normalized} is set to
     *                    true, {@link #BGFX_ATTRIB_TYPE_UINT8 ATTRIB_TYPE_UINT8} value in range 0-255 will be in range 0.0-1.0 in vertex shader.
     * @param _asInt      packaging rule for {@code vertexPack}, {@code vertexUnpack}, and {@code vertexConvert} for {@link #BGFX_ATTRIB_TYPE_UINT8 ATTRIB_TYPE_UINT8} and {@link #BGFX_ATTRIB_TYPE_INT16 ATTRIB_TYPE_INT16}. Unpacking
     *                    code must be implemented inside vertex shader.
     */
    public static void bgfx_vertex_decl_add(@NativeType("bgfx_vertex_decl_t *") BGFXVertexDecl _decl, @NativeType("bgfx_attrib_t") int _attrib, @NativeType("uint8_t") int _num, @NativeType("bgfx_attrib_type_t") int _type, @NativeType("bool") boolean _normalized, @NativeType("bool") boolean _asInt) {
        nbgfx_vertex_decl_add(_decl.address(), _attrib, (byte)_num, _type, _normalized, _asInt);
    }

    // --- [ bgfx_vertex_decl_skip ] ---

    /** Unsafe version of: {@link #bgfx_vertex_decl_skip vertex_decl_skip} */
    public static void nbgfx_vertex_decl_skip(long _decl, byte _num) {
        long __functionAddress = Functions.vertex_decl_skip;
        invokePV(__functionAddress, _decl, _num);
    }

    /**
     * Skips {@code _num} bytes in vertex stream.
     *
     * @param _decl the vertex declaration
     * @param _num  the number of bytes to skip
     */
    public static void bgfx_vertex_decl_skip(@NativeType("bgfx_vertex_decl_t *") BGFXVertexDecl _decl, @NativeType("uint8_t") int _num) {
        nbgfx_vertex_decl_skip(_decl.address(), (byte)_num);
    }

    // --- [ bgfx_vertex_decl_end ] ---

    /** Unsafe version of: {@link #bgfx_vertex_decl_end vertex_decl_end} */
    public static void nbgfx_vertex_decl_end(long _decl) {
        long __functionAddress = Functions.vertex_decl_end;
        invokePV(__functionAddress, _decl);
    }

    /**
     * Ends a vertex declaration.
     *
     * @param _decl the vertex declaration
     */
    public static void bgfx_vertex_decl_end(@NativeType("bgfx_vertex_decl_t *") BGFXVertexDecl _decl) {
        nbgfx_vertex_decl_end(_decl.address());
    }

    // --- [ bgfx_vertex_pack ] ---

    /** Unsafe version of: {@link #bgfx_vertex_pack vertex_pack} */
    public static void nbgfx_vertex_pack(long _input, boolean _inputNormalized, int _attr, long _decl, long _data, int _index) {
        long __functionAddress = Functions.vertex_pack;
        invokePPPV(__functionAddress, _input, _inputNormalized, _attr, _decl, _data, _index);
    }

    /**
     * Packs vertex attribute into vertex stream format.
     *
     * @param _input           value to be packed into vertex stream
     * @param _inputNormalized true if input value is already normalized
     * @param _attr            attribute to pack. One of:<br><table><tr><td>{@link #BGFX_ATTRIB_POSITION ATTRIB_POSITION}</td><td>{@link #BGFX_ATTRIB_NORMAL ATTRIB_NORMAL}</td><td>{@link #BGFX_ATTRIB_TANGENT ATTRIB_TANGENT}</td><td>{@link #BGFX_ATTRIB_BITANGENT ATTRIB_BITANGENT}</td><td>{@link #BGFX_ATTRIB_COLOR0 ATTRIB_COLOR0}</td></tr><tr><td>{@link #BGFX_ATTRIB_COLOR1 ATTRIB_COLOR1}</td><td>{@link #BGFX_ATTRIB_COLOR2 ATTRIB_COLOR2}</td><td>{@link #BGFX_ATTRIB_COLOR3 ATTRIB_COLOR3}</td><td>{@link #BGFX_ATTRIB_INDICES ATTRIB_INDICES}</td><td>{@link #BGFX_ATTRIB_WEIGHT ATTRIB_WEIGHT}</td></tr><tr><td>{@link #BGFX_ATTRIB_TEXCOORD0 ATTRIB_TEXCOORD0}</td><td>{@link #BGFX_ATTRIB_TEXCOORD1 ATTRIB_TEXCOORD1}</td><td>{@link #BGFX_ATTRIB_TEXCOORD2 ATTRIB_TEXCOORD2}</td><td>{@link #BGFX_ATTRIB_TEXCOORD3 ATTRIB_TEXCOORD3}</td><td>{@link #BGFX_ATTRIB_TEXCOORD4 ATTRIB_TEXCOORD4}</td></tr><tr><td>{@link #BGFX_ATTRIB_TEXCOORD5 ATTRIB_TEXCOORD5}</td><td>{@link #BGFX_ATTRIB_TEXCOORD6 ATTRIB_TEXCOORD6}</td><td>{@link #BGFX_ATTRIB_TEXCOORD7 ATTRIB_TEXCOORD7}</td></tr></table>
     * @param _decl            vertex stream declaration
     * @param _data            destination vertex stream where data will be packed
     * @param _index           vertex index that will be modified
     */
    public static void bgfx_vertex_pack(@NativeType("float const *") FloatBuffer _input, @NativeType("bool") boolean _inputNormalized, @NativeType("bgfx_attrib_t") int _attr, @NativeType("bgfx_vertex_decl_t const *") BGFXVertexDecl _decl, @NativeType("void *") ByteBuffer _data, @NativeType("uint32_t") int _index) {
        if (CHECKS) {
            check(_input, 4);
        }
        nbgfx_vertex_pack(memAddress(_input), _inputNormalized, _attr, _decl.address(), memAddress(_data), _index);
    }

    // --- [ bgfx_vertex_unpack ] ---

    /** Unsafe version of: {@link #bgfx_vertex_unpack vertex_unpack} */
    public static void nbgfx_vertex_unpack(long _output, int _attr, long _decl, long _data, int _index) {
        long __functionAddress = Functions.vertex_unpack;
        invokePPPV(__functionAddress, _output, _attr, _decl, _data, _index);
    }

    /**
     * Unpacks vertex attribute from vertex stream format.
     *
     * @param _output result of unpacking
     * @param _attr   attribute to unpack. One of:<br><table><tr><td>{@link #BGFX_ATTRIB_POSITION ATTRIB_POSITION}</td><td>{@link #BGFX_ATTRIB_NORMAL ATTRIB_NORMAL}</td><td>{@link #BGFX_ATTRIB_TANGENT ATTRIB_TANGENT}</td><td>{@link #BGFX_ATTRIB_BITANGENT ATTRIB_BITANGENT}</td><td>{@link #BGFX_ATTRIB_COLOR0 ATTRIB_COLOR0}</td></tr><tr><td>{@link #BGFX_ATTRIB_COLOR1 ATTRIB_COLOR1}</td><td>{@link #BGFX_ATTRIB_COLOR2 ATTRIB_COLOR2}</td><td>{@link #BGFX_ATTRIB_COLOR3 ATTRIB_COLOR3}</td><td>{@link #BGFX_ATTRIB_INDICES ATTRIB_INDICES}</td><td>{@link #BGFX_ATTRIB_WEIGHT ATTRIB_WEIGHT}</td></tr><tr><td>{@link #BGFX_ATTRIB_TEXCOORD0 ATTRIB_TEXCOORD0}</td><td>{@link #BGFX_ATTRIB_TEXCOORD1 ATTRIB_TEXCOORD1}</td><td>{@link #BGFX_ATTRIB_TEXCOORD2 ATTRIB_TEXCOORD2}</td><td>{@link #BGFX_ATTRIB_TEXCOORD3 ATTRIB_TEXCOORD3}</td><td>{@link #BGFX_ATTRIB_TEXCOORD4 ATTRIB_TEXCOORD4}</td></tr><tr><td>{@link #BGFX_ATTRIB_TEXCOORD5 ATTRIB_TEXCOORD5}</td><td>{@link #BGFX_ATTRIB_TEXCOORD6 ATTRIB_TEXCOORD6}</td><td>{@link #BGFX_ATTRIB_TEXCOORD7 ATTRIB_TEXCOORD7}</td></tr></table>
     * @param _decl   vertex stream declaration
     * @param _data   source vertex stream from where data will be unpacked
     * @param _index  vertex index that will be unpacked
     */
    public static void bgfx_vertex_unpack(@NativeType("float *") FloatBuffer _output, @NativeType("bgfx_attrib_t") int _attr, @NativeType("bgfx_vertex_decl_t const *") BGFXVertexDecl _decl, @NativeType("void const *") ByteBuffer _data, @NativeType("uint32_t") int _index) {
        if (CHECKS) {
            check(_output, 4);
        }
        nbgfx_vertex_unpack(memAddress(_output), _attr, _decl.address(), memAddress(_data), _index);
    }

    // --- [ bgfx_vertex_convert ] ---

    /** Unsafe version of: {@link #bgfx_vertex_convert vertex_convert} */
    public static void nbgfx_vertex_convert(long _destDecl, long _destData, long _srcDecl, long _srcData, int _num) {
        long __functionAddress = Functions.vertex_convert;
        invokePPPPV(__functionAddress, _destDecl, _destData, _srcDecl, _srcData, _num);
    }

    /**
     * Converts vertex stream data from one vertex stream format to another.
     *
     * @param _destDecl destination vertex stream declaration
     * @param _destData destination vertex stream
     * @param _srcDecl  source vertex stream declaration
     * @param _srcData  source vertex stream data
     * @param _num      number of vertices to convert from source to destination
     */
    public static void bgfx_vertex_convert(@NativeType("bgfx_vertex_decl_t const *") BGFXVertexDecl _destDecl, @NativeType("void *") ByteBuffer _destData, @NativeType("bgfx_vertex_decl_t const *") BGFXVertexDecl _srcDecl, @NativeType("void const *") ByteBuffer _srcData, @NativeType("uint32_t") int _num) {
        nbgfx_vertex_convert(_destDecl.address(), memAddress(_destData), _srcDecl.address(), memAddress(_srcData), _num);
    }

    // --- [ bgfx_weld_vertices ] ---

    /**
     * Unsafe version of: {@link #bgfx_weld_vertices weld_vertices}
     *
     * @param _num number of vertices in vertex stream
     */
    public static short nbgfx_weld_vertices(long _output, long _decl, long _data, short _num, float _epsilon) {
        long __functionAddress = Functions.weld_vertices;
        return invokePPPS(__functionAddress, _output, _decl, _data, _num, _epsilon);
    }

    /**
     * Welds vertices.
     *
     * @param _output  welded vertices remapping table. The size of buffer be the same as number of vertices.
     * @param _decl    vertex stream declaration
     * @param _data    vertex stream
     * @param _epsilon error tolerance for vertex position comparison
     *
     * @return number of unique vertices after vertex welding
     */
    @NativeType("uint16_t")
    public static short bgfx_weld_vertices(@NativeType("uint16_t *") ShortBuffer _output, @NativeType("bgfx_vertex_decl_t const *") BGFXVertexDecl _decl, @NativeType("void const *") ByteBuffer _data, float _epsilon) {
        return nbgfx_weld_vertices(memAddress(_output), _decl.address(), memAddress(_data), (short)_output.remaining(), _epsilon);
    }

    // --- [ bgfx_topology_convert ] ---

    /**
     * Unsafe version of: {@link #bgfx_topology_convert topology_convert}
     *
     * @param _dstSize    destination index buffer in bytes. It must be large enough to contain output indices. If destination size is insufficient index buffer will be
     *                    truncated.
     * @param _numIndices number of input indices
     */
    public static int nbgfx_topology_convert(int _conversion, long _dst, int _dstSize, long _indices, int _numIndices, boolean _index32) {
        long __functionAddress = Functions.topology_convert;
        return invokePPI(__functionAddress, _conversion, _dst, _dstSize, _indices, _numIndices, _index32);
    }

    /**
     * Converts index buffer for use with different primitive topologies.
     *
     * @param _conversion conversion type. One of:<br><table><tr><td>{@link #BGFX_TOPOLOGY_CONVERT_TRI_LIST_FLIP_WINDING TOPOLOGY_CONVERT_TRI_LIST_FLIP_WINDING}</td><td>{@link #BGFX_TOPOLOGY_CONVERT_TRI_LIST_TO_LINE_LIST TOPOLOGY_CONVERT_TRI_LIST_TO_LINE_LIST}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_CONVERT_TRI_STRIP_TO_TRI_LIST TOPOLOGY_CONVERT_TRI_STRIP_TO_TRI_LIST}</td><td>{@link #BGFX_TOPOLOGY_CONVERT_LINE_STRIP_TO_LINE_LIST TOPOLOGY_CONVERT_LINE_STRIP_TO_LINE_LIST}</td></tr></table>
     * @param _dst        destination index buffer. If this argument is {@code NULL} function will return number of indices after conversion
     * @param _indices    source indices
     * @param _index32    set to `true` if input indices are 32-bit
     *
     * @return number of output indices after conversion
     */
    @NativeType("uint32_t")
    public static int bgfx_topology_convert(@NativeType("bgfx_topology_convert_t") int _conversion, @Nullable @NativeType("void *") ByteBuffer _dst, @NativeType("void const *") ByteBuffer _indices, @NativeType("bool") boolean _index32) {
        return nbgfx_topology_convert(_conversion, memAddressSafe(_dst), remainingSafe(_dst), memAddress(_indices), _indices.remaining() >> (_index32 ? 2 : 1), _index32);
    }

    /**
     * Converts index buffer for use with different primitive topologies.
     *
     * @param _conversion conversion type. One of:<br><table><tr><td>{@link #BGFX_TOPOLOGY_CONVERT_TRI_LIST_FLIP_WINDING TOPOLOGY_CONVERT_TRI_LIST_FLIP_WINDING}</td><td>{@link #BGFX_TOPOLOGY_CONVERT_TRI_LIST_TO_LINE_LIST TOPOLOGY_CONVERT_TRI_LIST_TO_LINE_LIST}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_CONVERT_TRI_STRIP_TO_TRI_LIST TOPOLOGY_CONVERT_TRI_STRIP_TO_TRI_LIST}</td><td>{@link #BGFX_TOPOLOGY_CONVERT_LINE_STRIP_TO_LINE_LIST TOPOLOGY_CONVERT_LINE_STRIP_TO_LINE_LIST}</td></tr></table>
     * @param _dst        destination index buffer. If this argument is {@code NULL} function will return number of indices after conversion
     * @param _indices    source indices
     * @param _index32    set to `true` if input indices are 32-bit
     *
     * @return number of output indices after conversion
     */
    @NativeType("uint32_t")
    public static int bgfx_topology_convert(@NativeType("bgfx_topology_convert_t") int _conversion, @Nullable @NativeType("void *") ShortBuffer _dst, @NativeType("void const *") ShortBuffer _indices, @NativeType("bool") boolean _index32) {
        return nbgfx_topology_convert(_conversion, memAddressSafe(_dst), remainingSafe(_dst) << 1, memAddress(_indices), (int)(((long)_indices.remaining() << 1) >> (_index32 ? 2 : 1)), _index32);
    }

    /**
     * Converts index buffer for use with different primitive topologies.
     *
     * @param _conversion conversion type. One of:<br><table><tr><td>{@link #BGFX_TOPOLOGY_CONVERT_TRI_LIST_FLIP_WINDING TOPOLOGY_CONVERT_TRI_LIST_FLIP_WINDING}</td><td>{@link #BGFX_TOPOLOGY_CONVERT_TRI_LIST_TO_LINE_LIST TOPOLOGY_CONVERT_TRI_LIST_TO_LINE_LIST}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_CONVERT_TRI_STRIP_TO_TRI_LIST TOPOLOGY_CONVERT_TRI_STRIP_TO_TRI_LIST}</td><td>{@link #BGFX_TOPOLOGY_CONVERT_LINE_STRIP_TO_LINE_LIST TOPOLOGY_CONVERT_LINE_STRIP_TO_LINE_LIST}</td></tr></table>
     * @param _dst        destination index buffer. If this argument is {@code NULL} function will return number of indices after conversion
     * @param _indices    source indices
     * @param _index32    set to `true` if input indices are 32-bit
     *
     * @return number of output indices after conversion
     */
    @NativeType("uint32_t")
    public static int bgfx_topology_convert(@NativeType("bgfx_topology_convert_t") int _conversion, @Nullable @NativeType("void *") IntBuffer _dst, @NativeType("void const *") IntBuffer _indices, @NativeType("bool") boolean _index32) {
        return nbgfx_topology_convert(_conversion, memAddressSafe(_dst), remainingSafe(_dst) << 2, memAddress(_indices), (int)(((long)_indices.remaining() << 2) >> (_index32 ? 2 : 1)), _index32);
    }

    // --- [ bgfx_topology_sort_tri_list ] ---

    /**
     * Unsafe version of: {@link #bgfx_topology_sort_tri_list topology_sort_tri_list}
     *
     * @param _dstSize    destination index buffer in bytes. It must be large enough to contain output indices. If destination size is insufficient index buffer will be
     *                    truncated.
     * @param _numIndices number of input indices
     */
    public static void nbgfx_topology_sort_tri_list(int _sort, long _dst, int _dstSize, long _dir, long _pos, long _vertices, int _stride, long _indices, int _numIndices, boolean _index32) {
        long __functionAddress = Functions.topology_sort_tri_list;
        invokePPPPPV(__functionAddress, _sort, _dst, _dstSize, _dir, _pos, _vertices, _stride, _indices, _numIndices, _index32);
    }

    /**
     * Sorts indices.
     *
     * @param _sort     sort order. One of:<br><table><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MIN TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MIN}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_AVG TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_AVG}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MAX TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MAX}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MIN TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MIN}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_AVG TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_AVG}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MAX TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MAX}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MIN TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MIN}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_AVG TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_AVG}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MAX TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MAX}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MIN TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MIN}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_AVG TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_AVG}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MAX TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MAX}</td></tr></table>
     * @param _dst      destination index buffer
     * @param _dir      direction (vector must be normalized)
     * @param _pos      position
     * @param _vertices pointer to first vertex represented as float x, y, z. Must contain at least number of vertices referenced by index buffer.
     * @param _stride   vertex stride
     * @param _indices  source indices
     * @param _index32  set to `true` if input indices are 32-bit
     */
    public static void bgfx_topology_sort_tri_list(@NativeType("bgfx_topology_sort_t") int _sort, @NativeType("void *") ByteBuffer _dst, @NativeType("float const *") FloatBuffer _dir, @NativeType("float const *") FloatBuffer _pos, @NativeType("void const *") ByteBuffer _vertices, @NativeType("uint32_t") int _stride, @NativeType("void const *") ByteBuffer _indices, @NativeType("bool") boolean _index32) {
        if (CHECKS) {
            check(_dir, 3);
            check(_pos, 3);
        }
        nbgfx_topology_sort_tri_list(_sort, memAddress(_dst), _dst.remaining(), memAddress(_dir), memAddress(_pos), memAddress(_vertices), _stride, memAddress(_indices), _indices.remaining() >> (_index32 ? 2 : 1), _index32);
    }

    /**
     * Sorts indices.
     *
     * @param _sort     sort order. One of:<br><table><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MIN TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MIN}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_AVG TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_AVG}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MAX TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MAX}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MIN TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MIN}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_AVG TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_AVG}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MAX TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MAX}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MIN TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MIN}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_AVG TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_AVG}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MAX TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MAX}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MIN TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MIN}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_AVG TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_AVG}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MAX TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MAX}</td></tr></table>
     * @param _dst      destination index buffer
     * @param _dir      direction (vector must be normalized)
     * @param _pos      position
     * @param _vertices pointer to first vertex represented as float x, y, z. Must contain at least number of vertices referenced by index buffer.
     * @param _stride   vertex stride
     * @param _indices  source indices
     * @param _index32  set to `true` if input indices are 32-bit
     */
    public static void bgfx_topology_sort_tri_list(@NativeType("bgfx_topology_sort_t") int _sort, @NativeType("void *") ShortBuffer _dst, @NativeType("float const *") FloatBuffer _dir, @NativeType("float const *") FloatBuffer _pos, @NativeType("void const *") ByteBuffer _vertices, @NativeType("uint32_t") int _stride, @NativeType("void const *") ShortBuffer _indices, @NativeType("bool") boolean _index32) {
        if (CHECKS) {
            check(_dir, 3);
            check(_pos, 3);
        }
        nbgfx_topology_sort_tri_list(_sort, memAddress(_dst), _dst.remaining() << 1, memAddress(_dir), memAddress(_pos), memAddress(_vertices), _stride, memAddress(_indices), (int)(((long)_indices.remaining() << 1) >> (_index32 ? 2 : 1)), _index32);
    }

    /**
     * Sorts indices.
     *
     * @param _sort     sort order. One of:<br><table><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MIN TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MIN}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_AVG TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_AVG}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MAX TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MAX}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MIN TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MIN}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_AVG TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_AVG}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MAX TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MAX}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MIN TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MIN}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_AVG TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_AVG}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MAX TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MAX}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MIN TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MIN}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_AVG TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_AVG}</td></tr><tr><td>{@link #BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MAX TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MAX}</td></tr></table>
     * @param _dst      destination index buffer
     * @param _dir      direction (vector must be normalized)
     * @param _pos      position
     * @param _vertices pointer to first vertex represented as float x, y, z. Must contain at least number of vertices referenced by index buffer.
     * @param _stride   vertex stride
     * @param _indices  source indices
     * @param _index32  set to `true` if input indices are 32-bit
     */
    public static void bgfx_topology_sort_tri_list(@NativeType("bgfx_topology_sort_t") int _sort, @NativeType("void *") IntBuffer _dst, @NativeType("float const *") FloatBuffer _dir, @NativeType("float const *") FloatBuffer _pos, @NativeType("void const *") ByteBuffer _vertices, @NativeType("uint32_t") int _stride, @NativeType("void const *") IntBuffer _indices, @NativeType("bool") boolean _index32) {
        if (CHECKS) {
            check(_dir, 3);
            check(_pos, 3);
        }
        nbgfx_topology_sort_tri_list(_sort, memAddress(_dst), _dst.remaining() << 2, memAddress(_dir), memAddress(_pos), memAddress(_vertices), _stride, memAddress(_indices), (int)(((long)_indices.remaining() << 2) >> (_index32 ? 2 : 1)), _index32);
    }

    // --- [ bgfx_get_supported_renderers ] ---

    /**
     * Unsafe version of: {@link #bgfx_get_supported_renderers get_supported_renderers}
     *
     * @param _max maximum number of elements in {@code _enum} array
     */
    public static byte nbgfx_get_supported_renderers(byte _max, long _enum) {
        long __functionAddress = Functions.get_supported_renderers;
        return invokePB(__functionAddress, _max, _enum);
    }

    /**
     * Returns supported backend API renderers.
     *
     * @param _enum array where supported renderers will be written
     *
     * @return the number of renderers written to {@code _enum}
     */
    @NativeType("uint8_t")
    public static byte bgfx_get_supported_renderers(@NativeType("bgfx_renderer_type_t *") IntBuffer _enum) {
        return nbgfx_get_supported_renderers((byte)_enum.remaining(), memAddress(_enum));
    }

    // --- [ bgfx_get_renderer_name ] ---

    /** Unsafe version of: {@link #bgfx_get_renderer_name get_renderer_name} */
    public static long nbgfx_get_renderer_name(int _type) {
        long __functionAddress = Functions.get_renderer_name;
        return invokeP(__functionAddress, _type);
    }

    /**
     * Returns name of renderer.
     *
     * @param _type the renderer type. One of:<br><table><tr><td>{@link #BGFX_RENDERER_TYPE_NOOP RENDERER_TYPE_NOOP}</td><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D9 RENDERER_TYPE_DIRECT3D9}</td><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D11 RENDERER_TYPE_DIRECT3D11}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_DIRECT3D12 RENDERER_TYPE_DIRECT3D12}</td><td>{@link #BGFX_RENDERER_TYPE_GNM RENDERER_TYPE_GNM}</td><td>{@link #BGFX_RENDERER_TYPE_METAL RENDERER_TYPE_METAL}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_OPENGLES RENDERER_TYPE_OPENGLES}</td><td>{@link #BGFX_RENDERER_TYPE_OPENGL RENDERER_TYPE_OPENGL}</td><td>{@link #BGFX_RENDERER_TYPE_VULKAN RENDERER_TYPE_VULKAN}</td></tr><tr><td>{@link #BGFX_RENDERER_TYPE_COUNT RENDERER_TYPE_COUNT}</td></tr></table>
     */
    @Nullable
    @NativeType("char const *")
    public static String bgfx_get_renderer_name(@NativeType("bgfx_renderer_type_t") int _type) {
        long __result = nbgfx_get_renderer_name(_type);
        return memASCIISafe(__result);
    }

    // --- [ bgfx_init_ctor ] ---

    /** Unsafe version of: {@link #bgfx_init_ctor init_ctor} */
    public static void nbgfx_init_ctor(long _init) {
        long __functionAddress = Functions.init_ctor;
        invokePV(__functionAddress, _init);
    }

    /**
     * Updates the specified initialization parameters with default values.
     *
     * @param _init initialization parameters
     */
    public static void bgfx_init_ctor(@NativeType("bgfx_init_t *") BGFXInit _init) {
        nbgfx_init_ctor(_init.address());
    }

    // --- [ bgfx_init ] ---

    /** Unsafe version of: {@link #bgfx_init init} */
    public static boolean nbgfx_init(long _init) {
        long __functionAddress = Functions.init;
        if (CHECKS) {
            BGFXInit.validate(_init);
        }
        return invokePZ(__functionAddress, _init);
    }

    /**
     * Initializes bgfx library.
     *
     * @param _init initialization parameters
     *
     * @return true if initialization was successful
     */
    @NativeType("bool")
    public static boolean bgfx_init(@NativeType("bgfx_init_t const *") BGFXInit _init) {
        return nbgfx_init(_init.address());
    }

    // --- [ bgfx_shutdown ] ---

    /** Shuts down bgfx library. */
    public static void bgfx_shutdown() {
        long __functionAddress = Functions.shutdown;
        invokeV(__functionAddress);
    }

    // --- [ bgfx_reset ] ---

    /**
     * Resets graphic settings and back-buffer size.
     * 
     * <p>This call doesn't actually change window size, it just resizes back-buffer. Windowing code has to change window size.</p>
     *
     * @param _width  back-buffer width
     * @param _height back-buffer height
     * @param _flags  reset flags. One or more of:<br><table><tr><td>{@link #BGFX_RESET_NONE RESET_NONE}</td><td>{@link #BGFX_RESET_FULLSCREEN RESET_FULLSCREEN}</td><td>{@link #BGFX_RESET_FULLSCREEN_SHIFT RESET_FULLSCREEN_SHIFT}</td><td>{@link #BGFX_RESET_FULLSCREEN_MASK RESET_FULLSCREEN_MASK}</td><td>{@link #BGFX_RESET_MSAA_X2 RESET_MSAA_X2}</td></tr><tr><td>{@link #BGFX_RESET_MSAA_X4 RESET_MSAA_X4}</td><td>{@link #BGFX_RESET_MSAA_X8 RESET_MSAA_X8}</td><td>{@link #BGFX_RESET_MSAA_X16 RESET_MSAA_X16}</td><td>{@link #BGFX_RESET_MSAA_SHIFT RESET_MSAA_SHIFT}</td><td>{@link #BGFX_RESET_MSAA_MASK RESET_MSAA_MASK}</td></tr><tr><td>{@link #BGFX_RESET_VSYNC RESET_VSYNC}</td><td>{@link #BGFX_RESET_MAXANISOTROPY RESET_MAXANISOTROPY}</td><td>{@link #BGFX_RESET_CAPTURE RESET_CAPTURE}</td><td>{@link #BGFX_RESET_HMD RESET_HMD}</td><td>{@link #BGFX_RESET_HMD_DEBUG RESET_HMD_DEBUG}</td></tr><tr><td>{@link #BGFX_RESET_HMD_RECENTER RESET_HMD_RECENTER}</td><td>{@link #BGFX_RESET_FLUSH_AFTER_RENDER RESET_FLUSH_AFTER_RENDER}</td><td>{@link #BGFX_RESET_FLIP_AFTER_RENDER RESET_FLIP_AFTER_RENDER}</td><td>{@link #BGFX_RESET_SRGB_BACKBUFFER RESET_SRGB_BACKBUFFER}</td><td>{@link #BGFX_RESET_HIDPI RESET_HIDPI}</td></tr><tr><td>{@link #BGFX_RESET_DEPTH_CLAMP RESET_DEPTH_CLAMP}</td><td>{@link #BGFX_RESET_SUSPEND RESET_SUSPEND}</td></tr></table>
     */
    public static void bgfx_reset(@NativeType("uint32_t") int _width, @NativeType("uint32_t") int _height, @NativeType("uint32_t") int _flags) {
        long __functionAddress = Functions.reset;
        invokeV(__functionAddress, _width, _height, _flags);
    }

    // --- [ bgfx_begin ] ---

    /**
     * Begin submitting draw calls from thread.
     *
     * @return an encoder for submitting draw calls from multiple threads
     */
    @NativeType("struct bgfx_encoder_s *")
    public static long bgfx_begin() {
        long __functionAddress = Functions.begin;
        return invokeP(__functionAddress);
    }

    // --- [ bgfx_end ] ---

    /**
     * End submitting draw calls from thread.
     *
     * @param _encoder the encoder
     */
    public static void bgfx_end(@NativeType("struct bgfx_encoder_s *") long _encoder) {
        long __functionAddress = Functions.end;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder);
    }

    // --- [ bgfx_frame ] ---

    /**
     * Advances to next frame. When using multithreaded renderer, this call just swaps internal buffers, kicks render thread, and returns. In singlethreaded
     * renderer this call does frame rendering.
     *
     * @param _capture capture frame with graphics debugger
     *
     * @return current frame number. This might be used in conjunction with double/multi buffering data outside the library and passing it to library {@link #bgfx_make_ref make_ref}
     *         calls.
     */
    @NativeType("uint32_t")
    public static int bgfx_frame(@NativeType("bool") boolean _capture) {
        long __functionAddress = Functions.frame;
        return invokeI(__functionAddress, _capture);
    }

    // --- [ bgfx_get_renderer_type ] ---

    /** Returns current renderer backend API type. */
    @NativeType("bgfx_renderer_type_t")
    public static int bgfx_get_renderer_type() {
        long __functionAddress = Functions.get_renderer_type;
        return invokeI(__functionAddress);
    }

    // --- [ bgfx_get_caps ] ---

    /** Unsafe version of: {@link #bgfx_get_caps get_caps} */
    public static long nbgfx_get_caps() {
        long __functionAddress = Functions.get_caps;
        return invokeP(__functionAddress);
    }

    /** Returns renderer capabilities. */
    @Nullable
    @NativeType("bgfx_caps_t const *")
    public static BGFXCaps bgfx_get_caps() {
        long __result = nbgfx_get_caps();
        return BGFXCaps.createSafe(__result);
    }

    // --- [ bgfx_get_hmd ] ---

    /** Unsafe version of: {@link #bgfx_get_hmd get_hmd} */
    public static long nbgfx_get_hmd() {
        long __functionAddress = Functions.get_hmd;
        return invokeP(__functionAddress);
    }

    /** Returns HMD info. */
    @Nullable
    @NativeType("bgfx_hmd_t const *")
    public static BGFXHmd bgfx_get_hmd() {
        long __result = nbgfx_get_hmd();
        return BGFXHmd.createSafe(__result);
    }

    // --- [ bgfx_get_stats ] ---

    /** Unsafe version of: {@link #bgfx_get_stats get_stats} */
    public static long nbgfx_get_stats() {
        long __functionAddress = Functions.get_stats;
        return invokeP(__functionAddress);
    }

    /**
     * Returns performance counters.
     * 
     * <p>The pointer returned is valid until {@link #bgfx_frame frame} is called.</p>
     */
    @Nullable
    @NativeType("bgfx_stats_t const *")
    public static BGFXStats bgfx_get_stats() {
        long __result = nbgfx_get_stats();
        return BGFXStats.createSafe(__result);
    }

    // --- [ bgfx_alloc ] ---

    /** Unsafe version of: {@link #bgfx_alloc alloc} */
    public static long nbgfx_alloc(int _size) {
        long __functionAddress = Functions.alloc;
        return invokeP(__functionAddress, _size);
    }

    /**
     * Allocates buffer to pass to bgfx calls. Data will be freed inside bgfx.
     *
     * @param _size the number of bytes to allocate
     */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_alloc(@NativeType("uint32_t") int _size) {
        long __result = nbgfx_alloc(_size);
        return BGFXMemory.createSafe(__result);
    }

    // --- [ bgfx_copy ] ---

    /**
     * Unsafe version of: {@link #bgfx_copy copy}
     *
     * @param _size size of data to be copied
     */
    public static long nbgfx_copy(long _data, int _size) {
        long __functionAddress = Functions.copy;
        return invokePP(__functionAddress, _data, _size);
    }

    /**
     * Allocates buffer and copies data into it. Data will be freed inside bgfx.
     *
     * @param _data pointer to data to be copied
     */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_copy(@NativeType("void const *") ByteBuffer _data) {
        long __result = nbgfx_copy(memAddress(_data), _data.remaining());
        return BGFXMemory.createSafe(__result);
    }

    /**
     * Allocates buffer and copies data into it. Data will be freed inside bgfx.
     *
     * @param _data pointer to data to be copied
     */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_copy(@NativeType("void const *") ShortBuffer _data) {
        long __result = nbgfx_copy(memAddress(_data), _data.remaining() << 1);
        return BGFXMemory.createSafe(__result);
    }

    /**
     * Allocates buffer and copies data into it. Data will be freed inside bgfx.
     *
     * @param _data pointer to data to be copied
     */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_copy(@NativeType("void const *") IntBuffer _data) {
        long __result = nbgfx_copy(memAddress(_data), _data.remaining() << 2);
        return BGFXMemory.createSafe(__result);
    }

    /**
     * Allocates buffer and copies data into it. Data will be freed inside bgfx.
     *
     * @param _data pointer to data to be copied
     */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_copy(@NativeType("void const *") LongBuffer _data) {
        long __result = nbgfx_copy(memAddress(_data), _data.remaining() << 3);
        return BGFXMemory.createSafe(__result);
    }

    /**
     * Allocates buffer and copies data into it. Data will be freed inside bgfx.
     *
     * @param _data pointer to data to be copied
     */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_copy(@NativeType("void const *") FloatBuffer _data) {
        long __result = nbgfx_copy(memAddress(_data), _data.remaining() << 2);
        return BGFXMemory.createSafe(__result);
    }

    /**
     * Allocates buffer and copies data into it. Data will be freed inside bgfx.
     *
     * @param _data pointer to data to be copied
     */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_copy(@NativeType("void const *") DoubleBuffer _data) {
        long __result = nbgfx_copy(memAddress(_data), _data.remaining() << 3);
        return BGFXMemory.createSafe(__result);
    }

    /**
     * Allocates buffer and copies data into it. Data will be freed inside bgfx.
     *
     * @param _data pointer to data to be copied
     */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_copy(@NativeType("void const *") PointerBuffer _data) {
        long __result = nbgfx_copy(memAddress(_data), _data.remaining() << POINTER_SHIFT);
        return BGFXMemory.createSafe(__result);
    }

    // --- [ bgfx_make_ref ] ---

    /**
     * Unsafe version of: {@link #bgfx_make_ref make_ref}
     *
     * @param _size the number of bytes to reference
     */
    public static long nbgfx_make_ref(long _data, int _size) {
        long __functionAddress = Functions.make_ref;
        return invokePP(__functionAddress, _data, _size);
    }

    /**
     * Makes reference to data to pass to bgfx. Unlike {@link #bgfx_alloc alloc}, this call doesn't allocate memory for data. It just copies the {@code _data} pointer.
     * 
     * <p>Data passed must be available for at least 2 {@link #bgfx_frame frame} calls.</p>
     *
     * @param _data the data to reference
     */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_make_ref(@NativeType("void const *") ByteBuffer _data) {
        long __result = nbgfx_make_ref(memAddress(_data), _data.remaining());
        return BGFXMemory.createSafe(__result);
    }

    /**
     * Makes reference to data to pass to bgfx. Unlike {@link #bgfx_alloc alloc}, this call doesn't allocate memory for data. It just copies the {@code _data} pointer.
     * 
     * <p>Data passed must be available for at least 2 {@link #bgfx_frame frame} calls.</p>
     *
     * @param _data the data to reference
     */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_make_ref(@NativeType("void const *") ShortBuffer _data) {
        long __result = nbgfx_make_ref(memAddress(_data), _data.remaining() << 1);
        return BGFXMemory.createSafe(__result);
    }

    /**
     * Makes reference to data to pass to bgfx. Unlike {@link #bgfx_alloc alloc}, this call doesn't allocate memory for data. It just copies the {@code _data} pointer.
     * 
     * <p>Data passed must be available for at least 2 {@link #bgfx_frame frame} calls.</p>
     *
     * @param _data the data to reference
     */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_make_ref(@NativeType("void const *") IntBuffer _data) {
        long __result = nbgfx_make_ref(memAddress(_data), _data.remaining() << 2);
        return BGFXMemory.createSafe(__result);
    }

    /**
     * Makes reference to data to pass to bgfx. Unlike {@link #bgfx_alloc alloc}, this call doesn't allocate memory for data. It just copies the {@code _data} pointer.
     * 
     * <p>Data passed must be available for at least 2 {@link #bgfx_frame frame} calls.</p>
     *
     * @param _data the data to reference
     */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_make_ref(@NativeType("void const *") LongBuffer _data) {
        long __result = nbgfx_make_ref(memAddress(_data), _data.remaining() << 3);
        return BGFXMemory.createSafe(__result);
    }

    /**
     * Makes reference to data to pass to bgfx. Unlike {@link #bgfx_alloc alloc}, this call doesn't allocate memory for data. It just copies the {@code _data} pointer.
     * 
     * <p>Data passed must be available for at least 2 {@link #bgfx_frame frame} calls.</p>
     *
     * @param _data the data to reference
     */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_make_ref(@NativeType("void const *") FloatBuffer _data) {
        long __result = nbgfx_make_ref(memAddress(_data), _data.remaining() << 2);
        return BGFXMemory.createSafe(__result);
    }

    /**
     * Makes reference to data to pass to bgfx. Unlike {@link #bgfx_alloc alloc}, this call doesn't allocate memory for data. It just copies the {@code _data} pointer.
     * 
     * <p>Data passed must be available for at least 2 {@link #bgfx_frame frame} calls.</p>
     *
     * @param _data the data to reference
     */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_make_ref(@NativeType("void const *") DoubleBuffer _data) {
        long __result = nbgfx_make_ref(memAddress(_data), _data.remaining() << 3);
        return BGFXMemory.createSafe(__result);
    }

    /**
     * Makes reference to data to pass to bgfx. Unlike {@link #bgfx_alloc alloc}, this call doesn't allocate memory for data. It just copies the {@code _data} pointer.
     * 
     * <p>Data passed must be available for at least 2 {@link #bgfx_frame frame} calls.</p>
     *
     * @param _data the data to reference
     */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_make_ref(@NativeType("void const *") PointerBuffer _data) {
        long __result = nbgfx_make_ref(memAddress(_data), _data.remaining() << POINTER_SHIFT);
        return BGFXMemory.createSafe(__result);
    }

    // --- [ bgfx_make_ref_release ] ---

    /**
     * Unsafe version of: {@link #bgfx_make_ref_release make_ref_release}
     *
     * @param _size the number of bytes to reference
     */
    public static long nbgfx_make_ref_release(long _data, int _size, long _releaseFn, long _userData) {
        long __functionAddress = Functions.make_ref_release;
        return invokePPPP(__functionAddress, _data, _size, _releaseFn, _userData);
    }

    /**
     * Makes reference to data to pass to bgfx. Unlike {@link #bgfx_alloc alloc}, this call doesn't allocate memory for data. It just copies the {@code _data} pointer.
     * 
     * <p>The {@code bgfx_release_fn_t} function pointer will release this memory after it's consumed. The {@code bgfx_release_fn_t} function must be able to be
     * called from any thread.</p>
     *
     * @param _data      the data to reference
     * @param _releaseFn the release function
     * @param _userData  user data to pass to {@code _releaseFn}
     */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_make_ref_release(@NativeType("void const *") ByteBuffer _data, @NativeType("bgfx_release_fn_t") BGFXReleaseFunctionCallbackI _releaseFn, @NativeType("void *") long _userData) {
        long __result = nbgfx_make_ref_release(memAddress(_data), _data.remaining(), _releaseFn.address(), _userData);
        return BGFXMemory.createSafe(__result);
    }

    /**
     * Makes reference to data to pass to bgfx. Unlike {@link #bgfx_alloc alloc}, this call doesn't allocate memory for data. It just copies the {@code _data} pointer.
     * 
     * <p>The {@code bgfx_release_fn_t} function pointer will release this memory after it's consumed. The {@code bgfx_release_fn_t} function must be able to be
     * called from any thread.</p>
     *
     * @param _data      the data to reference
     * @param _releaseFn the release function
     * @param _userData  user data to pass to {@code _releaseFn}
     */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_make_ref_release(@NativeType("void const *") ShortBuffer _data, @NativeType("bgfx_release_fn_t") BGFXReleaseFunctionCallbackI _releaseFn, @NativeType("void *") long _userData) {
        long __result = nbgfx_make_ref_release(memAddress(_data), _data.remaining() << 1, _releaseFn.address(), _userData);
        return BGFXMemory.createSafe(__result);
    }

    /**
     * Makes reference to data to pass to bgfx. Unlike {@link #bgfx_alloc alloc}, this call doesn't allocate memory for data. It just copies the {@code _data} pointer.
     * 
     * <p>The {@code bgfx_release_fn_t} function pointer will release this memory after it's consumed. The {@code bgfx_release_fn_t} function must be able to be
     * called from any thread.</p>
     *
     * @param _data      the data to reference
     * @param _releaseFn the release function
     * @param _userData  user data to pass to {@code _releaseFn}
     */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_make_ref_release(@NativeType("void const *") IntBuffer _data, @NativeType("bgfx_release_fn_t") BGFXReleaseFunctionCallbackI _releaseFn, @NativeType("void *") long _userData) {
        long __result = nbgfx_make_ref_release(memAddress(_data), _data.remaining() << 2, _releaseFn.address(), _userData);
        return BGFXMemory.createSafe(__result);
    }

    /**
     * Makes reference to data to pass to bgfx. Unlike {@link #bgfx_alloc alloc}, this call doesn't allocate memory for data. It just copies the {@code _data} pointer.
     * 
     * <p>The {@code bgfx_release_fn_t} function pointer will release this memory after it's consumed. The {@code bgfx_release_fn_t} function must be able to be
     * called from any thread.</p>
     *
     * @param _data      the data to reference
     * @param _releaseFn the release function
     * @param _userData  user data to pass to {@code _releaseFn}
     */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_make_ref_release(@NativeType("void const *") LongBuffer _data, @NativeType("bgfx_release_fn_t") BGFXReleaseFunctionCallbackI _releaseFn, @NativeType("void *") long _userData) {
        long __result = nbgfx_make_ref_release(memAddress(_data), _data.remaining() << 3, _releaseFn.address(), _userData);
        return BGFXMemory.createSafe(__result);
    }

    /**
     * Makes reference to data to pass to bgfx. Unlike {@link #bgfx_alloc alloc}, this call doesn't allocate memory for data. It just copies the {@code _data} pointer.
     * 
     * <p>The {@code bgfx_release_fn_t} function pointer will release this memory after it's consumed. The {@code bgfx_release_fn_t} function must be able to be
     * called from any thread.</p>
     *
     * @param _data      the data to reference
     * @param _releaseFn the release function
     * @param _userData  user data to pass to {@code _releaseFn}
     */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_make_ref_release(@NativeType("void const *") FloatBuffer _data, @NativeType("bgfx_release_fn_t") BGFXReleaseFunctionCallbackI _releaseFn, @NativeType("void *") long _userData) {
        long __result = nbgfx_make_ref_release(memAddress(_data), _data.remaining() << 2, _releaseFn.address(), _userData);
        return BGFXMemory.createSafe(__result);
    }

    /**
     * Makes reference to data to pass to bgfx. Unlike {@link #bgfx_alloc alloc}, this call doesn't allocate memory for data. It just copies the {@code _data} pointer.
     * 
     * <p>The {@code bgfx_release_fn_t} function pointer will release this memory after it's consumed. The {@code bgfx_release_fn_t} function must be able to be
     * called from any thread.</p>
     *
     * @param _data      the data to reference
     * @param _releaseFn the release function
     * @param _userData  user data to pass to {@code _releaseFn}
     */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_make_ref_release(@NativeType("void const *") DoubleBuffer _data, @NativeType("bgfx_release_fn_t") BGFXReleaseFunctionCallbackI _releaseFn, @NativeType("void *") long _userData) {
        long __result = nbgfx_make_ref_release(memAddress(_data), _data.remaining() << 3, _releaseFn.address(), _userData);
        return BGFXMemory.createSafe(__result);
    }

    /**
     * Makes reference to data to pass to bgfx. Unlike {@link #bgfx_alloc alloc}, this call doesn't allocate memory for data. It just copies the {@code _data} pointer.
     * 
     * <p>The {@code bgfx_release_fn_t} function pointer will release this memory after it's consumed. The {@code bgfx_release_fn_t} function must be able to be
     * called from any thread.</p>
     *
     * @param _data      the data to reference
     * @param _releaseFn the release function
     * @param _userData  user data to pass to {@code _releaseFn}
     */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_make_ref_release(@NativeType("void const *") PointerBuffer _data, @NativeType("bgfx_release_fn_t") BGFXReleaseFunctionCallbackI _releaseFn, @NativeType("void *") long _userData) {
        long __result = nbgfx_make_ref_release(memAddress(_data), _data.remaining() << POINTER_SHIFT, _releaseFn.address(), _userData);
        return BGFXMemory.createSafe(__result);
    }

    // --- [ bgfx_set_debug ] ---

    /**
     * Sets debug flags.
     *
     * @param _debug the debug flags. One or more of:<br><table><tr><td>{@link #BGFX_DEBUG_NONE DEBUG_NONE}</td><td>{@link #BGFX_DEBUG_WIREFRAME DEBUG_WIREFRAME}</td><td>{@link #BGFX_DEBUG_IFH DEBUG_IFH}</td><td>{@link #BGFX_DEBUG_STATS DEBUG_STATS}</td><td>{@link #BGFX_DEBUG_TEXT DEBUG_TEXT}</td><td>{@link #BGFX_DEBUG_PROFILER DEBUG_PROFILER}</td></tr></table>
     */
    public static void bgfx_set_debug(@NativeType("uint32_t") int _debug) {
        long __functionAddress = Functions.set_debug;
        invokeV(__functionAddress, _debug);
    }

    // --- [ bgfx_dbg_text_clear ] ---

    /** Unsafe version of: {@link #bgfx_dbg_text_clear dbg_text_clear} */
    public static void nbgfx_dbg_text_clear(byte _attr, boolean _small) {
        long __functionAddress = Functions.dbg_text_clear;
        invokeV(__functionAddress, _attr, _small);
    }

    /**
     * Clears internal debug text buffer.
     *
     * @param _attr  color palette. Where top 4-bits represent index of background, and bottom 4-bits represent foreground color from standard VGA text palette (ANSI
     *               escape codes).
     * @param _small 
     */
    public static void bgfx_dbg_text_clear(@NativeType("uint8_t") int _attr, @NativeType("bool") boolean _small) {
        nbgfx_dbg_text_clear((byte)_attr, _small);
    }

    // --- [ bgfx_dbg_text_printf ] ---

    /** Unsafe version of: {@link #bgfx_dbg_text_printf dbg_text_printf} */
    public static void nbgfx_dbg_text_printf(short _x, short _y, byte _attr, long _format) {
        long __functionAddress = Functions.dbg_text_printf;
        invokePV(__functionAddress, _x, _y, _attr, _format);
    }

    /**
     * Prints into internal debug text character-buffer (VGA-compatible text mode).
     *
     * @param _x      x coordinate
     * @param _y      y coordinate
     * @param _attr   color palette. Where top 4-bits represent index of background, and bottom 4-bits represent foreground color from standard VGA text palette (ANSI
     *                escape codes).
     * @param _format `printf` style format
     */
    public static void bgfx_dbg_text_printf(@NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint8_t") int _attr, @NativeType("char const *") ByteBuffer _format) {
        if (CHECKS) {
            checkNT1(_format);
        }
        nbgfx_dbg_text_printf((short)_x, (short)_y, (byte)_attr, memAddress(_format));
    }

    /**
     * Prints into internal debug text character-buffer (VGA-compatible text mode).
     *
     * @param _x      x coordinate
     * @param _y      y coordinate
     * @param _attr   color palette. Where top 4-bits represent index of background, and bottom 4-bits represent foreground color from standard VGA text palette (ANSI
     *                escape codes).
     * @param _format `printf` style format
     */
    public static void bgfx_dbg_text_printf(@NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint8_t") int _attr, @NativeType("char const *") CharSequence _format) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer _formatEncoded = stack.ASCII(_format);
            nbgfx_dbg_text_printf((short)_x, (short)_y, (byte)_attr, memAddress(_formatEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bgfx_dbg_text_vprintf ] ---

    /** Unsafe version of: {@link #bgfx_dbg_text_vprintf dbg_text_vprintf} */
    public static void nbgfx_dbg_text_vprintf(short _x, short _y, byte _attr, long _format, long _argList) {
        long __functionAddress = Functions.dbg_text_vprintf;
        if (CHECKS) {
            check(_argList);
        }
        invokePPV(__functionAddress, _x, _y, _attr, _format, _argList);
    }

    /**
     * Print into internal debug text character-buffer (VGA-compatible text mode).
     *
     * @param _x       x coordinate
     * @param _y       y coordinate
     * @param _attr    color palette. Where top 4-bits represent index of background, and bottom 4-bits represent foreground color from standard VGA text palette.
     * @param _format  `printf` style format
     * @param _argList additional arguments for format string
     */
    public static void bgfx_dbg_text_vprintf(@NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint8_t") int _attr, @NativeType("char const *") ByteBuffer _format, @NativeType("va_list") long _argList) {
        if (CHECKS) {
            checkNT1(_format);
        }
        nbgfx_dbg_text_vprintf((short)_x, (short)_y, (byte)_attr, memAddress(_format), _argList);
    }

    /**
     * Print into internal debug text character-buffer (VGA-compatible text mode).
     *
     * @param _x       x coordinate
     * @param _y       y coordinate
     * @param _attr    color palette. Where top 4-bits represent index of background, and bottom 4-bits represent foreground color from standard VGA text palette.
     * @param _format  `printf` style format
     * @param _argList additional arguments for format string
     */
    public static void bgfx_dbg_text_vprintf(@NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint8_t") int _attr, @NativeType("char const *") CharSequence _format, @NativeType("va_list") long _argList) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer _formatEncoded = stack.ASCII(_format);
            nbgfx_dbg_text_vprintf((short)_x, (short)_y, (byte)_attr, memAddress(_formatEncoded), _argList);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bgfx_dbg_text_image ] ---

    /** Unsafe version of: {@link #bgfx_dbg_text_image dbg_text_image} */
    public static void nbgfx_dbg_text_image(short _x, short _y, short _width, short _height, long _data, short _pitch) {
        long __functionAddress = Functions.dbg_text_image;
        invokePV(__functionAddress, _x, _y, _width, _height, _data, _pitch);
    }

    /**
     * Draws image into internal debug text buffer.
     *
     * @param _x      x coordinate
     * @param _y      y coordinate
     * @param _width  image width
     * @param _height image height
     * @param _data   raw image data (character/attribute raw encoding)
     * @param _pitch  image pitch in bytes
     */
    public static void bgfx_dbg_text_image(@NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("void const *") ByteBuffer _data, @NativeType("uint16_t") int _pitch) {
        if (CHECKS) {
            check(_data, _height * _pitch);
        }
        nbgfx_dbg_text_image((short)_x, (short)_y, (short)_width, (short)_height, memAddress(_data), (short)_pitch);
    }

    // --- [ bgfx_create_index_buffer ] ---

    /** Unsafe version of: {@link #bgfx_create_index_buffer create_index_buffer} */
    public static short nbgfx_create_index_buffer(long _mem, short _flags) {
        long __functionAddress = Functions.create_index_buffer;
        if (CHECKS) {
            BGFXMemory.validate(_mem);
        }
        return invokePS(__functionAddress, _mem, _flags);
    }

    /**
     * Creates static index buffer.
     *
     * @param _mem   index buffer data
     * @param _flags buffer creation flags. One or more of:<br><table><tr><td>{@link #BGFX_BUFFER_NONE BUFFER_NONE}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ BUFFER_COMPUTE_READ}</td><td>{@link #BGFX_BUFFER_COMPUTE_WRITE BUFFER_COMPUTE_WRITE}</td><td>{@link #BGFX_BUFFER_DRAW_INDIRECT BUFFER_DRAW_INDIRECT}</td></tr><tr><td>{@link #BGFX_BUFFER_ALLOW_RESIZE BUFFER_ALLOW_RESIZE}</td><td>{@link #BGFX_BUFFER_INDEX32 BUFFER_INDEX32}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ_WRITE BUFFER_COMPUTE_READ_WRITE}</td></tr></table>
     */
    @NativeType("bgfx_index_buffer_handle_t")
    public static short bgfx_create_index_buffer(@NativeType("bgfx_memory_t const *") BGFXMemory _mem, @NativeType("uint16_t") int _flags) {
        return nbgfx_create_index_buffer(_mem.address(), (short)_flags);
    }

    // --- [ bgfx_destroy_index_buffer ] ---

    /**
     * Destroys static index buffer.
     *
     * @param _handle the static index buffer to destroy
     */
    public static void bgfx_destroy_index_buffer(@NativeType("bgfx_index_buffer_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_index_buffer;
        invokeV(__functionAddress, _handle);
    }

    // --- [ bgfx_create_vertex_buffer ] ---

    /** Unsafe version of: {@link #bgfx_create_vertex_buffer create_vertex_buffer} */
    public static short nbgfx_create_vertex_buffer(long _mem, long _decl, short _flags) {
        long __functionAddress = Functions.create_vertex_buffer;
        if (CHECKS) {
            BGFXMemory.validate(_mem);
        }
        return invokePPS(__functionAddress, _mem, _decl, _flags);
    }

    /**
     * Creates static vertex buffer.
     *
     * @param _mem   vertex buffer data
     * @param _decl  vertex declaration
     * @param _flags buffer creation flags. One or more of:<br><table><tr><td>{@link #BGFX_BUFFER_NONE BUFFER_NONE}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ BUFFER_COMPUTE_READ}</td><td>{@link #BGFX_BUFFER_COMPUTE_WRITE BUFFER_COMPUTE_WRITE}</td><td>{@link #BGFX_BUFFER_DRAW_INDIRECT BUFFER_DRAW_INDIRECT}</td></tr><tr><td>{@link #BGFX_BUFFER_ALLOW_RESIZE BUFFER_ALLOW_RESIZE}</td><td>{@link #BGFX_BUFFER_INDEX32 BUFFER_INDEX32}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ_WRITE BUFFER_COMPUTE_READ_WRITE}</td></tr></table>
     */
    @NativeType("bgfx_vertex_buffer_handle_t")
    public static short bgfx_create_vertex_buffer(@NativeType("bgfx_memory_t const *") BGFXMemory _mem, @NativeType("bgfx_vertex_decl_t const *") BGFXVertexDecl _decl, @NativeType("uint16_t") int _flags) {
        return nbgfx_create_vertex_buffer(_mem.address(), _decl.address(), (short)_flags);
    }

    // --- [ bgfx_destroy_vertex_buffer ] ---

    /**
     * Destroys static vertex buffer.
     *
     * @param _handle the static vertex buffer to destroy
     */
    public static void bgfx_destroy_vertex_buffer(@NativeType("bgfx_vertex_buffer_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_vertex_buffer;
        invokeV(__functionAddress, _handle);
    }

    // --- [ bgfx_create_dynamic_index_buffer ] ---

    /** Unsafe version of: {@link #bgfx_create_dynamic_index_buffer create_dynamic_index_buffer} */
    public static short nbgfx_create_dynamic_index_buffer(int _num, short _flags) {
        long __functionAddress = Functions.create_dynamic_index_buffer;
        return invokeS(__functionAddress, _num, _flags);
    }

    /**
     * Creates empty dynamic index buffer.
     *
     * @param _num   number of indices
     * @param _flags buffer creation flags. One or more of:<br><table><tr><td>{@link #BGFX_BUFFER_NONE BUFFER_NONE}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ BUFFER_COMPUTE_READ}</td><td>{@link #BGFX_BUFFER_COMPUTE_WRITE BUFFER_COMPUTE_WRITE}</td><td>{@link #BGFX_BUFFER_DRAW_INDIRECT BUFFER_DRAW_INDIRECT}</td></tr><tr><td>{@link #BGFX_BUFFER_ALLOW_RESIZE BUFFER_ALLOW_RESIZE}</td><td>{@link #BGFX_BUFFER_INDEX32 BUFFER_INDEX32}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ_WRITE BUFFER_COMPUTE_READ_WRITE}</td></tr></table>
     */
    @NativeType("bgfx_dynamic_index_buffer_handle_t")
    public static short bgfx_create_dynamic_index_buffer(@NativeType("uint32_t") int _num, @NativeType("uint16_t") int _flags) {
        return nbgfx_create_dynamic_index_buffer(_num, (short)_flags);
    }

    // --- [ bgfx_create_dynamic_index_buffer_mem ] ---

    /** Unsafe version of: {@link #bgfx_create_dynamic_index_buffer_mem create_dynamic_index_buffer_mem} */
    public static short nbgfx_create_dynamic_index_buffer_mem(long _mem, short _flags) {
        long __functionAddress = Functions.create_dynamic_index_buffer_mem;
        if (CHECKS) {
            BGFXMemory.validate(_mem);
        }
        return invokePS(__functionAddress, _mem, _flags);
    }

    /**
     * Creates dynamic index buffer and initializes it.
     *
     * @param _mem   index buffer data
     * @param _flags buffer creation flags. One or more of:<br><table><tr><td>{@link #BGFX_BUFFER_NONE BUFFER_NONE}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ BUFFER_COMPUTE_READ}</td><td>{@link #BGFX_BUFFER_COMPUTE_WRITE BUFFER_COMPUTE_WRITE}</td><td>{@link #BGFX_BUFFER_DRAW_INDIRECT BUFFER_DRAW_INDIRECT}</td></tr><tr><td>{@link #BGFX_BUFFER_ALLOW_RESIZE BUFFER_ALLOW_RESIZE}</td><td>{@link #BGFX_BUFFER_INDEX32 BUFFER_INDEX32}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ_WRITE BUFFER_COMPUTE_READ_WRITE}</td></tr></table>
     */
    @NativeType("bgfx_dynamic_index_buffer_handle_t")
    public static short bgfx_create_dynamic_index_buffer_mem(@NativeType("bgfx_memory_t const *") BGFXMemory _mem, @NativeType("uint16_t") int _flags) {
        return nbgfx_create_dynamic_index_buffer_mem(_mem.address(), (short)_flags);
    }

    // --- [ bgfx_update_dynamic_index_buffer ] ---

    /** Unsafe version of: {@link #bgfx_update_dynamic_index_buffer update_dynamic_index_buffer} */
    public static void nbgfx_update_dynamic_index_buffer(short _handle, int _startIndex, long _mem) {
        long __functionAddress = Functions.update_dynamic_index_buffer;
        if (CHECKS) {
            BGFXMemory.validate(_mem);
        }
        invokePV(__functionAddress, _handle, _startIndex, _mem);
    }

    /**
     * Updates dynamic index buffer.
     *
     * @param _handle     dynamic index buffer handle
     * @param _startIndex start index
     * @param _mem        index buffer data
     */
    public static void bgfx_update_dynamic_index_buffer(@NativeType("bgfx_dynamic_index_buffer_handle_t") short _handle, @NativeType("uint32_t") int _startIndex, @NativeType("bgfx_memory_t const *") BGFXMemory _mem) {
        nbgfx_update_dynamic_index_buffer(_handle, _startIndex, _mem.address());
    }

    // --- [ bgfx_destroy_dynamic_index_buffer ] ---

    /**
     * Destroys dynamic index buffer.
     *
     * @param _handle the dynamic index buffer to destroy
     */
    public static void bgfx_destroy_dynamic_index_buffer(@NativeType("bgfx_dynamic_index_buffer_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_dynamic_index_buffer;
        invokeV(__functionAddress, _handle);
    }

    // --- [ bgfx_create_dynamic_vertex_buffer ] ---

    /** Unsafe version of: {@link #bgfx_create_dynamic_vertex_buffer create_dynamic_vertex_buffer} */
    public static short nbgfx_create_dynamic_vertex_buffer(int _num, long _decl, short _flags) {
        long __functionAddress = Functions.create_dynamic_vertex_buffer;
        return invokePS(__functionAddress, _num, _decl, _flags);
    }

    /**
     * Creates empty dynamic vertex buffer.
     *
     * @param _num   number of vertices
     * @param _decl  vertex declaration
     * @param _flags buffer creation flags. One or more of:<br><table><tr><td>{@link #BGFX_BUFFER_NONE BUFFER_NONE}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ BUFFER_COMPUTE_READ}</td><td>{@link #BGFX_BUFFER_COMPUTE_WRITE BUFFER_COMPUTE_WRITE}</td><td>{@link #BGFX_BUFFER_DRAW_INDIRECT BUFFER_DRAW_INDIRECT}</td></tr><tr><td>{@link #BGFX_BUFFER_ALLOW_RESIZE BUFFER_ALLOW_RESIZE}</td><td>{@link #BGFX_BUFFER_INDEX32 BUFFER_INDEX32}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ_WRITE BUFFER_COMPUTE_READ_WRITE}</td></tr></table>
     */
    @NativeType("bgfx_dynamic_vertex_buffer_handle_t")
    public static short bgfx_create_dynamic_vertex_buffer(@NativeType("uint32_t") int _num, @NativeType("bgfx_vertex_decl_t const *") BGFXVertexDecl _decl, @NativeType("uint16_t") int _flags) {
        return nbgfx_create_dynamic_vertex_buffer(_num, _decl.address(), (short)_flags);
    }

    // --- [ bgfx_create_dynamic_vertex_buffer_mem ] ---

    /** Unsafe version of: {@link #bgfx_create_dynamic_vertex_buffer_mem create_dynamic_vertex_buffer_mem} */
    public static short nbgfx_create_dynamic_vertex_buffer_mem(long _mem, long _decl, short _flags) {
        long __functionAddress = Functions.create_dynamic_vertex_buffer_mem;
        if (CHECKS) {
            BGFXMemory.validate(_mem);
        }
        return invokePPS(__functionAddress, _mem, _decl, _flags);
    }

    /**
     * Creates dynamic vertex buffer and initializes it.
     *
     * @param _mem   vertex buffer data
     * @param _decl  vertex declaration
     * @param _flags buffer creation flags. One or more of:<br><table><tr><td>{@link #BGFX_BUFFER_NONE BUFFER_NONE}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ BUFFER_COMPUTE_READ}</td><td>{@link #BGFX_BUFFER_COMPUTE_WRITE BUFFER_COMPUTE_WRITE}</td><td>{@link #BGFX_BUFFER_DRAW_INDIRECT BUFFER_DRAW_INDIRECT}</td></tr><tr><td>{@link #BGFX_BUFFER_ALLOW_RESIZE BUFFER_ALLOW_RESIZE}</td><td>{@link #BGFX_BUFFER_INDEX32 BUFFER_INDEX32}</td><td>{@link #BGFX_BUFFER_COMPUTE_READ_WRITE BUFFER_COMPUTE_READ_WRITE}</td></tr></table>
     */
    @NativeType("bgfx_dynamic_vertex_buffer_handle_t")
    public static short bgfx_create_dynamic_vertex_buffer_mem(@NativeType("bgfx_memory_t const *") BGFXMemory _mem, @NativeType("bgfx_vertex_decl_t const *") BGFXVertexDecl _decl, @NativeType("uint16_t") int _flags) {
        return nbgfx_create_dynamic_vertex_buffer_mem(_mem.address(), _decl.address(), (short)_flags);
    }

    // --- [ bgfx_update_dynamic_vertex_buffer ] ---

    /** Unsafe version of: {@link #bgfx_update_dynamic_vertex_buffer update_dynamic_vertex_buffer} */
    public static void nbgfx_update_dynamic_vertex_buffer(short _handle, int _startVertex, long _mem) {
        long __functionAddress = Functions.update_dynamic_vertex_buffer;
        if (CHECKS) {
            BGFXMemory.validate(_mem);
        }
        invokePV(__functionAddress, _handle, _startVertex, _mem);
    }

    /**
     * Updates dynamic vertex buffer.
     *
     * @param _handle      dynamic vertex buffer handle
     * @param _startVertex start vertex
     * @param _mem         vertex buffer data
     */
    public static void bgfx_update_dynamic_vertex_buffer(@NativeType("bgfx_dynamic_vertex_buffer_handle_t") short _handle, @NativeType("uint32_t") int _startVertex, @NativeType("bgfx_memory_t const *") BGFXMemory _mem) {
        nbgfx_update_dynamic_vertex_buffer(_handle, _startVertex, _mem.address());
    }

    // --- [ bgfx_destroy_dynamic_vertex_buffer ] ---

    /**
     * Destroys dynamic vertex buffer.
     *
     * @param _handle the dynamic vertex buffer to destroy
     */
    public static void bgfx_destroy_dynamic_vertex_buffer(@NativeType("bgfx_dynamic_vertex_buffer_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_dynamic_vertex_buffer;
        invokeV(__functionAddress, _handle);
    }

    // --- [ bgfx_get_avail_transient_index_buffer ] ---

    /**
     * Returns number of requested or maximum available indices.
     *
     * @param _num number of required indices
     */
    @NativeType("uint32_t")
    public static int bgfx_get_avail_transient_index_buffer(@NativeType("uint32_t") int _num) {
        long __functionAddress = Functions.get_avail_transient_index_buffer;
        return invokeI(__functionAddress, _num);
    }

    // --- [ bgfx_get_avail_transient_vertex_buffer ] ---

    /** Unsafe version of: {@link #bgfx_get_avail_transient_vertex_buffer get_avail_transient_vertex_buffer} */
    public static int nbgfx_get_avail_transient_vertex_buffer(int _num, long _decl) {
        long __functionAddress = Functions.get_avail_transient_vertex_buffer;
        return invokePI(__functionAddress, _num, _decl);
    }

    /**
     * Returns number of requested or maximum available vertices.
     *
     * @param _num  number of required vertices
     * @param _decl vertex declaration
     */
    @NativeType("uint32_t")
    public static int bgfx_get_avail_transient_vertex_buffer(@NativeType("uint32_t") int _num, @NativeType("bgfx_vertex_decl_t const *") BGFXVertexDecl _decl) {
        return nbgfx_get_avail_transient_vertex_buffer(_num, _decl.address());
    }

    // --- [ bgfx_get_avail_instance_data_buffer ] ---

    /** Unsafe version of: {@link #bgfx_get_avail_instance_data_buffer get_avail_instance_data_buffer} */
    public static int nbgfx_get_avail_instance_data_buffer(int _num, short _stride) {
        long __functionAddress = Functions.get_avail_instance_data_buffer;
        return invokeI(__functionAddress, _num, _stride);
    }

    /**
     * Returns number of requested or maximum available instance buffer slots.
     *
     * @param _num    number of required instances
     * @param _stride stride per instance
     */
    @NativeType("uint32_t")
    public static int bgfx_get_avail_instance_data_buffer(@NativeType("uint32_t") int _num, @NativeType("uint16_t") int _stride) {
        return nbgfx_get_avail_instance_data_buffer(_num, (short)_stride);
    }

    // --- [ bgfx_alloc_transient_index_buffer ] ---

    /** Unsafe version of: {@link #bgfx_alloc_transient_index_buffer alloc_transient_index_buffer} */
    public static void nbgfx_alloc_transient_index_buffer(long _tib, int _num) {
        long __functionAddress = Functions.alloc_transient_index_buffer;
        invokePV(__functionAddress, _tib, _num);
    }

    /**
     * Allocates transient index buffer.
     * 
     * <p>Only 16-bit index buffer is supported.</p>
     *
     * @param _tib {@link BGFXTransientIndexBuffer} structure is filled and is valid for the duration of frame, and it can be reused for multiple draw calls
     * @param _num number of indices to allocate
     */
    public static void bgfx_alloc_transient_index_buffer(@NativeType("bgfx_transient_index_buffer_t *") BGFXTransientIndexBuffer _tib, @NativeType("uint32_t") int _num) {
        nbgfx_alloc_transient_index_buffer(_tib.address(), _num);
    }

    // --- [ bgfx_alloc_transient_vertex_buffer ] ---

    /** Unsafe version of: {@link #bgfx_alloc_transient_vertex_buffer alloc_transient_vertex_buffer} */
    public static void nbgfx_alloc_transient_vertex_buffer(long _tvb, int _num, long _decl) {
        long __functionAddress = Functions.alloc_transient_vertex_buffer;
        invokePPV(__functionAddress, _tvb, _num, _decl);
    }

    /**
     * Allocates transient vertex buffer.
     *
     * @param _tvb  {@link BGFXTransientVertexBuffer} structure is filled and is valid for the duration of frame, and it can be reused for multiple draw calls
     * @param _num  number of vertices to allocate
     * @param _decl vertex declaration
     */
    public static void bgfx_alloc_transient_vertex_buffer(@NativeType("bgfx_transient_vertex_buffer_t *") BGFXTransientVertexBuffer _tvb, @NativeType("uint32_t") int _num, @NativeType("bgfx_vertex_decl_t const *") BGFXVertexDecl _decl) {
        nbgfx_alloc_transient_vertex_buffer(_tvb.address(), _num, _decl.address());
    }

    // --- [ bgfx_alloc_transient_buffers ] ---

    /** Unsafe version of: {@link #bgfx_alloc_transient_buffers alloc_transient_buffers} */
    public static boolean nbgfx_alloc_transient_buffers(long _tvb, long _decl, int _numVertices, long _tib, int _numIndices) {
        long __functionAddress = Functions.alloc_transient_buffers;
        return invokePPPZ(__functionAddress, _tvb, _decl, _numVertices, _tib, _numIndices);
    }

    /**
     * Checks for required space and allocates transient vertex and index buffers. If both space requirements are satisfied function returns true.
     * 
     * <p>Only 16-bit index buffer is supported.</p>
     *
     * @param _tvb         {@link BGFXTransientVertexBuffer} structure is filled and is valid for the duration of frame, and it can be reused for multiple draw calls
     * @param _decl        vertex declaration
     * @param _numVertices number of vertices to allocate
     * @param _tib         {@link BGFXTransientIndexBuffer} structure is filled and is valid for the duration of frame, and it can be reused for multiple draw calls
     * @param _numIndices  number of indices to allocate
     */
    @NativeType("bool")
    public static boolean bgfx_alloc_transient_buffers(@NativeType("bgfx_transient_vertex_buffer_t *") BGFXTransientVertexBuffer _tvb, @NativeType("bgfx_vertex_decl_t const *") BGFXVertexDecl _decl, @NativeType("uint32_t") int _numVertices, @NativeType("bgfx_transient_index_buffer_t *") BGFXTransientIndexBuffer _tib, @NativeType("uint32_t") int _numIndices) {
        return nbgfx_alloc_transient_buffers(_tvb.address(), _decl.address(), _numVertices, _tib.address(), _numIndices);
    }

    // --- [ bgfx_alloc_instance_data_buffer ] ---

    /** Unsafe version of: {@link #bgfx_alloc_instance_data_buffer alloc_instance_data_buffer} */
    public static void nbgfx_alloc_instance_data_buffer(long _idb, int _num, short _stride) {
        long __functionAddress = Functions.alloc_instance_data_buffer;
        invokePV(__functionAddress, _idb, _num, _stride);
    }

    /**
     * Allocates instance data buffer.
     *
     * @param _idb    {@link BGFXInstanceDataBuffer} structure is filled and is valid for duration of frame, and it can be reused for multiple draw calls
     * @param _num    number of instances
     * @param _stride instance stride. Must be multiple of 16
     */
    public static void bgfx_alloc_instance_data_buffer(@NativeType("bgfx_instance_data_buffer_t *") BGFXInstanceDataBuffer _idb, @NativeType("uint32_t") int _num, @NativeType("uint16_t") int _stride) {
        nbgfx_alloc_instance_data_buffer(_idb.address(), _num, (short)_stride);
    }

    // --- [ bgfx_create_indirect_buffer ] ---

    /**
     * Creates draw indirect buffer.
     *
     * @param _num number of indirect calls
     */
    @NativeType("bgfx_indirect_buffer_handle_t")
    public static short bgfx_create_indirect_buffer(@NativeType("uint32_t") int _num) {
        long __functionAddress = Functions.create_indirect_buffer;
        return invokeS(__functionAddress, _num);
    }

    // --- [ bgfx_destroy_indirect_buffer ] ---

    /**
     * Destroys draw indirect buffer.
     *
     * @param _handle the draw indirect buffer to destroy
     */
    public static void bgfx_destroy_indirect_buffer(@NativeType("bgfx_indirect_buffer_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_indirect_buffer;
        invokeV(__functionAddress, _handle);
    }

    // --- [ bgfx_create_shader ] ---

    /** Unsafe version of: {@link #bgfx_create_shader create_shader} */
    public static short nbgfx_create_shader(long _mem) {
        long __functionAddress = Functions.create_shader;
        if (CHECKS) {
            BGFXMemory.validate(_mem);
        }
        return invokePS(__functionAddress, _mem);
    }

    /**
     * Creates shader from memory buffer.
     *
     * @param _mem 
     */
    @NativeType("bgfx_shader_handle_t")
    public static short bgfx_create_shader(@NativeType("bgfx_memory_t const *") BGFXMemory _mem) {
        return nbgfx_create_shader(_mem.address());
    }

    // --- [ bgfx_get_shader_uniforms ] ---

    /**
     * Unsafe version of: {@link #bgfx_get_shader_uniforms get_shader_uniforms}
     *
     * @param _max maximum capacity of {@code _uniforms}
     */
    public static short nbgfx_get_shader_uniforms(short _handle, long _uniforms, short _max) {
        long __functionAddress = Functions.get_shader_uniforms;
        return invokePS(__functionAddress, _handle, _uniforms, _max);
    }

    /**
     * Returns the number of uniforms and uniform handles used inside shader.
     * 
     * <p>Only non-predefined uniforms are returned.</p>
     *
     * @param _handle   shader handle
     * @param _uniforms {@code bgfx_uniform_handle_t} array where data will be stored
     *
     * @return number of uniforms used by shader
     */
    @NativeType("uint16_t")
    public static short bgfx_get_shader_uniforms(@NativeType("bgfx_shader_handle_t") short _handle, @NativeType("bgfx_uniform_handle_t *") ShortBuffer _uniforms) {
        return nbgfx_get_shader_uniforms(_handle, memAddress(_uniforms), (short)_uniforms.remaining());
    }

    // --- [ bgfx_set_shader_name ] ---

    /** Unsafe version of: {@link #bgfx_set_shader_name set_shader_name} */
    public static void nbgfx_set_shader_name(short _handle, long _name) {
        long __functionAddress = Functions.set_shader_name;
        invokePV(__functionAddress, _handle, _name);
    }

    /**
     * Sets shader debug name.
     *
     * @param _handle shader handle
     * @param _name   shader name
     */
    public static void bgfx_set_shader_name(@NativeType("bgfx_shader_handle_t") short _handle, @NativeType("char const *") ByteBuffer _name) {
        if (CHECKS) {
            checkNT1(_name);
        }
        nbgfx_set_shader_name(_handle, memAddress(_name));
    }

    /**
     * Sets shader debug name.
     *
     * @param _handle shader handle
     * @param _name   shader name
     */
    public static void bgfx_set_shader_name(@NativeType("bgfx_shader_handle_t") short _handle, @NativeType("char const *") CharSequence _name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer _nameEncoded = stack.UTF8(_name);
            nbgfx_set_shader_name(_handle, memAddress(_nameEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bgfx_destroy_shader ] ---

    /**
     * Destroys shader. Once a shader program is created with {@code _handle}, it is safe to destroy that shader.
     *
     * @param _handle the shader  to destroy
     */
    public static void bgfx_destroy_shader(@NativeType("bgfx_shader_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_shader;
        invokeV(__functionAddress, _handle);
    }

    // --- [ bgfx_create_program ] ---

    /**
     * Creates program with vertex and fragment shaders.
     *
     * @param _vsh            vertex shader
     * @param _fsh            fragment shader
     * @param _destroyShaders if true, shaders will be destroyed when program is destroyed
     *
     * @return program handle if vertex shader output and fragment shader input are matching, otherwise returns invalid program handle.
     */
    @NativeType("bgfx_program_handle_t")
    public static short bgfx_create_program(@NativeType("bgfx_shader_handle_t") short _vsh, @NativeType("bgfx_shader_handle_t") short _fsh, @NativeType("bool") boolean _destroyShaders) {
        long __functionAddress = Functions.create_program;
        return invokeS(__functionAddress, _vsh, _fsh, _destroyShaders);
    }

    // --- [ bgfx_create_compute_program ] ---

    /**
     * Creates program with compute shader.
     *
     * @param _csh            compute shader
     * @param _destroyShaders if true, shader will be destroyed when program is destroyed
     */
    @NativeType("bgfx_program_handle_t")
    public static short bgfx_create_compute_program(@NativeType("bgfx_shader_handle_t") short _csh, @NativeType("bool") boolean _destroyShaders) {
        long __functionAddress = Functions.create_compute_program;
        return invokeS(__functionAddress, _csh, _destroyShaders);
    }

    // --- [ bgfx_destroy_program ] ---

    /**
     * Destroy program.
     *
     * @param _handle the program to destroy
     */
    public static void bgfx_destroy_program(@NativeType("bgfx_program_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_program;
        invokeV(__functionAddress, _handle);
    }

    // --- [ bgfx_is_texture_valid ] ---

    /** Unsafe version of: {@link #bgfx_is_texture_valid is_texture_valid} */
    public static boolean nbgfx_is_texture_valid(short _depth, boolean _cubeMap, short _numLayers, int _format, int _flags) {
        long __functionAddress = Functions.is_texture_valid;
        return invokeZ(__functionAddress, _depth, _cubeMap, _numLayers, _format, _flags);
    }

    /**
     * Validate texture parameters.
     *
     * @param _depth     depth dimension of volume texture
     * @param _cubeMap   indicates that texture contains cubemap
     * @param _numLayers number of layers in texture array
     * @param _format    texture format. One of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG11B10F TEXTURE_FORMAT_RG11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
     * @param _flags     texture flags. One or more of:<br><table><tr><td>{@link #BGFX_TEXTURE_NONE TEXTURE_NONE}</td><td>{@link #BGFX_TEXTURE_U_MIRROR TEXTURE_U_MIRROR}</td><td>{@link #BGFX_TEXTURE_U_CLAMP TEXTURE_U_CLAMP}</td><td>{@link #BGFX_TEXTURE_U_BORDER TEXTURE_U_BORDER}</td></tr><tr><td>{@link #BGFX_TEXTURE_V_MIRROR TEXTURE_V_MIRROR}</td><td>{@link #BGFX_TEXTURE_V_CLAMP TEXTURE_V_CLAMP}</td><td>{@link #BGFX_TEXTURE_V_BORDER TEXTURE_V_BORDER}</td><td>{@link #BGFX_TEXTURE_W_MIRROR TEXTURE_W_MIRROR}</td></tr><tr><td>{@link #BGFX_TEXTURE_W_CLAMP TEXTURE_W_CLAMP}</td><td>{@link #BGFX_TEXTURE_W_BORDER TEXTURE_W_BORDER}</td><td>{@link #BGFX_TEXTURE_MIN_POINT TEXTURE_MIN_POINT}</td><td>{@link #BGFX_TEXTURE_MIN_ANISOTROPIC TEXTURE_MIN_ANISOTROPIC}</td></tr><tr><td>{@link #BGFX_TEXTURE_MAG_POINT TEXTURE_MAG_POINT}</td><td>{@link #BGFX_TEXTURE_MAG_ANISOTROPIC TEXTURE_MAG_ANISOTROPIC}</td><td>{@link #BGFX_TEXTURE_MIP_POINT TEXTURE_MIP_POINT}</td><td>{@link #BGFX_TEXTURE_MSAA_SAMPLE TEXTURE_MSAA_SAMPLE}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT TEXTURE_RT}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X2 TEXTURE_RT_MSAA_X2}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X4 TEXTURE_RT_MSAA_X4}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X8 TEXTURE_RT_MSAA_X8}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT_MSAA_X16 TEXTURE_RT_MSAA_X16}</td><td>{@link #BGFX_TEXTURE_RT_WRITE_ONLY TEXTURE_RT_WRITE_ONLY}</td><td>{@link #BGFX_TEXTURE_COMPARE_LESS TEXTURE_COMPARE_LESS}</td><td>{@link #BGFX_TEXTURE_COMPARE_LEQUAL TEXTURE_COMPARE_LEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_EQUAL TEXTURE_COMPARE_EQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GEQUAL TEXTURE_COMPARE_GEQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GREATER TEXTURE_COMPARE_GREATER}</td><td>{@link #BGFX_TEXTURE_COMPARE_NOTEQUAL TEXTURE_COMPARE_NOTEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_NEVER TEXTURE_COMPARE_NEVER}</td><td>{@link #BGFX_TEXTURE_COMPARE_ALWAYS TEXTURE_COMPARE_ALWAYS}</td><td>{@link #BGFX_TEXTURE_COMPUTE_WRITE TEXTURE_COMPUTE_WRITE}</td><td>{@link #BGFX_TEXTURE_SRGB TEXTURE_SRGB}</td></tr><tr><td>{@link #BGFX_TEXTURE_BLIT_DST TEXTURE_BLIT_DST}</td><td>{@link #BGFX_TEXTURE_READ_BACK TEXTURE_READ_BACK}</td></tr></table>
     */
    @NativeType("bool")
    public static boolean bgfx_is_texture_valid(@NativeType("uint16_t") int _depth, @NativeType("bool") boolean _cubeMap, @NativeType("uint16_t") int _numLayers, @NativeType("bgfx_texture_format_t") int _format, @NativeType("uint32_t") int _flags) {
        return nbgfx_is_texture_valid((short)_depth, _cubeMap, (short)_numLayers, _format, _flags);
    }

    // --- [ bgfx_calc_texture_size ] ---

    /** Unsafe version of: {@link #bgfx_calc_texture_size calc_texture_size} */
    public static void nbgfx_calc_texture_size(long _info, short _width, short _height, short _depth, boolean _cubeMap, boolean _hasMips, short _numLayers, int _format) {
        long __functionAddress = Functions.calc_texture_size;
        invokePV(__functionAddress, _info, _width, _height, _depth, _cubeMap, _hasMips, _numLayers, _format);
    }

    /**
     * Calculates amount of memory required for texture.
     *
     * @param _info      resulting texture info structure
     * @param _width     width
     * @param _height    height
     * @param _depth     depth dimension of volume texture
     * @param _cubeMap   indicates that texture contains cubemap
     * @param _hasMips   indicates that texture contains full mip-map chain
     * @param _numLayers number of layers in texture array
     * @param _format    texture format. One of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG11B10F TEXTURE_FORMAT_RG11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
     */
    public static void bgfx_calc_texture_size(@NativeType("bgfx_texture_info_t *") BGFXTextureInfo _info, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("uint16_t") int _depth, @NativeType("bool") boolean _cubeMap, @NativeType("bool") boolean _hasMips, @NativeType("uint16_t") int _numLayers, @NativeType("bgfx_texture_format_t") int _format) {
        nbgfx_calc_texture_size(_info.address(), (short)_width, (short)_height, (short)_depth, _cubeMap, _hasMips, (short)_numLayers, _format);
    }

    // --- [ bgfx_create_texture ] ---

    /** Unsafe version of: {@link #bgfx_create_texture create_texture} */
    public static short nbgfx_create_texture(long _mem, int _flags, byte _skip, long _info) {
        long __functionAddress = Functions.create_texture;
        if (CHECKS) {
            BGFXMemory.validate(_mem);
        }
        return invokePPS(__functionAddress, _mem, _flags, _skip, _info);
    }

    /**
     * Creates texture from memory buffer.
     *
     * @param _mem   DDS, KTX or PVR texture data
     * @param _flags default texture sampling mode is linear, and wrap mode is repeat. One or more of:<br><table><tr><td>{@link #BGFX_TEXTURE_NONE TEXTURE_NONE}</td><td>{@link #BGFX_TEXTURE_U_MIRROR TEXTURE_U_MIRROR}</td><td>{@link #BGFX_TEXTURE_U_CLAMP TEXTURE_U_CLAMP}</td><td>{@link #BGFX_TEXTURE_U_BORDER TEXTURE_U_BORDER}</td></tr><tr><td>{@link #BGFX_TEXTURE_V_MIRROR TEXTURE_V_MIRROR}</td><td>{@link #BGFX_TEXTURE_V_CLAMP TEXTURE_V_CLAMP}</td><td>{@link #BGFX_TEXTURE_V_BORDER TEXTURE_V_BORDER}</td><td>{@link #BGFX_TEXTURE_W_MIRROR TEXTURE_W_MIRROR}</td></tr><tr><td>{@link #BGFX_TEXTURE_W_CLAMP TEXTURE_W_CLAMP}</td><td>{@link #BGFX_TEXTURE_W_BORDER TEXTURE_W_BORDER}</td><td>{@link #BGFX_TEXTURE_MIN_POINT TEXTURE_MIN_POINT}</td><td>{@link #BGFX_TEXTURE_MIN_ANISOTROPIC TEXTURE_MIN_ANISOTROPIC}</td></tr><tr><td>{@link #BGFX_TEXTURE_MAG_POINT TEXTURE_MAG_POINT}</td><td>{@link #BGFX_TEXTURE_MAG_ANISOTROPIC TEXTURE_MAG_ANISOTROPIC}</td><td>{@link #BGFX_TEXTURE_MIP_POINT TEXTURE_MIP_POINT}</td><td>{@link #BGFX_TEXTURE_MSAA_SAMPLE TEXTURE_MSAA_SAMPLE}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT TEXTURE_RT}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X2 TEXTURE_RT_MSAA_X2}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X4 TEXTURE_RT_MSAA_X4}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X8 TEXTURE_RT_MSAA_X8}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT_MSAA_X16 TEXTURE_RT_MSAA_X16}</td><td>{@link #BGFX_TEXTURE_RT_WRITE_ONLY TEXTURE_RT_WRITE_ONLY}</td><td>{@link #BGFX_TEXTURE_COMPARE_LESS TEXTURE_COMPARE_LESS}</td><td>{@link #BGFX_TEXTURE_COMPARE_LEQUAL TEXTURE_COMPARE_LEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_EQUAL TEXTURE_COMPARE_EQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GEQUAL TEXTURE_COMPARE_GEQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GREATER TEXTURE_COMPARE_GREATER}</td><td>{@link #BGFX_TEXTURE_COMPARE_NOTEQUAL TEXTURE_COMPARE_NOTEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_NEVER TEXTURE_COMPARE_NEVER}</td><td>{@link #BGFX_TEXTURE_COMPARE_ALWAYS TEXTURE_COMPARE_ALWAYS}</td><td>{@link #BGFX_TEXTURE_COMPUTE_WRITE TEXTURE_COMPUTE_WRITE}</td><td>{@link #BGFX_TEXTURE_SRGB TEXTURE_SRGB}</td></tr><tr><td>{@link #BGFX_TEXTURE_BLIT_DST TEXTURE_BLIT_DST}</td><td>{@link #BGFX_TEXTURE_READ_BACK TEXTURE_READ_BACK}</td></tr></table>
     * @param _skip  skip top level mips when parsing texture
     * @param _info  when non-{@code NULL} is specified it returns parsed texture information
     */
    @NativeType("bgfx_texture_handle_t")
    public static short bgfx_create_texture(@NativeType("bgfx_memory_t const *") BGFXMemory _mem, @NativeType("uint32_t") int _flags, @NativeType("uint8_t") int _skip, @Nullable @NativeType("bgfx_texture_info_t *") BGFXTextureInfo _info) {
        return nbgfx_create_texture(_mem.address(), _flags, (byte)_skip, memAddressSafe(_info));
    }

    // --- [ bgfx_create_texture_2d ] ---

    /** Unsafe version of: {@link #bgfx_create_texture_2d create_texture_2d} */
    public static short nbgfx_create_texture_2d(short _width, short _height, boolean _hasMips, short _numLayers, int _format, int _flags, long _mem) {
        long __functionAddress = Functions.create_texture_2d;
        if (CHECKS) {
            if (_mem != NULL) { BGFXMemory.validate(_mem); }
        }
        return invokePS(__functionAddress, _width, _height, _hasMips, _numLayers, _format, _flags, _mem);
    }

    /**
     * Creates 2D texture.
     *
     * @param _width     width
     * @param _height    height
     * @param _hasMips   indicates that texture contains full mip-map chain
     * @param _numLayers number of layers in texture array. Must be 1 if caps {@link #BGFX_CAPS_TEXTURE_2D_ARRAY CAPS_TEXTURE_2D_ARRAY} flag is not set.
     * @param _format    texture format. One of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG11B10F TEXTURE_FORMAT_RG11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
     * @param _flags     default texture sampling mode is linear, and wrap mode is repeat. One or more of:<br><table><tr><td>{@link #BGFX_TEXTURE_NONE TEXTURE_NONE}</td><td>{@link #BGFX_TEXTURE_U_MIRROR TEXTURE_U_MIRROR}</td><td>{@link #BGFX_TEXTURE_U_CLAMP TEXTURE_U_CLAMP}</td><td>{@link #BGFX_TEXTURE_U_BORDER TEXTURE_U_BORDER}</td></tr><tr><td>{@link #BGFX_TEXTURE_V_MIRROR TEXTURE_V_MIRROR}</td><td>{@link #BGFX_TEXTURE_V_CLAMP TEXTURE_V_CLAMP}</td><td>{@link #BGFX_TEXTURE_V_BORDER TEXTURE_V_BORDER}</td><td>{@link #BGFX_TEXTURE_W_MIRROR TEXTURE_W_MIRROR}</td></tr><tr><td>{@link #BGFX_TEXTURE_W_CLAMP TEXTURE_W_CLAMP}</td><td>{@link #BGFX_TEXTURE_W_BORDER TEXTURE_W_BORDER}</td><td>{@link #BGFX_TEXTURE_MIN_POINT TEXTURE_MIN_POINT}</td><td>{@link #BGFX_TEXTURE_MIN_ANISOTROPIC TEXTURE_MIN_ANISOTROPIC}</td></tr><tr><td>{@link #BGFX_TEXTURE_MAG_POINT TEXTURE_MAG_POINT}</td><td>{@link #BGFX_TEXTURE_MAG_ANISOTROPIC TEXTURE_MAG_ANISOTROPIC}</td><td>{@link #BGFX_TEXTURE_MIP_POINT TEXTURE_MIP_POINT}</td><td>{@link #BGFX_TEXTURE_MSAA_SAMPLE TEXTURE_MSAA_SAMPLE}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT TEXTURE_RT}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X2 TEXTURE_RT_MSAA_X2}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X4 TEXTURE_RT_MSAA_X4}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X8 TEXTURE_RT_MSAA_X8}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT_MSAA_X16 TEXTURE_RT_MSAA_X16}</td><td>{@link #BGFX_TEXTURE_RT_WRITE_ONLY TEXTURE_RT_WRITE_ONLY}</td><td>{@link #BGFX_TEXTURE_COMPARE_LESS TEXTURE_COMPARE_LESS}</td><td>{@link #BGFX_TEXTURE_COMPARE_LEQUAL TEXTURE_COMPARE_LEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_EQUAL TEXTURE_COMPARE_EQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GEQUAL TEXTURE_COMPARE_GEQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GREATER TEXTURE_COMPARE_GREATER}</td><td>{@link #BGFX_TEXTURE_COMPARE_NOTEQUAL TEXTURE_COMPARE_NOTEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_NEVER TEXTURE_COMPARE_NEVER}</td><td>{@link #BGFX_TEXTURE_COMPARE_ALWAYS TEXTURE_COMPARE_ALWAYS}</td><td>{@link #BGFX_TEXTURE_COMPUTE_WRITE TEXTURE_COMPUTE_WRITE}</td><td>{@link #BGFX_TEXTURE_SRGB TEXTURE_SRGB}</td></tr><tr><td>{@link #BGFX_TEXTURE_BLIT_DST TEXTURE_BLIT_DST}</td><td>{@link #BGFX_TEXTURE_READ_BACK TEXTURE_READ_BACK}</td></tr></table>
     * @param _mem       texture data. If {@code _mem} is non-{@code NULL}, created texture will be immutable. When {@code _numLayers} is more than 1, expected memory layout is
     *                   texture and all mips together for each array element.
     */
    @NativeType("bgfx_texture_handle_t")
    public static short bgfx_create_texture_2d(@NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("bool") boolean _hasMips, @NativeType("uint16_t") int _numLayers, @NativeType("bgfx_texture_format_t") int _format, @NativeType("uint32_t") int _flags, @Nullable @NativeType("bgfx_memory_t const *") BGFXMemory _mem) {
        return nbgfx_create_texture_2d((short)_width, (short)_height, _hasMips, (short)_numLayers, _format, _flags, memAddressSafe(_mem));
    }

    // --- [ bgfx_create_texture_2d_scaled ] ---

    /** Unsafe version of: {@link #bgfx_create_texture_2d_scaled create_texture_2d_scaled} */
    public static short nbgfx_create_texture_2d_scaled(int _ratio, boolean _hasMips, short _numLayers, int _format, int _flags) {
        long __functionAddress = Functions.create_texture_2d_scaled;
        return invokeS(__functionAddress, _ratio, _hasMips, _numLayers, _format, _flags);
    }

    /**
     * Creates frame buffer with size based on backbuffer ratio. Frame buffer will maintain ratio if back buffer resolution changes.
     *
     * @param _ratio     frame buffer size in respect to back-buffer size. One of:<br><table><tr><td>{@link #BGFX_BACKBUFFER_RATIO_EQUAL BACKBUFFER_RATIO_EQUAL}</td><td>{@link #BGFX_BACKBUFFER_RATIO_HALF BACKBUFFER_RATIO_HALF}</td><td>{@link #BGFX_BACKBUFFER_RATIO_QUARTER BACKBUFFER_RATIO_QUARTER}</td></tr><tr><td>{@link #BGFX_BACKBUFFER_RATIO_EIGHTH BACKBUFFER_RATIO_EIGHTH}</td><td>{@link #BGFX_BACKBUFFER_RATIO_SIXTEENTH BACKBUFFER_RATIO_SIXTEENTH}</td><td>{@link #BGFX_BACKBUFFER_RATIO_DOUBLE BACKBUFFER_RATIO_DOUBLE}</td></tr></table>
     * @param _hasMips   indicates that texture contains full mip-map chain
     * @param _numLayers number of layers in texture array. Must be 1 if caps {@link #BGFX_CAPS_TEXTURE_2D_ARRAY CAPS_TEXTURE_2D_ARRAY} flag is not set.
     * @param _format    texture format. One of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG11B10F TEXTURE_FORMAT_RG11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
     * @param _flags     default texture sampling mode is linear, and wrap mode is repeat. One or more of:<br><table><tr><td>{@link #BGFX_TEXTURE_NONE TEXTURE_NONE}</td><td>{@link #BGFX_TEXTURE_U_MIRROR TEXTURE_U_MIRROR}</td><td>{@link #BGFX_TEXTURE_U_CLAMP TEXTURE_U_CLAMP}</td><td>{@link #BGFX_TEXTURE_U_BORDER TEXTURE_U_BORDER}</td></tr><tr><td>{@link #BGFX_TEXTURE_V_MIRROR TEXTURE_V_MIRROR}</td><td>{@link #BGFX_TEXTURE_V_CLAMP TEXTURE_V_CLAMP}</td><td>{@link #BGFX_TEXTURE_V_BORDER TEXTURE_V_BORDER}</td><td>{@link #BGFX_TEXTURE_W_MIRROR TEXTURE_W_MIRROR}</td></tr><tr><td>{@link #BGFX_TEXTURE_W_CLAMP TEXTURE_W_CLAMP}</td><td>{@link #BGFX_TEXTURE_W_BORDER TEXTURE_W_BORDER}</td><td>{@link #BGFX_TEXTURE_MIN_POINT TEXTURE_MIN_POINT}</td><td>{@link #BGFX_TEXTURE_MIN_ANISOTROPIC TEXTURE_MIN_ANISOTROPIC}</td></tr><tr><td>{@link #BGFX_TEXTURE_MAG_POINT TEXTURE_MAG_POINT}</td><td>{@link #BGFX_TEXTURE_MAG_ANISOTROPIC TEXTURE_MAG_ANISOTROPIC}</td><td>{@link #BGFX_TEXTURE_MIP_POINT TEXTURE_MIP_POINT}</td><td>{@link #BGFX_TEXTURE_MSAA_SAMPLE TEXTURE_MSAA_SAMPLE}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT TEXTURE_RT}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X2 TEXTURE_RT_MSAA_X2}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X4 TEXTURE_RT_MSAA_X4}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X8 TEXTURE_RT_MSAA_X8}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT_MSAA_X16 TEXTURE_RT_MSAA_X16}</td><td>{@link #BGFX_TEXTURE_RT_WRITE_ONLY TEXTURE_RT_WRITE_ONLY}</td><td>{@link #BGFX_TEXTURE_COMPARE_LESS TEXTURE_COMPARE_LESS}</td><td>{@link #BGFX_TEXTURE_COMPARE_LEQUAL TEXTURE_COMPARE_LEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_EQUAL TEXTURE_COMPARE_EQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GEQUAL TEXTURE_COMPARE_GEQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GREATER TEXTURE_COMPARE_GREATER}</td><td>{@link #BGFX_TEXTURE_COMPARE_NOTEQUAL TEXTURE_COMPARE_NOTEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_NEVER TEXTURE_COMPARE_NEVER}</td><td>{@link #BGFX_TEXTURE_COMPARE_ALWAYS TEXTURE_COMPARE_ALWAYS}</td><td>{@link #BGFX_TEXTURE_COMPUTE_WRITE TEXTURE_COMPUTE_WRITE}</td><td>{@link #BGFX_TEXTURE_SRGB TEXTURE_SRGB}</td></tr><tr><td>{@link #BGFX_TEXTURE_BLIT_DST TEXTURE_BLIT_DST}</td><td>{@link #BGFX_TEXTURE_READ_BACK TEXTURE_READ_BACK}</td></tr></table>
     */
    @NativeType("bgfx_texture_handle_t")
    public static short bgfx_create_texture_2d_scaled(@NativeType("bgfx_backbuffer_ratio_t") int _ratio, @NativeType("bool") boolean _hasMips, @NativeType("uint16_t") int _numLayers, @NativeType("bgfx_texture_format_t") int _format, @NativeType("uint32_t") int _flags) {
        return nbgfx_create_texture_2d_scaled(_ratio, _hasMips, (short)_numLayers, _format, _flags);
    }

    // --- [ bgfx_create_texture_3d ] ---

    /** Unsafe version of: {@link #bgfx_create_texture_3d create_texture_3d} */
    public static short nbgfx_create_texture_3d(short _width, short _height, short _depth, boolean _hasMips, int _format, int _flags, long _mem) {
        long __functionAddress = Functions.create_texture_3d;
        if (CHECKS) {
            if (_mem != NULL) { BGFXMemory.validate(_mem); }
        }
        return invokePS(__functionAddress, _width, _height, _depth, _hasMips, _format, _flags, _mem);
    }

    /**
     * Creates 3D texture.
     *
     * @param _width   width
     * @param _height  height
     * @param _depth   depth
     * @param _hasMips indicates that texture contains full mip-map chain
     * @param _format  texture format. One of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG11B10F TEXTURE_FORMAT_RG11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
     * @param _flags   default texture sampling mode is linear, and wrap mode is repeat. One or more of:<br><table><tr><td>{@link #BGFX_TEXTURE_NONE TEXTURE_NONE}</td><td>{@link #BGFX_TEXTURE_U_MIRROR TEXTURE_U_MIRROR}</td><td>{@link #BGFX_TEXTURE_U_CLAMP TEXTURE_U_CLAMP}</td><td>{@link #BGFX_TEXTURE_U_BORDER TEXTURE_U_BORDER}</td></tr><tr><td>{@link #BGFX_TEXTURE_V_MIRROR TEXTURE_V_MIRROR}</td><td>{@link #BGFX_TEXTURE_V_CLAMP TEXTURE_V_CLAMP}</td><td>{@link #BGFX_TEXTURE_V_BORDER TEXTURE_V_BORDER}</td><td>{@link #BGFX_TEXTURE_W_MIRROR TEXTURE_W_MIRROR}</td></tr><tr><td>{@link #BGFX_TEXTURE_W_CLAMP TEXTURE_W_CLAMP}</td><td>{@link #BGFX_TEXTURE_W_BORDER TEXTURE_W_BORDER}</td><td>{@link #BGFX_TEXTURE_MIN_POINT TEXTURE_MIN_POINT}</td><td>{@link #BGFX_TEXTURE_MIN_ANISOTROPIC TEXTURE_MIN_ANISOTROPIC}</td></tr><tr><td>{@link #BGFX_TEXTURE_MAG_POINT TEXTURE_MAG_POINT}</td><td>{@link #BGFX_TEXTURE_MAG_ANISOTROPIC TEXTURE_MAG_ANISOTROPIC}</td><td>{@link #BGFX_TEXTURE_MIP_POINT TEXTURE_MIP_POINT}</td><td>{@link #BGFX_TEXTURE_MSAA_SAMPLE TEXTURE_MSAA_SAMPLE}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT TEXTURE_RT}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X2 TEXTURE_RT_MSAA_X2}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X4 TEXTURE_RT_MSAA_X4}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X8 TEXTURE_RT_MSAA_X8}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT_MSAA_X16 TEXTURE_RT_MSAA_X16}</td><td>{@link #BGFX_TEXTURE_RT_WRITE_ONLY TEXTURE_RT_WRITE_ONLY}</td><td>{@link #BGFX_TEXTURE_COMPARE_LESS TEXTURE_COMPARE_LESS}</td><td>{@link #BGFX_TEXTURE_COMPARE_LEQUAL TEXTURE_COMPARE_LEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_EQUAL TEXTURE_COMPARE_EQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GEQUAL TEXTURE_COMPARE_GEQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GREATER TEXTURE_COMPARE_GREATER}</td><td>{@link #BGFX_TEXTURE_COMPARE_NOTEQUAL TEXTURE_COMPARE_NOTEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_NEVER TEXTURE_COMPARE_NEVER}</td><td>{@link #BGFX_TEXTURE_COMPARE_ALWAYS TEXTURE_COMPARE_ALWAYS}</td><td>{@link #BGFX_TEXTURE_COMPUTE_WRITE TEXTURE_COMPUTE_WRITE}</td><td>{@link #BGFX_TEXTURE_SRGB TEXTURE_SRGB}</td></tr><tr><td>{@link #BGFX_TEXTURE_BLIT_DST TEXTURE_BLIT_DST}</td><td>{@link #BGFX_TEXTURE_READ_BACK TEXTURE_READ_BACK}</td></tr></table>
     * @param _mem     texture data. If {@code _mem} is non-{@code NULL}, created texture will be immutable.
     */
    @NativeType("bgfx_texture_handle_t")
    public static short bgfx_create_texture_3d(@NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("uint16_t") int _depth, @NativeType("bool") boolean _hasMips, @NativeType("bgfx_texture_format_t") int _format, @NativeType("uint32_t") int _flags, @Nullable @NativeType("bgfx_memory_t const *") BGFXMemory _mem) {
        return nbgfx_create_texture_3d((short)_width, (short)_height, (short)_depth, _hasMips, _format, _flags, memAddressSafe(_mem));
    }

    // --- [ bgfx_create_texture_cube ] ---

    /** Unsafe version of: {@link #bgfx_create_texture_cube create_texture_cube} */
    public static short nbgfx_create_texture_cube(short _size, boolean _hasMips, short _numLayers, int _format, int _flags, long _mem) {
        long __functionAddress = Functions.create_texture_cube;
        if (CHECKS) {
            if (_mem != NULL) { BGFXMemory.validate(_mem); }
        }
        return invokePS(__functionAddress, _size, _hasMips, _numLayers, _format, _flags, _mem);
    }

    /**
     * Creates Cube texture.
     *
     * @param _size      cube side size
     * @param _hasMips   indicates that texture contains full mip-map chain
     * @param _numLayers number of layers in texture array. Must be 1 if caps {@link #BGFX_CAPS_TEXTURE_CUBE_ARRAY CAPS_TEXTURE_CUBE_ARRAY} flag is not set.
     * @param _format    one of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG11B10F TEXTURE_FORMAT_RG11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
     * @param _flags     default texture sampling mode is linear, and wrap mode is repeat. One or more of:<br><table><tr><td>{@link #BGFX_TEXTURE_NONE TEXTURE_NONE}</td><td>{@link #BGFX_TEXTURE_U_MIRROR TEXTURE_U_MIRROR}</td><td>{@link #BGFX_TEXTURE_U_CLAMP TEXTURE_U_CLAMP}</td><td>{@link #BGFX_TEXTURE_U_BORDER TEXTURE_U_BORDER}</td></tr><tr><td>{@link #BGFX_TEXTURE_V_MIRROR TEXTURE_V_MIRROR}</td><td>{@link #BGFX_TEXTURE_V_CLAMP TEXTURE_V_CLAMP}</td><td>{@link #BGFX_TEXTURE_V_BORDER TEXTURE_V_BORDER}</td><td>{@link #BGFX_TEXTURE_W_MIRROR TEXTURE_W_MIRROR}</td></tr><tr><td>{@link #BGFX_TEXTURE_W_CLAMP TEXTURE_W_CLAMP}</td><td>{@link #BGFX_TEXTURE_W_BORDER TEXTURE_W_BORDER}</td><td>{@link #BGFX_TEXTURE_MIN_POINT TEXTURE_MIN_POINT}</td><td>{@link #BGFX_TEXTURE_MIN_ANISOTROPIC TEXTURE_MIN_ANISOTROPIC}</td></tr><tr><td>{@link #BGFX_TEXTURE_MAG_POINT TEXTURE_MAG_POINT}</td><td>{@link #BGFX_TEXTURE_MAG_ANISOTROPIC TEXTURE_MAG_ANISOTROPIC}</td><td>{@link #BGFX_TEXTURE_MIP_POINT TEXTURE_MIP_POINT}</td><td>{@link #BGFX_TEXTURE_MSAA_SAMPLE TEXTURE_MSAA_SAMPLE}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT TEXTURE_RT}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X2 TEXTURE_RT_MSAA_X2}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X4 TEXTURE_RT_MSAA_X4}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X8 TEXTURE_RT_MSAA_X8}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT_MSAA_X16 TEXTURE_RT_MSAA_X16}</td><td>{@link #BGFX_TEXTURE_RT_WRITE_ONLY TEXTURE_RT_WRITE_ONLY}</td><td>{@link #BGFX_TEXTURE_COMPARE_LESS TEXTURE_COMPARE_LESS}</td><td>{@link #BGFX_TEXTURE_COMPARE_LEQUAL TEXTURE_COMPARE_LEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_EQUAL TEXTURE_COMPARE_EQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GEQUAL TEXTURE_COMPARE_GEQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GREATER TEXTURE_COMPARE_GREATER}</td><td>{@link #BGFX_TEXTURE_COMPARE_NOTEQUAL TEXTURE_COMPARE_NOTEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_NEVER TEXTURE_COMPARE_NEVER}</td><td>{@link #BGFX_TEXTURE_COMPARE_ALWAYS TEXTURE_COMPARE_ALWAYS}</td><td>{@link #BGFX_TEXTURE_COMPUTE_WRITE TEXTURE_COMPUTE_WRITE}</td><td>{@link #BGFX_TEXTURE_SRGB TEXTURE_SRGB}</td></tr><tr><td>{@link #BGFX_TEXTURE_BLIT_DST TEXTURE_BLIT_DST}</td><td>{@link #BGFX_TEXTURE_READ_BACK TEXTURE_READ_BACK}</td></tr></table>
     * @param _mem       texture data. If {@code _mem} is non-{@code NULL}, created texture will be immutable. When {@code _numLayers} is more than 1, expected memory layout is
     *                   cubemap texture and all mips together for each array element.
     */
    @NativeType("bgfx_texture_handle_t")
    public static short bgfx_create_texture_cube(@NativeType("uint16_t") int _size, @NativeType("bool") boolean _hasMips, @NativeType("uint16_t") int _numLayers, @NativeType("bgfx_texture_format_t") int _format, @NativeType("uint32_t") int _flags, @Nullable @NativeType("bgfx_memory_t const *") BGFXMemory _mem) {
        return nbgfx_create_texture_cube((short)_size, _hasMips, (short)_numLayers, _format, _flags, memAddressSafe(_mem));
    }

    // --- [ bgfx_update_texture_2d ] ---

    /** Unsafe version of: {@link #bgfx_update_texture_2d update_texture_2d} */
    public static void nbgfx_update_texture_2d(short _handle, short _layer, byte _mip, short _x, short _y, short _width, short _height, long _mem, short _pitch) {
        long __functionAddress = Functions.update_texture_2d;
        if (CHECKS) {
            BGFXMemory.validate(_mem);
        }
        invokePV(__functionAddress, _handle, _layer, _mip, _x, _y, _width, _height, _mem, _pitch);
    }

    /**
     * Updates 2D texture.
     *
     * @param _handle texture handle
     * @param _layer  layers in texture array
     * @param _mip    mip level
     * @param _x      x offset in texture
     * @param _y      y offset in texture
     * @param _width  width of texture block
     * @param _height height of texture block
     * @param _mem    texture update data
     * @param _pitch  pitch of input image (bytes). When {@code _pitch} is set to {@code UINT16_MAX}, it will be calculated internally based on {@code _width}.
     */
    public static void bgfx_update_texture_2d(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("uint16_t") int _layer, @NativeType("uint8_t") int _mip, @NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("bgfx_memory_t const *") BGFXMemory _mem, @NativeType("uint16_t") int _pitch) {
        nbgfx_update_texture_2d(_handle, (short)_layer, (byte)_mip, (short)_x, (short)_y, (short)_width, (short)_height, _mem.address(), (short)_pitch);
    }

    // --- [ bgfx_update_texture_3d ] ---

    /** Unsafe version of: {@link #bgfx_update_texture_3d update_texture_3d} */
    public static void nbgfx_update_texture_3d(short _handle, byte _mip, short _x, short _y, short _z, short _width, short _height, short _depth, long _mem) {
        long __functionAddress = Functions.update_texture_3d;
        if (CHECKS) {
            BGFXMemory.validate(_mem);
        }
        invokePV(__functionAddress, _handle, _mip, _x, _y, _z, _width, _height, _depth, _mem);
    }

    /**
     * Updates 3D texture.
     *
     * @param _handle texture handle
     * @param _mip    mip level
     * @param _x      x offset in texture
     * @param _y      y offset in texture
     * @param _z      z offset in texture
     * @param _width  width of texture block
     * @param _height height of texture block
     * @param _depth  depth of texture block
     * @param _mem    texture update data
     */
    public static void bgfx_update_texture_3d(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("uint8_t") int _mip, @NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint16_t") int _z, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("uint16_t") int _depth, @NativeType("bgfx_memory_t const *") BGFXMemory _mem) {
        nbgfx_update_texture_3d(_handle, (byte)_mip, (short)_x, (short)_y, (short)_z, (short)_width, (short)_height, (short)_depth, _mem.address());
    }

    // --- [ bgfx_update_texture_cube ] ---

    /** Unsafe version of: {@link #bgfx_update_texture_cube update_texture_cube} */
    public static void nbgfx_update_texture_cube(short _handle, short _layer, byte _side, byte _mip, short _x, short _y, short _width, short _height, long _mem, short _pitch) {
        long __functionAddress = Functions.update_texture_cube;
        if (CHECKS) {
            BGFXMemory.validate(_mem);
        }
        invokePV(__functionAddress, _handle, _layer, _side, _mip, _x, _y, _width, _height, _mem, _pitch);
    }

    /**
     * Updates Cube texture.
     * 
     * <p>Cubemap sides: 0 is +X, 1 is -X, 2 is +Y, 3 is -Y, 4 is +Z, and 5 is -Z.</p>
     * 
     * <code><pre>
     *            +----------+
     *            |-z       2|
     *            | ^  +y    |
     *            | |        |    Unfolded cube:
     *            | +---->+x |
     * +----------+----------+----------+----------+
     * |+y       1|+y       4|+y       0|+y       5|
     * | ^  -x    | ^  +z    | ^  +x    | ^  -z    |
     * | |        | |        | |        | |        |
     * | +---->+z | +---->+x | +---->-z | +---->-x |
     * +----------+----------+----------+----------+
     *            |+z       3|
     *            | ^  -y    |
     *            | |        |
     *            | +---->+x |
     *            +----------+</pre></code>
     *
     * @param _handle texture handle
     * @param _layer  layers in texture array
     * @param _side   cubemap side. One of:<br><table><tr><td>{@link #BGFX_CUBE_MAP_POSITIVE_X CUBE_MAP_POSITIVE_X}</td><td>{@link #BGFX_CUBE_MAP_NEGATIVE_X CUBE_MAP_NEGATIVE_X}</td><td>{@link #BGFX_CUBE_MAP_POSITIVE_Y CUBE_MAP_POSITIVE_Y}</td><td>{@link #BGFX_CUBE_MAP_NEGATIVE_Y CUBE_MAP_NEGATIVE_Y}</td></tr><tr><td>{@link #BGFX_CUBE_MAP_POSITIVE_Z CUBE_MAP_POSITIVE_Z}</td><td>{@link #BGFX_CUBE_MAP_NEGATIVE_Z CUBE_MAP_NEGATIVE_Z}</td></tr></table>
     * @param _mip    mip level
     * @param _x      x offset in texture
     * @param _y      y offset in texture
     * @param _width  width of texture block
     * @param _height height of texture block
     * @param _mem    texture update data
     * @param _pitch  pitch of input image (bytes). When {@code _pitch} is set to {@code UINT16_MAX}, it will be calculated internally based on {@code _width}.
     */
    public static void bgfx_update_texture_cube(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("uint16_t") int _layer, @NativeType("uint8_t") byte _side, @NativeType("uint8_t") int _mip, @NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("bgfx_memory_t const *") BGFXMemory _mem, @NativeType("uint16_t") int _pitch) {
        nbgfx_update_texture_cube(_handle, (short)_layer, _side, (byte)_mip, (short)_x, (short)_y, (short)_width, (short)_height, _mem.address(), (short)_pitch);
    }

    // --- [ bgfx_read_texture ] ---

    /** Unsafe version of: {@link #bgfx_read_texture read_texture} */
    public static int nbgfx_read_texture(short _handle, long _data, byte _mip) {
        long __functionAddress = Functions.read_texture;
        return invokePI(__functionAddress, _handle, _data, _mip);
    }

    /**
     * Reads back texture content.
     * 
     * <p>Texture must be created with {@link #BGFX_TEXTURE_READ_BACK TEXTURE_READ_BACK} flag. Availability depends on {@link #BGFX_CAPS_TEXTURE_READ_BACK CAPS_TEXTURE_READ_BACK}.</p>
     *
     * @param _handle texture handle
     * @param _data   destination buffer
     * @param _mip    mip level
     *
     * @return frame number when the result will be available
     */
    @NativeType("uint32_t")
    public static int bgfx_read_texture(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("void *") ByteBuffer _data, @NativeType("uint8_t") int _mip) {
        return nbgfx_read_texture(_handle, memAddress(_data), (byte)_mip);
    }

    /**
     * Reads back texture content.
     * 
     * <p>Texture must be created with {@link #BGFX_TEXTURE_READ_BACK TEXTURE_READ_BACK} flag. Availability depends on {@link #BGFX_CAPS_TEXTURE_READ_BACK CAPS_TEXTURE_READ_BACK}.</p>
     *
     * @param _handle texture handle
     * @param _data   destination buffer
     * @param _mip    mip level
     *
     * @return frame number when the result will be available
     */
    @NativeType("uint32_t")
    public static int bgfx_read_texture(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("void *") ShortBuffer _data, @NativeType("uint8_t") int _mip) {
        return nbgfx_read_texture(_handle, memAddress(_data), (byte)_mip);
    }

    /**
     * Reads back texture content.
     * 
     * <p>Texture must be created with {@link #BGFX_TEXTURE_READ_BACK TEXTURE_READ_BACK} flag. Availability depends on {@link #BGFX_CAPS_TEXTURE_READ_BACK CAPS_TEXTURE_READ_BACK}.</p>
     *
     * @param _handle texture handle
     * @param _data   destination buffer
     * @param _mip    mip level
     *
     * @return frame number when the result will be available
     */
    @NativeType("uint32_t")
    public static int bgfx_read_texture(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("void *") IntBuffer _data, @NativeType("uint8_t") int _mip) {
        return nbgfx_read_texture(_handle, memAddress(_data), (byte)_mip);
    }

    /**
     * Reads back texture content.
     * 
     * <p>Texture must be created with {@link #BGFX_TEXTURE_READ_BACK TEXTURE_READ_BACK} flag. Availability depends on {@link #BGFX_CAPS_TEXTURE_READ_BACK CAPS_TEXTURE_READ_BACK}.</p>
     *
     * @param _handle texture handle
     * @param _data   destination buffer
     * @param _mip    mip level
     *
     * @return frame number when the result will be available
     */
    @NativeType("uint32_t")
    public static int bgfx_read_texture(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("void *") FloatBuffer _data, @NativeType("uint8_t") int _mip) {
        return nbgfx_read_texture(_handle, memAddress(_data), (byte)_mip);
    }

    // --- [ bgfx_set_texture_name ] ---

    /** Unsafe version of: {@link #bgfx_set_texture_name set_texture_name} */
    public static void nbgfx_set_texture_name(short _handle, long _name) {
        long __functionAddress = Functions.set_texture_name;
        invokePV(__functionAddress, _handle, _name);
    }

    /**
     * Sets texture debug name.
     *
     * @param _handle texture handle
     * @param _name   texture name
     */
    public static void bgfx_set_texture_name(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("char const *") ByteBuffer _name) {
        if (CHECKS) {
            checkNT1(_name);
        }
        nbgfx_set_texture_name(_handle, memAddress(_name));
    }

    /**
     * Sets texture debug name.
     *
     * @param _handle texture handle
     * @param _name   texture name
     */
    public static void bgfx_set_texture_name(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("char const *") CharSequence _name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer _nameEncoded = stack.UTF8(_name);
            nbgfx_set_texture_name(_handle, memAddress(_nameEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bgfx_get_direct_access_ptr ] ---

    /**
     * Returns texture direct access pointer.
     * 
     * <p>Returns pointer to texture memory. If returned pointer is {@code NULL} direct access is not available for this texture. If pointer is {@code UINTPTR_MAX}
     * sentinel value it means texture is pending creation. Pointer returned can be cached and it will be valid until texture is destroyed.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Availability depends on: {@link #BGFX_CAPS_TEXTURE_DIRECT_ACCESS CAPS_TEXTURE_DIRECT_ACCESS}. This feature is available on GPUs that have unified memory architecture (UMA) support.</p></div>
     *
     * @param _handle 
     */
    @NativeType("void *")
    public static long bgfx_get_direct_access_ptr(@NativeType("bgfx_texture_handle_t") short _handle) {
        long __functionAddress = Functions.get_direct_access_ptr;
        return invokeP(__functionAddress, _handle);
    }

    // --- [ bgfx_destroy_texture ] ---

    /**
     * Destroys texture.
     *
     * @param _handle texture handle
     */
    public static void bgfx_destroy_texture(@NativeType("bgfx_texture_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_texture;
        invokeV(__functionAddress, _handle);
    }

    // --- [ bgfx_create_frame_buffer ] ---

    /** Unsafe version of: {@link #bgfx_create_frame_buffer create_frame_buffer} */
    public static short nbgfx_create_frame_buffer(short _width, short _height, int _format, int _textureFlags) {
        long __functionAddress = Functions.create_frame_buffer;
        return invokeS(__functionAddress, _width, _height, _format, _textureFlags);
    }

    /**
     * Creates frame buffer (simple).
     *
     * @param _width        texture width
     * @param _height       texture height
     * @param _format       texture format. One of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG11B10F TEXTURE_FORMAT_RG11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
     * @param _textureFlags default texture sampling mode is linear, and wrap mode is repeat. One of:<br><table><tr><td>{@link #BGFX_TEXTURE_NONE TEXTURE_NONE}</td><td>{@link #BGFX_TEXTURE_U_MIRROR TEXTURE_U_MIRROR}</td><td>{@link #BGFX_TEXTURE_U_CLAMP TEXTURE_U_CLAMP}</td><td>{@link #BGFX_TEXTURE_U_BORDER TEXTURE_U_BORDER}</td></tr><tr><td>{@link #BGFX_TEXTURE_V_MIRROR TEXTURE_V_MIRROR}</td><td>{@link #BGFX_TEXTURE_V_CLAMP TEXTURE_V_CLAMP}</td><td>{@link #BGFX_TEXTURE_V_BORDER TEXTURE_V_BORDER}</td><td>{@link #BGFX_TEXTURE_W_MIRROR TEXTURE_W_MIRROR}</td></tr><tr><td>{@link #BGFX_TEXTURE_W_CLAMP TEXTURE_W_CLAMP}</td><td>{@link #BGFX_TEXTURE_W_BORDER TEXTURE_W_BORDER}</td><td>{@link #BGFX_TEXTURE_MIN_POINT TEXTURE_MIN_POINT}</td><td>{@link #BGFX_TEXTURE_MIN_ANISOTROPIC TEXTURE_MIN_ANISOTROPIC}</td></tr><tr><td>{@link #BGFX_TEXTURE_MAG_POINT TEXTURE_MAG_POINT}</td><td>{@link #BGFX_TEXTURE_MAG_ANISOTROPIC TEXTURE_MAG_ANISOTROPIC}</td><td>{@link #BGFX_TEXTURE_MIP_POINT TEXTURE_MIP_POINT}</td><td>{@link #BGFX_TEXTURE_MSAA_SAMPLE TEXTURE_MSAA_SAMPLE}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT TEXTURE_RT}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X2 TEXTURE_RT_MSAA_X2}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X4 TEXTURE_RT_MSAA_X4}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X8 TEXTURE_RT_MSAA_X8}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT_MSAA_X16 TEXTURE_RT_MSAA_X16}</td><td>{@link #BGFX_TEXTURE_RT_WRITE_ONLY TEXTURE_RT_WRITE_ONLY}</td><td>{@link #BGFX_TEXTURE_COMPARE_LESS TEXTURE_COMPARE_LESS}</td><td>{@link #BGFX_TEXTURE_COMPARE_LEQUAL TEXTURE_COMPARE_LEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_EQUAL TEXTURE_COMPARE_EQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GEQUAL TEXTURE_COMPARE_GEQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GREATER TEXTURE_COMPARE_GREATER}</td><td>{@link #BGFX_TEXTURE_COMPARE_NOTEQUAL TEXTURE_COMPARE_NOTEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_NEVER TEXTURE_COMPARE_NEVER}</td><td>{@link #BGFX_TEXTURE_COMPARE_ALWAYS TEXTURE_COMPARE_ALWAYS}</td><td>{@link #BGFX_TEXTURE_COMPUTE_WRITE TEXTURE_COMPUTE_WRITE}</td><td>{@link #BGFX_TEXTURE_SRGB TEXTURE_SRGB}</td></tr><tr><td>{@link #BGFX_TEXTURE_BLIT_DST TEXTURE_BLIT_DST}</td><td>{@link #BGFX_TEXTURE_READ_BACK TEXTURE_READ_BACK}</td></tr></table>
     *
     * @return handle to frame buffer object
     */
    @NativeType("bgfx_frame_buffer_handle_t")
    public static short bgfx_create_frame_buffer(@NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("bgfx_texture_format_t") int _format, @NativeType("uint32_t") int _textureFlags) {
        return nbgfx_create_frame_buffer((short)_width, (short)_height, _format, _textureFlags);
    }

    // --- [ bgfx_create_frame_buffer_scaled ] ---

    /**
     * Creates frame buffer with size based on backbuffer ratio. Frame buffer will maintain ratio if back buffer resolution changes.
     *
     * @param _ratio        frame buffer size in respect to back-buffer size. One of:<br><table><tr><td>{@link #BGFX_BACKBUFFER_RATIO_EQUAL BACKBUFFER_RATIO_EQUAL}</td><td>{@link #BGFX_BACKBUFFER_RATIO_HALF BACKBUFFER_RATIO_HALF}</td><td>{@link #BGFX_BACKBUFFER_RATIO_QUARTER BACKBUFFER_RATIO_QUARTER}</td></tr><tr><td>{@link #BGFX_BACKBUFFER_RATIO_EIGHTH BACKBUFFER_RATIO_EIGHTH}</td><td>{@link #BGFX_BACKBUFFER_RATIO_SIXTEENTH BACKBUFFER_RATIO_SIXTEENTH}</td><td>{@link #BGFX_BACKBUFFER_RATIO_DOUBLE BACKBUFFER_RATIO_DOUBLE}</td></tr></table>
     * @param _format       texture format. One of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG11B10F TEXTURE_FORMAT_RG11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
     * @param _textureFlags default texture sampling mode is linear, and wrap mode is repeat. One of:<br><table><tr><td>{@link #BGFX_TEXTURE_NONE TEXTURE_NONE}</td><td>{@link #BGFX_TEXTURE_U_MIRROR TEXTURE_U_MIRROR}</td><td>{@link #BGFX_TEXTURE_U_CLAMP TEXTURE_U_CLAMP}</td><td>{@link #BGFX_TEXTURE_U_BORDER TEXTURE_U_BORDER}</td></tr><tr><td>{@link #BGFX_TEXTURE_V_MIRROR TEXTURE_V_MIRROR}</td><td>{@link #BGFX_TEXTURE_V_CLAMP TEXTURE_V_CLAMP}</td><td>{@link #BGFX_TEXTURE_V_BORDER TEXTURE_V_BORDER}</td><td>{@link #BGFX_TEXTURE_W_MIRROR TEXTURE_W_MIRROR}</td></tr><tr><td>{@link #BGFX_TEXTURE_W_CLAMP TEXTURE_W_CLAMP}</td><td>{@link #BGFX_TEXTURE_W_BORDER TEXTURE_W_BORDER}</td><td>{@link #BGFX_TEXTURE_MIN_POINT TEXTURE_MIN_POINT}</td><td>{@link #BGFX_TEXTURE_MIN_ANISOTROPIC TEXTURE_MIN_ANISOTROPIC}</td></tr><tr><td>{@link #BGFX_TEXTURE_MAG_POINT TEXTURE_MAG_POINT}</td><td>{@link #BGFX_TEXTURE_MAG_ANISOTROPIC TEXTURE_MAG_ANISOTROPIC}</td><td>{@link #BGFX_TEXTURE_MIP_POINT TEXTURE_MIP_POINT}</td><td>{@link #BGFX_TEXTURE_MSAA_SAMPLE TEXTURE_MSAA_SAMPLE}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT TEXTURE_RT}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X2 TEXTURE_RT_MSAA_X2}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X4 TEXTURE_RT_MSAA_X4}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X8 TEXTURE_RT_MSAA_X8}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT_MSAA_X16 TEXTURE_RT_MSAA_X16}</td><td>{@link #BGFX_TEXTURE_RT_WRITE_ONLY TEXTURE_RT_WRITE_ONLY}</td><td>{@link #BGFX_TEXTURE_COMPARE_LESS TEXTURE_COMPARE_LESS}</td><td>{@link #BGFX_TEXTURE_COMPARE_LEQUAL TEXTURE_COMPARE_LEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_EQUAL TEXTURE_COMPARE_EQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GEQUAL TEXTURE_COMPARE_GEQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GREATER TEXTURE_COMPARE_GREATER}</td><td>{@link #BGFX_TEXTURE_COMPARE_NOTEQUAL TEXTURE_COMPARE_NOTEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_NEVER TEXTURE_COMPARE_NEVER}</td><td>{@link #BGFX_TEXTURE_COMPARE_ALWAYS TEXTURE_COMPARE_ALWAYS}</td><td>{@link #BGFX_TEXTURE_COMPUTE_WRITE TEXTURE_COMPUTE_WRITE}</td><td>{@link #BGFX_TEXTURE_SRGB TEXTURE_SRGB}</td></tr><tr><td>{@link #BGFX_TEXTURE_BLIT_DST TEXTURE_BLIT_DST}</td><td>{@link #BGFX_TEXTURE_READ_BACK TEXTURE_READ_BACK}</td></tr></table>
     *
     * @return handle to frame buffer object
     */
    @NativeType("bgfx_frame_buffer_handle_t")
    public static short bgfx_create_frame_buffer_scaled(@NativeType("bgfx_backbuffer_ratio_t") int _ratio, @NativeType("bgfx_texture_format_t") int _format, @NativeType("uint32_t") int _textureFlags) {
        long __functionAddress = Functions.create_frame_buffer_scaled;
        return invokeS(__functionAddress, _ratio, _format, _textureFlags);
    }

    // --- [ bgfx_create_frame_buffer_from_handles ] ---

    /**
     * Unsafe version of: {@link #bgfx_create_frame_buffer_from_handles create_frame_buffer_from_handles}
     *
     * @param _num number of texture attachments
     */
    public static short nbgfx_create_frame_buffer_from_handles(byte _num, long _handles, boolean _destroyTextures) {
        long __functionAddress = Functions.create_frame_buffer_from_handles;
        return invokePS(__functionAddress, _num, _handles, _destroyTextures);
    }

    /**
     * Creates MRT frame buffer from texture handles (simple).
     *
     * @param _handles         texture attachments
     * @param _destroyTextures if true, textures will be destroyed when frame buffer is destroyed
     *
     * @return handle to frame buffer object
     */
    @NativeType("bgfx_frame_buffer_handle_t")
    public static short bgfx_create_frame_buffer_from_handles(@NativeType("bgfx_texture_handle_t const *") ShortBuffer _handles, @NativeType("bool") boolean _destroyTextures) {
        return nbgfx_create_frame_buffer_from_handles((byte)_handles.remaining(), memAddress(_handles), _destroyTextures);
    }

    // --- [ bgfx_create_frame_buffer_from_attachment ] ---

    /**
     * Unsafe version of: {@link #bgfx_create_frame_buffer_from_attachment create_frame_buffer_from_attachment}
     *
     * @param _num number of texture attachments
     */
    public static short nbgfx_create_frame_buffer_from_attachment(byte _num, long _attachment, boolean _destroyTextures) {
        long __functionAddress = Functions.create_frame_buffer_from_attachment;
        return invokePS(__functionAddress, _num, _attachment, _destroyTextures);
    }

    /**
     * Create MRT frame buffer from texture handles with specific layer and mip level.
     *
     * @param _attachment      attachment texture info
     * @param _destroyTextures if true, textures will be destroyed when frame buffer is destroyed
     *
     * @return handle to frame buffer object
     */
    @NativeType("bgfx_frame_buffer_handle_t")
    public static short bgfx_create_frame_buffer_from_attachment(@NativeType("bgfx_attachment_t const *") BGFXAttachment.Buffer _attachment, @NativeType("bool") boolean _destroyTextures) {
        return nbgfx_create_frame_buffer_from_attachment((byte)_attachment.remaining(), _attachment.address(), _destroyTextures);
    }

    // --- [ bgfx_create_frame_buffer_from_nwh ] ---

    /** Unsafe version of: {@link #bgfx_create_frame_buffer_from_nwh create_frame_buffer_from_nwh} */
    public static short nbgfx_create_frame_buffer_from_nwh(long _nwh, short _width, short _height, int _depthFormat) {
        long __functionAddress = Functions.create_frame_buffer_from_nwh;
        if (CHECKS) {
            check(_nwh);
        }
        return invokePS(__functionAddress, _nwh, _width, _height, _depthFormat);
    }

    /**
     * Creates frame buffer for multiple window rendering.
     * 
     * <p>Frame buffer cannot be used for sampling.</p>
     *
     * @param _nwh         OS' target native window handle
     * @param _width       window back buffer width
     * @param _height      window back buffer height
     * @param _depthFormat window back buffer depth format. One of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG11B10F TEXTURE_FORMAT_RG11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
     *
     * @return handle to frame buffer object
     */
    @NativeType("bgfx_frame_buffer_handle_t")
    public static short bgfx_create_frame_buffer_from_nwh(@NativeType("void *") long _nwh, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("bgfx_texture_format_t") int _depthFormat) {
        return nbgfx_create_frame_buffer_from_nwh(_nwh, (short)_width, (short)_height, _depthFormat);
    }

    // --- [ bgfx_get_texture ] ---

    /** Unsafe version of: {@link #bgfx_get_texture get_texture} */
    public static short nbgfx_get_texture(short _handle, byte _attachment) {
        long __functionAddress = Functions.get_texture;
        return invokeS(__functionAddress, _handle, _attachment);
    }

    /**
     * Obtains texture handle of frame buffer attachment.
     *
     * @param _handle     frame buffer handle
     * @param _attachment frame buffer attachment index
     *
     * @return invalid texture handle if attachment index is not correct, or frame buffer is created with native window handle
     */
    @NativeType("bgfx_texture_handle_t")
    public static short bgfx_get_texture(@NativeType("bgfx_frame_buffer_handle_t") short _handle, @NativeType("uint8_t") int _attachment) {
        return nbgfx_get_texture(_handle, (byte)_attachment);
    }

    // --- [ bgfx_destroy_frame_buffer ] ---

    /**
     * Destroys frame buffer.
     *
     * @param _handle the frame buffer to destroy
     */
    public static void bgfx_destroy_frame_buffer(@NativeType("bgfx_frame_buffer_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_frame_buffer;
        invokeV(__functionAddress, _handle);
    }

    // --- [ bgfx_create_uniform ] ---

    /** Unsafe version of: {@link #bgfx_create_uniform create_uniform} */
    public static short nbgfx_create_uniform(long _name, int _type, short _num) {
        long __functionAddress = Functions.create_uniform;
        return invokePS(__functionAddress, _name, _type, _num);
    }

    /**
     * Creates shader uniform parameter.
     * 
     * <p>Uniform names are unique. It's valid to call {@code bgfx_create_uniform} multiple times with the same uniform name. The library will always return the
     * same handle, but the handle reference count will be incremented. This means that the same number of {@link #bgfx_destroy_uniform destroy_uniform} must be called to properly
     * destroy the uniform.</p>
     * 
     * <p>Predefined uniforms (declared in `bgfx_shader.sh`):</p>
     * 
     * <ul>
     * <li>{@code u_viewRect vec4(x, y, width, height)} - view rectangle for current view, in pixels.</li>
     * <li>{@code u_viewTexel vec4(1.0/width, 1.0/height, undef, undef)} - inverse width and height</li>
     * <li>{@code u_view mat4} - view matrix</li>
     * <li>{@code u_invView mat4} - inverted view matrix</li>
     * <li>{@code u_proj mat4} - projection matrix</li>
     * <li>{@code u_invProj mat4} - inverted projection matrix</li>
     * <li>{@code u_viewProj mat4} - concatenated view projection matrix</li>
     * <li>{@code u_invViewProj mat4} - concatenated inverted view projection matrix</li>
     * <li>{@code u_model mat4[BGFX_CONFIG_MAX_BONES]} - array of model matrices.</li>
     * <li>{@code u_modelView mat4} - concatenated model view matrix, only first model matrix from array is used.</li>
     * <li>{@code u_modelViewProj mat4} - concatenated model view projection matrix.</li>
     * <li>{@code u_alphaRef float} - alpha reference value for alpha test.</li>
     * </ul>
     *
     * @param _name uniform name in shader
     * @param _type type of uniform. One of:<br><table><tr><td>{@link #BGFX_UNIFORM_TYPE_INT1 UNIFORM_TYPE_INT1}</td><td>{@link #BGFX_UNIFORM_TYPE_END UNIFORM_TYPE_END}</td><td>{@link #BGFX_UNIFORM_TYPE_VEC4 UNIFORM_TYPE_VEC4}</td><td>{@link #BGFX_UNIFORM_TYPE_MAT3 UNIFORM_TYPE_MAT3}</td></tr><tr><td>{@link #BGFX_UNIFORM_TYPE_MAT4 UNIFORM_TYPE_MAT4}</td></tr></table>
     * @param _num  number of elements in array
     *
     * @return handle to uniform object
     */
    @NativeType("bgfx_uniform_handle_t")
    public static short bgfx_create_uniform(@NativeType("char const *") ByteBuffer _name, @NativeType("bgfx_uniform_type_t") int _type, @NativeType("uint16_t") int _num) {
        if (CHECKS) {
            checkNT1(_name);
        }
        return nbgfx_create_uniform(memAddress(_name), _type, (short)_num);
    }

    /**
     * Creates shader uniform parameter.
     * 
     * <p>Uniform names are unique. It's valid to call {@code bgfx_create_uniform} multiple times with the same uniform name. The library will always return the
     * same handle, but the handle reference count will be incremented. This means that the same number of {@link #bgfx_destroy_uniform destroy_uniform} must be called to properly
     * destroy the uniform.</p>
     * 
     * <p>Predefined uniforms (declared in `bgfx_shader.sh`):</p>
     * 
     * <ul>
     * <li>{@code u_viewRect vec4(x, y, width, height)} - view rectangle for current view, in pixels.</li>
     * <li>{@code u_viewTexel vec4(1.0/width, 1.0/height, undef, undef)} - inverse width and height</li>
     * <li>{@code u_view mat4} - view matrix</li>
     * <li>{@code u_invView mat4} - inverted view matrix</li>
     * <li>{@code u_proj mat4} - projection matrix</li>
     * <li>{@code u_invProj mat4} - inverted projection matrix</li>
     * <li>{@code u_viewProj mat4} - concatenated view projection matrix</li>
     * <li>{@code u_invViewProj mat4} - concatenated inverted view projection matrix</li>
     * <li>{@code u_model mat4[BGFX_CONFIG_MAX_BONES]} - array of model matrices.</li>
     * <li>{@code u_modelView mat4} - concatenated model view matrix, only first model matrix from array is used.</li>
     * <li>{@code u_modelViewProj mat4} - concatenated model view projection matrix.</li>
     * <li>{@code u_alphaRef float} - alpha reference value for alpha test.</li>
     * </ul>
     *
     * @param _name uniform name in shader
     * @param _type type of uniform. One of:<br><table><tr><td>{@link #BGFX_UNIFORM_TYPE_INT1 UNIFORM_TYPE_INT1}</td><td>{@link #BGFX_UNIFORM_TYPE_END UNIFORM_TYPE_END}</td><td>{@link #BGFX_UNIFORM_TYPE_VEC4 UNIFORM_TYPE_VEC4}</td><td>{@link #BGFX_UNIFORM_TYPE_MAT3 UNIFORM_TYPE_MAT3}</td></tr><tr><td>{@link #BGFX_UNIFORM_TYPE_MAT4 UNIFORM_TYPE_MAT4}</td></tr></table>
     * @param _num  number of elements in array
     *
     * @return handle to uniform object
     */
    @NativeType("bgfx_uniform_handle_t")
    public static short bgfx_create_uniform(@NativeType("char const *") CharSequence _name, @NativeType("bgfx_uniform_type_t") int _type, @NativeType("uint16_t") int _num) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer _nameEncoded = stack.ASCII(_name);
            return nbgfx_create_uniform(memAddress(_nameEncoded), _type, (short)_num);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bgfx_get_uniform_info ] ---

    /** Unsafe version of: {@link #bgfx_get_uniform_info get_uniform_info} */
    public static void nbgfx_get_uniform_info(short _handle, long _info) {
        long __functionAddress = Functions.get_uniform_info;
        invokePV(__functionAddress, _handle, _info);
    }

    /**
     * Retrieves uniform info.
     *
     * @param _handle handle to uniform object
     * @param _info   uniform info
     */
    public static void bgfx_get_uniform_info(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("bgfx_uniform_info_t *") BGFXUniformInfo _info) {
        nbgfx_get_uniform_info(_handle, _info.address());
    }

    // --- [ bgfx_destroy_uniform ] ---

    /**
     * Destroys shader uniform parameter.
     *
     * @param _handle handle to uniform object
     */
    public static void bgfx_destroy_uniform(@NativeType("bgfx_uniform_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_uniform;
        invokeV(__functionAddress, _handle);
    }

    // --- [ bgfx_create_occlusion_query ] ---

    /**
     * Creates occlusion query.
     *
     * @return handle to occlusion query object
     */
    @NativeType("bgfx_occlusion_query_handle_t")
    public static short bgfx_create_occlusion_query() {
        long __functionAddress = Functions.create_occlusion_query;
        return invokeS(__functionAddress);
    }

    // --- [ bgfx_get_result ] ---

    /** Unsafe version of: {@link #bgfx_get_result get_result} */
    public static int nbgfx_get_result(short _handle, long _result) {
        long __functionAddress = Functions.get_result;
        return invokePI(__functionAddress, _handle, _result);
    }

    /**
     * Retrieves occlusion query result from previous frame.
     *
     * @param _handle handle to occlusion query object
     * @param _result number of pixels that passed test. This argument can be {@code NULL} if result of occlusion query is not needed.
     *
     * @return occlusion query result
     */
    @NativeType("bgfx_occlusion_query_result_t")
    public static int bgfx_get_result(@NativeType("bgfx_occlusion_query_handle_t") short _handle, @Nullable @NativeType("int32_t *") IntBuffer _result) {
        if (CHECKS) {
            checkSafe(_result, 1);
        }
        return nbgfx_get_result(_handle, memAddressSafe(_result));
    }

    // --- [ bgfx_destroy_occlusion_query ] ---

    /**
     * Destroys occlusion query.
     *
     * @param _handle handle to occlusion query object
     */
    public static void bgfx_destroy_occlusion_query(@NativeType("bgfx_occlusion_query_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_occlusion_query;
        invokeV(__functionAddress, _handle);
    }

    // --- [ bgfx_set_palette_color ] ---

    /** Unsafe version of: {@link #bgfx_set_palette_color set_palette_color} */
    public static void nbgfx_set_palette_color(byte _index, long _rgba) {
        long __functionAddress = Functions.set_palette_color;
        invokePV(__functionAddress, _index, _rgba);
    }

    /**
     * Sets palette color value.
     *
     * @param _index index into palette
     * @param _rgba  packed 32-bit RGBA value
     */
    public static void bgfx_set_palette_color(@NativeType("uint8_t") int _index, @NativeType("float const *") FloatBuffer _rgba) {
        if (CHECKS) {
            check(_rgba, 4);
        }
        nbgfx_set_palette_color((byte)_index, memAddress(_rgba));
    }

    // --- [ bgfx_set_view_name ] ---

    /** Unsafe version of: {@link #bgfx_set_view_name set_view_name} */
    public static void nbgfx_set_view_name(short _id, long _name) {
        long __functionAddress = Functions.set_view_name;
        invokePV(__functionAddress, _id, _name);
    }

    /**
     * Sets view name.
     * 
     * <p>This is debug only feature. In graphics debugger view name will appear as:</p>
     * 
     * <code><pre>
     * "nnnce <view name>"
     *  ^  ^^ ^
     *  |  |+-- eye (L/R)
     *  |  +--- compute (C)
     *  +------ view id</pre></code>
     *
     * @param _id   view id
     * @param _name view name
     */
    public static void bgfx_set_view_name(@NativeType("bgfx_view_id_t") int _id, @NativeType("char const *") ByteBuffer _name) {
        if (CHECKS) {
            checkNT1(_name);
        }
        nbgfx_set_view_name((short)_id, memAddress(_name));
    }

    /**
     * Sets view name.
     * 
     * <p>This is debug only feature. In graphics debugger view name will appear as:</p>
     * 
     * <code><pre>
     * "nnnce <view name>"
     *  ^  ^^ ^
     *  |  |+-- eye (L/R)
     *  |  +--- compute (C)
     *  +------ view id</pre></code>
     *
     * @param _id   view id
     * @param _name view name
     */
    public static void bgfx_set_view_name(@NativeType("bgfx_view_id_t") int _id, @NativeType("char const *") CharSequence _name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer _nameEncoded = stack.ASCII(_name);
            nbgfx_set_view_name((short)_id, memAddress(_nameEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bgfx_set_view_rect ] ---

    /** Unsafe version of: {@link #bgfx_set_view_rect set_view_rect} */
    public static void nbgfx_set_view_rect(short _id, short _x, short _y, short _width, short _height) {
        long __functionAddress = Functions.set_view_rect;
        invokeV(__functionAddress, _id, _x, _y, _width, _height);
    }

    /**
     * Sets view rectangle. Draw primitive outside view will be clipped.
     *
     * @param _id     view id
     * @param _x      position x from the left corner of the window
     * @param _y      position y from the top corner of the window
     * @param _width  width of view port region
     * @param _height height of view port region
     */
    public static void bgfx_set_view_rect(@NativeType("bgfx_view_id_t") int _id, @NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height) {
        nbgfx_set_view_rect((short)_id, (short)_x, (short)_y, (short)_width, (short)_height);
    }

    // --- [ bgfx_set_view_rect_auto ] ---

    /** Unsafe version of: {@link #bgfx_set_view_rect_auto set_view_rect_auto} */
    public static void nbgfx_set_view_rect_auto(short _id, short _x, short _y, int _ratio) {
        long __functionAddress = Functions.set_view_rect_auto;
        invokeV(__functionAddress, _id, _x, _y, _ratio);
    }

    /**
     * Sets view rectangle. Draw primitive outside view will be clipped.
     *
     * @param _id    view id
     * @param _x     position x from the left corner of the window
     * @param _y     position y from the top corner of the window
     * @param _ratio width and height will be set in respect to back-buffer size. One of:<br><table><tr><td>{@link #BGFX_BACKBUFFER_RATIO_EQUAL BACKBUFFER_RATIO_EQUAL}</td><td>{@link #BGFX_BACKBUFFER_RATIO_HALF BACKBUFFER_RATIO_HALF}</td><td>{@link #BGFX_BACKBUFFER_RATIO_QUARTER BACKBUFFER_RATIO_QUARTER}</td></tr><tr><td>{@link #BGFX_BACKBUFFER_RATIO_EIGHTH BACKBUFFER_RATIO_EIGHTH}</td><td>{@link #BGFX_BACKBUFFER_RATIO_SIXTEENTH BACKBUFFER_RATIO_SIXTEENTH}</td><td>{@link #BGFX_BACKBUFFER_RATIO_DOUBLE BACKBUFFER_RATIO_DOUBLE}</td></tr></table>
     */
    public static void bgfx_set_view_rect_auto(@NativeType("bgfx_view_id_t") int _id, @NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("bgfx_backbuffer_ratio_t") int _ratio) {
        nbgfx_set_view_rect_auto((short)_id, (short)_x, (short)_y, _ratio);
    }

    // --- [ bgfx_set_view_scissor ] ---

    /** Unsafe version of: {@link #bgfx_set_view_scissor set_view_scissor} */
    public static void nbgfx_set_view_scissor(short _id, short _x, short _y, short _width, short _height) {
        long __functionAddress = Functions.set_view_scissor;
        invokeV(__functionAddress, _id, _x, _y, _width, _height);
    }

    /**
     * Sets view scissor. Draw primitive outside view will be clipped. When {@code _x}, {@code _y}, {@code _width} and {@code _height} are set to 0, scissor
     * will be disabled.
     *
     * @param _id     view id
     * @param _x      position x from the left corner of the window
     * @param _y      position y from the top corner of the window
     * @param _width  width of scissor region
     * @param _height height of scissor region
     */
    public static void bgfx_set_view_scissor(@NativeType("bgfx_view_id_t") int _id, @NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height) {
        nbgfx_set_view_scissor((short)_id, (short)_x, (short)_y, (short)_width, (short)_height);
    }

    // --- [ bgfx_set_view_clear ] ---

    /** Unsafe version of: {@link #bgfx_set_view_clear set_view_clear} */
    public static void nbgfx_set_view_clear(short _id, short _flags, int _rgba, float _depth, byte _stencil) {
        long __functionAddress = Functions.set_view_clear;
        invokeV(__functionAddress, _id, _flags, _rgba, _depth, _stencil);
    }

    /**
     * Sets view clear flags.
     *
     * @param _id      view id
     * @param _flags   clear flags. Use {@link #BGFX_CLEAR_NONE CLEAR_NONE} to remove any clear operation. One or more of:<br><table><tr><td>{@link #BGFX_CLEAR_NONE CLEAR_NONE}</td><td>{@link #BGFX_CLEAR_COLOR CLEAR_COLOR}</td><td>{@link #BGFX_CLEAR_DEPTH CLEAR_DEPTH}</td><td>{@link #BGFX_CLEAR_STENCIL CLEAR_STENCIL}</td></tr><tr><td>{@link #BGFX_CLEAR_DISCARD_COLOR_0 CLEAR_DISCARD_COLOR_0}</td><td>{@link #BGFX_CLEAR_DISCARD_COLOR_1 CLEAR_DISCARD_COLOR_1}</td><td>{@link #BGFX_CLEAR_DISCARD_COLOR_2 CLEAR_DISCARD_COLOR_2}</td><td>{@link #BGFX_CLEAR_DISCARD_COLOR_3 CLEAR_DISCARD_COLOR_3}</td></tr><tr><td>{@link #BGFX_CLEAR_DISCARD_COLOR_4 CLEAR_DISCARD_COLOR_4}</td><td>{@link #BGFX_CLEAR_DISCARD_COLOR_5 CLEAR_DISCARD_COLOR_5}</td><td>{@link #BGFX_CLEAR_DISCARD_COLOR_6 CLEAR_DISCARD_COLOR_6}</td><td>{@link #BGFX_CLEAR_DISCARD_COLOR_7 CLEAR_DISCARD_COLOR_7}</td></tr><tr><td>{@link #BGFX_CLEAR_DISCARD_DEPTH CLEAR_DISCARD_DEPTH}</td><td>{@link #BGFX_CLEAR_DISCARD_STENCIL CLEAR_DISCARD_STENCIL}</td><td>{@link #BGFX_CLEAR_DISCARD_COLOR_MASK CLEAR_DISCARD_COLOR_MASK}</td><td>{@link #BGFX_CLEAR_DISCARD_MASK CLEAR_DISCARD_MASK}</td></tr></table>
     * @param _rgba    color clear value
     * @param _depth   depth clear value
     * @param _stencil stencil clear value
     */
    public static void bgfx_set_view_clear(@NativeType("bgfx_view_id_t") int _id, @NativeType("uint16_t") int _flags, @NativeType("uint32_t") int _rgba, float _depth, @NativeType("uint8_t") int _stencil) {
        nbgfx_set_view_clear((short)_id, (short)_flags, _rgba, _depth, (byte)_stencil);
    }

    // --- [ bgfx_set_view_clear_mrt ] ---

    /** Unsafe version of: {@link #bgfx_set_view_clear_mrt set_view_clear_mrt} */
    public static void nbgfx_set_view_clear_mrt(short _id, short _flags, float _depth, byte _stencil, byte _0, byte _1, byte _2, byte _3, byte _4, byte _5, byte _6, byte _7) {
        long __functionAddress = Functions.set_view_clear_mrt;
        invokeV(__functionAddress, _id, _flags, _depth, _stencil, _0, _1, _2, _3, _4, _5, _6, _7);
    }

    /**
     * Sets view clear flags with different clear color for each frame buffer texture. Must use {@code setClearColor} to setup clear color palette.
     *
     * @param _id      view id
     * @param _flags   clear flags. Use {@link #BGFX_CLEAR_NONE CLEAR_NONE} to remove any clear operation. One or more of:<br><table><tr><td>{@link #BGFX_CLEAR_NONE CLEAR_NONE}</td><td>{@link #BGFX_CLEAR_COLOR CLEAR_COLOR}</td><td>{@link #BGFX_CLEAR_DEPTH CLEAR_DEPTH}</td><td>{@link #BGFX_CLEAR_STENCIL CLEAR_STENCIL}</td></tr><tr><td>{@link #BGFX_CLEAR_DISCARD_COLOR_0 CLEAR_DISCARD_COLOR_0}</td><td>{@link #BGFX_CLEAR_DISCARD_COLOR_1 CLEAR_DISCARD_COLOR_1}</td><td>{@link #BGFX_CLEAR_DISCARD_COLOR_2 CLEAR_DISCARD_COLOR_2}</td><td>{@link #BGFX_CLEAR_DISCARD_COLOR_3 CLEAR_DISCARD_COLOR_3}</td></tr><tr><td>{@link #BGFX_CLEAR_DISCARD_COLOR_4 CLEAR_DISCARD_COLOR_4}</td><td>{@link #BGFX_CLEAR_DISCARD_COLOR_5 CLEAR_DISCARD_COLOR_5}</td><td>{@link #BGFX_CLEAR_DISCARD_COLOR_6 CLEAR_DISCARD_COLOR_6}</td><td>{@link #BGFX_CLEAR_DISCARD_COLOR_7 CLEAR_DISCARD_COLOR_7}</td></tr><tr><td>{@link #BGFX_CLEAR_DISCARD_DEPTH CLEAR_DISCARD_DEPTH}</td><td>{@link #BGFX_CLEAR_DISCARD_STENCIL CLEAR_DISCARD_STENCIL}</td><td>{@link #BGFX_CLEAR_DISCARD_COLOR_MASK CLEAR_DISCARD_COLOR_MASK}</td><td>{@link #BGFX_CLEAR_DISCARD_MASK CLEAR_DISCARD_MASK}</td></tr></table>
     * @param _depth   depth clear value
     * @param _stencil stencil clear value
     * @param _0       palette index for frame buffer attachment 0
     * @param _1       palette index for frame buffer attachment 1
     * @param _2       palette index for frame buffer attachment 2
     * @param _3       palette index for frame buffer attachment 3
     * @param _4       palette index for frame buffer attachment 4
     * @param _5       palette index for frame buffer attachment 5
     * @param _6       palette index for frame buffer attachment 6
     * @param _7       palette index for frame buffer attachment 7
     */
    public static void bgfx_set_view_clear_mrt(@NativeType("bgfx_view_id_t") int _id, @NativeType("uint16_t") int _flags, float _depth, @NativeType("uint8_t") int _stencil, @NativeType("uint8_t") byte _0, @NativeType("uint8_t") byte _1, @NativeType("uint8_t") byte _2, @NativeType("uint8_t") byte _3, @NativeType("uint8_t") byte _4, @NativeType("uint8_t") byte _5, @NativeType("uint8_t") byte _6, @NativeType("uint8_t") byte _7) {
        nbgfx_set_view_clear_mrt((short)_id, (short)_flags, _depth, (byte)_stencil, _0, _1, _2, _3, _4, _5, _6, _7);
    }

    // --- [ bgfx_set_view_mode ] ---

    /** Unsafe version of: {@link #bgfx_set_view_mode set_view_mode} */
    public static void nbgfx_set_view_mode(short _id, int _mode) {
        long __functionAddress = Functions.set_view_mode;
        invokeV(__functionAddress, _id, _mode);
    }

    /**
     * Sets view sorting mode.
     *
     * @param _id   view id
     * @param _mode view sort mode. One of:<br><table><tr><td>{@link #BGFX_VIEW_MODE_DEFAULT VIEW_MODE_DEFAULT}</td><td>{@link #BGFX_VIEW_MODE_SEQUENTIAL VIEW_MODE_SEQUENTIAL}</td><td>{@link #BGFX_VIEW_MODE_DEPTH_ASCENDING VIEW_MODE_DEPTH_ASCENDING}</td></tr><tr><td>{@link #BGFX_VIEW_MODE_DEPTH_DESCENDING VIEW_MODE_DEPTH_DESCENDING}</td><td>{@link #BGFX_VIEW_MODE_CCOUNT VIEW_MODE_CCOUNT}</td></tr></table>
     */
    public static void bgfx_set_view_mode(@NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_view_mode_t") int _mode) {
        nbgfx_set_view_mode((short)_id, _mode);
    }

    // --- [ bgfx_set_view_frame_buffer ] ---

    /** Unsafe version of: {@link #bgfx_set_view_frame_buffer set_view_frame_buffer} */
    public static void nbgfx_set_view_frame_buffer(short _id, short _handle) {
        long __functionAddress = Functions.set_view_frame_buffer;
        invokeV(__functionAddress, _id, _handle);
    }

    /**
     * Sets view frame buffer.
     * 
     * <p>Not persistent after {@link #bgfx_reset reset} call.</p>
     *
     * @param _id     view id
     * @param _handle frame buffer handle. Passing {@link #BGFX_INVALID_HANDLE INVALID_HANDLE} as frame buffer handle will draw primitives from this view into default back buffer.
     */
    public static void bgfx_set_view_frame_buffer(@NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_frame_buffer_handle_t") short _handle) {
        nbgfx_set_view_frame_buffer((short)_id, _handle);
    }

    // --- [ bgfx_set_view_transform ] ---

    /** Unsafe version of: {@link #bgfx_set_view_transform set_view_transform} */
    public static void nbgfx_set_view_transform(short _id, long _view, long _proj) {
        long __functionAddress = Functions.set_view_transform;
        invokePPV(__functionAddress, _id, _view, _proj);
    }

    /**
     * Sets view view and projection matrices, all draw primitives in this view will use these matrices.
     *
     * @param _id   view id
     * @param _view view matrix
     * @param _proj projection matrix
     */
    public static void bgfx_set_view_transform(@NativeType("bgfx_view_id_t") int _id, @Nullable @NativeType("void const *") ByteBuffer _view, @Nullable @NativeType("void const *") ByteBuffer _proj) {
        if (CHECKS) {
            checkSafe(_view, 64);
            checkSafe(_proj, 64);
        }
        nbgfx_set_view_transform((short)_id, memAddressSafe(_view), memAddressSafe(_proj));
    }

    /**
     * Sets view view and projection matrices, all draw primitives in this view will use these matrices.
     *
     * @param _id   view id
     * @param _view view matrix
     * @param _proj projection matrix
     */
    public static void bgfx_set_view_transform(@NativeType("bgfx_view_id_t") int _id, @Nullable @NativeType("void const *") FloatBuffer _view, @Nullable @NativeType("void const *") FloatBuffer _proj) {
        if (CHECKS) {
            checkSafe(_view, 64 >> 2);
            checkSafe(_proj, 64 >> 2);
        }
        nbgfx_set_view_transform((short)_id, memAddressSafe(_view), memAddressSafe(_proj));
    }

    // --- [ bgfx_set_view_transform_stereo ] ---

    /** Unsafe version of: {@link #bgfx_set_view_transform_stereo set_view_transform_stereo} */
    public static void nbgfx_set_view_transform_stereo(short _id, long _view, long _projL, byte _flags, long _projR) {
        long __functionAddress = Functions.set_view_transform_stereo;
        invokePPPV(__functionAddress, _id, _view, _projL, _flags, _projR);
    }

    /**
     * Sets view view and projection matrices, all draw primitives in this view will use these matrices.
     *
     * @param _id    view id
     * @param _view  project matrix
     * @param _projL projection matrix for left eye in stereo mode
     * @param _flags view flags. One of:<br><table><tr><td>{@link #BGFX_VIEW_NONE VIEW_NONE}</td><td>{@link #BGFX_VIEW_STEREO VIEW_STEREO}</td></tr></table>
     * @param _projR projection matrix for right eye in stereo mode
     */
    public static void bgfx_set_view_transform_stereo(@NativeType("bgfx_view_id_t") int _id, @Nullable @NativeType("void const *") ByteBuffer _view, @Nullable @NativeType("void const *") ByteBuffer _projL, @NativeType("uint8_t") int _flags, @Nullable @NativeType("void const *") ByteBuffer _projR) {
        if (CHECKS) {
            checkSafe(_view, 64);
            checkSafe(_projL, 64);
            checkSafe(_projR, 64);
        }
        nbgfx_set_view_transform_stereo((short)_id, memAddressSafe(_view), memAddressSafe(_projL), (byte)_flags, memAddressSafe(_projR));
    }

    /**
     * Sets view view and projection matrices, all draw primitives in this view will use these matrices.
     *
     * @param _id    view id
     * @param _view  project matrix
     * @param _projL projection matrix for left eye in stereo mode
     * @param _flags view flags. One of:<br><table><tr><td>{@link #BGFX_VIEW_NONE VIEW_NONE}</td><td>{@link #BGFX_VIEW_STEREO VIEW_STEREO}</td></tr></table>
     * @param _projR projection matrix for right eye in stereo mode
     */
    public static void bgfx_set_view_transform_stereo(@NativeType("bgfx_view_id_t") int _id, @Nullable @NativeType("void const *") FloatBuffer _view, @Nullable @NativeType("void const *") FloatBuffer _projL, @NativeType("uint8_t") int _flags, @Nullable @NativeType("void const *") FloatBuffer _projR) {
        if (CHECKS) {
            checkSafe(_view, 64 >> 2);
            checkSafe(_projL, 64 >> 2);
            checkSafe(_projR, 64 >> 2);
        }
        nbgfx_set_view_transform_stereo((short)_id, memAddressSafe(_view), memAddressSafe(_projL), (byte)_flags, memAddressSafe(_projR));
    }

    // --- [ bgfx_set_view_order ] ---

    /** Unsafe version of: {@link #bgfx_set_view_order set_view_order} */
    public static void nbgfx_set_view_order(short _id, short _num, long _order) {
        long __functionAddress = Functions.set_view_order;
        invokePV(__functionAddress, _id, _num, _order);
    }

    /**
     * Post submit view reordering.
     *
     * @param _id    view id
     * @param _num   number of views to remap
     * @param _order view remap id table. Passing {@code NULL} will reset view ids to default state
     */
    public static void bgfx_set_view_order(@NativeType("bgfx_view_id_t") int _id, @NativeType("uint16_t") int _num, @Nullable @NativeType("bgfx_view_id_t const *") ShortBuffer _order) {
        if (CHECKS) {
            checkSafe(_order, _num);
        }
        nbgfx_set_view_order((short)_id, (short)_num, memAddressSafe(_order));
    }

    // --- [ bgfx_reset_view ] ---

    /** Unsafe version of: {@link #bgfx_reset_view reset_view} */
    public static void nbgfx_reset_view(short _id) {
        long __functionAddress = Functions.reset_view;
        invokeV(__functionAddress, _id);
    }

    /**
     * Resets all view settings to default.
     *
     * @param _id view id
     */
    public static void bgfx_reset_view(@NativeType("bgfx_view_id_t") int _id) {
        nbgfx_reset_view((short)_id);
    }

    // --- [ bgfx_set_marker ] ---

    /** Unsafe version of: {@link #bgfx_set_marker set_marker} */
    public static void nbgfx_set_marker(long _marker) {
        long __functionAddress = Functions.set_marker;
        invokePV(__functionAddress, _marker);
    }

    /**
     * Sets debug marker.
     *
     * @param _marker debug marker
     */
    public static void bgfx_set_marker(@NativeType("char const *") ByteBuffer _marker) {
        if (CHECKS) {
            checkNT1(_marker);
        }
        nbgfx_set_marker(memAddress(_marker));
    }

    /**
     * Sets debug marker.
     *
     * @param _marker debug marker
     */
    public static void bgfx_set_marker(@NativeType("char const *") CharSequence _marker) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer _markerEncoded = stack.ASCII(_marker);
            nbgfx_set_marker(memAddress(_markerEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bgfx_set_state ] ---

    /**
     * Sets render states for draw primitive.
     * 
     * <p>Remarks:</p>
     * 
     * <ol>
     * <li>To setup more complex states use:
     * 
     * <code><pre>
     * BGFX_STATE_ALPHA_REF(_ref),
     * BGFX_STATE_POINT_SIZE(_size),
     * BGFX_STATE_BLEND_FUNC(_src, _dst),
     * BGFX_STATE_BLEND_FUNC_SEPARATE(_srcRGB, _dstRGB, _srcA, _dstA)
     * BGFX_STATE_BLEND_EQUATION(_equation)
     * BGFX_STATE_BLEND_EQUATION_SEPARATE(_equationRGB, _equationA)</pre></code></li>
     * <li>{@link #BGFX_STATE_BLEND_EQUATION_ADD STATE_BLEND_EQUATION_ADD} is set when no other blend equation is specified.</li>
     * </ol>
     *
     * @param _state state flags. One or more of:<br><table><tr><td>{@link #BGFX_STATE_WRITE_R STATE_WRITE_R}</td><td>{@link #BGFX_STATE_WRITE_G STATE_WRITE_G}</td><td>{@link #BGFX_STATE_WRITE_B STATE_WRITE_B}</td><td>{@link #BGFX_STATE_WRITE_A STATE_WRITE_A}</td></tr><tr><td>{@link #BGFX_STATE_WRITE_Z STATE_WRITE_Z}</td><td>{@link #BGFX_STATE_WRITE_RGB STATE_WRITE_RGB}</td><td>{@link #BGFX_STATE_WRITE_MASK STATE_WRITE_MASK}</td><td>{@link #BGFX_STATE_DEPTH_TEST_LESS STATE_DEPTH_TEST_LESS}</td></tr><tr><td>{@link #BGFX_STATE_DEPTH_TEST_LEQUAL STATE_DEPTH_TEST_LEQUAL}</td><td>{@link #BGFX_STATE_DEPTH_TEST_EQUAL STATE_DEPTH_TEST_EQUAL}</td><td>{@link #BGFX_STATE_DEPTH_TEST_GEQUAL STATE_DEPTH_TEST_GEQUAL}</td><td>{@link #BGFX_STATE_DEPTH_TEST_GREATER STATE_DEPTH_TEST_GREATER}</td></tr><tr><td>{@link #BGFX_STATE_DEPTH_TEST_NOTEQUAL STATE_DEPTH_TEST_NOTEQUAL}</td><td>{@link #BGFX_STATE_DEPTH_TEST_NEVER STATE_DEPTH_TEST_NEVER}</td><td>{@link #BGFX_STATE_DEPTH_TEST_ALWAYS STATE_DEPTH_TEST_ALWAYS}</td><td>{@link #BGFX_STATE_BLEND_ZERO STATE_BLEND_ZERO}</td></tr><tr><td>{@link #BGFX_STATE_BLEND_ONE STATE_BLEND_ONE}</td><td>{@link #BGFX_STATE_BLEND_SRC_COLOR STATE_BLEND_SRC_COLOR}</td><td>{@link #BGFX_STATE_BLEND_INV_SRC_COLOR STATE_BLEND_INV_SRC_COLOR}</td><td>{@link #BGFX_STATE_BLEND_SRC_ALPHA STATE_BLEND_SRC_ALPHA}</td></tr><tr><td>{@link #BGFX_STATE_BLEND_INV_SRC_ALPHA STATE_BLEND_INV_SRC_ALPHA}</td><td>{@link #BGFX_STATE_BLEND_DST_ALPHA STATE_BLEND_DST_ALPHA}</td><td>{@link #BGFX_STATE_BLEND_INV_DST_ALPHA STATE_BLEND_INV_DST_ALPHA}</td><td>{@link #BGFX_STATE_BLEND_DST_COLOR STATE_BLEND_DST_COLOR}</td></tr><tr><td>{@link #BGFX_STATE_BLEND_INV_DST_COLOR STATE_BLEND_INV_DST_COLOR}</td><td>{@link #BGFX_STATE_BLEND_SRC_ALPHA_SAT STATE_BLEND_SRC_ALPHA_SAT}</td><td>{@link #BGFX_STATE_BLEND_FACTOR STATE_BLEND_FACTOR}</td><td>{@link #BGFX_STATE_BLEND_INV_FACTOR STATE_BLEND_INV_FACTOR}</td></tr><tr><td>{@link #BGFX_STATE_BLEND_EQUATION_ADD STATE_BLEND_EQUATION_ADD}</td><td>{@link #BGFX_STATE_BLEND_EQUATION_SUB STATE_BLEND_EQUATION_SUB}</td><td>{@link #BGFX_STATE_BLEND_EQUATION_REVSUB STATE_BLEND_EQUATION_REVSUB}</td><td>{@link #BGFX_STATE_BLEND_EQUATION_MIN STATE_BLEND_EQUATION_MIN}</td></tr><tr><td>{@link #BGFX_STATE_BLEND_EQUATION_MAX STATE_BLEND_EQUATION_MAX}</td><td>{@link #BGFX_STATE_BLEND_INDEPENDENT STATE_BLEND_INDEPENDENT}</td><td>{@link #BGFX_STATE_BLEND_ALPHA_TO_COVERAGE STATE_BLEND_ALPHA_TO_COVERAGE}</td><td>{@link #BGFX_STATE_CULL_CW STATE_CULL_CW}</td></tr><tr><td>{@link #BGFX_STATE_CULL_CCW STATE_CULL_CCW}</td><td>{@link #BGFX_STATE_PT_TRISTRIP STATE_PT_TRISTRIP}</td><td>{@link #BGFX_STATE_PT_LINES STATE_PT_LINES}</td><td>{@link #BGFX_STATE_PT_LINESTRIP STATE_PT_LINESTRIP}</td></tr><tr><td>{@link #BGFX_STATE_PT_POINTS STATE_PT_POINTS}</td><td>{@link #BGFX_STATE_MSAA STATE_MSAA}</td><td>{@link #BGFX_STATE_LINEAA STATE_LINEAA}</td><td>{@link #BGFX_STATE_CONSERVATIVE_RASTER STATE_CONSERVATIVE_RASTER}</td></tr><tr><td>{@link #BGFX_STATE_NONE STATE_NONE}</td><td>{@link #BGFX_STATE_DEFAULT STATE_DEFAULT}</td></tr></table>
     * @param _rgba  blend factor used by {@link #BGFX_STATE_BLEND_FACTOR STATE_BLEND_FACTOR} and {@link #BGFX_STATE_BLEND_INV_FACTOR STATE_BLEND_INV_FACTOR} blend modes
     */
    public static void bgfx_set_state(@NativeType("uint64_t") long _state, @NativeType("uint32_t") int _rgba) {
        long __functionAddress = Functions.set_state;
        invokeJV(__functionAddress, _state, _rgba);
    }

    // --- [ bgfx_set_condition ] ---

    /**
     * Sets condition for rendering.
     *
     * @param _handle  occlusion query handle
     * @param _visible render if occlusion query is visible
     */
    public static void bgfx_set_condition(@NativeType("bgfx_occlusion_query_handle_t") short _handle, @NativeType("bool") boolean _visible) {
        long __functionAddress = Functions.set_condition;
        invokeV(__functionAddress, _handle, _visible);
    }

    // --- [ bgfx_set_stencil ] ---

    /**
     * Sets stencil test state.
     *
     * @param _fstencil front stencil state. One or more of:<br><table><tr><td>{@link #BGFX_STENCIL_TEST_LESS STENCIL_TEST_LESS}</td><td>{@link #BGFX_STENCIL_TEST_LEQUAL STENCIL_TEST_LEQUAL}</td><td>{@link #BGFX_STENCIL_TEST_EQUAL STENCIL_TEST_EQUAL}</td></tr><tr><td>{@link #BGFX_STENCIL_TEST_GEQUAL STENCIL_TEST_GEQUAL}</td><td>{@link #BGFX_STENCIL_TEST_GREATER STENCIL_TEST_GREATER}</td><td>{@link #BGFX_STENCIL_TEST_NOTEQUAL STENCIL_TEST_NOTEQUAL}</td></tr><tr><td>{@link #BGFX_STENCIL_TEST_NEVER STENCIL_TEST_NEVER}</td><td>{@link #BGFX_STENCIL_TEST_ALWAYS STENCIL_TEST_ALWAYS}</td><td>{@link #BGFX_STENCIL_OP_FAIL_S_ZERO STENCIL_OP_FAIL_S_ZERO}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_FAIL_S_KEEP STENCIL_OP_FAIL_S_KEEP}</td><td>{@link #BGFX_STENCIL_OP_FAIL_S_REPLACE STENCIL_OP_FAIL_S_REPLACE}</td><td>{@link #BGFX_STENCIL_OP_FAIL_S_INCR STENCIL_OP_FAIL_S_INCR}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_FAIL_S_INCRSAT STENCIL_OP_FAIL_S_INCRSAT}</td><td>{@link #BGFX_STENCIL_OP_FAIL_S_DECR STENCIL_OP_FAIL_S_DECR}</td><td>{@link #BGFX_STENCIL_OP_FAIL_S_DECRSAT STENCIL_OP_FAIL_S_DECRSAT}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_FAIL_S_INVERT STENCIL_OP_FAIL_S_INVERT}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_ZERO STENCIL_OP_FAIL_Z_ZERO}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_KEEP STENCIL_OP_FAIL_Z_KEEP}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_FAIL_Z_REPLACE STENCIL_OP_FAIL_Z_REPLACE}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_INCR STENCIL_OP_FAIL_Z_INCR}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_INCRSAT STENCIL_OP_FAIL_Z_INCRSAT}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_FAIL_Z_DECR STENCIL_OP_FAIL_Z_DECR}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_DECRSAT STENCIL_OP_FAIL_Z_DECRSAT}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_INVERT STENCIL_OP_FAIL_Z_INVERT}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_PASS_Z_ZERO STENCIL_OP_PASS_Z_ZERO}</td><td>{@link #BGFX_STENCIL_OP_PASS_Z_KEEP STENCIL_OP_PASS_Z_KEEP}</td><td>{@link #BGFX_STENCIL_OP_PASS_Z_REPLACE STENCIL_OP_PASS_Z_REPLACE}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_PASS_Z_INCR STENCIL_OP_PASS_Z_INCR}</td><td>{@link #BGFX_STENCIL_OP_PASS_Z_INCRSAT STENCIL_OP_PASS_Z_INCRSAT}</td><td>{@link #BGFX_STENCIL_OP_PASS_Z_DECR STENCIL_OP_PASS_Z_DECR}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_PASS_Z_DECRSAT STENCIL_OP_PASS_Z_DECRSAT}</td><td>{@link #BGFX_STENCIL_OP_PASS_Z_INVERT STENCIL_OP_PASS_Z_INVERT}</td><td>{@link #BGFX_STENCIL_NONE STENCIL_NONE}</td></tr><tr><td>{@link #BGFX_STENCIL_DEFAULT STENCIL_DEFAULT}</td></tr></table>
     * @param _bstencil back stencil state. If back is set to {@link #BGFX_STENCIL_NONE STENCIL_NONE} {@code _fstencil} is applied to both front and back facing primitives. One or more of:<br><table><tr><td>{@link #BGFX_STENCIL_TEST_LESS STENCIL_TEST_LESS}</td><td>{@link #BGFX_STENCIL_TEST_LEQUAL STENCIL_TEST_LEQUAL}</td><td>{@link #BGFX_STENCIL_TEST_EQUAL STENCIL_TEST_EQUAL}</td></tr><tr><td>{@link #BGFX_STENCIL_TEST_GEQUAL STENCIL_TEST_GEQUAL}</td><td>{@link #BGFX_STENCIL_TEST_GREATER STENCIL_TEST_GREATER}</td><td>{@link #BGFX_STENCIL_TEST_NOTEQUAL STENCIL_TEST_NOTEQUAL}</td></tr><tr><td>{@link #BGFX_STENCIL_TEST_NEVER STENCIL_TEST_NEVER}</td><td>{@link #BGFX_STENCIL_TEST_ALWAYS STENCIL_TEST_ALWAYS}</td><td>{@link #BGFX_STENCIL_OP_FAIL_S_ZERO STENCIL_OP_FAIL_S_ZERO}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_FAIL_S_KEEP STENCIL_OP_FAIL_S_KEEP}</td><td>{@link #BGFX_STENCIL_OP_FAIL_S_REPLACE STENCIL_OP_FAIL_S_REPLACE}</td><td>{@link #BGFX_STENCIL_OP_FAIL_S_INCR STENCIL_OP_FAIL_S_INCR}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_FAIL_S_INCRSAT STENCIL_OP_FAIL_S_INCRSAT}</td><td>{@link #BGFX_STENCIL_OP_FAIL_S_DECR STENCIL_OP_FAIL_S_DECR}</td><td>{@link #BGFX_STENCIL_OP_FAIL_S_DECRSAT STENCIL_OP_FAIL_S_DECRSAT}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_FAIL_S_INVERT STENCIL_OP_FAIL_S_INVERT}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_ZERO STENCIL_OP_FAIL_Z_ZERO}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_KEEP STENCIL_OP_FAIL_Z_KEEP}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_FAIL_Z_REPLACE STENCIL_OP_FAIL_Z_REPLACE}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_INCR STENCIL_OP_FAIL_Z_INCR}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_INCRSAT STENCIL_OP_FAIL_Z_INCRSAT}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_FAIL_Z_DECR STENCIL_OP_FAIL_Z_DECR}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_DECRSAT STENCIL_OP_FAIL_Z_DECRSAT}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_INVERT STENCIL_OP_FAIL_Z_INVERT}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_PASS_Z_ZERO STENCIL_OP_PASS_Z_ZERO}</td><td>{@link #BGFX_STENCIL_OP_PASS_Z_KEEP STENCIL_OP_PASS_Z_KEEP}</td><td>{@link #BGFX_STENCIL_OP_PASS_Z_REPLACE STENCIL_OP_PASS_Z_REPLACE}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_PASS_Z_INCR STENCIL_OP_PASS_Z_INCR}</td><td>{@link #BGFX_STENCIL_OP_PASS_Z_INCRSAT STENCIL_OP_PASS_Z_INCRSAT}</td><td>{@link #BGFX_STENCIL_OP_PASS_Z_DECR STENCIL_OP_PASS_Z_DECR}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_PASS_Z_DECRSAT STENCIL_OP_PASS_Z_DECRSAT}</td><td>{@link #BGFX_STENCIL_OP_PASS_Z_INVERT STENCIL_OP_PASS_Z_INVERT}</td><td>{@link #BGFX_STENCIL_NONE STENCIL_NONE}</td></tr><tr><td>{@link #BGFX_STENCIL_DEFAULT STENCIL_DEFAULT}</td></tr></table>
     */
    public static void bgfx_set_stencil(@NativeType("uint32_t") int _fstencil, @NativeType("uint32_t") int _bstencil) {
        long __functionAddress = Functions.set_stencil;
        invokeV(__functionAddress, _fstencil, _bstencil);
    }

    // --- [ bgfx_set_scissor ] ---

    /** Unsafe version of: {@link #bgfx_set_scissor set_scissor} */
    public static short nbgfx_set_scissor(short _x, short _y, short _width, short _height) {
        long __functionAddress = Functions.set_scissor;
        return invokeS(__functionAddress, _x, _y, _width, _height);
    }

    /**
     * Sets scissor for draw primitive. For scissor for all primitives in view see {@link #bgfx_set_view_scissor set_view_scissor}.
     *
     * @param _x      position x from the left corner of the window
     * @param _y      position y from the top corner of the window
     * @param _width  width of scissor region
     * @param _height height of scissor region
     *
     * @return scissor cache index
     */
    @NativeType("uint16_t")
    public static short bgfx_set_scissor(@NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height) {
        return nbgfx_set_scissor((short)_x, (short)_y, (short)_width, (short)_height);
    }

    // --- [ bgfx_set_scissor_cached ] ---

    /** Unsafe version of: {@link #bgfx_set_scissor_cached set_scissor_cached} */
    public static void nbgfx_set_scissor_cached(short _cache) {
        long __functionAddress = Functions.set_scissor_cached;
        invokeV(__functionAddress, _cache);
    }

    /**
     * Sets scissor from cache for draw primitive.
     *
     * @param _cache index in scissor cache. Passing {@code UINT16_MAX} unsets primitive scissor and primitive will use view scissor instead.
     */
    public static void bgfx_set_scissor_cached(@NativeType("uint16_t") int _cache) {
        nbgfx_set_scissor_cached((short)_cache);
    }

    // --- [ bgfx_set_transform ] ---

    /**
     * Unsafe version of: {@link #bgfx_set_transform set_transform}
     *
     * @param _num number of matrices in array
     */
    public static int nbgfx_set_transform(long _mtx, short _num) {
        long __functionAddress = Functions.set_transform;
        return invokePI(__functionAddress, _mtx, _num);
    }

    /**
     * Sets model matrix for draw primitive. If it is not called model will be rendered with identity model matrix.
     *
     * @param _mtx pointer to first matrix in array
     *
     * @return index into matrix cache in case the same model matrix has to be used for other draw primitive call
     */
    @NativeType("uint32_t")
    public static int bgfx_set_transform(@NativeType("void const *") ByteBuffer _mtx) {
        return nbgfx_set_transform(memAddress(_mtx), (short)(_mtx.remaining() >> 6));
    }

    /**
     * Sets model matrix for draw primitive. If it is not called model will be rendered with identity model matrix.
     *
     * @param _mtx pointer to first matrix in array
     *
     * @return index into matrix cache in case the same model matrix has to be used for other draw primitive call
     */
    @NativeType("uint32_t")
    public static int bgfx_set_transform(@NativeType("void const *") FloatBuffer _mtx) {
        return nbgfx_set_transform(memAddress(_mtx), (short)(_mtx.remaining() >> 4));
    }

    // --- [ bgfx_alloc_transform ] ---

    /** Unsafe version of: {@link #bgfx_alloc_transform alloc_transform} */
    public static int nbgfx_alloc_transform(long _transform, short _num) {
        long __functionAddress = Functions.alloc_transform;
        return invokePI(__functionAddress, _transform, _num);
    }

    /**
     * Reserves {@code _num} matrices in internal matrix cache.
     * 
     * <p>Pointer returned can be modifed until {@link #bgfx_frame frame} is called.</p>
     *
     * @param _transform pointer to {@link BGFXTransform} structure
     * @param _num       number of matrices
     *
     * @return index into matrix cache
     */
    @NativeType("uint32_t")
    public static int bgfx_alloc_transform(@NativeType("bgfx_transform_t *") BGFXTransform _transform, @NativeType("uint16_t") int _num) {
        return nbgfx_alloc_transform(_transform.address(), (short)_num);
    }

    // --- [ bgfx_set_transform_cached ] ---

    /** Unsafe version of: {@link #bgfx_set_transform_cached set_transform_cached} */
    public static void nbgfx_set_transform_cached(int _cache, short _num) {
        long __functionAddress = Functions.set_transform_cached;
        invokeV(__functionAddress, _cache, _num);
    }

    /**
     * Sets model matrix from matrix cache for draw primitive.
     *
     * @param _cache index in matrix cache
     * @param _num   number of matrices from cache
     */
    public static void bgfx_set_transform_cached(@NativeType("uint32_t") int _cache, @NativeType("uint16_t") int _num) {
        nbgfx_set_transform_cached(_cache, (short)_num);
    }

    // --- [ bgfx_set_uniform ] ---

    /** Unsafe version of: {@link #bgfx_set_uniform set_uniform} */
    public static void nbgfx_set_uniform(short _handle, long _value, short _num) {
        long __functionAddress = Functions.set_uniform;
        invokePV(__functionAddress, _handle, _value, _num);
    }

    /**
     * Sets shader uniform parameter for draw primitive.
     *
     * @param _handle uniform
     * @param _value  pointer to uniform data
     * @param _num    number of elements. Passing {@code UINT16_MAX} will use the {@code _num} passed on uniform creation.
     */
    public static void bgfx_set_uniform(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") ByteBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_set_uniform(_handle, memAddress(_value), (short)_num);
    }

    /**
     * Sets shader uniform parameter for draw primitive.
     *
     * @param _handle uniform
     * @param _value  pointer to uniform data
     * @param _num    number of elements. Passing {@code UINT16_MAX} will use the {@code _num} passed on uniform creation.
     */
    public static void bgfx_set_uniform(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") ShortBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_set_uniform(_handle, memAddress(_value), (short)_num);
    }

    /**
     * Sets shader uniform parameter for draw primitive.
     *
     * @param _handle uniform
     * @param _value  pointer to uniform data
     * @param _num    number of elements. Passing {@code UINT16_MAX} will use the {@code _num} passed on uniform creation.
     */
    public static void bgfx_set_uniform(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") IntBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_set_uniform(_handle, memAddress(_value), (short)_num);
    }

    /**
     * Sets shader uniform parameter for draw primitive.
     *
     * @param _handle uniform
     * @param _value  pointer to uniform data
     * @param _num    number of elements. Passing {@code UINT16_MAX} will use the {@code _num} passed on uniform creation.
     */
    public static void bgfx_set_uniform(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") LongBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_set_uniform(_handle, memAddress(_value), (short)_num);
    }

    /**
     * Sets shader uniform parameter for draw primitive.
     *
     * @param _handle uniform
     * @param _value  pointer to uniform data
     * @param _num    number of elements. Passing {@code UINT16_MAX} will use the {@code _num} passed on uniform creation.
     */
    public static void bgfx_set_uniform(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") FloatBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_set_uniform(_handle, memAddress(_value), (short)_num);
    }

    /**
     * Sets shader uniform parameter for draw primitive.
     *
     * @param _handle uniform
     * @param _value  pointer to uniform data
     * @param _num    number of elements. Passing {@code UINT16_MAX} will use the {@code _num} passed on uniform creation.
     */
    public static void bgfx_set_uniform(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") DoubleBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_set_uniform(_handle, memAddress(_value), (short)_num);
    }

    // --- [ bgfx_set_index_buffer ] ---

    /**
     * Sets index buffer for draw primitive.
     *
     * @param _handle     index buffer
     * @param _firstIndex first index to render
     * @param _numIndices number of indices to render
     */
    public static void bgfx_set_index_buffer(@NativeType("bgfx_index_buffer_handle_t") short _handle, @NativeType("uint32_t") int _firstIndex, @NativeType("uint32_t") int _numIndices) {
        long __functionAddress = Functions.set_index_buffer;
        invokeV(__functionAddress, _handle, _firstIndex, _numIndices);
    }

    // --- [ bgfx_set_dynamic_index_buffer ] ---

    /**
     * Sets index buffer for draw primitive.
     *
     * @param _handle     dynamic index buffer
     * @param _firstIndex first index to render
     * @param _numIndices number of indices to render
     */
    public static void bgfx_set_dynamic_index_buffer(@NativeType("bgfx_dynamic_index_buffer_handle_t") short _handle, @NativeType("uint32_t") int _firstIndex, @NativeType("uint32_t") int _numIndices) {
        long __functionAddress = Functions.set_dynamic_index_buffer;
        invokeV(__functionAddress, _handle, _firstIndex, _numIndices);
    }

    // --- [ bgfx_set_transient_index_buffer ] ---

    /** Unsafe version of: {@link #bgfx_set_transient_index_buffer set_transient_index_buffer} */
    public static void nbgfx_set_transient_index_buffer(long _tib, int _firstIndex, int _numIndices) {
        long __functionAddress = Functions.set_transient_index_buffer;
        if (CHECKS) {
            BGFXTransientIndexBuffer.validate(_tib);
        }
        invokePV(__functionAddress, _tib, _firstIndex, _numIndices);
    }

    /**
     * Sets index buffer for draw primitive.
     *
     * @param _tib        transient index buffer
     * @param _firstIndex first index to render
     * @param _numIndices number of indices to render
     */
    public static void bgfx_set_transient_index_buffer(@NativeType("bgfx_transient_index_buffer_t const *") BGFXTransientIndexBuffer _tib, @NativeType("uint32_t") int _firstIndex, @NativeType("uint32_t") int _numIndices) {
        nbgfx_set_transient_index_buffer(_tib.address(), _firstIndex, _numIndices);
    }

    // --- [ bgfx_set_vertex_buffer ] ---

    /** Unsafe version of: {@link #bgfx_set_vertex_buffer set_vertex_buffer} */
    public static void nbgfx_set_vertex_buffer(byte _stream, short _handle, int _startVertex, int _numVertices) {
        long __functionAddress = Functions.set_vertex_buffer;
        invokeV(__functionAddress, _stream, _handle, _startVertex, _numVertices);
    }

    /**
     * Sets vertex buffer for draw primitive.
     *
     * @param _stream      vertex stream
     * @param _handle      vertex buffer
     * @param _startVertex first vertex to render
     * @param _numVertices number of vertices to render
     */
    public static void bgfx_set_vertex_buffer(@NativeType("uint8_t") int _stream, @NativeType("bgfx_vertex_buffer_handle_t") short _handle, @NativeType("uint32_t") int _startVertex, @NativeType("uint32_t") int _numVertices) {
        nbgfx_set_vertex_buffer((byte)_stream, _handle, _startVertex, _numVertices);
    }

    // --- [ bgfx_set_dynamic_vertex_buffer ] ---

    /** Unsafe version of: {@link #bgfx_set_dynamic_vertex_buffer set_dynamic_vertex_buffer} */
    public static void nbgfx_set_dynamic_vertex_buffer(byte _stream, short _handle, int _startVertex, int _numVertices) {
        long __functionAddress = Functions.set_dynamic_vertex_buffer;
        invokeV(__functionAddress, _stream, _handle, _startVertex, _numVertices);
    }

    /**
     * Sets vertex buffer for draw primitive.
     *
     * @param _stream      vertex stream
     * @param _handle      dynamic vertex buffer
     * @param _startVertex first vertex to render
     * @param _numVertices number of vertices to render
     */
    public static void bgfx_set_dynamic_vertex_buffer(@NativeType("uint8_t") int _stream, @NativeType("bgfx_dynamic_vertex_buffer_handle_t") short _handle, @NativeType("uint32_t") int _startVertex, @NativeType("uint32_t") int _numVertices) {
        nbgfx_set_dynamic_vertex_buffer((byte)_stream, _handle, _startVertex, _numVertices);
    }

    // --- [ bgfx_set_transient_vertex_buffer ] ---

    /** Unsafe version of: {@link #bgfx_set_transient_vertex_buffer set_transient_vertex_buffer} */
    public static void nbgfx_set_transient_vertex_buffer(byte _stream, long _tvb, int _startVertex, int _numVertices) {
        long __functionAddress = Functions.set_transient_vertex_buffer;
        if (CHECKS) {
            BGFXTransientVertexBuffer.validate(_tvb);
        }
        invokePV(__functionAddress, _stream, _tvb, _startVertex, _numVertices);
    }

    /**
     * Sets vertex buffer for draw primitive.
     *
     * @param _stream      vertex stream
     * @param _tvb         transient vertex buffer
     * @param _startVertex first vertex to render
     * @param _numVertices number of vertices to render
     */
    public static void bgfx_set_transient_vertex_buffer(@NativeType("uint8_t") int _stream, @NativeType("bgfx_transient_vertex_buffer_t const *") BGFXTransientVertexBuffer _tvb, @NativeType("uint32_t") int _startVertex, @NativeType("uint32_t") int _numVertices) {
        nbgfx_set_transient_vertex_buffer((byte)_stream, _tvb.address(), _startVertex, _numVertices);
    }

    // --- [ bgfx_set_instance_data_buffer ] ---

    /** Unsafe version of: {@link #bgfx_set_instance_data_buffer set_instance_data_buffer} */
    public static void nbgfx_set_instance_data_buffer(long _idb, int _start, int _num) {
        long __functionAddress = Functions.set_instance_data_buffer;
        if (CHECKS) {
            BGFXInstanceDataBuffer.validate(_idb);
        }
        invokePV(__functionAddress, _idb, _start, _num);
    }

    /**
     * Sets instance data buffer for draw primitive.
     *
     * @param _idb   transient instance data buffer
     * @param _start first instance data
     * @param _num   number of data instances
     */
    public static void bgfx_set_instance_data_buffer(@NativeType("bgfx_instance_data_buffer_t const *") BGFXInstanceDataBuffer _idb, @NativeType("uint32_t") int _start, @NativeType("uint32_t") int _num) {
        nbgfx_set_instance_data_buffer(_idb.address(), _start, _num);
    }

    // --- [ bgfx_set_instance_data_from_vertex_buffer ] ---

    /**
     * Set instance data buffer for draw primitive.
     *
     * @param _handle vertex buffer
     * @param _start  first instance data
     * @param _num    number of data instances
     */
    public static void bgfx_set_instance_data_from_vertex_buffer(@NativeType("bgfx_vertex_buffer_handle_t") short _handle, @NativeType("uint32_t") int _start, @NativeType("uint32_t") int _num) {
        long __functionAddress = Functions.set_instance_data_from_vertex_buffer;
        invokeV(__functionAddress, _handle, _start, _num);
    }

    // --- [ bgfx_set_instance_data_from_dynamic_vertex_buffer ] ---

    /**
     * Set instance data buffer for draw primitive.
     *
     * @param _handle dynamic vertex buffer
     * @param _start  first instance data
     * @param _num    number of data instances
     */
    public static void bgfx_set_instance_data_from_dynamic_vertex_buffer(@NativeType("bgfx_dynamic_vertex_buffer_handle_t") short _handle, @NativeType("uint32_t") int _start, @NativeType("uint32_t") int _num) {
        long __functionAddress = Functions.set_instance_data_from_dynamic_vertex_buffer;
        invokeV(__functionAddress, _handle, _start, _num);
    }

    // --- [ bgfx_set_texture ] ---

    /** Unsafe version of: {@link #bgfx_set_texture set_texture} */
    public static void nbgfx_set_texture(byte _stage, short _sampler, short _handle, int _flags) {
        long __functionAddress = Functions.set_texture;
        invokeV(__functionAddress, _stage, _sampler, _handle, _flags);
    }

    /**
     * Sets texture stage for draw primitive.
     *
     * @param _stage   texture unit
     * @param _sampler program sampler
     * @param _handle  texture handle
     * @param _flags   texture sampling mode. {@code UINT32_MAX} uses texture sampling settings from the texture. One of:<br><table><tr><td>{@link #BGFX_TEXTURE_NONE TEXTURE_NONE}</td><td>{@link #BGFX_TEXTURE_U_MIRROR TEXTURE_U_MIRROR}</td><td>{@link #BGFX_TEXTURE_U_CLAMP TEXTURE_U_CLAMP}</td><td>{@link #BGFX_TEXTURE_U_BORDER TEXTURE_U_BORDER}</td></tr><tr><td>{@link #BGFX_TEXTURE_V_MIRROR TEXTURE_V_MIRROR}</td><td>{@link #BGFX_TEXTURE_V_CLAMP TEXTURE_V_CLAMP}</td><td>{@link #BGFX_TEXTURE_V_BORDER TEXTURE_V_BORDER}</td><td>{@link #BGFX_TEXTURE_W_MIRROR TEXTURE_W_MIRROR}</td></tr><tr><td>{@link #BGFX_TEXTURE_W_CLAMP TEXTURE_W_CLAMP}</td><td>{@link #BGFX_TEXTURE_W_BORDER TEXTURE_W_BORDER}</td><td>{@link #BGFX_TEXTURE_MIN_POINT TEXTURE_MIN_POINT}</td><td>{@link #BGFX_TEXTURE_MIN_ANISOTROPIC TEXTURE_MIN_ANISOTROPIC}</td></tr><tr><td>{@link #BGFX_TEXTURE_MAG_POINT TEXTURE_MAG_POINT}</td><td>{@link #BGFX_TEXTURE_MAG_ANISOTROPIC TEXTURE_MAG_ANISOTROPIC}</td><td>{@link #BGFX_TEXTURE_MIP_POINT TEXTURE_MIP_POINT}</td><td>{@link #BGFX_TEXTURE_MSAA_SAMPLE TEXTURE_MSAA_SAMPLE}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT TEXTURE_RT}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X2 TEXTURE_RT_MSAA_X2}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X4 TEXTURE_RT_MSAA_X4}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X8 TEXTURE_RT_MSAA_X8}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT_MSAA_X16 TEXTURE_RT_MSAA_X16}</td><td>{@link #BGFX_TEXTURE_RT_WRITE_ONLY TEXTURE_RT_WRITE_ONLY}</td><td>{@link #BGFX_TEXTURE_COMPARE_LESS TEXTURE_COMPARE_LESS}</td><td>{@link #BGFX_TEXTURE_COMPARE_LEQUAL TEXTURE_COMPARE_LEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_EQUAL TEXTURE_COMPARE_EQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GEQUAL TEXTURE_COMPARE_GEQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GREATER TEXTURE_COMPARE_GREATER}</td><td>{@link #BGFX_TEXTURE_COMPARE_NOTEQUAL TEXTURE_COMPARE_NOTEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_NEVER TEXTURE_COMPARE_NEVER}</td><td>{@link #BGFX_TEXTURE_COMPARE_ALWAYS TEXTURE_COMPARE_ALWAYS}</td><td>{@link #BGFX_TEXTURE_COMPUTE_WRITE TEXTURE_COMPUTE_WRITE}</td><td>{@link #BGFX_TEXTURE_SRGB TEXTURE_SRGB}</td></tr><tr><td>{@link #BGFX_TEXTURE_BLIT_DST TEXTURE_BLIT_DST}</td><td>{@link #BGFX_TEXTURE_READ_BACK TEXTURE_READ_BACK}</td></tr></table>
     */
    public static void bgfx_set_texture(@NativeType("uint8_t") int _stage, @NativeType("bgfx_uniform_handle_t") short _sampler, @NativeType("bgfx_texture_handle_t") short _handle, @NativeType("uint32_t") int _flags) {
        nbgfx_set_texture((byte)_stage, _sampler, _handle, _flags);
    }

    // --- [ bgfx_touch ] ---

    /** Unsafe version of: {@link #bgfx_touch touch} */
    public static void nbgfx_touch(short _id) {
        long __functionAddress = Functions.touch;
        invokeV(__functionAddress, _id);
    }

    /**
     * Submits an empty primitive for rendering. Uniforms and draw state will be applied but no geometry will be submitted.
     * 
     * <p>These empty draw calls will sort before ordinary draw calls.</p>
     *
     * @param _id view id
     */
    public static void bgfx_touch(@NativeType("bgfx_view_id_t") int _id) {
        nbgfx_touch((short)_id);
    }

    // --- [ bgfx_submit ] ---

    /** Unsafe version of: {@link #bgfx_submit submit} */
    public static void nbgfx_submit(short _id, short _handle, int _depth, boolean _preserveState) {
        long __functionAddress = Functions.submit;
        invokeV(__functionAddress, _id, _handle, _depth, _preserveState);
    }

    /**
     * Submits primitive for rendering.
     *
     * @param _id            view id
     * @param _handle        program
     * @param _depth         depth for sorting
     * @param _preserveState preserve internal draw state for next draw call submit
     */
    public static void bgfx_submit(@NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_program_handle_t") short _handle, @NativeType("int32_t") int _depth, @NativeType("bool") boolean _preserveState) {
        nbgfx_submit((short)_id, _handle, _depth, _preserveState);
    }

    // --- [ bgfx_submit_occlusion_query ] ---

    /** Unsafe version of: {@link #bgfx_submit_occlusion_query submit_occlusion_query} */
    public static void nbgfx_submit_occlusion_query(short _id, short _program, short _occlusionQuery, int _depth, boolean _preserveState) {
        long __functionAddress = Functions.submit_occlusion_query;
        invokeV(__functionAddress, _id, _program, _occlusionQuery, _depth, _preserveState);
    }

    /**
     * Submits primitive with occlusion query for rendering.
     *
     * @param _id             view id
     * @param _program        program
     * @param _occlusionQuery occlusion query
     * @param _depth          depth for sorting
     * @param _preserveState  preserve internal draw state for next draw call submit
     */
    public static void bgfx_submit_occlusion_query(@NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_program_handle_t") short _program, @NativeType("bgfx_occlusion_query_handle_t") short _occlusionQuery, @NativeType("int32_t") int _depth, @NativeType("bool") boolean _preserveState) {
        nbgfx_submit_occlusion_query((short)_id, _program, _occlusionQuery, _depth, _preserveState);
    }

    // --- [ bgfx_submit_indirect ] ---

    /** Unsafe version of: {@link #bgfx_submit_indirect submit_indirect} */
    public static void nbgfx_submit_indirect(short _id, short _handle, short _indirectHandle, short _start, short _num, int _depth, boolean _preserveState) {
        long __functionAddress = Functions.submit_indirect;
        invokeV(__functionAddress, _id, _handle, _indirectHandle, _start, _num, _depth, _preserveState);
    }

    /**
     * Submits primitive for rendering with index and instance data info from indirect buffer.
     *
     * @param _id             view id
     * @param _handle         program
     * @param _indirectHandle indirect buffer
     * @param _start          first element in indirect buffer
     * @param _num            number of dispatches
     * @param _depth          depth for sorting
     * @param _preserveState  preserve internal draw state for next draw call submit
     */
    public static void bgfx_submit_indirect(@NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_program_handle_t") short _handle, @NativeType("bgfx_indirect_buffer_handle_t") short _indirectHandle, @NativeType("uint16_t") int _start, @NativeType("uint16_t") int _num, @NativeType("int32_t") int _depth, @NativeType("bool") boolean _preserveState) {
        nbgfx_submit_indirect((short)_id, _handle, _indirectHandle, (short)_start, (short)_num, _depth, _preserveState);
    }

    // --- [ bgfx_set_image ] ---

    /** Unsafe version of: {@link #bgfx_set_image set_image} */
    public static void nbgfx_set_image(byte _stage, short _handle, byte _mip, int _access, int _format) {
        long __functionAddress = Functions.set_image;
        invokeV(__functionAddress, _stage, _handle, _mip, _access, _format);
    }

    /**
     * Sets compute image from texture.
     *
     * @param _stage  texture unit
     * @param _handle texture handle
     * @param _mip    mip level
     * @param _access texture access. One of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
     * @param _format texture format. One of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG11B10F TEXTURE_FORMAT_RG11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
     */
    public static void bgfx_set_image(@NativeType("uint8_t") int _stage, @NativeType("bgfx_texture_handle_t") short _handle, @NativeType("uint8_t") int _mip, @NativeType("bgfx_access_t") int _access, @NativeType("bgfx_texture_format_t") int _format) {
        nbgfx_set_image((byte)_stage, _handle, (byte)_mip, _access, _format);
    }

    // --- [ bgfx_set_compute_index_buffer ] ---

    /** Unsafe version of: {@link #bgfx_set_compute_index_buffer set_compute_index_buffer} */
    public static void nbgfx_set_compute_index_buffer(byte _stage, short _handle, int _access) {
        long __functionAddress = Functions.set_compute_index_buffer;
        invokeV(__functionAddress, _stage, _handle, _access);
    }

    /**
     * Sets compute index buffer.
     *
     * @param _stage  compute stage
     * @param _handle index buffer handle
     * @param _access buffer access. One of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
     */
    public static void bgfx_set_compute_index_buffer(@NativeType("uint8_t") int _stage, @NativeType("bgfx_index_buffer_handle_t") short _handle, @NativeType("bgfx_access_t") int _access) {
        nbgfx_set_compute_index_buffer((byte)_stage, _handle, _access);
    }

    // --- [ bgfx_set_compute_vertex_buffer ] ---

    /** Unsafe version of: {@link #bgfx_set_compute_vertex_buffer set_compute_vertex_buffer} */
    public static void nbgfx_set_compute_vertex_buffer(byte _stage, short _handle, int _access) {
        long __functionAddress = Functions.set_compute_vertex_buffer;
        invokeV(__functionAddress, _stage, _handle, _access);
    }

    /**
     * Sets compute vertex buffer.
     *
     * @param _stage  compute stage
     * @param _handle vertex buffer handle
     * @param _access buffer access. One of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
     */
    public static void bgfx_set_compute_vertex_buffer(@NativeType("uint8_t") int _stage, @NativeType("bgfx_vertex_buffer_handle_t") short _handle, @NativeType("bgfx_access_t") int _access) {
        nbgfx_set_compute_vertex_buffer((byte)_stage, _handle, _access);
    }

    // --- [ bgfx_set_compute_dynamic_index_buffer ] ---

    /** Unsafe version of: {@link #bgfx_set_compute_dynamic_index_buffer set_compute_dynamic_index_buffer} */
    public static void nbgfx_set_compute_dynamic_index_buffer(byte _stage, short _handle, int _access) {
        long __functionAddress = Functions.set_compute_dynamic_index_buffer;
        invokeV(__functionAddress, _stage, _handle, _access);
    }

    /**
     * Sets compute dynamic index buffer.
     *
     * @param _stage  compute stage
     * @param _handle dynamic index buffer handle
     * @param _access buffer access. One of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
     */
    public static void bgfx_set_compute_dynamic_index_buffer(@NativeType("uint8_t") int _stage, @NativeType("bgfx_dynamic_index_buffer_handle_t") short _handle, @NativeType("bgfx_access_t") int _access) {
        nbgfx_set_compute_dynamic_index_buffer((byte)_stage, _handle, _access);
    }

    // --- [ bgfx_set_compute_dynamic_vertex_buffer ] ---

    /** Unsafe version of: {@link #bgfx_set_compute_dynamic_vertex_buffer set_compute_dynamic_vertex_buffer} */
    public static void nbgfx_set_compute_dynamic_vertex_buffer(byte _stage, short _handle, int _access) {
        long __functionAddress = Functions.set_compute_dynamic_vertex_buffer;
        invokeV(__functionAddress, _stage, _handle, _access);
    }

    /**
     * Sets compute dynamic vertex buffer.
     *
     * @param _stage  compute stage
     * @param _handle dynamic vertex buffer handle
     * @param _access buffer access. One of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
     */
    public static void bgfx_set_compute_dynamic_vertex_buffer(@NativeType("uint8_t") int _stage, @NativeType("bgfx_dynamic_vertex_buffer_handle_t") short _handle, @NativeType("bgfx_access_t") int _access) {
        nbgfx_set_compute_dynamic_vertex_buffer((byte)_stage, _handle, _access);
    }

    // --- [ bgfx_set_compute_indirect_buffer ] ---

    /** Unsafe version of: {@link #bgfx_set_compute_indirect_buffer set_compute_indirect_buffer} */
    public static void nbgfx_set_compute_indirect_buffer(byte _stage, short _handle, int _access) {
        long __functionAddress = Functions.set_compute_indirect_buffer;
        invokeV(__functionAddress, _stage, _handle, _access);
    }

    /**
     * Sets compute indirect buffer.
     *
     * @param _stage  compute stage
     * @param _handle indirect buffer handle
     * @param _access buffer access. One of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
     */
    public static void bgfx_set_compute_indirect_buffer(@NativeType("uint8_t") int _stage, @NativeType("bgfx_indirect_buffer_handle_t") short _handle, @NativeType("bgfx_access_t") int _access) {
        nbgfx_set_compute_indirect_buffer((byte)_stage, _handle, _access);
    }

    // --- [ bgfx_dispatch ] ---

    /** Unsafe version of: {@link #bgfx_dispatch dispatch} */
    public static void nbgfx_dispatch(short _id, short _handle, int _numX, int _numY, int _numZ, byte _flags) {
        long __functionAddress = Functions.dispatch;
        invokeV(__functionAddress, _id, _handle, _numX, _numY, _numZ, _flags);
    }

    /**
     * Dispatches compute.
     *
     * @param _id     view id
     * @param _handle compute program
     * @param _numX   number of groups X
     * @param _numY   number of groups Y
     * @param _numZ   number of groups Z
     * @param _flags  view flags. One of:<br><table><tr><td>{@link #BGFX_SUBMIT_EYE_LEFT SUBMIT_EYE_LEFT}</td><td>{@link #BGFX_SUBMIT_EYE_RIGHT SUBMIT_EYE_RIGHT}</td><td>{@link #BGFX_SUBMIT_EYE_FIRST SUBMIT_EYE_FIRST}</td></tr></table>
     */
    public static void bgfx_dispatch(@NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_program_handle_t") short _handle, @NativeType("uint32_t") int _numX, @NativeType("uint32_t") int _numY, @NativeType("uint32_t") int _numZ, @NativeType("uint8_t") int _flags) {
        nbgfx_dispatch((short)_id, _handle, _numX, _numY, _numZ, (byte)_flags);
    }

    // --- [ bgfx_dispatch_indirect ] ---

    /** Unsafe version of: {@link #bgfx_dispatch_indirect dispatch_indirect} */
    public static void nbgfx_dispatch_indirect(short _id, short _handle, short _indirectHandle, short _start, short _num, byte _flags) {
        long __functionAddress = Functions.dispatch_indirect;
        invokeV(__functionAddress, _id, _handle, _indirectHandle, _start, _num, _flags);
    }

    /**
     * Dispatches compute indirect.
     *
     * @param _id             view id
     * @param _handle         compute program
     * @param _indirectHandle indirect buffer
     * @param _start          first element in indirect buffer
     * @param _num            number of dispatches
     * @param _flags          view flags. One of:<br><table><tr><td>{@link #BGFX_SUBMIT_EYE_LEFT SUBMIT_EYE_LEFT}</td><td>{@link #BGFX_SUBMIT_EYE_RIGHT SUBMIT_EYE_RIGHT}</td><td>{@link #BGFX_SUBMIT_EYE_FIRST SUBMIT_EYE_FIRST}</td></tr></table>
     */
    public static void bgfx_dispatch_indirect(@NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_program_handle_t") short _handle, @NativeType("bgfx_indirect_buffer_handle_t") short _indirectHandle, @NativeType("uint16_t") int _start, @NativeType("uint16_t") int _num, @NativeType("uint8_t") int _flags) {
        nbgfx_dispatch_indirect((short)_id, _handle, _indirectHandle, (short)_start, (short)_num, (byte)_flags);
    }

    // --- [ bgfx_discard ] ---

    /** Discards all previously set state for draw or compute call. */
    public static void bgfx_discard() {
        long __functionAddress = Functions.discard;
        invokeV(__functionAddress);
    }

    // --- [ bgfx_blit ] ---

    /** Unsafe version of: {@link #bgfx_blit blit} */
    public static void nbgfx_blit(short _id, short _dst, byte _dstMip, short _dstX, short _dstY, short _dstZ, short _src, byte _srcMip, short _srcX, short _srcY, short _srcZ, short _width, short _height, short _depth) {
        long __functionAddress = Functions.blit;
        invokeV(__functionAddress, _id, _dst, _dstMip, _dstX, _dstY, _dstZ, _src, _srcMip, _srcX, _srcY, _srcZ, _width, _height, _depth);
    }

    /**
     * Blits texture region between two textures.
     * 
     * <p>Destination texture must be created with {@link #BGFX_TEXTURE_BLIT_DST TEXTURE_BLIT_DST} flag. Availability depends on {@link #BGFX_CAPS_TEXTURE_BLIT CAPS_TEXTURE_BLIT}.</p>
     *
     * @param _id     view id
     * @param _dst    destination texture handle
     * @param _dstMip destination texture mip level
     * @param _dstX   destination texture X position
     * @param _dstY   destination texture Y position
     * @param _dstZ   if texture is 2D this argument should be 0. If destination texture is cube this argument represents destination texture cube face. For 3D texture
     *                this argument represents destination texture Z position.
     * @param _src    source texture handle
     * @param _srcMip source texture mip level
     * @param _srcX   source texture X position
     * @param _srcY   source texture Y position
     * @param _srcZ   if texture is 2D this argument should be 0. If destination texture is cube this argument represents destination texture cube face. For 3D texture
     *                this argument represents destination texture Z position.
     * @param _width  width of region
     * @param _height height of region
     * @param _depth  if texture is 3D this argument represents depth of region, otherwise it's unused
     */
    public static void bgfx_blit(@NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_texture_handle_t") short _dst, @NativeType("uint8_t") int _dstMip, @NativeType("uint16_t") int _dstX, @NativeType("uint16_t") int _dstY, @NativeType("uint16_t") int _dstZ, @NativeType("bgfx_texture_handle_t") short _src, @NativeType("uint8_t") int _srcMip, @NativeType("uint16_t") int _srcX, @NativeType("uint16_t") int _srcY, @NativeType("uint16_t") int _srcZ, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("uint16_t") int _depth) {
        nbgfx_blit((short)_id, _dst, (byte)_dstMip, (short)_dstX, (short)_dstY, (short)_dstZ, _src, (byte)_srcMip, (short)_srcX, (short)_srcY, (short)_srcZ, (short)_width, (short)_height, (short)_depth);
    }

    // --- [ bgfx_encoder_set_marker ] ---

    /** Unsafe version of: {@link #bgfx_encoder_set_marker encoder_set_marker} */
    public static void nbgfx_encoder_set_marker(long _encoder, long _marker) {
        long __functionAddress = Functions.encoder_set_marker;
        if (CHECKS) {
            check(_encoder);
        }
        invokePPV(__functionAddress, _encoder, _marker);
    }

    /**
     * Sets debug marker.
     *
     * @param _encoder the encoder
     * @param _marker  debug marker
     */
    public static void bgfx_encoder_set_marker(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("char const *") ByteBuffer _marker) {
        if (CHECKS) {
            checkNT1(_marker);
        }
        nbgfx_encoder_set_marker(_encoder, memAddress(_marker));
    }

    /**
     * Sets debug marker.
     *
     * @param _encoder the encoder
     * @param _marker  debug marker
     */
    public static void bgfx_encoder_set_marker(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("char const *") CharSequence _marker) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer _markerEncoded = stack.ASCII(_marker);
            nbgfx_encoder_set_marker(_encoder, memAddress(_markerEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bgfx_encoder_set_state ] ---

    /**
     * Sets render states for draw primitive.
     * 
     * <p>Remarks:</p>
     * 
     * <ol>
     * <li>To setup more complex states use:
     * 
     * <code><pre>
     * BGFX_STATE_ALPHA_REF(_ref),
     * BGFX_STATE_POINT_SIZE(_size),
     * BGFX_STATE_BLEND_FUNC(_src, _dst),
     * BGFX_STATE_BLEND_FUNC_SEPARATE(_srcRGB, _dstRGB, _srcA, _dstA)
     * BGFX_STATE_BLEND_EQUATION(_equation)
     * BGFX_STATE_BLEND_EQUATION_SEPARATE(_equationRGB, _equationA)</pre></code></li>
     * <li>{@link #BGFX_STATE_BLEND_EQUATION_ADD STATE_BLEND_EQUATION_ADD} is set when no other blend equation is specified.</li>
     * </ol>
     *
     * @param _encoder the encoder
     * @param _state   state flags. One or more of:<br><table><tr><td>{@link #BGFX_STATE_WRITE_R STATE_WRITE_R}</td><td>{@link #BGFX_STATE_WRITE_G STATE_WRITE_G}</td><td>{@link #BGFX_STATE_WRITE_B STATE_WRITE_B}</td><td>{@link #BGFX_STATE_WRITE_A STATE_WRITE_A}</td></tr><tr><td>{@link #BGFX_STATE_WRITE_Z STATE_WRITE_Z}</td><td>{@link #BGFX_STATE_WRITE_RGB STATE_WRITE_RGB}</td><td>{@link #BGFX_STATE_WRITE_MASK STATE_WRITE_MASK}</td><td>{@link #BGFX_STATE_DEPTH_TEST_LESS STATE_DEPTH_TEST_LESS}</td></tr><tr><td>{@link #BGFX_STATE_DEPTH_TEST_LEQUAL STATE_DEPTH_TEST_LEQUAL}</td><td>{@link #BGFX_STATE_DEPTH_TEST_EQUAL STATE_DEPTH_TEST_EQUAL}</td><td>{@link #BGFX_STATE_DEPTH_TEST_GEQUAL STATE_DEPTH_TEST_GEQUAL}</td><td>{@link #BGFX_STATE_DEPTH_TEST_GREATER STATE_DEPTH_TEST_GREATER}</td></tr><tr><td>{@link #BGFX_STATE_DEPTH_TEST_NOTEQUAL STATE_DEPTH_TEST_NOTEQUAL}</td><td>{@link #BGFX_STATE_DEPTH_TEST_NEVER STATE_DEPTH_TEST_NEVER}</td><td>{@link #BGFX_STATE_DEPTH_TEST_ALWAYS STATE_DEPTH_TEST_ALWAYS}</td><td>{@link #BGFX_STATE_BLEND_ZERO STATE_BLEND_ZERO}</td></tr><tr><td>{@link #BGFX_STATE_BLEND_ONE STATE_BLEND_ONE}</td><td>{@link #BGFX_STATE_BLEND_SRC_COLOR STATE_BLEND_SRC_COLOR}</td><td>{@link #BGFX_STATE_BLEND_INV_SRC_COLOR STATE_BLEND_INV_SRC_COLOR}</td><td>{@link #BGFX_STATE_BLEND_SRC_ALPHA STATE_BLEND_SRC_ALPHA}</td></tr><tr><td>{@link #BGFX_STATE_BLEND_INV_SRC_ALPHA STATE_BLEND_INV_SRC_ALPHA}</td><td>{@link #BGFX_STATE_BLEND_DST_ALPHA STATE_BLEND_DST_ALPHA}</td><td>{@link #BGFX_STATE_BLEND_INV_DST_ALPHA STATE_BLEND_INV_DST_ALPHA}</td><td>{@link #BGFX_STATE_BLEND_DST_COLOR STATE_BLEND_DST_COLOR}</td></tr><tr><td>{@link #BGFX_STATE_BLEND_INV_DST_COLOR STATE_BLEND_INV_DST_COLOR}</td><td>{@link #BGFX_STATE_BLEND_SRC_ALPHA_SAT STATE_BLEND_SRC_ALPHA_SAT}</td><td>{@link #BGFX_STATE_BLEND_FACTOR STATE_BLEND_FACTOR}</td><td>{@link #BGFX_STATE_BLEND_INV_FACTOR STATE_BLEND_INV_FACTOR}</td></tr><tr><td>{@link #BGFX_STATE_BLEND_EQUATION_ADD STATE_BLEND_EQUATION_ADD}</td><td>{@link #BGFX_STATE_BLEND_EQUATION_SUB STATE_BLEND_EQUATION_SUB}</td><td>{@link #BGFX_STATE_BLEND_EQUATION_REVSUB STATE_BLEND_EQUATION_REVSUB}</td><td>{@link #BGFX_STATE_BLEND_EQUATION_MIN STATE_BLEND_EQUATION_MIN}</td></tr><tr><td>{@link #BGFX_STATE_BLEND_EQUATION_MAX STATE_BLEND_EQUATION_MAX}</td><td>{@link #BGFX_STATE_BLEND_INDEPENDENT STATE_BLEND_INDEPENDENT}</td><td>{@link #BGFX_STATE_BLEND_ALPHA_TO_COVERAGE STATE_BLEND_ALPHA_TO_COVERAGE}</td><td>{@link #BGFX_STATE_CULL_CW STATE_CULL_CW}</td></tr><tr><td>{@link #BGFX_STATE_CULL_CCW STATE_CULL_CCW}</td><td>{@link #BGFX_STATE_PT_TRISTRIP STATE_PT_TRISTRIP}</td><td>{@link #BGFX_STATE_PT_LINES STATE_PT_LINES}</td><td>{@link #BGFX_STATE_PT_LINESTRIP STATE_PT_LINESTRIP}</td></tr><tr><td>{@link #BGFX_STATE_PT_POINTS STATE_PT_POINTS}</td><td>{@link #BGFX_STATE_MSAA STATE_MSAA}</td><td>{@link #BGFX_STATE_LINEAA STATE_LINEAA}</td><td>{@link #BGFX_STATE_CONSERVATIVE_RASTER STATE_CONSERVATIVE_RASTER}</td></tr><tr><td>{@link #BGFX_STATE_NONE STATE_NONE}</td><td>{@link #BGFX_STATE_DEFAULT STATE_DEFAULT}</td></tr></table>
     * @param _rgba    blend factor used by {@link #BGFX_STATE_BLEND_FACTOR STATE_BLEND_FACTOR} and {@link #BGFX_STATE_BLEND_INV_FACTOR STATE_BLEND_INV_FACTOR} blend modes
     */
    public static void bgfx_encoder_set_state(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("uint64_t") long _state, @NativeType("uint32_t") int _rgba) {
        long __functionAddress = Functions.encoder_set_state;
        if (CHECKS) {
            check(_encoder);
        }
        invokePJV(__functionAddress, _encoder, _state, _rgba);
    }

    // --- [ bgfx_encoder_set_condition ] ---

    /**
     * Sets condition for rendering.
     *
     * @param _encoder the encoder
     * @param _handle  occlusion query handle
     * @param _visible render if occlusion query is visible
     */
    public static void bgfx_encoder_set_condition(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_occlusion_query_handle_t") short _handle, @NativeType("bool") boolean _visible) {
        long __functionAddress = Functions.encoder_set_condition;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _handle, _visible);
    }

    // --- [ bgfx_encoder_set_stencil ] ---

    /**
     * Sets stencil test state.
     *
     * @param _encoder  the encoder
     * @param _fstencil front stencil state. One or more of:<br><table><tr><td>{@link #BGFX_STENCIL_TEST_LESS STENCIL_TEST_LESS}</td><td>{@link #BGFX_STENCIL_TEST_LEQUAL STENCIL_TEST_LEQUAL}</td><td>{@link #BGFX_STENCIL_TEST_EQUAL STENCIL_TEST_EQUAL}</td></tr><tr><td>{@link #BGFX_STENCIL_TEST_GEQUAL STENCIL_TEST_GEQUAL}</td><td>{@link #BGFX_STENCIL_TEST_GREATER STENCIL_TEST_GREATER}</td><td>{@link #BGFX_STENCIL_TEST_NOTEQUAL STENCIL_TEST_NOTEQUAL}</td></tr><tr><td>{@link #BGFX_STENCIL_TEST_NEVER STENCIL_TEST_NEVER}</td><td>{@link #BGFX_STENCIL_TEST_ALWAYS STENCIL_TEST_ALWAYS}</td><td>{@link #BGFX_STENCIL_OP_FAIL_S_ZERO STENCIL_OP_FAIL_S_ZERO}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_FAIL_S_KEEP STENCIL_OP_FAIL_S_KEEP}</td><td>{@link #BGFX_STENCIL_OP_FAIL_S_REPLACE STENCIL_OP_FAIL_S_REPLACE}</td><td>{@link #BGFX_STENCIL_OP_FAIL_S_INCR STENCIL_OP_FAIL_S_INCR}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_FAIL_S_INCRSAT STENCIL_OP_FAIL_S_INCRSAT}</td><td>{@link #BGFX_STENCIL_OP_FAIL_S_DECR STENCIL_OP_FAIL_S_DECR}</td><td>{@link #BGFX_STENCIL_OP_FAIL_S_DECRSAT STENCIL_OP_FAIL_S_DECRSAT}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_FAIL_S_INVERT STENCIL_OP_FAIL_S_INVERT}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_ZERO STENCIL_OP_FAIL_Z_ZERO}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_KEEP STENCIL_OP_FAIL_Z_KEEP}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_FAIL_Z_REPLACE STENCIL_OP_FAIL_Z_REPLACE}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_INCR STENCIL_OP_FAIL_Z_INCR}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_INCRSAT STENCIL_OP_FAIL_Z_INCRSAT}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_FAIL_Z_DECR STENCIL_OP_FAIL_Z_DECR}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_DECRSAT STENCIL_OP_FAIL_Z_DECRSAT}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_INVERT STENCIL_OP_FAIL_Z_INVERT}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_PASS_Z_ZERO STENCIL_OP_PASS_Z_ZERO}</td><td>{@link #BGFX_STENCIL_OP_PASS_Z_KEEP STENCIL_OP_PASS_Z_KEEP}</td><td>{@link #BGFX_STENCIL_OP_PASS_Z_REPLACE STENCIL_OP_PASS_Z_REPLACE}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_PASS_Z_INCR STENCIL_OP_PASS_Z_INCR}</td><td>{@link #BGFX_STENCIL_OP_PASS_Z_INCRSAT STENCIL_OP_PASS_Z_INCRSAT}</td><td>{@link #BGFX_STENCIL_OP_PASS_Z_DECR STENCIL_OP_PASS_Z_DECR}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_PASS_Z_DECRSAT STENCIL_OP_PASS_Z_DECRSAT}</td><td>{@link #BGFX_STENCIL_OP_PASS_Z_INVERT STENCIL_OP_PASS_Z_INVERT}</td><td>{@link #BGFX_STENCIL_NONE STENCIL_NONE}</td></tr><tr><td>{@link #BGFX_STENCIL_DEFAULT STENCIL_DEFAULT}</td></tr></table>
     * @param _bstencil back stencil state. If back is set to {@link #BGFX_STENCIL_NONE STENCIL_NONE} {@code _fstencil} is applied to both front and back facing primitives. One or more of:<br><table><tr><td>{@link #BGFX_STENCIL_TEST_LESS STENCIL_TEST_LESS}</td><td>{@link #BGFX_STENCIL_TEST_LEQUAL STENCIL_TEST_LEQUAL}</td><td>{@link #BGFX_STENCIL_TEST_EQUAL STENCIL_TEST_EQUAL}</td></tr><tr><td>{@link #BGFX_STENCIL_TEST_GEQUAL STENCIL_TEST_GEQUAL}</td><td>{@link #BGFX_STENCIL_TEST_GREATER STENCIL_TEST_GREATER}</td><td>{@link #BGFX_STENCIL_TEST_NOTEQUAL STENCIL_TEST_NOTEQUAL}</td></tr><tr><td>{@link #BGFX_STENCIL_TEST_NEVER STENCIL_TEST_NEVER}</td><td>{@link #BGFX_STENCIL_TEST_ALWAYS STENCIL_TEST_ALWAYS}</td><td>{@link #BGFX_STENCIL_OP_FAIL_S_ZERO STENCIL_OP_FAIL_S_ZERO}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_FAIL_S_KEEP STENCIL_OP_FAIL_S_KEEP}</td><td>{@link #BGFX_STENCIL_OP_FAIL_S_REPLACE STENCIL_OP_FAIL_S_REPLACE}</td><td>{@link #BGFX_STENCIL_OP_FAIL_S_INCR STENCIL_OP_FAIL_S_INCR}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_FAIL_S_INCRSAT STENCIL_OP_FAIL_S_INCRSAT}</td><td>{@link #BGFX_STENCIL_OP_FAIL_S_DECR STENCIL_OP_FAIL_S_DECR}</td><td>{@link #BGFX_STENCIL_OP_FAIL_S_DECRSAT STENCIL_OP_FAIL_S_DECRSAT}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_FAIL_S_INVERT STENCIL_OP_FAIL_S_INVERT}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_ZERO STENCIL_OP_FAIL_Z_ZERO}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_KEEP STENCIL_OP_FAIL_Z_KEEP}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_FAIL_Z_REPLACE STENCIL_OP_FAIL_Z_REPLACE}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_INCR STENCIL_OP_FAIL_Z_INCR}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_INCRSAT STENCIL_OP_FAIL_Z_INCRSAT}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_FAIL_Z_DECR STENCIL_OP_FAIL_Z_DECR}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_DECRSAT STENCIL_OP_FAIL_Z_DECRSAT}</td><td>{@link #BGFX_STENCIL_OP_FAIL_Z_INVERT STENCIL_OP_FAIL_Z_INVERT}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_PASS_Z_ZERO STENCIL_OP_PASS_Z_ZERO}</td><td>{@link #BGFX_STENCIL_OP_PASS_Z_KEEP STENCIL_OP_PASS_Z_KEEP}</td><td>{@link #BGFX_STENCIL_OP_PASS_Z_REPLACE STENCIL_OP_PASS_Z_REPLACE}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_PASS_Z_INCR STENCIL_OP_PASS_Z_INCR}</td><td>{@link #BGFX_STENCIL_OP_PASS_Z_INCRSAT STENCIL_OP_PASS_Z_INCRSAT}</td><td>{@link #BGFX_STENCIL_OP_PASS_Z_DECR STENCIL_OP_PASS_Z_DECR}</td></tr><tr><td>{@link #BGFX_STENCIL_OP_PASS_Z_DECRSAT STENCIL_OP_PASS_Z_DECRSAT}</td><td>{@link #BGFX_STENCIL_OP_PASS_Z_INVERT STENCIL_OP_PASS_Z_INVERT}</td><td>{@link #BGFX_STENCIL_NONE STENCIL_NONE}</td></tr><tr><td>{@link #BGFX_STENCIL_DEFAULT STENCIL_DEFAULT}</td></tr></table>
     */
    public static void bgfx_encoder_set_stencil(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("uint32_t") int _fstencil, @NativeType("uint32_t") int _bstencil) {
        long __functionAddress = Functions.encoder_set_stencil;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _fstencil, _bstencil);
    }

    // --- [ bgfx_encoder_set_scissor ] ---

    /** Unsafe version of: {@link #bgfx_encoder_set_scissor encoder_set_scissor} */
    public static short nbgfx_encoder_set_scissor(long _encoder, short _x, short _y, short _width, short _height) {
        long __functionAddress = Functions.encoder_set_scissor;
        if (CHECKS) {
            check(_encoder);
        }
        return invokePS(__functionAddress, _encoder, _x, _y, _width, _height);
    }

    /**
     * Sets scissor for draw primitive. To scissor for all primitives in view see {@link #bgfx_set_view_scissor set_view_scissor}.
     *
     * @param _encoder the encoder
     * @param _x       position x from the left side of the window
     * @param _y       position y from the top side of the window
     * @param _width   width of scissor region
     * @param _height  height of scissor region
     *
     * @return scissor cache index
     */
    @NativeType("uint16_t")
    public static short bgfx_encoder_set_scissor(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height) {
        return nbgfx_encoder_set_scissor(_encoder, (short)_x, (short)_y, (short)_width, (short)_height);
    }

    // --- [ bgfx_encoder_set_scissor_cached ] ---

    /** Unsafe version of: {@link #bgfx_encoder_set_scissor_cached encoder_set_scissor_cached} */
    public static void nbgfx_encoder_set_scissor_cached(long _encoder, short _cache) {
        long __functionAddress = Functions.encoder_set_scissor_cached;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _cache);
    }

    /**
     * Sets scissor from cache for draw primitive.
     *
     * @param _encoder the encoder
     * @param _cache   index in scissor cache. Pass {@code UINT16_MAX} to have primitive use view scissor instead.
     */
    public static void bgfx_encoder_set_scissor_cached(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("uint16_t") int _cache) {
        nbgfx_encoder_set_scissor_cached(_encoder, (short)_cache);
    }

    // --- [ bgfx_encoder_set_transform ] ---

    /**
     * Unsafe version of: {@link #bgfx_encoder_set_transform encoder_set_transform}
     *
     * @param _num number of matrices in array
     */
    public static int nbgfx_encoder_set_transform(long _encoder, long _mtx, short _num) {
        long __functionAddress = Functions.encoder_set_transform;
        if (CHECKS) {
            check(_encoder);
        }
        return invokePPI(__functionAddress, _encoder, _mtx, _num);
    }

    /**
     * Sets model matrix for draw primitive. If it is not called, the model will be rendered with identity model matrix.
     *
     * @param _encoder the encoder
     * @param _mtx     pointer to first matrix in array
     *
     * @return index into matrix cache in case the same model matrix has to be used for other draw primitive call
     */
    @NativeType("uint32_t")
    public static int bgfx_encoder_set_transform(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("void const *") ByteBuffer _mtx) {
        return nbgfx_encoder_set_transform(_encoder, memAddress(_mtx), (short)(_mtx.remaining() >> 6));
    }

    /**
     * Sets model matrix for draw primitive. If it is not called, the model will be rendered with identity model matrix.
     *
     * @param _encoder the encoder
     * @param _mtx     pointer to first matrix in array
     *
     * @return index into matrix cache in case the same model matrix has to be used for other draw primitive call
     */
    @NativeType("uint32_t")
    public static int bgfx_encoder_set_transform(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("void const *") FloatBuffer _mtx) {
        return nbgfx_encoder_set_transform(_encoder, memAddress(_mtx), (short)(_mtx.remaining() >> 4));
    }

    // --- [ bgfx_encoder_alloc_transform ] ---

    /** Unsafe version of: {@link #bgfx_encoder_alloc_transform encoder_alloc_transform} */
    public static int nbgfx_encoder_alloc_transform(long _encoder, long _transform, short _num) {
        long __functionAddress = Functions.encoder_alloc_transform;
        if (CHECKS) {
            check(_encoder);
        }
        return invokePPI(__functionAddress, _encoder, _transform, _num);
    }

    /**
     * Reserves {@code _num} matrices in internal matrix cache.
     * 
     * <p>Pointer returned can be modifed until {@link #bgfx_frame frame} is called.</p>
     *
     * @param _encoder   the encoder
     * @param _transform pointer to {@link BGFXTransform} structure
     * @param _num       number of matrices
     *
     * @return index into matrix cache
     */
    @NativeType("uint32_t")
    public static int bgfx_encoder_alloc_transform(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_transform_t *") BGFXTransform _transform, @NativeType("uint16_t") int _num) {
        return nbgfx_encoder_alloc_transform(_encoder, _transform.address(), (short)_num);
    }

    // --- [ bgfx_encoder_set_transform_cached ] ---

    /** Unsafe version of: {@link #bgfx_encoder_set_transform_cached encoder_set_transform_cached} */
    public static void nbgfx_encoder_set_transform_cached(long _encoder, int _cache, short _num) {
        long __functionAddress = Functions.encoder_set_transform_cached;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _cache, _num);
    }

    /**
     * Sets model matrix from matrix cache for draw primitive.
     *
     * @param _encoder the encoder
     * @param _cache   index in matrix cache
     * @param _num     number of matrices from cache
     */
    public static void bgfx_encoder_set_transform_cached(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("uint32_t") int _cache, @NativeType("uint16_t") int _num) {
        nbgfx_encoder_set_transform_cached(_encoder, _cache, (short)_num);
    }

    // --- [ bgfx_encoder_set_uniform ] ---

    /** Unsafe version of: {@link #bgfx_encoder_set_uniform encoder_set_uniform} */
    public static void nbgfx_encoder_set_uniform(long _encoder, short _handle, long _value, short _num) {
        long __functionAddress = Functions.encoder_set_uniform;
        if (CHECKS) {
            check(_encoder);
        }
        invokePPV(__functionAddress, _encoder, _handle, _value, _num);
    }

    /**
     * Sets shader uniform parameter for draw primitive.
     *
     * @param _encoder the encoder
     * @param _handle  uniform
     * @param _value   pointer to uniform data
     * @param _num     number of elements. Passing {@code UINT16_MAX} will use the {@code _num} passed on uniform creation.
     */
    public static void bgfx_encoder_set_uniform(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") ByteBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_encoder_set_uniform(_encoder, _handle, memAddress(_value), (short)_num);
    }

    /**
     * Sets shader uniform parameter for draw primitive.
     *
     * @param _encoder the encoder
     * @param _handle  uniform
     * @param _value   pointer to uniform data
     * @param _num     number of elements. Passing {@code UINT16_MAX} will use the {@code _num} passed on uniform creation.
     */
    public static void bgfx_encoder_set_uniform(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") ShortBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_encoder_set_uniform(_encoder, _handle, memAddress(_value), (short)_num);
    }

    /**
     * Sets shader uniform parameter for draw primitive.
     *
     * @param _encoder the encoder
     * @param _handle  uniform
     * @param _value   pointer to uniform data
     * @param _num     number of elements. Passing {@code UINT16_MAX} will use the {@code _num} passed on uniform creation.
     */
    public static void bgfx_encoder_set_uniform(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") IntBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_encoder_set_uniform(_encoder, _handle, memAddress(_value), (short)_num);
    }

    /**
     * Sets shader uniform parameter for draw primitive.
     *
     * @param _encoder the encoder
     * @param _handle  uniform
     * @param _value   pointer to uniform data
     * @param _num     number of elements. Passing {@code UINT16_MAX} will use the {@code _num} passed on uniform creation.
     */
    public static void bgfx_encoder_set_uniform(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") LongBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_encoder_set_uniform(_encoder, _handle, memAddress(_value), (short)_num);
    }

    /**
     * Sets shader uniform parameter for draw primitive.
     *
     * @param _encoder the encoder
     * @param _handle  uniform
     * @param _value   pointer to uniform data
     * @param _num     number of elements. Passing {@code UINT16_MAX} will use the {@code _num} passed on uniform creation.
     */
    public static void bgfx_encoder_set_uniform(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") FloatBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_encoder_set_uniform(_encoder, _handle, memAddress(_value), (short)_num);
    }

    /**
     * Sets shader uniform parameter for draw primitive.
     *
     * @param _encoder the encoder
     * @param _handle  uniform
     * @param _value   pointer to uniform data
     * @param _num     number of elements. Passing {@code UINT16_MAX} will use the {@code _num} passed on uniform creation.
     */
    public static void bgfx_encoder_set_uniform(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") DoubleBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_encoder_set_uniform(_encoder, _handle, memAddress(_value), (short)_num);
    }

    // --- [ bgfx_encoder_set_index_buffer ] ---

    /**
     * Sets index buffer for draw primitive.
     *
     * @param _encoder    the encoder
     * @param _handle     index buffer
     * @param _firstIndex first index to render
     * @param _numIndices number of indices to render
     */
    public static void bgfx_encoder_set_index_buffer(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_index_buffer_handle_t") short _handle, @NativeType("uint32_t") int _firstIndex, @NativeType("uint32_t") int _numIndices) {
        long __functionAddress = Functions.encoder_set_index_buffer;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _handle, _firstIndex, _numIndices);
    }

    // --- [ bgfx_encoder_set_dynamic_index_buffer ] ---

    /**
     * Sets index buffer for draw primitive.
     *
     * @param _encoder    the encoder
     * @param _handle     dynamic index buffer
     * @param _firstIndex first index to render
     * @param _numIndices number of indices to render
     */
    public static void bgfx_encoder_set_dynamic_index_buffer(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_dynamic_index_buffer_handle_t") short _handle, @NativeType("uint32_t") int _firstIndex, @NativeType("uint32_t") int _numIndices) {
        long __functionAddress = Functions.encoder_set_dynamic_index_buffer;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _handle, _firstIndex, _numIndices);
    }

    // --- [ bgfx_encoder_set_transient_index_buffer ] ---

    /** Unsafe version of: {@link #bgfx_encoder_set_transient_index_buffer encoder_set_transient_index_buffer} */
    public static void nbgfx_encoder_set_transient_index_buffer(long _encoder, long _tib, int _firstIndex, int _numIndices) {
        long __functionAddress = Functions.encoder_set_transient_index_buffer;
        if (CHECKS) {
            check(_encoder);
            BGFXTransientIndexBuffer.validate(_tib);
        }
        invokePPV(__functionAddress, _encoder, _tib, _firstIndex, _numIndices);
    }

    /**
     * Sets index buffer for draw primitive.
     *
     * @param _encoder    the encoder
     * @param _tib        transient index buffer
     * @param _firstIndex first index to render
     * @param _numIndices number of indices to render
     */
    public static void bgfx_encoder_set_transient_index_buffer(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_transient_index_buffer_t const *") BGFXTransientIndexBuffer _tib, @NativeType("uint32_t") int _firstIndex, @NativeType("uint32_t") int _numIndices) {
        nbgfx_encoder_set_transient_index_buffer(_encoder, _tib.address(), _firstIndex, _numIndices);
    }

    // --- [ bgfx_encoder_set_vertex_buffer ] ---

    /** Unsafe version of: {@link #bgfx_encoder_set_vertex_buffer encoder_set_vertex_buffer} */
    public static void nbgfx_encoder_set_vertex_buffer(long _encoder, byte _stream, short _handle, int _startVertex, int _numVertices) {
        long __functionAddress = Functions.encoder_set_vertex_buffer;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _stream, _handle, _startVertex, _numVertices);
    }

    /**
     * Sets vertex buffer for draw primitive.
     *
     * @param _encoder     the encoder
     * @param _stream      vertex stream
     * @param _handle      vertex buffer
     * @param _startVertex first vertex to render
     * @param _numVertices number of vertices to render
     */
    public static void bgfx_encoder_set_vertex_buffer(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("uint8_t") int _stream, @NativeType("bgfx_vertex_buffer_handle_t") short _handle, @NativeType("uint32_t") int _startVertex, @NativeType("uint32_t") int _numVertices) {
        nbgfx_encoder_set_vertex_buffer(_encoder, (byte)_stream, _handle, _startVertex, _numVertices);
    }

    // --- [ bgfx_encoder_set_dynamic_vertex_buffer ] ---

    /** Unsafe version of: {@link #bgfx_encoder_set_dynamic_vertex_buffer encoder_set_dynamic_vertex_buffer} */
    public static void nbgfx_encoder_set_dynamic_vertex_buffer(long _encoder, byte _stream, short _handle, int _startVertex, int _numVertices) {
        long __functionAddress = Functions.encoder_set_dynamic_vertex_buffer;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _stream, _handle, _startVertex, _numVertices);
    }

    /**
     * Sets vertex buffer for draw primitive.
     *
     * @param _encoder     the encoder
     * @param _stream      vertex stream
     * @param _handle      dynamic vertex buffer
     * @param _startVertex first vertex to render
     * @param _numVertices number of vertices to render
     */
    public static void bgfx_encoder_set_dynamic_vertex_buffer(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("uint8_t") int _stream, @NativeType("bgfx_dynamic_vertex_buffer_handle_t") short _handle, @NativeType("uint32_t") int _startVertex, @NativeType("uint32_t") int _numVertices) {
        nbgfx_encoder_set_dynamic_vertex_buffer(_encoder, (byte)_stream, _handle, _startVertex, _numVertices);
    }

    // --- [ bgfx_encoder_set_transient_vertex_buffer ] ---

    /** Unsafe version of: {@link #bgfx_encoder_set_transient_vertex_buffer encoder_set_transient_vertex_buffer} */
    public static void nbgfx_encoder_set_transient_vertex_buffer(long _encoder, byte _stream, long _tvb, int _startVertex, int _numVertices) {
        long __functionAddress = Functions.encoder_set_transient_vertex_buffer;
        if (CHECKS) {
            check(_encoder);
            BGFXTransientVertexBuffer.validate(_tvb);
        }
        invokePPV(__functionAddress, _encoder, _stream, _tvb, _startVertex, _numVertices);
    }

    /**
     * Sets vertex buffer for draw primitive.
     *
     * @param _encoder     the encoder
     * @param _stream      vertex stream
     * @param _tvb         transient vertex buffer
     * @param _startVertex first vertex to render
     * @param _numVertices number of vertices to render
     */
    public static void bgfx_encoder_set_transient_vertex_buffer(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("uint8_t") int _stream, @NativeType("bgfx_transient_vertex_buffer_t const *") BGFXTransientVertexBuffer _tvb, @NativeType("uint32_t") int _startVertex, @NativeType("uint32_t") int _numVertices) {
        nbgfx_encoder_set_transient_vertex_buffer(_encoder, (byte)_stream, _tvb.address(), _startVertex, _numVertices);
    }

    // --- [ bgfx_encoder_set_instance_data_buffer ] ---

    /** Unsafe version of: {@link #bgfx_encoder_set_instance_data_buffer encoder_set_instance_data_buffer} */
    public static void nbgfx_encoder_set_instance_data_buffer(long _encoder, long _idb, int _start, int _num) {
        long __functionAddress = Functions.encoder_set_instance_data_buffer;
        if (CHECKS) {
            check(_encoder);
            BGFXInstanceDataBuffer.validate(_idb);
        }
        invokePPV(__functionAddress, _encoder, _idb, _start, _num);
    }

    /**
     * Sets instance data buffer for draw primitive.
     *
     * @param _encoder the encoder
     * @param _idb     transient instance data buffer
     * @param _start   first instance data
     * @param _num     number of data instances
     */
    public static void bgfx_encoder_set_instance_data_buffer(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_instance_data_buffer_t const *") BGFXInstanceDataBuffer _idb, @NativeType("uint32_t") int _start, @NativeType("uint32_t") int _num) {
        nbgfx_encoder_set_instance_data_buffer(_encoder, _idb.address(), _start, _num);
    }

    // --- [ bgfx_encoder_set_instance_data_from_vertex_buffer ] ---

    /**
     * Set instance data buffer for draw primitive.
     *
     * @param _encoder the encoder
     * @param _handle  vertex buffer
     * @param _start   first instance data
     * @param _num     number of data instances
     */
    public static void bgfx_encoder_set_instance_data_from_vertex_buffer(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_vertex_buffer_handle_t") short _handle, @NativeType("uint32_t") int _start, @NativeType("uint32_t") int _num) {
        long __functionAddress = Functions.encoder_set_instance_data_from_vertex_buffer;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _handle, _start, _num);
    }

    // --- [ bgfx_encoder_set_instance_data_from_dynamic_vertex_buffer ] ---

    /**
     * Set instance data buffer for draw primitive.
     *
     * @param _encoder the encoder
     * @param _handle  dynamic vertex buffer
     * @param _start   first instance data
     * @param _num     number of data instances
     */
    public static void bgfx_encoder_set_instance_data_from_dynamic_vertex_buffer(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_dynamic_vertex_buffer_handle_t") short _handle, @NativeType("uint32_t") int _start, @NativeType("uint32_t") int _num) {
        long __functionAddress = Functions.encoder_set_instance_data_from_dynamic_vertex_buffer;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _handle, _start, _num);
    }

    // --- [ bgfx_encoder_set_texture ] ---

    /** Unsafe version of: {@link #bgfx_encoder_set_texture encoder_set_texture} */
    public static void nbgfx_encoder_set_texture(long _encoder, byte _stage, short _sampler, short _handle, int _flags) {
        long __functionAddress = Functions.encoder_set_texture;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _stage, _sampler, _handle, _flags);
    }

    /**
     * Sets texture stage for draw primitive.
     *
     * @param _encoder the encoder
     * @param _stage   texture unit
     * @param _sampler program sampler
     * @param _handle  texture handle
     * @param _flags   texture sampling mode. {@code UINT32_MAX} uses texture sampling settings from the texture. One of:<br><table><tr><td>{@link #BGFX_TEXTURE_NONE TEXTURE_NONE}</td><td>{@link #BGFX_TEXTURE_U_MIRROR TEXTURE_U_MIRROR}</td><td>{@link #BGFX_TEXTURE_U_CLAMP TEXTURE_U_CLAMP}</td><td>{@link #BGFX_TEXTURE_U_BORDER TEXTURE_U_BORDER}</td></tr><tr><td>{@link #BGFX_TEXTURE_V_MIRROR TEXTURE_V_MIRROR}</td><td>{@link #BGFX_TEXTURE_V_CLAMP TEXTURE_V_CLAMP}</td><td>{@link #BGFX_TEXTURE_V_BORDER TEXTURE_V_BORDER}</td><td>{@link #BGFX_TEXTURE_W_MIRROR TEXTURE_W_MIRROR}</td></tr><tr><td>{@link #BGFX_TEXTURE_W_CLAMP TEXTURE_W_CLAMP}</td><td>{@link #BGFX_TEXTURE_W_BORDER TEXTURE_W_BORDER}</td><td>{@link #BGFX_TEXTURE_MIN_POINT TEXTURE_MIN_POINT}</td><td>{@link #BGFX_TEXTURE_MIN_ANISOTROPIC TEXTURE_MIN_ANISOTROPIC}</td></tr><tr><td>{@link #BGFX_TEXTURE_MAG_POINT TEXTURE_MAG_POINT}</td><td>{@link #BGFX_TEXTURE_MAG_ANISOTROPIC TEXTURE_MAG_ANISOTROPIC}</td><td>{@link #BGFX_TEXTURE_MIP_POINT TEXTURE_MIP_POINT}</td><td>{@link #BGFX_TEXTURE_MSAA_SAMPLE TEXTURE_MSAA_SAMPLE}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT TEXTURE_RT}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X2 TEXTURE_RT_MSAA_X2}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X4 TEXTURE_RT_MSAA_X4}</td><td>{@link #BGFX_TEXTURE_RT_MSAA_X8 TEXTURE_RT_MSAA_X8}</td></tr><tr><td>{@link #BGFX_TEXTURE_RT_MSAA_X16 TEXTURE_RT_MSAA_X16}</td><td>{@link #BGFX_TEXTURE_RT_WRITE_ONLY TEXTURE_RT_WRITE_ONLY}</td><td>{@link #BGFX_TEXTURE_COMPARE_LESS TEXTURE_COMPARE_LESS}</td><td>{@link #BGFX_TEXTURE_COMPARE_LEQUAL TEXTURE_COMPARE_LEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_EQUAL TEXTURE_COMPARE_EQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GEQUAL TEXTURE_COMPARE_GEQUAL}</td><td>{@link #BGFX_TEXTURE_COMPARE_GREATER TEXTURE_COMPARE_GREATER}</td><td>{@link #BGFX_TEXTURE_COMPARE_NOTEQUAL TEXTURE_COMPARE_NOTEQUAL}</td></tr><tr><td>{@link #BGFX_TEXTURE_COMPARE_NEVER TEXTURE_COMPARE_NEVER}</td><td>{@link #BGFX_TEXTURE_COMPARE_ALWAYS TEXTURE_COMPARE_ALWAYS}</td><td>{@link #BGFX_TEXTURE_COMPUTE_WRITE TEXTURE_COMPUTE_WRITE}</td><td>{@link #BGFX_TEXTURE_SRGB TEXTURE_SRGB}</td></tr><tr><td>{@link #BGFX_TEXTURE_BLIT_DST TEXTURE_BLIT_DST}</td><td>{@link #BGFX_TEXTURE_READ_BACK TEXTURE_READ_BACK}</td></tr></table>
     */
    public static void bgfx_encoder_set_texture(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("uint8_t") int _stage, @NativeType("bgfx_uniform_handle_t") short _sampler, @NativeType("bgfx_texture_handle_t") short _handle, @NativeType("uint32_t") int _flags) {
        nbgfx_encoder_set_texture(_encoder, (byte)_stage, _sampler, _handle, _flags);
    }

    // --- [ bgfx_encoder_touch ] ---

    /** Unsafe version of: {@link #bgfx_encoder_touch encoder_touch} */
    public static void nbgfx_encoder_touch(long _encoder, short _id) {
        long __functionAddress = Functions.encoder_touch;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _id);
    }

    /**
     * Submits an empty primitive for rendering. Uniforms and draw state will be applied but no geometry will be submitted.
     * 
     * <p>These empty draw calls will sort before ordinary draw calls.</p>
     *
     * @param _encoder the encoder
     * @param _id      view id
     */
    public static void bgfx_encoder_touch(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_view_id_t") int _id) {
        nbgfx_encoder_touch(_encoder, (short)_id);
    }

    // --- [ bgfx_encoder_submit ] ---

    /** Unsafe version of: {@link #bgfx_encoder_submit encoder_submit} */
    public static void nbgfx_encoder_submit(long _encoder, short _id, short _handle, int _depth, boolean _preserveState) {
        long __functionAddress = Functions.encoder_submit;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _id, _handle, _depth, _preserveState);
    }

    /**
     * Submits primitive for rendering.
     *
     * @param _encoder       the encoder
     * @param _id            view id
     * @param _handle        program
     * @param _depth         depth for sorting
     * @param _preserveState preserve internal draw state for next draw call submit
     */
    public static void bgfx_encoder_submit(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_program_handle_t") short _handle, @NativeType("int32_t") int _depth, @NativeType("bool") boolean _preserveState) {
        nbgfx_encoder_submit(_encoder, (short)_id, _handle, _depth, _preserveState);
    }

    // --- [ bgfx_encoder_submit_occlusion_query ] ---

    /** Unsafe version of: {@link #bgfx_encoder_submit_occlusion_query encoder_submit_occlusion_query} */
    public static void nbgfx_encoder_submit_occlusion_query(long _encoder, short _id, short _program, short _occlusionQuery, int _depth, boolean _preserveState) {
        long __functionAddress = Functions.encoder_submit_occlusion_query;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _id, _program, _occlusionQuery, _depth, _preserveState);
    }

    /**
     * Submits primitive with occlusion query for rendering.
     *
     * @param _encoder        the encoder
     * @param _id             view id
     * @param _program        program
     * @param _occlusionQuery occlusion query
     * @param _depth          depth for sorting
     * @param _preserveState  preserve internal draw state for next draw call submit
     */
    public static void bgfx_encoder_submit_occlusion_query(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_program_handle_t") short _program, @NativeType("bgfx_occlusion_query_handle_t") short _occlusionQuery, @NativeType("int32_t") int _depth, @NativeType("bool") boolean _preserveState) {
        nbgfx_encoder_submit_occlusion_query(_encoder, (short)_id, _program, _occlusionQuery, _depth, _preserveState);
    }

    // --- [ bgfx_encoder_submit_indirect ] ---

    /** Unsafe version of: {@link #bgfx_encoder_submit_indirect encoder_submit_indirect} */
    public static void nbgfx_encoder_submit_indirect(long _encoder, short _id, short _handle, short _indirectHandle, short _start, short _num, int _depth, boolean _preserveState) {
        long __functionAddress = Functions.encoder_submit_indirect;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _id, _handle, _indirectHandle, _start, _num, _depth, _preserveState);
    }

    /**
     * Submits primitive for rendering with index and instance data info from indirect buffer.
     *
     * @param _encoder        the encoder
     * @param _id             view id
     * @param _handle         program
     * @param _indirectHandle indirect buffer
     * @param _start          first element in indirect buffer
     * @param _num            number of dispatches
     * @param _depth          depth for sorting
     * @param _preserveState  preserve internal draw state for next draw call submit
     */
    public static void bgfx_encoder_submit_indirect(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_program_handle_t") short _handle, @NativeType("bgfx_indirect_buffer_handle_t") short _indirectHandle, @NativeType("uint16_t") int _start, @NativeType("uint16_t") int _num, @NativeType("int32_t") int _depth, @NativeType("bool") boolean _preserveState) {
        nbgfx_encoder_submit_indirect(_encoder, (short)_id, _handle, _indirectHandle, (short)_start, (short)_num, _depth, _preserveState);
    }

    // --- [ bgfx_encoder_set_image ] ---

    /** Unsafe version of: {@link #bgfx_encoder_set_image encoder_set_image} */
    public static void nbgfx_encoder_set_image(long _encoder, byte _stage, short _handle, byte _mip, int _access, int _format) {
        long __functionAddress = Functions.encoder_set_image;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _stage, _handle, _mip, _access, _format);
    }

    /**
     * Sets compute image from texture.
     *
     * @param _encoder the encoder
     * @param _stage   texture unit
     * @param _handle  texture handle
     * @param _mip     mip level
     * @param _access  texture access. One of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
     * @param _format  texture format. One of:<br><table><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC1 TEXTURE_FORMAT_BC1}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC2 TEXTURE_FORMAT_BC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC3 TEXTURE_FORMAT_BC3}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC4 TEXTURE_FORMAT_BC4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_BC5 TEXTURE_FORMAT_BC5}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC6H TEXTURE_FORMAT_BC6H}</td><td>{@link #BGFX_TEXTURE_FORMAT_BC7 TEXTURE_FORMAT_BC7}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC1 TEXTURE_FORMAT_ETC1}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_ETC2 TEXTURE_FORMAT_ETC2}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A TEXTURE_FORMAT_ETC2A}</td><td>{@link #BGFX_TEXTURE_FORMAT_ETC2A1 TEXTURE_FORMAT_ETC2A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12 TEXTURE_FORMAT_PTC12}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC14 TEXTURE_FORMAT_PTC14}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC12A TEXTURE_FORMAT_PTC12A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC14A TEXTURE_FORMAT_PTC14A}</td><td>{@link #BGFX_TEXTURE_FORMAT_PTC22 TEXTURE_FORMAT_PTC22}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_PTC24 TEXTURE_FORMAT_PTC24}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN TEXTURE_FORMAT_UNKNOWN}</td><td>{@link #BGFX_TEXTURE_FORMAT_R1 TEXTURE_FORMAT_R1}</td><td>{@link #BGFX_TEXTURE_FORMAT_A8 TEXTURE_FORMAT_A8}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R8 TEXTURE_FORMAT_R8}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8I TEXTURE_FORMAT_R8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8U TEXTURE_FORMAT_R8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R8S TEXTURE_FORMAT_R8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16 TEXTURE_FORMAT_R16}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16I TEXTURE_FORMAT_R16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16U TEXTURE_FORMAT_R16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R16F TEXTURE_FORMAT_R16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_R16S TEXTURE_FORMAT_R16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32I TEXTURE_FORMAT_R32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32U TEXTURE_FORMAT_R32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_R32F TEXTURE_FORMAT_R32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG8 TEXTURE_FORMAT_RG8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8I TEXTURE_FORMAT_RG8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8U TEXTURE_FORMAT_RG8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG8S TEXTURE_FORMAT_RG8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16 TEXTURE_FORMAT_RG16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16I TEXTURE_FORMAT_RG16I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16U TEXTURE_FORMAT_RG16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG16F TEXTURE_FORMAT_RG16F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RG16S TEXTURE_FORMAT_RG16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32I TEXTURE_FORMAT_RG32I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32U TEXTURE_FORMAT_RG32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG32F TEXTURE_FORMAT_RG32F}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB8 TEXTURE_FORMAT_RGB8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8I TEXTURE_FORMAT_RGB8I}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8U TEXTURE_FORMAT_RGB8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB8S TEXTURE_FORMAT_RGB8S}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB9E5F TEXTURE_FORMAT_RGB9E5F}</td><td>{@link #BGFX_TEXTURE_FORMAT_BGRA8 TEXTURE_FORMAT_BGRA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8 TEXTURE_FORMAT_RGBA8}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8I TEXTURE_FORMAT_RGBA8I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8U TEXTURE_FORMAT_RGBA8U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA8S TEXTURE_FORMAT_RGBA8S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16 TEXTURE_FORMAT_RGBA16}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16I TEXTURE_FORMAT_RGBA16I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16U TEXTURE_FORMAT_RGBA16U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16F TEXTURE_FORMAT_RGBA16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA16S TEXTURE_FORMAT_RGBA16S}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32I TEXTURE_FORMAT_RGBA32I}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32U TEXTURE_FORMAT_RGBA32U}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA32F TEXTURE_FORMAT_RGBA32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_R5G6B5 TEXTURE_FORMAT_R5G6B5}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGBA4 TEXTURE_FORMAT_RGBA4}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_RGB5A1 TEXTURE_FORMAT_RGB5A1}</td><td>{@link #BGFX_TEXTURE_FORMAT_RGB10A2 TEXTURE_FORMAT_RGB10A2}</td><td>{@link #BGFX_TEXTURE_FORMAT_RG11B10F TEXTURE_FORMAT_RG11B10F}</td><td>{@link #BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH TEXTURE_FORMAT_UNKNOWN_DEPTH}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16 TEXTURE_FORMAT_D16}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24 TEXTURE_FORMAT_D24}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24S8 TEXTURE_FORMAT_D24S8}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32 TEXTURE_FORMAT_D32}</td></tr><tr><td>{@link #BGFX_TEXTURE_FORMAT_D16F TEXTURE_FORMAT_D16F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D24F TEXTURE_FORMAT_D24F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D32F TEXTURE_FORMAT_D32F}</td><td>{@link #BGFX_TEXTURE_FORMAT_D0S8 TEXTURE_FORMAT_D0S8}</td></tr></table>
     */
    public static void bgfx_encoder_set_image(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("uint8_t") int _stage, @NativeType("bgfx_texture_handle_t") short _handle, @NativeType("uint8_t") int _mip, @NativeType("bgfx_access_t") int _access, @NativeType("bgfx_texture_format_t") int _format) {
        nbgfx_encoder_set_image(_encoder, (byte)_stage, _handle, (byte)_mip, _access, _format);
    }

    // --- [ bgfx_encoder_set_compute_index_buffer ] ---

    /** Unsafe version of: {@link #bgfx_encoder_set_compute_index_buffer encoder_set_compute_index_buffer} */
    public static void nbgfx_encoder_set_compute_index_buffer(long _encoder, byte _stage, short _handle, int _access) {
        long __functionAddress = Functions.encoder_set_compute_index_buffer;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _stage, _handle, _access);
    }

    /**
     * Sets compute index buffer.
     *
     * @param _encoder the encoder
     * @param _stage   compute stage
     * @param _handle  index buffer handle
     * @param _access  buffer access. One of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
     */
    public static void bgfx_encoder_set_compute_index_buffer(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("uint8_t") int _stage, @NativeType("bgfx_index_buffer_handle_t") short _handle, @NativeType("bgfx_access_t") int _access) {
        nbgfx_encoder_set_compute_index_buffer(_encoder, (byte)_stage, _handle, _access);
    }

    // --- [ bgfx_encoder_set_compute_vertex_buffer ] ---

    /** Unsafe version of: {@link #bgfx_encoder_set_compute_vertex_buffer encoder_set_compute_vertex_buffer} */
    public static void nbgfx_encoder_set_compute_vertex_buffer(long _encoder, byte _stage, short _handle, int _access) {
        long __functionAddress = Functions.encoder_set_compute_vertex_buffer;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _stage, _handle, _access);
    }

    /**
     * Sets compute vertex buffer.
     *
     * @param _encoder the encoder
     * @param _stage   compute stage
     * @param _handle  vertex buffer handle
     * @param _access  buffer access. One of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
     */
    public static void bgfx_encoder_set_compute_vertex_buffer(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("uint8_t") int _stage, @NativeType("bgfx_vertex_buffer_handle_t") short _handle, @NativeType("bgfx_access_t") int _access) {
        nbgfx_encoder_set_compute_vertex_buffer(_encoder, (byte)_stage, _handle, _access);
    }

    // --- [ bgfx_encoder_set_compute_dynamic_index_buffer ] ---

    /** Unsafe version of: {@link #bgfx_encoder_set_compute_dynamic_index_buffer encoder_set_compute_dynamic_index_buffer} */
    public static void nbgfx_encoder_set_compute_dynamic_index_buffer(long _encoder, byte _stage, short _handle, int _access) {
        long __functionAddress = Functions.encoder_set_compute_dynamic_index_buffer;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _stage, _handle, _access);
    }

    /**
     * Sets compute dynamic index buffer.
     *
     * @param _encoder the encoder
     * @param _stage   compute stage
     * @param _handle  dynamic index buffer handle
     * @param _access  buffer access. One of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
     */
    public static void bgfx_encoder_set_compute_dynamic_index_buffer(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("uint8_t") int _stage, @NativeType("bgfx_dynamic_index_buffer_handle_t") short _handle, @NativeType("bgfx_access_t") int _access) {
        nbgfx_encoder_set_compute_dynamic_index_buffer(_encoder, (byte)_stage, _handle, _access);
    }

    // --- [ bgfx_encoder_set_compute_dynamic_vertex_buffer ] ---

    /** Unsafe version of: {@link #bgfx_encoder_set_compute_dynamic_vertex_buffer encoder_set_compute_dynamic_vertex_buffer} */
    public static void nbgfx_encoder_set_compute_dynamic_vertex_buffer(long _encoder, byte _stage, short _handle, int _access) {
        long __functionAddress = Functions.encoder_set_compute_dynamic_vertex_buffer;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _stage, _handle, _access);
    }

    /**
     * Sets compute dynamic vertex buffer.
     *
     * @param _encoder the encoder
     * @param _stage   compute stage
     * @param _handle  dynamic vertex buffer handle
     * @param _access  buffer access. One of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
     */
    public static void bgfx_encoder_set_compute_dynamic_vertex_buffer(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("uint8_t") int _stage, @NativeType("bgfx_dynamic_vertex_buffer_handle_t") short _handle, @NativeType("bgfx_access_t") int _access) {
        nbgfx_encoder_set_compute_dynamic_vertex_buffer(_encoder, (byte)_stage, _handle, _access);
    }

    // --- [ bgfx_encoder_set_compute_indirect_buffer ] ---

    /** Unsafe version of: {@link #bgfx_encoder_set_compute_indirect_buffer encoder_set_compute_indirect_buffer} */
    public static void nbgfx_encoder_set_compute_indirect_buffer(long _encoder, byte _stage, short _handle, int _access) {
        long __functionAddress = Functions.encoder_set_compute_indirect_buffer;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _stage, _handle, _access);
    }

    /**
     * Sets compute indirect buffer.
     *
     * @param _encoder the encoder
     * @param _stage   compute stage
     * @param _handle  indirect buffer handle
     * @param _access  buffer access. One of:<br><table><tr><td>{@link #BGFX_ACCESS_READ ACCESS_READ}</td><td>{@link #BGFX_ACCESS_WRITE ACCESS_WRITE}</td><td>{@link #BGFX_ACCESS_READWRITE ACCESS_READWRITE}</td></tr></table>
     */
    public static void bgfx_encoder_set_compute_indirect_buffer(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("uint8_t") int _stage, @NativeType("bgfx_indirect_buffer_handle_t") short _handle, @NativeType("bgfx_access_t") int _access) {
        nbgfx_encoder_set_compute_indirect_buffer(_encoder, (byte)_stage, _handle, _access);
    }

    // --- [ bgfx_encoder_dispatch ] ---

    /** Unsafe version of: {@link #bgfx_encoder_dispatch encoder_dispatch} */
    public static void nbgfx_encoder_dispatch(long _encoder, short _id, short _handle, int _numX, int _numY, int _numZ, byte _flags) {
        long __functionAddress = Functions.encoder_dispatch;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _id, _handle, _numX, _numY, _numZ, _flags);
    }

    /**
     * Dispatches compute.
     *
     * @param _encoder the encoder
     * @param _id      view id
     * @param _handle  compute program
     * @param _numX    number of groups X
     * @param _numY    number of groups Y
     * @param _numZ    number of groups Z
     * @param _flags   view flags. One of:<br><table><tr><td>{@link #BGFX_SUBMIT_EYE_LEFT SUBMIT_EYE_LEFT}</td><td>{@link #BGFX_SUBMIT_EYE_RIGHT SUBMIT_EYE_RIGHT}</td><td>{@link #BGFX_SUBMIT_EYE_FIRST SUBMIT_EYE_FIRST}</td></tr></table>
     */
    public static void bgfx_encoder_dispatch(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_program_handle_t") short _handle, @NativeType("uint32_t") int _numX, @NativeType("uint32_t") int _numY, @NativeType("uint32_t") int _numZ, @NativeType("uint8_t") int _flags) {
        nbgfx_encoder_dispatch(_encoder, (short)_id, _handle, _numX, _numY, _numZ, (byte)_flags);
    }

    // --- [ bgfx_encoder_dispatch_indirect ] ---

    /** Unsafe version of: {@link #bgfx_encoder_dispatch_indirect encoder_dispatch_indirect} */
    public static void nbgfx_encoder_dispatch_indirect(long _encoder, short _id, short _handle, short _indirectHandle, short _start, short _num, byte _flags) {
        long __functionAddress = Functions.encoder_dispatch_indirect;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _id, _handle, _indirectHandle, _start, _num, _flags);
    }

    /**
     * Dispatches compute indirect.
     *
     * @param _encoder        the encoder
     * @param _id             view id
     * @param _handle         compute program
     * @param _indirectHandle indirect buffer
     * @param _start          first element in indirect buffer
     * @param _num            number of dispatches
     * @param _flags          view flags. One of:<br><table><tr><td>{@link #BGFX_SUBMIT_EYE_LEFT SUBMIT_EYE_LEFT}</td><td>{@link #BGFX_SUBMIT_EYE_RIGHT SUBMIT_EYE_RIGHT}</td><td>{@link #BGFX_SUBMIT_EYE_FIRST SUBMIT_EYE_FIRST}</td></tr></table>
     */
    public static void bgfx_encoder_dispatch_indirect(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_program_handle_t") short _handle, @NativeType("bgfx_indirect_buffer_handle_t") short _indirectHandle, @NativeType("uint16_t") int _start, @NativeType("uint16_t") int _num, @NativeType("uint8_t") int _flags) {
        nbgfx_encoder_dispatch_indirect(_encoder, (short)_id, _handle, _indirectHandle, (short)_start, (short)_num, (byte)_flags);
    }

    // --- [ bgfx_encoder_discard ] ---

    /**
     * Discards all previously set state for draw or compute call.
     *
     * @param _encoder the encoder
     */
    public static void bgfx_encoder_discard(@NativeType("struct bgfx_encoder_s *") long _encoder) {
        long __functionAddress = Functions.encoder_discard;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder);
    }

    // --- [ bgfx_encoder_blit ] ---

    /** Unsafe version of: {@link #bgfx_encoder_blit encoder_blit} */
    public static void nbgfx_encoder_blit(long _encoder, short _id, short _dst, byte _dstMip, short _dstX, short _dstY, short _dstZ, short _src, byte _srcMip, short _srcX, short _srcY, short _srcZ, short _width, short _height, short _depth) {
        long __functionAddress = Functions.encoder_blit;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(__functionAddress, _encoder, _id, _dst, _dstMip, _dstX, _dstY, _dstZ, _src, _srcMip, _srcX, _srcY, _srcZ, _width, _height, _depth);
    }

    /**
     * Blits texture region between two textures.
     * 
     * <p>Destination texture must be created with {@link #BGFX_TEXTURE_BLIT_DST TEXTURE_BLIT_DST} flag. Availability depends on {@link #BGFX_CAPS_TEXTURE_BLIT CAPS_TEXTURE_BLIT}.</p>
     *
     * @param _encoder the encoder
     * @param _id      view id
     * @param _dst     destination texture handle
     * @param _dstMip  destination texture mip level
     * @param _dstX    destination texture X position
     * @param _dstY    destination texture Y position
     * @param _dstZ    if texture is 2D this argument should be 0. If destination texture is cube this argument represents destination texture cube face. For 3D texture
     *                 this argument represents destination texture Z position.
     * @param _src     source texture handle
     * @param _srcMip  source texture mip level
     * @param _srcX    source texture X position
     * @param _srcY    source texture Y position
     * @param _srcZ    if texture is 2D this argument should be 0. If destination texture is cube this argument represents destination texture cube face. For 3D texture
     *                 this argument represent destination texture Z position.
     * @param _width   width of region
     * @param _height  height of region
     * @param _depth   if texture is 3D this argument represents depth of region, otherwise it's unused
     */
    public static void bgfx_encoder_blit(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_texture_handle_t") short _dst, @NativeType("uint8_t") int _dstMip, @NativeType("uint16_t") int _dstX, @NativeType("uint16_t") int _dstY, @NativeType("uint16_t") int _dstZ, @NativeType("bgfx_texture_handle_t") short _src, @NativeType("uint8_t") int _srcMip, @NativeType("uint16_t") int _srcX, @NativeType("uint16_t") int _srcY, @NativeType("uint16_t") int _srcZ, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("uint16_t") int _depth) {
        nbgfx_encoder_blit(_encoder, (short)_id, _dst, (byte)_dstMip, (short)_dstX, (short)_dstY, (short)_dstZ, _src, (byte)_srcMip, (short)_srcX, (short)_srcY, (short)_srcZ, (short)_width, (short)_height, (short)_depth);
    }

    // --- [ bgfx_request_screen_shot ] ---

    /** Unsafe version of: {@link #bgfx_request_screen_shot request_screen_shot} */
    public static void nbgfx_request_screen_shot(short _handle, long _filePath) {
        long __functionAddress = Functions.request_screen_shot;
        invokePV(__functionAddress, _handle, _filePath);
    }

    /**
     * Requests screen shot.
     *
     * @param _handle   frame buffer handle
     * @param _filePath will be passed to {@link BGFXScreenShotCallback}
     */
    public static void bgfx_request_screen_shot(@NativeType("bgfx_frame_buffer_handle_t") short _handle, @NativeType("char const *") ByteBuffer _filePath) {
        if (CHECKS) {
            checkNT1(_filePath);
        }
        nbgfx_request_screen_shot(_handle, memAddress(_filePath));
    }

    /**
     * Requests screen shot.
     *
     * @param _handle   frame buffer handle
     * @param _filePath will be passed to {@link BGFXScreenShotCallback}
     */
    public static void bgfx_request_screen_shot(@NativeType("bgfx_frame_buffer_handle_t") short _handle, @NativeType("char const *") CharSequence _filePath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer _filePathEncoded = stack.ASCII(_filePath);
            nbgfx_request_screen_shot(_handle, memAddress(_filePathEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ BGFX_STATE_ALPHA_REF ] ---

    @NativeType("uint64_t")
    public static long BGFX_STATE_ALPHA_REF(@NativeType("uint64_t") long _ref) {
        return (_ref << BGFX_STATE_ALPHA_REF_SHIFT) & BGFX_STATE_ALPHA_REF_MASK;
    }

    // --- [ BGFX_STATE_POINT_SIZE ] ---

    @NativeType("uint64_t")
    public static long BGFX_STATE_POINT_SIZE(@NativeType("uint64_t") long _size) {
        return (_size << BGFX_STATE_POINT_SIZE_SHIFT) & BGFX_STATE_POINT_SIZE_MASK;
    }

    // --- [ BGFX_STATE_BLEND_FUNC_SEPARATE ] ---

    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_FUNC_SEPARATE(@NativeType("uint64_t") long _srcRGB, @NativeType("uint64_t") long _dstRGB, @NativeType("uint64_t") long _srcA, @NativeType("uint64_t") long _dstA) {
        return ((_srcRGB | (_dstRGB << 4))) | ((_srcA | (_dstA << 4)) << 8);
    }

    // --- [ BGFX_STATE_BLEND_EQUATION_SEPARATE ] ---

    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_EQUATION_SEPARATE(@NativeType("uint64_t") long _rgb, @NativeType("uint64_t") long _a) {
        return _rgb | (_a << 3);
    }

    // --- [ BGFX_STATE_BLEND_FUNC ] ---

    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_FUNC(@NativeType("uint64_t") long _src, @NativeType("uint64_t") long _dst) {
        return BGFX_STATE_BLEND_FUNC_SEPARATE(_src, _dst, _src, _dst);
    }

    // --- [ BGFX_STATE_BLEND_EQUATION ] ---

    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_EQUATION(@NativeType("uint64_t") long _equation) {
        return BGFX_STATE_BLEND_EQUATION_SEPARATE(_equation, _equation);
    }

    // --- [ BGFX_STATE_BLEND_FUNC_RT_x ] ---

    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_FUNC_RT_x(@NativeType("uint64_t") long _src, @NativeType("uint64_t") long _dst) {
        return (_src >> BGFX_STATE_BLEND_SHIFT) | ((_dst >> BGFX_STATE_BLEND_SHIFT) << 4);
    }

    // --- [ BGFX_STATE_BLEND_FUNC_RT_xE ] ---

    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_FUNC_RT_xE(@NativeType("uint64_t") long _src, @NativeType("uint64_t") long _dst, @NativeType("uint64_t") long _equation) {
        return BGFX_STATE_BLEND_FUNC_RT_x(_src, _dst) | ((_equation >> BGFX_STATE_BLEND_EQUATION_SHIFT) << 8);
    }

    // --- [ BGFX_STATE_BLEND_FUNC_RT_1 ] ---

    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_FUNC_RT_1(@NativeType("uint64_t") long _src, @NativeType("uint64_t") long _dst) {
        return BGFX_STATE_BLEND_FUNC_RT_x(_src, _dst) << 0;
    }

    // --- [ BGFX_STATE_BLEND_FUNC_RT_2 ] ---

    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_FUNC_RT_2(@NativeType("uint64_t") long _src, @NativeType("uint64_t") long _dst) {
        return BGFX_STATE_BLEND_FUNC_RT_x(_src, _dst) << 11;
    }

    // --- [ BGFX_STATE_BLEND_FUNC_RT_3 ] ---

    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_FUNC_RT_3(@NativeType("uint64_t") long _src, @NativeType("uint64_t") long _dst) {
        return BGFX_STATE_BLEND_FUNC_RT_x(_src, _dst) << 22;
    }

    // --- [ BGFX_STATE_BLEND_FUNC_RT_1E ] ---

    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_FUNC_RT_1E(@NativeType("uint64_t") long _src, @NativeType("uint64_t") long _dst, @NativeType("uint64_t") long _equation) {
        return BGFX_STATE_BLEND_FUNC_RT_xE(_src, _dst, _equation) << 0;
    }

    // --- [ BGFX_STATE_BLEND_FUNC_RT_2E ] ---

    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_FUNC_RT_2E(@NativeType("uint64_t") long _src, @NativeType("uint64_t") long _dst, @NativeType("uint64_t") long _equation) {
        return BGFX_STATE_BLEND_FUNC_RT_xE(_src, _dst, _equation) << 11;
    }

    // --- [ BGFX_STATE_BLEND_FUNC_RT_3E ] ---

    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_FUNC_RT_3E(@NativeType("uint64_t") long _src, @NativeType("uint64_t") long _dst, @NativeType("uint64_t") long _equation) {
        return BGFX_STATE_BLEND_FUNC_RT_xE(_src, _dst, _equation) << 22;
    }

    // --- [ BGFX_STENCIL_FUNC_REF ] ---

    @NativeType("uint32_t")
    public static int BGFX_STENCIL_FUNC_REF(@NativeType("uint32_t") int _ref) {
        return (_ref << BGFX_STENCIL_FUNC_REF_SHIFT) & BGFX_STENCIL_FUNC_REF_MASK;
    }

    // --- [ BGFX_STENCIL_FUNC_RMASK ] ---

    @NativeType("uint32_t")
    public static int BGFX_STENCIL_FUNC_RMASK(@NativeType("uint32_t") int _mask) {
        return (_mask << BGFX_STENCIL_FUNC_RMASK_SHIFT) & BGFX_STENCIL_FUNC_RMASK_MASK;
    }

    // --- [ BGFX_TEXTURE_BORDER_COLOR ] ---

    @NativeType("uint32_t")
    public static int BGFX_TEXTURE_BORDER_COLOR(@NativeType("uint32_t") int _index) {
        return (_index << BGFX_TEXTURE_BORDER_COLOR_SHIFT) & BGFX_TEXTURE_BORDER_COLOR_MASK;
    }

    /** Array version of: {@link #bgfx_vertex_pack vertex_pack} */
    public static void bgfx_vertex_pack(@NativeType("float const *") float[] _input, @NativeType("bool") boolean _inputNormalized, @NativeType("bgfx_attrib_t") int _attr, @NativeType("bgfx_vertex_decl_t const *") BGFXVertexDecl _decl, @NativeType("void *") ByteBuffer _data, @NativeType("uint32_t") int _index) {
        long __functionAddress = Functions.vertex_pack;
        if (CHECKS) {
            check(_input, 4);
        }
        invokePPPV(__functionAddress, _input, _inputNormalized, _attr, _decl.address(), memAddress(_data), _index);
    }

    /** Array version of: {@link #bgfx_vertex_unpack vertex_unpack} */
    public static void bgfx_vertex_unpack(@NativeType("float *") float[] _output, @NativeType("bgfx_attrib_t") int _attr, @NativeType("bgfx_vertex_decl_t const *") BGFXVertexDecl _decl, @NativeType("void const *") ByteBuffer _data, @NativeType("uint32_t") int _index) {
        long __functionAddress = Functions.vertex_unpack;
        if (CHECKS) {
            check(_output, 4);
        }
        invokePPPV(__functionAddress, _output, _attr, _decl.address(), memAddress(_data), _index);
    }

    /** Array version of: {@link #bgfx_weld_vertices weld_vertices} */
    @NativeType("uint16_t")
    public static short bgfx_weld_vertices(@NativeType("uint16_t *") short[] _output, @NativeType("bgfx_vertex_decl_t const *") BGFXVertexDecl _decl, @NativeType("void const *") ByteBuffer _data, float _epsilon) {
        long __functionAddress = Functions.weld_vertices;
        return invokePPPS(__functionAddress, _output, _decl.address(), memAddress(_data), (short)_output.length, _epsilon);
    }

    /** Array version of: {@link #bgfx_topology_convert topology_convert} */
    @NativeType("uint32_t")
    public static int bgfx_topology_convert(@NativeType("bgfx_topology_convert_t") int _conversion, @Nullable @NativeType("void *") short[] _dst, @NativeType("void const *") short[] _indices, @NativeType("bool") boolean _index32) {
        long __functionAddress = Functions.topology_convert;
        return invokePPI(__functionAddress, _conversion, _dst, lengthSafe(_dst) << 1, _indices, _indices.length, _index32);
    }

    /** Array version of: {@link #bgfx_topology_convert topology_convert} */
    @NativeType("uint32_t")
    public static int bgfx_topology_convert(@NativeType("bgfx_topology_convert_t") int _conversion, @Nullable @NativeType("void *") int[] _dst, @NativeType("void const *") int[] _indices, @NativeType("bool") boolean _index32) {
        long __functionAddress = Functions.topology_convert;
        return invokePPI(__functionAddress, _conversion, _dst, lengthSafe(_dst) << 2, _indices, _indices.length, _index32);
    }

    /** Array version of: {@link #bgfx_topology_sort_tri_list topology_sort_tri_list} */
    public static void bgfx_topology_sort_tri_list(@NativeType("bgfx_topology_sort_t") int _sort, @NativeType("void *") ByteBuffer _dst, @NativeType("float const *") float[] _dir, @NativeType("float const *") float[] _pos, @NativeType("void const *") ByteBuffer _vertices, @NativeType("uint32_t") int _stride, @NativeType("void const *") ByteBuffer _indices, @NativeType("bool") boolean _index32) {
        long __functionAddress = Functions.topology_sort_tri_list;
        if (CHECKS) {
            check(_dir, 3);
            check(_pos, 3);
        }
        invokePPPPPV(__functionAddress, _sort, memAddress(_dst), _dst.remaining(), _dir, _pos, memAddress(_vertices), _stride, memAddress(_indices), _indices.remaining() >> (_index32 ? 2 : 1), _index32);
    }

    /** Array version of: {@link #bgfx_topology_sort_tri_list topology_sort_tri_list} */
    public static void bgfx_topology_sort_tri_list(@NativeType("bgfx_topology_sort_t") int _sort, @NativeType("void *") short[] _dst, @NativeType("float const *") float[] _dir, @NativeType("float const *") float[] _pos, @NativeType("void const *") ByteBuffer _vertices, @NativeType("uint32_t") int _stride, @NativeType("void const *") short[] _indices, @NativeType("bool") boolean _index32) {
        long __functionAddress = Functions.topology_sort_tri_list;
        if (CHECKS) {
            check(_dir, 3);
            check(_pos, 3);
        }
        invokePPPPPV(__functionAddress, _sort, _dst, _dst.length << 1, _dir, _pos, memAddress(_vertices), _stride, _indices, _indices.length, _index32);
    }

    /** Array version of: {@link #bgfx_topology_sort_tri_list topology_sort_tri_list} */
    public static void bgfx_topology_sort_tri_list(@NativeType("bgfx_topology_sort_t") int _sort, @NativeType("void *") int[] _dst, @NativeType("float const *") float[] _dir, @NativeType("float const *") float[] _pos, @NativeType("void const *") ByteBuffer _vertices, @NativeType("uint32_t") int _stride, @NativeType("void const *") int[] _indices, @NativeType("bool") boolean _index32) {
        long __functionAddress = Functions.topology_sort_tri_list;
        if (CHECKS) {
            check(_dir, 3);
            check(_pos, 3);
        }
        invokePPPPPV(__functionAddress, _sort, _dst, _dst.length << 2, _dir, _pos, memAddress(_vertices), _stride, _indices, _indices.length, _index32);
    }

    /** Array version of: {@link #bgfx_get_supported_renderers get_supported_renderers} */
    @NativeType("uint8_t")
    public static byte bgfx_get_supported_renderers(@NativeType("bgfx_renderer_type_t *") int[] _enum) {
        long __functionAddress = Functions.get_supported_renderers;
        return invokePB(__functionAddress, (byte)_enum.length, _enum);
    }

    /** Array version of: {@link #bgfx_copy copy} */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_copy(@NativeType("void const *") short[] _data) {
        long __functionAddress = Functions.copy;
        long __result = invokePP(__functionAddress, _data, _data.length << 1);
        return BGFXMemory.createSafe(__result);
    }

    /** Array version of: {@link #bgfx_copy copy} */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_copy(@NativeType("void const *") int[] _data) {
        long __functionAddress = Functions.copy;
        long __result = invokePP(__functionAddress, _data, _data.length << 2);
        return BGFXMemory.createSafe(__result);
    }

    /** Array version of: {@link #bgfx_copy copy} */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_copy(@NativeType("void const *") long[] _data) {
        long __functionAddress = Functions.copy;
        long __result = invokePP(__functionAddress, _data, _data.length << 3);
        return BGFXMemory.createSafe(__result);
    }

    /** Array version of: {@link #bgfx_copy copy} */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_copy(@NativeType("void const *") float[] _data) {
        long __functionAddress = Functions.copy;
        long __result = invokePP(__functionAddress, _data, _data.length << 2);
        return BGFXMemory.createSafe(__result);
    }

    /** Array version of: {@link #bgfx_copy copy} */
    @Nullable
    @NativeType("bgfx_memory_t const *")
    public static BGFXMemory bgfx_copy(@NativeType("void const *") double[] _data) {
        long __functionAddress = Functions.copy;
        long __result = invokePP(__functionAddress, _data, _data.length << 3);
        return BGFXMemory.createSafe(__result);
    }

    /** Array version of: {@link #bgfx_get_shader_uniforms get_shader_uniforms} */
    @NativeType("uint16_t")
    public static short bgfx_get_shader_uniforms(@NativeType("bgfx_shader_handle_t") short _handle, @NativeType("bgfx_uniform_handle_t *") short[] _uniforms) {
        long __functionAddress = Functions.get_shader_uniforms;
        return invokePS(__functionAddress, _handle, _uniforms, (short)_uniforms.length);
    }

    /** Array version of: {@link #bgfx_read_texture read_texture} */
    @NativeType("uint32_t")
    public static int bgfx_read_texture(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("void *") short[] _data, @NativeType("uint8_t") int _mip) {
        long __functionAddress = Functions.read_texture;
        return invokePI(__functionAddress, _handle, _data, (byte)_mip);
    }

    /** Array version of: {@link #bgfx_read_texture read_texture} */
    @NativeType("uint32_t")
    public static int bgfx_read_texture(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("void *") int[] _data, @NativeType("uint8_t") int _mip) {
        long __functionAddress = Functions.read_texture;
        return invokePI(__functionAddress, _handle, _data, (byte)_mip);
    }

    /** Array version of: {@link #bgfx_read_texture read_texture} */
    @NativeType("uint32_t")
    public static int bgfx_read_texture(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("void *") float[] _data, @NativeType("uint8_t") int _mip) {
        long __functionAddress = Functions.read_texture;
        return invokePI(__functionAddress, _handle, _data, (byte)_mip);
    }

    /** Array version of: {@link #bgfx_create_frame_buffer_from_handles create_frame_buffer_from_handles} */
    @NativeType("bgfx_frame_buffer_handle_t")
    public static short bgfx_create_frame_buffer_from_handles(@NativeType("bgfx_texture_handle_t const *") short[] _handles, @NativeType("bool") boolean _destroyTextures) {
        long __functionAddress = Functions.create_frame_buffer_from_handles;
        return invokePS(__functionAddress, (byte)_handles.length, _handles, _destroyTextures);
    }

    /** Array version of: {@link #bgfx_get_result get_result} */
    @NativeType("bgfx_occlusion_query_result_t")
    public static int bgfx_get_result(@NativeType("bgfx_occlusion_query_handle_t") short _handle, @Nullable @NativeType("int32_t *") int[] _result) {
        long __functionAddress = Functions.get_result;
        if (CHECKS) {
            checkSafe(_result, 1);
        }
        return invokePI(__functionAddress, _handle, _result);
    }

    /** Array version of: {@link #bgfx_set_palette_color set_palette_color} */
    public static void bgfx_set_palette_color(@NativeType("uint8_t") int _index, @NativeType("float const *") float[] _rgba) {
        long __functionAddress = Functions.set_palette_color;
        if (CHECKS) {
            check(_rgba, 4);
        }
        invokePV(__functionAddress, (byte)_index, _rgba);
    }

    /** Array version of: {@link #bgfx_set_view_transform set_view_transform} */
    public static void bgfx_set_view_transform(@NativeType("bgfx_view_id_t") int _id, @Nullable @NativeType("void const *") float[] _view, @Nullable @NativeType("void const *") float[] _proj) {
        long __functionAddress = Functions.set_view_transform;
        if (CHECKS) {
            checkSafe(_view, 64 >> 2);
            checkSafe(_proj, 64 >> 2);
        }
        invokePPV(__functionAddress, (short)_id, _view, _proj);
    }

    /** Array version of: {@link #bgfx_set_view_transform_stereo set_view_transform_stereo} */
    public static void bgfx_set_view_transform_stereo(@NativeType("bgfx_view_id_t") int _id, @Nullable @NativeType("void const *") float[] _view, @Nullable @NativeType("void const *") float[] _projL, @NativeType("uint8_t") int _flags, @Nullable @NativeType("void const *") float[] _projR) {
        long __functionAddress = Functions.set_view_transform_stereo;
        if (CHECKS) {
            checkSafe(_view, 64 >> 2);
            checkSafe(_projL, 64 >> 2);
            checkSafe(_projR, 64 >> 2);
        }
        invokePPPV(__functionAddress, (short)_id, _view, _projL, (byte)_flags, _projR);
    }

    /** Array version of: {@link #bgfx_set_view_order set_view_order} */
    public static void bgfx_set_view_order(@NativeType("bgfx_view_id_t") int _id, @NativeType("uint16_t") int _num, @Nullable @NativeType("bgfx_view_id_t const *") short[] _order) {
        long __functionAddress = Functions.set_view_order;
        if (CHECKS) {
            checkSafe(_order, _num);
        }
        invokePV(__functionAddress, (short)_id, (short)_num, _order);
    }

    /** Array version of: {@link #bgfx_set_transform set_transform} */
    @NativeType("uint32_t")
    public static int bgfx_set_transform(@NativeType("void const *") float[] _mtx) {
        long __functionAddress = Functions.set_transform;
        return invokePI(__functionAddress, _mtx, (short)(_mtx.length >> 4));
    }

    /** Array version of: {@link #bgfx_set_uniform set_uniform} */
    public static void bgfx_set_uniform(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") short[] _value, @NativeType("uint16_t") int _num) {
        long __functionAddress = Functions.set_uniform;
        invokePV(__functionAddress, _handle, _value, (short)_num);
    }

    /** Array version of: {@link #bgfx_set_uniform set_uniform} */
    public static void bgfx_set_uniform(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") int[] _value, @NativeType("uint16_t") int _num) {
        long __functionAddress = Functions.set_uniform;
        invokePV(__functionAddress, _handle, _value, (short)_num);
    }

    /** Array version of: {@link #bgfx_set_uniform set_uniform} */
    public static void bgfx_set_uniform(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") long[] _value, @NativeType("uint16_t") int _num) {
        long __functionAddress = Functions.set_uniform;
        invokePV(__functionAddress, _handle, _value, (short)_num);
    }

    /** Array version of: {@link #bgfx_set_uniform set_uniform} */
    public static void bgfx_set_uniform(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") float[] _value, @NativeType("uint16_t") int _num) {
        long __functionAddress = Functions.set_uniform;
        invokePV(__functionAddress, _handle, _value, (short)_num);
    }

    /** Array version of: {@link #bgfx_set_uniform set_uniform} */
    public static void bgfx_set_uniform(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") double[] _value, @NativeType("uint16_t") int _num) {
        long __functionAddress = Functions.set_uniform;
        invokePV(__functionAddress, _handle, _value, (short)_num);
    }

    /** Array version of: {@link #bgfx_encoder_set_transform encoder_set_transform} */
    @NativeType("uint32_t")
    public static int bgfx_encoder_set_transform(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("void const *") float[] _mtx) {
        long __functionAddress = Functions.encoder_set_transform;
        if (CHECKS) {
            check(_encoder);
        }
        return invokePPI(__functionAddress, _encoder, _mtx, (short)(_mtx.length >> 4));
    }

    /** Array version of: {@link #bgfx_encoder_set_uniform encoder_set_uniform} */
    public static void bgfx_encoder_set_uniform(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") short[] _value, @NativeType("uint16_t") int _num) {
        long __functionAddress = Functions.encoder_set_uniform;
        if (CHECKS) {
            check(_encoder);
        }
        invokePPV(__functionAddress, _encoder, _handle, _value, (short)_num);
    }

    /** Array version of: {@link #bgfx_encoder_set_uniform encoder_set_uniform} */
    public static void bgfx_encoder_set_uniform(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") int[] _value, @NativeType("uint16_t") int _num) {
        long __functionAddress = Functions.encoder_set_uniform;
        if (CHECKS) {
            check(_encoder);
        }
        invokePPV(__functionAddress, _encoder, _handle, _value, (short)_num);
    }

    /** Array version of: {@link #bgfx_encoder_set_uniform encoder_set_uniform} */
    public static void bgfx_encoder_set_uniform(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") long[] _value, @NativeType("uint16_t") int _num) {
        long __functionAddress = Functions.encoder_set_uniform;
        if (CHECKS) {
            check(_encoder);
        }
        invokePPV(__functionAddress, _encoder, _handle, _value, (short)_num);
    }

    /** Array version of: {@link #bgfx_encoder_set_uniform encoder_set_uniform} */
    public static void bgfx_encoder_set_uniform(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") float[] _value, @NativeType("uint16_t") int _num) {
        long __functionAddress = Functions.encoder_set_uniform;
        if (CHECKS) {
            check(_encoder);
        }
        invokePPV(__functionAddress, _encoder, _handle, _value, (short)_num);
    }

    /** Array version of: {@link #bgfx_encoder_set_uniform encoder_set_uniform} */
    public static void bgfx_encoder_set_uniform(@NativeType("struct bgfx_encoder_s *") long _encoder, @NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") double[] _value, @NativeType("uint16_t") int _num) {
        long __functionAddress = Functions.encoder_set_uniform;
        if (CHECKS) {
            check(_encoder);
        }
        invokePPV(__functionAddress, _encoder, _handle, _value, (short)_num);
    }

}